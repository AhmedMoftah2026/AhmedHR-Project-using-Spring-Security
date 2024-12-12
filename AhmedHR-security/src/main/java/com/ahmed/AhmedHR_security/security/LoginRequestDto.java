package com.ahmed.AhmedHR_security.security;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
public class LoginRequestDto {

	@NotEmpty
	private String login;
	
	@NotEmpty
	private String password;
}
