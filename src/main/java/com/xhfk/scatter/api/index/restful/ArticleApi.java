package com.xhfk.scatter.api.index.restful;

import com.github.pagehelper.PageInfo;
import com.xhfk.scatter.api.base.PaginationRequestVO;
import com.xhfk.scatter.api.base.PaginationResponseVO;
import com.xhfk.scatter.api.index.service.ArticleService;
import com.xhfk.scatter.api.index.vo.ArticleVO;
import com.xhfk.scatter.domain.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("api/v1/articles")
public class ArticleApi {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public RestResponse<PaginationResponseVO<ArticleVO>> listArticles(@RequestParam int pageIndex, @RequestParam int pageSize) {
        PaginationRequestVO pageParams = new PaginationRequestVO(pageIndex, pageSize);
        List<ArticleVO> list = articleService.listArticles(pageParams);
        PaginationResponseVO<ArticleVO> articleResult = new PaginationResponseVO(0, list);
        return RestResponse.success(articleResult);
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public RestResponse<PaginationResponseVO<ArticleVO>> listArticlesByPageHelper(@RequestBody PaginationRequestVO page) {
        PageInfo<ArticleVO> pageInfo = articleService.listArticlesByPageHelper(page);
        List<ArticleVO> list = pageInfo.getList();
        PaginationResponseVO<ArticleVO> articleResult = new PaginationResponseVO((int) pageInfo.getTotal(), list);
        return RestResponse.success(articleResult);
    }
}
