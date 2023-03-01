package br.ufg.ubiquos.ma.dtos;

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
public class DTOUsuario {
	
	@NotNull
	@NotEmpty
	private String usuario;

	@NotNull
	@NotEmpty
	private String senha;

}
