package classes;

import java.time.LocalDate;

/**
 * The Human class represents a person with attributes such as ID, name, gender, division, salary, and birth date.
 */
public class Human {

    private int id;
    private String name;
    private String gender;
    private Division division;
    private int salary;
    private LocalDate birthDate;

    /**
     * Конструирует объект Human с указанными параметрами.
     *
     * @param id         Уникальный идентификатор для человека
     * @param name       Имя человека
     * @param gender     Пол человека
     * @param division   Подразделение, к которому принадлежит человек
     * @param salary     Зарплата человека
     * @param birthDate  Дата рождения человека
     */
    public Human(int id, String name, String gender, Division division, int salary, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    /**
     * Получает ID человека
     *
     * @return ID человека
     */
    public int getId() { return id; }

    /**
     * Получает имя человека.
     *
     * @return Имя человека.
     */
    public String getName() { return name; }

    /**
     * Получает пол человека.
     *
     * @return Пол человека.
     */
    public String getGender() { return gender; }

    /**
     * Получает подразделение, к которому принадлежит человек.
     *
     * @return Подразделение человека.
     */
    public Division getSubdivision() { return division; }

    /**
     * Получает зарплату человека.
     *
     * @return Зарплата человека.
     */
    public int getSalary() { return salary; }

    /**
     * Получает дату рождения человека.
     *
     * @return Дата рождения человека.
     */
    public LocalDate getBirthDate() { return birthDate; }

    /**
     * Устанавливает имя человека.
     *
     * @param name Новое имя для человека.
     */
    public void setName(String name) { this.name = name; }

    /**
     * Устанавливает пол человека.
     *
     * @param gender Новый пол для человека.
     */
    public void setGender(String gender) { this.gender = gender; }

    /**
     * Устанавливает подразделение, к которому принадлежит человек.
     *
     * @param division Новое подразделение для человека.
     */
    public void setSubdivision(Division division) { this.division = division; }

    /**
     * Устанавливает зарплату человека.
     *
     * @param salary Новая зарплата для человека.
     */
    public void setSalary(int salary) { this.salary = salary; }

    /**
     * Устанавливает дату рождения человека.
     *
     * @param birthDate Новая дата рождения для человека.
     */
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
}