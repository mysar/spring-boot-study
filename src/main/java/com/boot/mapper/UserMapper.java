package com.boot.mapper;

import com.boot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Im.Yan on 2017/8/21.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id} ")
    User findById(Integer id);

}
