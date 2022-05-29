package com.self.growth.task.config;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.stereotype.Component;

@Component
public class MySaTokenContext {

    public long loginUserId() {
        return StpUtil.getLoginIdAsLong();
    }
}
