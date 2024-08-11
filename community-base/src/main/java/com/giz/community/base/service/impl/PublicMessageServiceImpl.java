package com.giz.community.base.service.impl;

import com.giz.community.base.service.PublicMessageService;
import com.giz.community.base.vo.PublicMessageVo;
import com.giz.community.common.utils.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author gzq44
 * @date 2024/08/11 17:08
 **/
@Service
public class PublicMessageServiceImpl implements PublicMessageService {
    @Override
    public boolean createMessage(PublicMessageVo vo) {
        return StringUtils.equals(vo.getUserName(), "gzq44") && StringUtils.equals(vo.getPassword(), "123456");
    }

    @Override
    public boolean updateMessage(PublicMessageVo vo) {
        return false;
    }

    @Override
    public boolean deleteMessage(PublicMessageVo vo) {
        return false;
    }

    @Override
    public boolean selectMessage(PublicMessageVo vo) {
        return false;
    }
}
