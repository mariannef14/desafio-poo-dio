package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria() {}
	
	public Mentoria(String titulo, String descricao, int cargaHoraria, LocalDate data) {
		setTitulo(titulo);
		setDescricao(descricao);
		setCargaHoraria(cargaHoraria);
		this.data = data;	
	}

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
		return "Mentoria -> Título: " + getTitulo() + " | Descrição: " + getDescricao() + " | Carga Horária: " + getCargaHoraria() +  " | Data: " + data;
    }

}
