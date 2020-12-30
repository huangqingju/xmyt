package com.example.sbm.admin.service.excel;

import com.example.sbm.admin.base.BaseService;
import com.example.sbm.admin.base.PageResultInfo;
import com.example.sbm.admin.base.ResultInfo;
import com.example.sbm.admin.entity.excel.DbSigningStatistics;
import com.example.sbm.admin.mapper.excel.DbRefundStatisticsMapper;
import com.example.sbm.admin.mapper.excel.DbSigningStatisticsMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class DbSigningStatisticsService extends BaseService {

    @Autowired
    private DbSigningStatisticsMapper signingStatisticsMapper;


    public int addSigning(DbSigningStatistics signingStatistics){
        signingStatistics.setCreateTime(new Date());
        return  signingStatisticsMapper.insertSelective(signingStatistics);

    }

    public void updateSigning(DbSigningStatistics signingStatistics) {
        signingStatisticsMapper.updateByPrimaryKeySelective(signingStatistics);
    }

    public PageResultInfo querySigningPageList(Integer page, Integer limit) {
       // PageHelper.startPage(page,limit);
        List<Map<String,Object>> list =signingStatisticsMapper.querySigningPageList( limit*(page-1),limit);
        PageResultInfo pageResultInfo = new PageResultInfo();

        Example example = new Example(DbSigningStatistics.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("enable",1);
        pageResultInfo.setCode(0);
        pageResultInfo.setCount(signingStatisticsMapper.selectCountByExample(example));
        pageResultInfo.setData(list);
        pageResultInfo.setSuccess(true);

        return pageResultInfo;

    }

    public void updateSigningEnable(DbSigningStatistics signingStatistics) {
        signingStatistics.setEnable(0);
        signingStatisticsMapper.updateByPrimaryKeySelective(signingStatistics);
    }

    public DbSigningStatistics querySigningById(Integer id) {

         return signingStatisticsMapper.selectByPrimaryKey(id);
    }

    public List<Map<String,Object>> queryExportList(DbSigningStatistics signingStatistics) {

        return signingStatisticsMapper.querySigningPageList( null,null);

    }
}
