package com.example.sbm.admin.mapper;

import com.example.sbm.admin.entity.Category;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface CategoryMapper extends Mapper<Category> {


    @Select("select * from ")
    List<Category> queryListTree(Integer id);
}
