package com.example.sbm.admin.controller.system;

import com.example.sbm.admin.base.BaseController;
import com.example.sbm.admin.service.CategoryService;
import com.example.sbm.admin.service.sysManager.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys/index")
public class SystemIndexController extends BaseController {

    @Autowired
    private SysMenuService sysMenuService;




    @RequestMapping("/main")
    public String mainInit(Model model){
        //model.addAttribute("resourceMenuList",sysMenuService.resourceMenuList());

        //model.addAttribute("sysMenuList",sysMenuService.sysMenuList());
        model.addAttribute("sysMenuList",sysMenuService.creatMenuTree(1, sysMenuService.queryAll())) ;
        return "admin/main/main";
    }
}
