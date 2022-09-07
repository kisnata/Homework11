import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() { return name; }
    public String getSurName() { return surname; }
    public String getFullName() { return name + " " + surname; }
        @Override
        public int hashCode() {
        return Objects.hash(name, surname);
        }
        @Override
        public boolean equals(Object obj) { return super.equals(obj);
        }
        @Override
        public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';

                }

            }