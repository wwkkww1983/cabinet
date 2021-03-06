package com.suzhou.cabinet.service;


import com.suzhou.cabinet.entity.User;
import com.suzhou.cabinet.mapper.UserMapper;
import com.suzhou.cabinet.utils.RestResult;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.suzhou.cabinet.utils.RestResult.fail;
import static com.suzhou.cabinet.utils.RestResult.success;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author suz
 * @since 2020-03-23
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public RestResult<String> login(User loginUser) {
        User user = userMapper.selUser(loginUser);
        if(user!=null){
            return success("success");
        }
        return fail("login error","user do not exist");
    }

}
