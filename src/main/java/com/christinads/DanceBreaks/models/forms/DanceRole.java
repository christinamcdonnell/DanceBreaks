package com.christinads.DanceBreaks.models.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Christy on 3/20/2018.
 */
public class DanceRole {
}


package com.christinads.DanceBreaks.models;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;
        import javax.persistence.*;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;
        import java.util.List;

/**
 * Created by Christy on 3/20/2018.
 */
@Entity
public class DanceType {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=8, max=50)
    private String name;

    @NotNull
    @Size(min=8, max=15, message = "Password must not be empty")
    private String nickname;

    public DanceType() { }

    public DanceType(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname(){ return this.nickname; }

    public void setNickname(String nickname) { this.nickname = nickname; }
}
