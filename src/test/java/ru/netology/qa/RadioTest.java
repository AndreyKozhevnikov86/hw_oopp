package ru.netology.qa;
import org.junit.jupiter.api.Test;
import ru.netology.qa.Radio;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void setupStation() {            // выбор радиостанции
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupStationMoreMax() {   //выбор станции больше максимального значения
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupStation8() {            // выбор радиостанции 8
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupStation9() {            // выбор радиостанции 9
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupStation1() {            // выбор радиостанции 1
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupStation0() {            // выбор радиостанции 0
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);
        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupStationLessMin() {   //выбор станции меньше минимального значения
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {     //переключение станции вперед
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.next();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {     //переключение станции назад
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.prev();

        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax() {     //следующая станция после конечной радтостанции
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.next();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {     //предыдущая станция после первой станции
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.setCurrentRadioStation(0);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolume() {            // установка громкости
        Radio rad = new Radio();
        rad.setCurrentVolume(55);

        int expected = 55;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupMinVolume() {            // установка громкости минимальной
        Radio rad = new Radio();
        rad.setCurrentVolume(31);
        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupMaxVolume() {            // установка громкости максимальной
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolume1() {            // установка громкости 1
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolumeLessMin() {            // установка громкости меньше минимального значения
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolumeMoreMax() {            // установка громкости больше максимального значения
        Radio rad = new Radio();
        rad.setCurrentVolume(123);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolumeUp() {            // увелечение громкости на +1
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.volumeUp();
        int expected = 2;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolumeDown() {            // уменьшение громкости на -1
        Radio rad = new Radio();
        rad.setCurrentVolume(54);
        rad.volumeDown();
        int expected = 53;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolumeMaxMore() {            // Увеличение громкости на +1 при максимальной громкости
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.volumeUp();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setupVolumeMinLess() {            // Уменьшение громкости на -1 при минимальной громкости
        Radio rad = new Radio();
        rad.setCurrentVolume(34);
        rad.setCurrentVolume(0);
        rad.volumeDown();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}



