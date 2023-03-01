package br.ufg.ubiquos.ma.dtos;

import java.util.List;

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
public class DTOLocalizacao {

	private String localizacao;
	
	private List<DTODispositivo> dispositivos;
}
