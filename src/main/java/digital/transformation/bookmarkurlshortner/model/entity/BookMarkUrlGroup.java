package digital.transformation.bookmarkurlshortner.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="group", schema = "bookmarkurlshortner")
//@Embeddable
public class BookMarkUrlGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String description;
    private Date created_date;
    private String created_by;
    private String tribe;
    private String team;
    private String component;
    private Date updated_date;
    private String updated_by;
    private Boolean active;

    private String admin;
}
