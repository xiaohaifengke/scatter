package com.xhfk.scatter.api.tag.service;

import com.xhfk.scatter.api.base.vo.TagVO;
import com.xhfk.scatter.dao.TagVOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    private TagVOMapper tagDao;

    public List<TagVO> listAllTags () {
        return tagDao.listAllTags();
    }

    public List<TagVO> listHotTags () {
        return tagDao.listHotTags();
    }

}
