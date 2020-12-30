package com.example.sbm.admin.service;

import com.example.sbm.admin.base.BaseService;
import com.example.sbm.admin.entity.Category;
import com.example.sbm.admin.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryService extends BaseService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 创建类别树
     * @return
     */
    public List<Map<String, Object>> createCategoryTree( List<Category>  categoryList) {
        return getChild(0,categoryList);
    }

    public List<Map<String,Object>> getChild(Integer pid , List<Category> allList){
        List<Map<String,Object>> childList = new ArrayList<>();//用于保存子节点的list
        for(Category category: allList){

            if(category.getParentId()!=null && category.getParentId().equals(pid)  ){
                //对应 layui 的tree 控件，
                Map<String,Object> map = new HashMap<>();
                map.put("title",category.getTitle());
                map.put("id",category.getId());
                map.put("spread",pid==0?true:false);
                map.put("checked",false);
                map.put("disabled",false);
                map.put("children",getChild(category.getId(),allList));
                childList.add(map);

            }
        }
        return childList;
    }

    public List<Category> queryCategoryList(){
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("enable",1);
        example.setOrderByClause("level , sort");
        return categoryMapper.selectByExample(example);
    }

    public Category queryCategoryById(Integer  id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    public void addCategory(Category category) {
        categoryMapper.insertSelective(category);
    }

    public void updateCategory(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    public void updateEnable(Integer id) {
        Category category = new Category();
        category.setId(id);
        category.setEnable(0);
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    /**
     * 通过 父 类id 查找 子类
     * @param parId
     * @return
     */
    public List<Category> queryChildCategoryList(Integer parId){
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("parentId",parId);
        criteria.andEqualTo("display",1);
        criteria.andEqualTo("enable",1);
        example.setOrderByClause("level , sort");
        return categoryMapper.selectByExample(example);

    }
}
