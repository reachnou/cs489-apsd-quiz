package edu.miu.cs489.apsdquiz1.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmailAddresses {
    private String email;
    private String label;

    @Override
    public String toString() {
        return "{" +
                "\"email\": " + "\"" + email + "\"" +
                ", \"label\": " + "\"" + label + "\"" +
                '}';
    }
}
