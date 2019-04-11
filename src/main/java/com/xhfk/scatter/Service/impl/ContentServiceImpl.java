package com.xhfk.scatter.Service.impl;

import com.xhfk.scatter.Service.IContentService;
import com.xhfk.scatter.dao.ContentVoMapper;
import com.xhfk.scatter.vo.ContentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContentServiceImpl implements IContentService {
    @Resource
    private ContentVoMapper contentVoMapper;

    @Override
    public List<ContentVo> getContents(Integer p, Integer limit) {
        List<ContentVo> contentVoList = contentVoMapper.selectByExampleWithBLOBs();
        return contentVoList;
    }
}
