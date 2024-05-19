package classes;

import java.util.Random;

/**
 * Класс Division представляет собой подразделение или подгруппу с атрибутами, такими как ID и заголовок.
 */
public class Division {
    private int id;
    private char title;



    /**
     * Конструирует объект Division с указанным заголовком и генерирует уникальный ID.
     *
     * @param title Заголовок подразделения.
     */
    public Division(char title) {
        this.id = generateId();
        this.title = title;
    }

    /**
     * Генерирует уникальный ID для подразделения.
     *
     * @return Случайно сгенерированный уникальный ID для подразделения.
     */
    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    /**
     * Получает ID подразделения.
     *
     * @return ID подразделения.
     */
    public int getId() { return id; }

    /**
     * Получает заголовок подразделения.
     *
     * @return Заголовок подразделения.
     */
    public char getTitle() { return title; }

    /**
     * Устанавливает заголовок подразделения.
     *
     * @param title Новый заголовок для подразделения.
     */
    public void setTitle(char title) { this.title = title; }
}