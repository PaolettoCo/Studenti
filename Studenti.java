public class Studenti {
    private String nome;
    private String surname;
    private double ID;

    public Studenti (String nome, String surname, double ID) {
        this.nome = nome;
        this.surname = surname;
        this.ID = ID;
    }
    public String getNome() {
        return nome;
    }
    public String getSurname() {
        return surname;
    }
    public double getId() {
        return ID;
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "nome='" + nome + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                '}';
    }
}
