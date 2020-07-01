import java.util.Objects;

public class Login {

    String user;
    String psw;


    public Login() {
    }

    public Login(String user, String psw) {
        this.user = user;
        this.psw = psw;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Login)) return false;
        Login login = (Login) o;
        return getUser().equals(login.getUser()) &&
                getPsw().equals(login.getPsw());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getPsw());
    }

    @Override
    public String toString() {
        return "Login{" +
                "user='" + user + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
