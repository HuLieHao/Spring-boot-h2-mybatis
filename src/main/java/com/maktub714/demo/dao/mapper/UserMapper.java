package com.maktub714.demo.dao.mapper;

import com.maktub714.demo.dao.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * User:  maktub
 * Date:   17/9/12 14:54
 */
@Mapper
public interface UserMapper {

    List<User> selectAll();
}