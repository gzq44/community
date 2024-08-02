package com.giz.community.recommend.service;


import java.util.List;

/**
 * 社区推荐功能服务API
 *
 * @author gzq44
 * @date 2024/07/28 21:58
 **/
public interface IInterestingRecommendService {

    /**
     *
     * 获取用户喜欢参数
     *
     * @return
     * @param userId
     */
    List<String> abilityUserInterestingFactor(Long userId);
}
