import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class filmsTest {
    @Test
    public void testFindAll() {
        films films = new films();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        String[] acntual = films.findAll();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, acntual);
    }

    @Test
    public void testLast() {
        films films = new films(12);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        String[] acntual = films.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, acntual);
    }



    @Test
    public void testLast2() {
        films films = new films();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Троли";
        String movie7 = "Номер один";

        films.add(movie1);
        films.add(movie2);
        films.add(movie3);
        films.add(movie4);
        films.add(movie5);
        films.add(movie6);
        films.add(movie7);
        String[] acntual = films.findLast();
        String[] expected = {movie7, movie6, movie5,movie4, movie3};

        Assertions.assertArrayEquals(expected, acntual);
    }



}