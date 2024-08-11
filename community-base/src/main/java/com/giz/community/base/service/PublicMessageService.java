package com.giz.community.base.service;

import com.giz.community.base.vo.PublicMessageVo;

/**
 * @author gzq44
 * @date 2024/08/11 17:07
 */
public interface PublicMessageService {
    /**
     * 创建消息
     * @param vo
     * @return
     */
    boolean createMessage(PublicMessageVo vo);

    /**
     * 更新消息
     * @param vo
     * @return
     */
    boolean updateMessage(PublicMessageVo vo);

    /**
     * 删除消息
     * @param vo
     * @return
     */
    boolean deleteMessage(PublicMessageVo vo);

    /**
     * 查询消息
     * @param vo
     * @return
     */
    boolean selectMessage(PublicMessageVo vo);
}
