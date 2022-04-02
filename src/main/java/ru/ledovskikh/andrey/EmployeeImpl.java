package ru.ledovskikh.andrey;

/**
 * @author Andrey Ledovskikh
 */
public record EmployeeImpl (int id, String name, String surname) implements Employee {

    @Override
    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
