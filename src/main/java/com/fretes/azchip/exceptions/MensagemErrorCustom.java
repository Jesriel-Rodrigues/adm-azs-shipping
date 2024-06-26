package com.fretes.azchip.exceptions;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MensagemErrorCustom {

	private String timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	private List<ErrorObject> errors;
}
