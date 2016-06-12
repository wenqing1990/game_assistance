package com.game.assistance.controllers;

import com.game.assistance.response.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

/**
 * Created by wenqing on 2016/6/12 0012.
 */
@RestController
@Api(value = "活动类接口", produces = MediaType.APPLICATION_JSON)
public class TestController {

    @ApiOperation(value = "测试接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "testID", value = "Activity ID", required = true, dataType = "String", paramType = "path")
    })
    @RequestMapping(value = "test/{testID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    public BaseResponse test(){
        return new BaseResponse(1,"success");
    }

}
