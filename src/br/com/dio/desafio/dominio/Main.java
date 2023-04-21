package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java como Programar");
        curso.setDescricao("Como fazer tudo em java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Node como Programar");
        curso2.setDescricao("Como fazer tudo em node");
        curso2.setCargaHoraria(80);

        Conteudo conteudo = new Curso();
        conteudo.setTitulo("Node como Programar");
        conteudo.setDescricao("Como fazer tudo em node");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Ensinando java");
        mentoria.setDescricao("MEntoria de java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);
//        System.out.println(conteudo);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição boocampo java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEderson = new Dev();
        devEderson.setNome("Ederson");
        devEderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ederson: " + devEderson.getConteudoInscritos());
        devEderson.progedir();
        devEderson.progedir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Ederson: " + devEderson.getConteudoInscritos());
        System.out.println("Conteudos Concluídos Ederson: " + devEderson.getConteudosConcluidos());
        System.out.println("XP: " + devEderson.calcularTotalXp());

        System.out.println("-------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudoInscritos());
        devJoao.progedir();
        devJoao.progedir();
        devJoao.progedir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudoInscritos());
        System.out.println("Conteudos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
