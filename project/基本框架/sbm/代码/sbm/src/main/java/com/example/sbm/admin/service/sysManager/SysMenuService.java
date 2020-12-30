package com.example.sbm.admin.service.sysManager;

import com.example.sbm.admin.base.BaseService;
import com.example.sbm.admin.entity.SysMenu;
import com.example.sbm.admin.mapper.sysManager.SysMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysMenuService extends BaseService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    /**
     *通过父节点 id 获取菜单树
     * @param id 父节点ID
     * @return
     */
    public List<SysMenu> creatMenuTree(Integer id, List<SysMenu> list){
        List<SysMenu> childLsit = new ArrayList<>();
        list.forEach(menu ->{
            if(menu.getParentId()!=null && menu.getParentId() == id){
                menu.setChildMenu(creatMenuTree(menu.getId(),list ));
                childLsit.add(menu);

            }
        });
        return childLsit;
    }
    public List<SysMenu> queryAll(){
        Example example = new Example(SysMenu.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("display",1);
        criteria.andEqualTo("enable",1);

        return sysMenuMapper.selectByExample(example);

    }

    /**
     * 有效的菜单
     * @return
     */
    public List<SysMenu> queryEnableList(){
        Example example = new Example(SysMenu.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("enable",1);

        return sysMenuMapper.selectByExample(example);
    }

    /**
     * 查业务菜单
     * @return
     */
    public List<SysMenu> resourceMenuList (){
        Example example = new Example(SysMenu.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("display",1);
        criteria.andEqualTo("enable",1);
        criteria.andEqualTo("type",2);
        example.setOrderByClause("sorted");
        return sysMenuMapper.selectByExample(example);
    }

    /**
     * 查系统菜单
     * @return
     */
    public  List<SysMenu> sysMenuList(){
        Example example = new Example(SysMenu.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("display",1);
        criteria.andEqualTo("enable",1);
        criteria.andEqualTo("type",1);
        example.setOrderByClause("sorted");
        return sysMenuMapper.selectByExample(example);
    }

    /**
     * 通过 id， 创建系统菜单管理的菜单树
     * @param id
     * @param list
     * @return
     */
    public List<Map<String,Object>> creatMenuMangerTree(Integer id, List<SysMenu> list){
        List<Map<String,Object>> treeList= new ArrayList<>();
        list.forEach(sysMenu -> {
            if(sysMenu.getParentId()!=null &&  id.equals(sysMenu.getParentId())){
                Map<String,Object> map = new HashMap<>();
                map.put("id",String.valueOf(sysMenu.getId()));
                map.put("title",sysMenu.getAdminDataText());
                map.put("children",creatMenuMangerTree(sysMenu.getId(),list));
                treeList.add(map);
            }
        });
        return treeList;
    }

    public SysMenu querySysMenuById(Integer id) {
        return sysMenuMapper.selectByPrimaryKey(id);
    }

    public void addSysMenu(SysMenu sysMenu) {
        sysMenuMapper.insert(sysMenu);
    }

    public void updateSysMenu(SysMenu sysMenu) {
        sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
    }

}
