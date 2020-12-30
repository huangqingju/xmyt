package com.example.sbm.admin.controller.exceldothing;

import com.example.sbm.admin.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sys/excel")
@Controller
public class ExcelDoThingController extends BaseController {
    private String prefix = "admin/excel";

    @RequestMapping("/init")
    public String excelInit(){
        return prefix+"/excel";
    }
}
