package com.suzhou.cabinet.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suzhou.cabinet.entity.Cabinet;
import com.suzhou.cabinet.entity.User;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author suz
 * @since 2020-03-23
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<Cabinet> {

    User selUser(@Param("loginUser") User loginUser);
}
