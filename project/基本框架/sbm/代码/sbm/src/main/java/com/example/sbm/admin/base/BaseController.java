package com.example.sbm.admin.base;

import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class BaseController {




    /**
     * 创建  成功或者失败   分页信息，
     * 简单创建 分页结果信息，
     * @param list 结果，
     * @param success true成功，false 失败
     * @return
     */
    public PageResultInfo createPageResultInfo (List list,boolean success){
        PageInfo<?> pageInfo=new PageInfo<>(list);
        PageResultInfo pageResultInfo=new PageResultInfo();
        pageResultInfo.setCount((int)pageInfo.getTotal());
        pageResultInfo.setData(list);
        if(success){
            pageResultInfo.setSuccess(true);
            pageResultInfo.setCode(0);
        }else {
            pageResultInfo.setSuccess(false);
            pageResultInfo.setCode(-1);
        }

        return pageResultInfo;
    }

    /**
     *创建  失败的  分页信息
     * @param list
     * @return
     */
    public PageResultInfo createPageResultInfoOfFail (List list){
        PageInfo<?> pageInfo=new PageInfo<>(list);
        PageResultInfo pageResultInfo=new PageResultInfo();
        pageResultInfo.setCount((int)pageInfo.getTotal());
        pageResultInfo.setData(list);
        pageResultInfo.setSuccess(false);
        return pageResultInfo;
    }

    /**
     *创建  失败的  分页信息
     * @param
     * @return
     */
    public PageResultInfo createPageResultInfoOfFail (){
        PageResultInfo pageResultInfo=new PageResultInfo();
        pageResultInfo.setSuccess(false);
        return pageResultInfo;
    }




    /**
     * 创建成功处理结果信息，
     * @return
     */
    public ResultInfo createResultInfo(boolean success){
        ResultInfo resultInfo = new ResultInfo();
        if(success){
            resultInfo.setType(1);
            resultInfo.setSuccess(true);
            resultInfo.setMessage("成功");
        }else {
            resultInfo.setType(0);
            resultInfo.setSuccess(false);
            resultInfo.setMessage("失败");
        }

        return resultInfo;
    }

    /**
     * 创建 失败的 处理结果信息
     * @return
     */
    public ResultInfo createResultInfoOfFail(){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setType(0);
        resultInfo.setSuccess(false);
        resultInfo.setMessage("失败，请重试！");
        return resultInfo;
    }
}
