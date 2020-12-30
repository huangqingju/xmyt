package com.example.sbm.admin.service.excel;

import com.example.sbm.admin.mapper.excel.DbCommissionStatisticsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbCommissionStatisticsService {
    @Autowired
    private DbCommissionStatisticsMapper dbCommissionStatisticsMapper;
}
