package com.example.sbm.admin.controller.sysManager;

import com.example.sbm.admin.base.BaseController;
import com.example.sbm.admin.base.PageResultInfo;
import com.example.sbm.admin.entity.SysRole;
import com.example.sbm.admin.service.sysManager.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sys/roleManage")
public class SysRoleController extends BaseController {

    private  String prefix = "admin/sys/sysRole/";

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("/init")
    public String Init(){
        return prefix+"init";
    }

    @RequestMapping("/pageList")
    @ResponseBody
    public PageResultInfo pageList(Integer page,Integer limit){
        PageResultInfo pageResultInfo= null;

        try {
            List<SysRole>roleList = sysRoleService.queryPageList(page,limit);
            pageResultInfo  = createPageResultInfo(roleList,true);
        } catch (Exception e) {
            pageResultInfo = createPageResultInfoOfFail();
        }
        return pageResultInfo;
    }

    @RequestMapping("/addOrEditInit")
    public String addOrEditInit(Integer id, Model model){
        SysRole sysRole = new SysRole();
        if(id !=null){
            sysRole = sysRoleService.querySysUserById(id);

        }
        model.addAttribute("sysRole",sysRole);
        return prefix+"addOrEdit";
    }

}
