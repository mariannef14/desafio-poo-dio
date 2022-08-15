import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Desenvolvimento básico em Java");
		curso1.setDescricao("Aprenda desde os conceitos e instalação até a execução de projetos em Java");
		curso1.setCargaHoraria(6);

		Curso curso2 = new Curso();
		curso2.setTitulo("Introdução à programação com Python");
		curso2.setDescricao("O curso trará todo o embasamento da linguagem Python, quando e onde são mais indicado aplicá-la.");
		curso2.setCargaHoraria(8);

		Curso curso3 = new Curso();
		curso3.setTitulo("Criando aplicações web com Spring Web MVC");
		curso3.setDescricao("O Spring Web MVC reúne várias funções em apenas uma ferramenta que otimiza o trabalho do desenvolvedor.");
		curso3.setCargaHoraria(7);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("O time de Education da DIO falará sobre essa linguagem que é muito usada no mercado");
		mentoria1.setCargaHoraria(2);
		mentoria1.setData(LocalDate.now());

		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);

		Dev dev1 = new Dev();
		dev1.setId(14);
		dev1.setNome("Marianne");
		dev1.inscreverBootcamp(bootcamp1);
		System.out.println("Conteúdos Inscritos Marianne:" + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteúdos Concluídos Marianne:" + dev1.getConteudosConcluidos());
		System.out.println("XP:" + dev1.calcularTotalXP());

		bootcamp1.gerarCertificado(dev1);


		Dev dev2 = new Dev(7, "Josué");
		bootcamp1.gerarCertificado(dev2);

	}

}
