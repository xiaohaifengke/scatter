package com.xhfk.scatter.api.tag.restful;

import com.xhfk.scatter.api.base.vo.TagVO;
import com.xhfk.scatter.api.tag.service.TagService;
import com.xhfk.scatter.domain.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/1.0")
public class TagApi {
    @Autowired
    private TagService tagService;

    @RequestMapping(value = "tags", method = RequestMethod.GET)
    public RestResponse<List<TagVO>> listTags(@RequestParam(value = "categories", required = false) String categories) {
        List<TagVO> list;
        if ("hot".equals(categories)) {
            list = tagService.listHotTags();
        } else {
            list = tagService.listAllTags();
        }
        return RestResponse.success(list);
    }
}
