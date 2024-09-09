package com.accurate.calculator.repositories;

import com.accurate.calculator.models.ResultModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface ResultRepository extends JpaRepository<ResultModel, UUID>, JpaSpecificationExecutor<ResultModel> {
}
