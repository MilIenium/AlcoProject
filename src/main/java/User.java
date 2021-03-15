import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Users")
@NamedQueries({
        @NamedQuery(name = "findByIsAdmin", query = "from User where isAdmin = :isAdmin"),
})
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, unique = true, length = 50)
    private String secondName;


    @Column(nullable = false, unique = true, length = 50)
    private String login;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false)
    private boolean isAdmin;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Transient
    private String test;

    public User(String firstName, String secondName, String login, String password, boolean isAdmin) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
