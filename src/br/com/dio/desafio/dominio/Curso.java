package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    public Curso() {}
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		setTitulo(titulo);
		setDescricao(descricao);
		setCargaHoraria(cargaHoraria);	
	}

    @Override
    public double calcularXP() {
        return XP_PADRAO * getCargaHoraria();
    }


    @Override
    public String toString() {
        return "Curso -> T�tulo: " + getTitulo() + " | Descri��o: " + getDescricao() + " | Carga Hor�ria: " + getCargaHoraria() + "h";
    }

}
