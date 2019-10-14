package com.education.sample.service.sendMessage;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {
    @RequestMapping(value = "/send-message", method = RequestMethod.PUT)
    public ResponseClass handleRequest(@RequestBody RequestClass requestClass) throws Exception {
        return new ResponseClass(
                String.format("User: %s | clicked the button!", requestClass.getUserName()),
                200,
                "SUCCESS"
        );
    }
}
