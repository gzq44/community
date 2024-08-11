package com.giz.community;

import com.giz.community.base.CommunityBaseApplication;
import com.giz.community.base.service.PublicMessageService;
import com.giz.community.base.vo.PublicMessageVo;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CommunityBaseApplication.class)
class CommunityBaseApplicationTests {

    @Resource
    private PublicMessageService publicMessageService;

    @BeforeEach
    public void mockIt() {
    }

    @Test
    void test1() {
        Assertions.assertTrue(publicMessageService.createMessage(PublicMessageVo.builder().userName("gzq45").password("123456").build()));
    }

}
