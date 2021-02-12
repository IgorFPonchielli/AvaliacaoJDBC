package Classes;

import java.util.Scanner;

public abstract class Beneficiario {

	private String nomeCompleto;
	private String dataNascimento;
	private Categoria categoria;
	private String estado;
	
	public Beneficiario(String nomeCompleto, String dataNascimento, Categoria categoria, String estado) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.categoria = categoria;
		this.estado = estado;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Beneficiario [nomeCompleto=" + nomeCompleto + ", dataNascimento=" + dataNascimento + ", categoria="
				+ categoria + ", estado=" + estado + "]";
	}
	
	
			
}
