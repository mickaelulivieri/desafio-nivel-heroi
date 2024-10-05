package entidade;

public class Heroi {
    private String nome;
    private int xp;
    private String nivelheroi;

    //construtor de heroi

    public Heroi(String nome, int xp){
        this.nome = nome;
        this.xp = xp;
        this.nivelheroi = qualorankdexp();
    }
    //Getters e Setters do nosso heroi (deixei apenas os que se usará no exercicio proposto ;))

    public String getNome() {
        return nome;
    }

    public int getXp() {
        return xp;
    }

    public String getNivelheroi() {
        return nivelheroi;
    }

    //metodo

    public String qualorankdexp(){
        if (xp < 1000) {
            nivelheroi = "Ferro";
        } else if (xp <= 2000) {
            nivelheroi = "Bronze";
        } else if (xp <= 5000) {
            nivelheroi = "Prata";
        } else if (xp <= 7000) {
            nivelheroi = "Ouro";
        } else if (xp <= 8000) {
            nivelheroi = "Platina";
        } else if (xp <= 9000) {
            nivelheroi = "Ascendente";
        } else if (xp <= 10000) {
            nivelheroi = "Imortal";
        } else {
            nivelheroi = "Radiante"; // Para XP maior ou igual a 10.001
        }

        return nivelheroi;
    }



}
