package br.ufg.ubiquos.ma.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DTODispositivo {
	
	@NotNull
	@NotEmpty
	private String nomeDispositivo;

	private Integer tipoDispositivo;

	@NotNull
	@NotEmpty
	private String localizacao;
	
	private Float valor;
	
	private LocalDateTime dataHoraLeitura;
	
	private Boolean estado;
}
