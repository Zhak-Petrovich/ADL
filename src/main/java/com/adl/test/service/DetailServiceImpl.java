package com.adl.test.service;

import com.adl.test.model.Detail;
import com.adl.test.repository.DetailRepository;
import com.adl.test.to.DetailTo;
import com.adl.test.util.DetailUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {

    private final DetailRepository repository;

    public DetailServiceImpl(DetailRepository repository) {
        this.repository = repository;
    }

    public List<Detail> getAllDetails() {
        return repository.findAll();
    }
    @Override
    public List<DetailTo> getDetailTos(List<Detail> details) {
        List<DetailTo> result = new ArrayList<>();
        for (Detail detail : details) {
            result.add(DetailUtil.createTo(detail));
        }
        return result;
    }
}
