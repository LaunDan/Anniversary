package annniversary;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class Person {
    private String name;
    private LocalDate birthday;



    public String getName() {
        return name;
    }

    public Person(String name, LocalDate birthday) throws IllegalArgumentException {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name is too short..");
        }
        if (birthday.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Anniversary. Date of birth can't be in the future..");
        }

        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public long getAge(){
        TemporalAmount betwen = Period.between(birthday, LocalDate.now());
        long age = betwen.get(ChronoUnit.YEARS);
        return age;
    }

    public long howSoon(){
        long sooner = ChronoUnit.DAYS.between(LocalDate.now(), birthday);
        return sooner;
    }

}
