package com.accurate.calculator.services.impl;

import com.accurate.calculator.enums.Operation;
import com.accurate.calculator.models.ResultModel;
import com.accurate.calculator.repositories.ResultRepository;
import com.accurate.calculator.services.CalculatorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Log4j2
@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Autowired
    private ResultRepository resultRepository;

    public double sum(double a, double b) {
        double result = a + b;
        var resultModel = new ResultModel();
        resultModel.setResult(result);
        resultModel.setOperation(Operation.SUM);
        resultModel.setCreationDate(LocalDateTime.now(ZoneId.of("UTC")));
        resultModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));


        resultRepository.save(resultModel);

        return result;
    }

    public double substract(double a, double b) {
        double result = a - b;
        var resultModel = new ResultModel();
        resultModel.setResult(result);
        resultModel.setOperation(Operation.SUBSTRACT);
        resultModel.setCreationDate(LocalDateTime.now(ZoneId.of("UTC")));
        resultModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));

        resultRepository.save(resultModel);

        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        var resultModel = new ResultModel();
        resultModel.setResult(result);
        resultModel.setOperation(Operation.MULTIPLY);
        resultModel.setCreationDate(LocalDateTime.now(ZoneId.of("UTC")));
        resultModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));

        resultRepository.save(resultModel);

        return result;
    }

    public double divide(double a, double b) {

        if (b == 0) {
            log.warn("Division by zero is not allowed.");
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }

        double result = a / b;
        var resultModel = new ResultModel();
        resultModel.setResult(result);
        resultModel.setOperation(Operation.DIVIDE);
        resultModel.setCreationDate(LocalDateTime.now(ZoneId.of("UTC")));
        resultModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));

        resultRepository.save(resultModel);

        return result;
    }

    /*
    @Override
    public void save(ResultModel result) {
        resultRepository.save(result);
    }


    @Override
    public void delete(ResultModel resultModel) {
        resultRepository.delete(resultModel);
    }

    @Override
    public Optional<ResultModel> findById(UUID resultId) {
        return resultRepository.findById(resultId);
    }

    @Override
    public Page<ResultModel> findAll(Specification<ResultModel> spec, Pageable pageable) {
        return resultRepository.findAll(spec, pageable);
    }
    */
}
