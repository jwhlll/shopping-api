package com.shop.api.application.web.contract.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * 계약 Dto
 * @author
 */
@Schema(description = "계약")
@Getter @Setter
public class ContractDto {

    @Schema(description = "유형", defaultValue = "0", allowableValues = {"0", "1", "2"})
    @Size(min=1, max=1, message="Type size must be less than 1 character")
    private String type;

    @Schema(description = "제목", maxLength = 100)
    @NotBlank(message="Title is not Blank")
    @Size(max=100, message="Title size must be less than 100 character")
    private String title;

    @Schema(description = "내용", maxLength = 500)
    @NotNull(message = "Content is not null")
    @Size(max=500, message="Content size must be less than 500 character")
    private String content;
}
