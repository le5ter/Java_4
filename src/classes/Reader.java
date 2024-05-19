package classes;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс Reader предоставляет функциональность для чтения данных из CSV-файла и заполнения списка объектов Human.
 */
public class Reader {

    /**
     * Читает указанный CSV-файл и возвращает список объектов Human, полученных из файла.
     *
     * @param csvFileName Имя CSV-файла для чтения.
     * @return Список объектов Human, содержащий данные из CSV-файла.
     */
    public static List<Human> readCsvFile(String csvFileName) {
        List<Human> humans = new ArrayList<>();

        try (InputStream inputStream = Reader.class.getClassLoader().getResourceAsStream(csvFileName);
             InputStreamReader reader = new InputStreamReader(inputStream);
             CSVReader csvReader = new CSVReaderBuilder(reader)
                     .withCSVParser(new com.opencsv.CSVParserBuilder().withSeparator(';').build())
                     .withSkipLines(1)
                     .build()) {

            List<String[]> records = csvReader.readAll();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            for (String[] record : records) {
                int id = Integer.parseInt(record[0]);
                String name = record[1];
                String gender = record[2];
                LocalDate birthDate = LocalDate.parse(record[3], formatter);
                char divisionTitle = record[4].charAt(0);
                int salary = Integer.parseInt(record[5]);

                Division division = new Division(divisionTitle);
                Human human = new Human(id, name, gender, division, salary, birthDate);

                humans.add(human);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return humans;
    }
}