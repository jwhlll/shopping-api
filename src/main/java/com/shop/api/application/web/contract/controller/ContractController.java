package com.shop.api.application.web.contract.controller;

import com.shop.api.application.web.common.model.Response;
import com.shop.api.application.web.contract.model.ContractDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.shop.api.infrastructure.feign.ExampleClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Tag(name = "contract", description = "계약 API")
@RestController
@RequestMapping("/contract")
@RequiredArgsConstructor
public class ContractController {

    private final ExampleClient exampleClient;

    @Operation(summary = "계약 조회", description = "계약 내용을 조회합니다.")
    @GetMapping(value = "/v1/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getContract() {
        return ResponseEntity.ok(Response.success());
    }

    @Operation(summary = "테스트1", description = "테스트1")
    @GetMapping(value = "/v1/test/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response<String>> getTest1(@PathVariable("id") String id) {
        return ResponseEntity.ok(Response.success(exampleClient.login(id)));
    }

    @Operation(summary = "테스트2", description = "테스트2", responses = {
            @ApiResponse(responseCode = "200", description = "테스트 성공", content = @Content(schema = @Schema(implementation = ContractDto.class)))
    })
    @PostMapping(value = "/v1/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response<ContractDto>> getTest2(@RequestBody @Valid ContractDto contractDto) {
        return ResponseEntity.ok(Response.success(contractDto));
    }
}
