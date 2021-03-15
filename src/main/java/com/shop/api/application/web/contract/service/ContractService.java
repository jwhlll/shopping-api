package com.shop.api.application.web.contract.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 계약 Service
 * @author
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ContractService {
    
    /**
     * 계약 조회
     */
    public void getContract() {

    }
}
