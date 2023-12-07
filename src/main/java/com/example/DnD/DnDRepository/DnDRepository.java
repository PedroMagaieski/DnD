package com.example.DnD.DnDRepository;

import com.example.DnD.Models.DnDModel;
import com.example.DnD.Models.DnDModelCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DnDRepository extends JpaRepository<DnDModel, UUID> {

}
