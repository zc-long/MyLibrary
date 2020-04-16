package com.zcl.library.service;

import com.zcl.library.pojo.Admin;

public interface AdminService {
    Admin select(Admin ad);

    void alterpwd(Admin ad);
}
