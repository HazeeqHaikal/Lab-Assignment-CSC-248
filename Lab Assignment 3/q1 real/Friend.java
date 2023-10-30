public class Friend {
    private int idno;
    private String name, hpno, email;

    public Friend(int idno, String name, String hpno, String email) {
        this.idno = idno;
        this.name = name;
        this.hpno = hpno;
        this.email = email;
    }

    public int getIdno() {
        return this.idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHpno() {
        return this.hpno;
    }

    public void setHpno(String hpno) {
        this.hpno = hpno;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
