import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test

    public void testFindAll() {
        Manager manager = new Manager();
        String movie1 = "Миссия невыполнима";
        String movie2 = "Миссия невыполнима 2";
        String movie3 = "Миссия невыполнима 3";
        String movie4 = "Миссия невыполнима: Протокол Фантом";
        String movie5 = "Миссия невыполнима: Племя изгоев";
        String movie6 = "Миссия невыполнима: Последствия";
        String movie7 = "Миссия невыполнима: Смертельная расплата";
        String movie8 = "Миссия невыполнима 8";

        manager.add(movie1);
        manager.add(movie3);
        manager.add(movie5);
        String[] actual = manager.findAll();
        String[] expected = {movie1, movie3, movie5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastWhenLimitEqualsSize() {
        Manager manager = new Manager();
        String movie1 = "Миссия невыполнима";
        String movie2 = "Миссия невыполнима 2";
        String movie3 = "Миссия невыполнима 3";
        String movie4 = "Миссия невыполнима: Протокол Фантом";
        String movie5 = "Миссия невыполнима: Племя изгоев";
        String movie6 = "Миссия невыполнима: Последствия";
        String movie7 = "Миссия невыполнима: Смертельная расплата";
        String movie8 = "Миссия невыполнима 8";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastWhenLimitMoreSize() {
        Manager manager = new Manager();
        String movie1 = "Миссия невыполнима";
        String movie2 = "Миссия невыполнима 2";
        String movie3 = "Миссия невыполнима 3";
        String movie4 = "Миссия невыполнима: Протокол Фантом";
        String movie5 = "Миссия невыполнима: Племя изгоев";
        String movie6 = "Миссия невыполнима: Последствия";
        String movie7 = "Миссия невыполнима: Смертельная расплата";
        String movie8 = "Миссия невыполнима 8";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastWhenLimitLessSize() {
        Manager manager = new Manager();
        String movie1 = "Миссия невыполнима";
        String movie2 = "Миссия невыполнима 2";
        String movie3 = "Миссия невыполнима 3";
        String movie4 = "Миссия невыполнима: Протокол Фантом";
        String movie5 = "Миссия невыполнима: Племя изгоев";
        String movie6 = "Миссия невыполнима: Последствия";
        String movie7 = "Миссия невыполнима: Смертельная расплата";
        String movie8 = "Миссия невыполнима 8";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastWhenLimitEqualsSizeWithCustomLimit() {
        Manager manager = new Manager(3);
        String movie1 = "Миссия невыполнима";
        String movie2 = "Миссия невыполнима 2";
        String movie3 = "Миссия невыполнима 3";
        String movie4 = "Миссия невыполнима: Протокол Фантом";
        String movie5 = "Миссия невыполнима: Племя изгоев";
        String movie6 = "Миссия невыполнима: Последствия";
        String movie7 = "Миссия невыполнима: Смертельная расплата";
        String movie8 = "Миссия невыполнима 8";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastWhenLimitMoreSizeWithCustomLimit() {
        Manager manager = new Manager(8);
        String movie1 = "Миссия невыполнима";
        String movie2 = "Миссия невыполнима 2";
        String movie3 = "Миссия невыполнима 3";
        String movie4 = "Миссия невыполнима: Протокол Фантом";
        String movie5 = "Миссия невыполнима: Племя изгоев";
        String movie6 = "Миссия невыполнима: Последствия";
        String movie7 = "Миссия невыполнима: Смертельная расплата";
        String movie8 = "Миссия невыполнима 8";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastWhenLimitLessSizeWithCustomLimit() {
        Manager manager = new Manager(2);
        String movie1 = "Миссия невыполнима";
        String movie2 = "Миссия невыполнима 2";
        String movie3 = "Миссия невыполнима 3";
        String movie4 = "Миссия невыполнима: Протокол Фантом";
        String movie5 = "Миссия невыполнима: Племя изгоев";
        String movie6 = "Миссия невыполнима: Последствия";
        String movie7 = "Миссия невыполнима: Смертельная расплата";
        String movie8 = "Миссия невыполнима 8";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6};

        Assertions.assertArrayEquals(expected, actual);
    }
}