package br.ufg.ubiquos.ma.dtos;

import io.grpc.examples.iotservice.Sessao;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DTOAuth {

	@NotNull
	@NotEmpty
	public String token;
	
	public String funcionalidade;
	
	public static DTOAuth from(Sessao sessao) {
		return DTOAuth.builder()
				.token(sessao.getToken())
				.funcionalidade(sessao.getFuncionalidade())
				.build();
	}
}
