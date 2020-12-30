package com.example.sbm.admin.service.sysManager;

import com.example.sbm.admin.base.BaseService;
import com.example.sbm.admin.entity.SysUserRolePermission;
import com.example.sbm.admin.mapper.sysManager.SysUserRolePermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class SysUserRolePermissionService extends BaseService {

    @Autowired
    private SysUserRolePermissionMapper sysUserRolePermissionMapper;


    public List<SysUserRolePermission> queryListByUserId(Long id) {
        Example example = new Example(SysUserRolePermission.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",id);
        return sysUserRolePermissionMapper.selectByExample(example);
    }
}
