package com.example.sbm.admin.service.excel;

import com.example.sbm.admin.mapper.excel.DbConsultationStatisticsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbConsultationStatisticsService {
    @Autowired
    private DbConsultationStatisticsMapper dbConsultationStatisticsMapper;
}
