package com.game.assistance.controller;

import com.game.assistance.response.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

/**
 * Created by wenqing on 2016/6/12 0012.
 */
@RestController
@Api(value = "测试类接口", produces = MediaType.APPLICATION_JSON)
public class TestController {

    @ApiOperation(value = "测试接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "testID", value = "Activity ID", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String", paramType = "header"),
    })
    @RequestMapping(value = "test/{testID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    public BaseResponse test(TestRequest testRequest){
        return new BaseResponse(1,"success");
    }

}

class TestRequest{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "TestRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
