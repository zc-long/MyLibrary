package com.zcl.library.dao;

import com.zcl.library.pojo.Admin;

public interface AdminMapper {
    Admin select(Admin ad);

    void alterpwd(Admin ad);
}
