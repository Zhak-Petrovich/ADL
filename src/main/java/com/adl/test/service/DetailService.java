package com.adl.test.service;

import com.adl.test.model.Detail;
import com.adl.test.to.DetailTo;

import java.util.List;

public interface DetailService {
    List<Detail> getAllDetails();
    List<DetailTo> getDetailTos(List<Detail> details);
}
