package com.example.sbm.admin.mapper.excel;

import com.example.sbm.admin.entity.excel.DbSigningStatistics;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Component
public interface DbSigningStatisticsMapper extends Mapper<DbSigningStatistics> {


    @Select("<script>" +
            " select s.*  , " +
            " c1.title contract_state_title ,c2.title product_category_title ," +
            " c3.title overseas_study_apply_title  ,c4.title language_train_title"+
            " , c5.title overseas_or_train_title ,c6.title linesTitle, c7.title country_title "+
            " from db_signing_statistics s LEFT JOIN db_category c1 ON s.contract_state = c1.id"+
            " LEFT JOIN db_category c2 on s.product_category =c2.id "+
            " LEFT JOIN db_category c3 on s.overseas_study_apply = c3.id "+
            " LEFT JOIN db_category c4 on s.language_train = c4.id " +
            " LEFT JOIN db_category c5 on s.overseas_or_train = c5.id "+
            " LEFT JOIN db_category c6 on s.lines_title = c6.id" +
            " LEFT JOIN db_category c7 on s.country = c7.id"+
            " where  s.`enable` = 1 " +
            " order by s.create_time desc "+
            " <if test=\"start!=null and start != '' and limit !=null and  limit !=''\"  >" +
            " limit ${start},${limit} "+
            " </if>"+
            "</script>")
    List<Map<String,Object>> querySigningPageList(@Param(value = "start") Integer start, @Param(value = "limit") Integer limit);
}
