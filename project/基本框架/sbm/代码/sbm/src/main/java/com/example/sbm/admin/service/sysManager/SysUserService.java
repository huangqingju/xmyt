package com.example.sbm.admin.service.sysManager;

import com.example.sbm.admin.base.BaseService;
import com.example.sbm.admin.entity.SysUser;
import com.example.sbm.admin.mapper.sysManager.SysUserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class SysUserService  extends BaseService {

    @Autowired
    private SysUserMapper sysUserMapper ;



    public List<SysUser> queryALl(){
        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("enable",1);
        return sysUserMapper.selectByExample(example);

    }


    /**
     * 通过 通过实体类 查出一个数据
     * @param sysUser
     * @return
     */
    public SysUser querySysUserBySysUser(SysUser sysUser){
        return sysUserMapper.selectOne(sysUser);
    }

    public void updateLoginInfoById(SysUser sysUser) {
       sysUserMapper.updateByPrimaryKeySelective(sysUser);

    }

    public SysUser querySysUserById(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public List queryPageList(Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("enable",1);
        example.setOrderByClause("create_time desc");
        return sysUserMapper.selectByExample(example);
    }
}
