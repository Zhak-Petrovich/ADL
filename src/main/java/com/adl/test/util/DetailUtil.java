package com.adl.test.util;

import com.adl.test.model.*;
import com.adl.test.repository.AssemblyDetTypeRepository;
import com.adl.test.repository.DetailLifeRepository;
import com.adl.test.repository.MaterialTypeRepository;
import com.adl.test.repository.ProjectRepository;
import com.adl.test.to.DetailTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DetailUtil {
    private static MaterialTypeRepository materialTypeRepository;
    private static AssemblyDetTypeRepository assemblyDetTypeRepository;
    private static ProjectRepository projectRepository;
    private static DetailLifeRepository detailLifeRepository;

    @Autowired
    public void setDetailLifeRepository(DetailLifeRepository detailLifeRepository) {
        DetailUtil.detailLifeRepository = detailLifeRepository;
    }

    @Autowired
    public void setMaterialTypeRepository(MaterialTypeRepository materialTypeRepository) {
        DetailUtil.materialTypeRepository = materialTypeRepository;
    }

    @Autowired
    public void setAssemblyDetTypeRepository(AssemblyDetTypeRepository assemblyDetTypeRepository) {
        DetailUtil.assemblyDetTypeRepository = assemblyDetTypeRepository;
    }

    @Autowired
    public void setProjectRepository(ProjectRepository projectRepository) {
        DetailUtil.projectRepository = projectRepository;
    }

    public static DetailTo createTo(Detail detail) {
        MaterialType materialType = materialTypeRepository.findById(detail.getMaterialType()).get();
        AssemblyType assemblyType = assemblyDetTypeRepository.findById(detail.getAssemblyType()).orElse(null);
        Prj prj = projectRepository.getById(detail.getProjectCase());
        LifeVersion detailLife = detailLifeRepository.findById(detail.getLifeVersion()).get();


                return new DetailTo(detail.getId(),
                prj.getName(),
                detail.getArticle(),
                detail.getNameDetail(),
                materialType.getCode(),
                assemblyType.getCode(),
                detail.getV1(),
                detail.getV2(),
                detail.getDetailQuantity(),
                detail.getDdate(),
                detail.getFullName(),
                detailLife.getName(),
                detail.getDescription());
    }
}
