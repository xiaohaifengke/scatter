package com.xhfk.scatter.controller;


import com.xhfk.scatter.Service.IContentService;
import com.xhfk.scatter.vo.ContentVo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 博客首页控制
 *
 * @author Jhail
 * @data 2019/04/04
 * */
@RestController
@RequestMapping("api/v0/articles")
public class BlogController {

    @Autowired
    private IContentService contentService;

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public JSONArray articleList(HttpServletRequest request) {
        List<ContentVo> contentVoList = contentService.getContents(null, null);
        System.out.print(contentVoList);
//        JSONObject json = new JSONObject();
        JSONArray json = JSONArray.fromObject(contentVoList);
        return json;
    }

}
