package com.example.userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserEndpoint {
    protected Logger logger = LoggerFactory.getLogger(UserEndpoint.class);
    @Value("${server.port:8200}")
    private int serverPort = 8200;
    @RequestMapping(value = "/{loginName}", method = RequestMethod.GET)
    public User detail(@PathVariable String loginName){
        String memos = "I come form " + this.serverPort;
        return User.builder().loginName(loginName)
                .name(loginName)
                .avatar("/avatar/default.png")
                .memos(memos)
                .build();
    }
}
