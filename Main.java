import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" curso java");
        curso1.setDescricao(" descrição curso java");
        curso1.setCargaHoraria(8);
        


        Curso curso2 = new Curso();
        curso2.setTitulo(" curso js");
        curso2.setDescricao(" descrição curso js");
        curso2.setCargaHoraria(4);
        

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descriação mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso2);
        System.out.println(curso1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJackson = new Dev();
        devJackson.setNome("Jackson");
        devJackson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Jackson " + devJackson.getConteudosInscrito());
        devJackson.progredir();
        devJackson.progredir();
        devJackson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Jackson " + devJackson.getConteudosInscrito());
        System.out.println("Conteúdos concluídos de Jackson " + devJackson.getConteudosConcluidos());
        System.out.println("XP: " + devJackson.calcularTotalXp());


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Camila " + devCamila.getConteudosInscrito());
        devCamila.progredir();
        devJackson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Camila " + devCamila.getConteudosInscrito());
        System.out.println("Conteúdos concluídos de Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());




    }
}