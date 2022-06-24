package org.example;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Phone {

    private String mob;

    public void init(){

    }

    public void destroy(){

    }
    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }


    public Phone(String mob) {
        this.mob = mob;
               mob.split("");
    }

    @Override
    public String toString() {
            return "Phone{" +
                    "mobile='" + mob + '\'' +
                    '}';
    }
}

