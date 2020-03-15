import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public Person(String name, LocalDate birthday) throws IllegalArgumentException {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name is too short..");
        }
        if (birthday.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of birthday can't be in the future..");
        }

        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name;
    }
}
