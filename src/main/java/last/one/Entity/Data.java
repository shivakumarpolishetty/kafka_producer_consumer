package last.one.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Data {

    @Column
    private String message;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Data()
    {

    }


    public Data(String message) {
        this.message = message;

    }
    public  int getid()
    {
        return id;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
