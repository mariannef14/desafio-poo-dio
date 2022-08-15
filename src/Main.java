import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Desenvolvimento b�sico em Java");
		curso1.setDescricao("Aprenda desde os conceitos e instala��o at� a execu��o de projetos em Java");
		curso1.setCargaHoraria(6);

		Curso curso2 = new Curso();
		curso2.setTitulo("Introdu��o �programa��o com Python");
		curso2.setDescricao("O curso trar� todo o embasamento da linguagem Python, quando e onde s�o mais indicado aplic�-la.");
		curso2.setCargaHoraria(8);

		Curso curso3 = new Curso();
		curso3.setTitulo("Criando aplica��es web com Spring Web MVC");
		curso3.setDescricao("O Spring Web MVC re�ne v�rias fun��es em apenas uma ferramenta que otimiza o trabalho do desenvolvedor.");
		curso3.setCargaHoraria(7);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("O time de Education da DIO falar� sobre essa linguagem que � muito usada no mercado");
		mentoria1.setCargaHoraria(2);
		mentoria1.setData(LocalDate.now());

		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);

		Dev dev1 = new Dev();
		dev1.setId(14);
		dev1.setNome("Marianne");
		dev1.inscreverBootcamp(bootcamp1);
		System.out.println("Conte�dos Inscritos Marianne:" + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conte�dos Conclu�dos Marianne:" + dev1.getConteudosConcluidos());
		System.out.println("XP:" + dev1.calcularTotalXP());

		bootcamp1.gerarCertificado(dev1);


		Dev dev2 = new Dev(7, "Josu�");
		bootcamp1.gerarCertificado(dev2);

	}

}
