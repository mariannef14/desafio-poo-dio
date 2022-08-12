package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<String> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private int cargaHoraria;

    public Bootcamp() {}
	
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<String> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<String> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public int getCargaHoraria() {

		return cargaHoraria = conteudos.stream()
				.mapToInt(conteudo -> conteudo.getCargaHoraria())
				.sum();
		
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    public void gerarCertificado(Dev dev) {
		
		if(this.getDevsInscritos().contains(dev.getNome())) {
			if(dev.conteudosInscritos.isEmpty()) {
				LocalDate dataAtual = LocalDate.now();
				DateTimeFormatter formatarData =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
				System.out.printf("Certificamos que %s em " + formatarData.format(dataAtual) + ", concluiu o bootcamp %s com carga horária de %d horas \n", dev.getNome(), this.getNome(), this.getCargaHoraria());
			} else {
				System.out.println("Você ainda não concluiu os seguintes conteúdos: " + dev.getConteudosInscritos());
			}
		} else {
			System.out.println("Você não está inscrito no bootcamp");
		}
		
	}
}
