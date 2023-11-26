package com.example.DnD.Services;

import com.example.DnD.DnDRepository.DnDRepository;
import com.example.DnD.Models.DnDModel;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service
public class DnDService {
    final DnDRepository dndRepository;
    public DnDService(DnDRepository dndRepository){
        this.dndRepository = dndRepository;
    }
    @Transactional
    public DnDModel save(DnDModel dndModel){
        return dndRepository.save(dndModel);
    }

    public Page<DnDModel> findAll(Pageable pageable) {
        return dndRepository.findAll(pageable);
    }

    public Optional<DnDModel> findById(UUID id) {
        return dndRepository.findById(id);
    }
    @Transactional
    public void delete(DnDModel dndModel) {
        dndRepository.delete(dndModel);
    }
}
