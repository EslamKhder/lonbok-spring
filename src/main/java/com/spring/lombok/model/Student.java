package com.spring.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Student {

    private Long id;

    private String name;

    private String address;

    private String age;

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Student student = (Student)obj;
        return this.id == student.getId() && this.getName() == student.getName()
                && this.getAddress() == student.getAddress() && this.getAge() == student.getAge();
    }

    @Override
    public int hashCode() {
        return (int) (id * name.hashCode() * age.hashCode() * address.hashCode());
    }*/
}
