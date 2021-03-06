package com.shanxiut.scs.auth.service;

import com.shanxiut.scs.auth.entity.Resource;
import com.shanxiut.scs.service.SuperService;

import java.util.List;

/**
 * @author LiHaitao
 * @description ResourceService:
 * @date 2019/3/7 17:01
 **/
public interface ResourceService extends SuperService<Resource,Long> {
    List<Resource> selectOwnerResourceByRoleId(Long id);
}
