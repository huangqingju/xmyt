package com.example.sbm.admin.service.sysManager;

import com.example.sbm.admin.base.BaseService;
import com.example.sbm.admin.entity.SysRole;
import com.example.sbm.admin.mapper.sysManager.SysRoleMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleService extends BaseService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    public List<SysRole> queryPageList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        SysRole sysRole = new SysRole();
        sysRole.setEnable(1);
        return sysRoleMapper.select(sysRole);
    }

    public SysRole querySysUserById(Integer id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }
}
