package com.example.cms.Service;

import com.example.cms.Entity.Mapping;
import com.example.cms.Response.EhrResponse;

import java.util.List;

public interface cmsService {
    List<EhrResponse> getEHR(int Id);
    boolean addMapping(Mapping map);
}
