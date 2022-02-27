package com.pj.dao;

import com.pj.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    User getUserById( long userId);
}
