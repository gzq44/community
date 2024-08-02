package com.giz.community.recommend.service.impl;

import com.giz.community.recommend.service.IInterestingRecommendService;

import java.util.ArrayList;
import java.util.List;

/**
 * 社区推荐功能服务IMPL
 *
 * @author gzq44
 * @date 2024/07/28 21:58
 **/
public class InterestingRecommendService implements IInterestingRecommendService {

    @Override
    public List<String> abilityUserInterestingFactor(Long userId) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("宠物");
        strings.add("健身");
        strings.add("摄影");
        strings.add("运动");
        strings.add("钓鱼");
        return strings;
    }
}
