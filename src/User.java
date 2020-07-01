import java.util.Date;
import java.util.Objects;

public class User {

    String cognome;
    String nome;
    Integer id_user;
    String email;
    Date nascita;

    public User() {
    }

    public User(String cognome, String nome, String email, Date nascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.email = email;
        this.nascita = nascita;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascita() {
        return nascita;
    }

    public void setNascita(Date nascita) {
        this.nascita = nascita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId_user().equals(user.getId_user()) &&
                getEmail().equals(user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_user(), getEmail());
    }
}
