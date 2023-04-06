package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setTitulo("Descrição mentoria Java");

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " +devCamila.calcularTotalXp());

        System.out.println("----------");

        Dev devWash = new Dev();
        devWash.setNome("Washington");
        devWash.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Wash" + devWash.getConteudosInscritos());
        devWash.progredir();
        devWash.progredir();
        devWash.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Wash" + devWash.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Wash" + devWash.getConteudosConcluidos());
        System.out.println("XP: " +devWash.calcularTotalXp());








    }
}