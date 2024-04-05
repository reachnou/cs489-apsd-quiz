package edu.miu.cs489.apsdquiz1.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {
    private String no;
    private String label;

    @Override
    public String toString() {
        return "{" +
                "\"email\": " + "\"" + no + "\"" +
                ", \"label\": " + "\"" + label + "\"" +
                '}';
    }
}
