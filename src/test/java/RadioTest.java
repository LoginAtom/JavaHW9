
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldMinimumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaximumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinimumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaximumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //увеличиваем звук на 1, если установлено на 0
    public void increaseVolumeWhenNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //увеличиваем звук на 1, если установлено на 99
    public void increaseVolumeWhenNinetyNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //увеличиваем звук на 1, если установлено на 100(максимум)
    public void increaseVolumeWhenMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //уменьшаем звук на 1, если установлено на 100(максимум)
    public void decreaseVolumeWhenMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //уменьшаем звук на 1, если установлено на 1 )
    public void decreaseVolumeWhenOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //уменьшаем звук на 1, если установлено на 0 минимум)
    public void decreaseVolumeWhenMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //переключаем на следующую станцию, если установлено на 0
    public void increaseStationWhenNull() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.increaseStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //переключаем на следующую станцию, если установлено на 8
    public void increaseStationWhenEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.increaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //переключаем на следующую станцию, если установлено на 9 максимум
    public void increaseStationWhenMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //переключаем на предыдущую станцию, если установлено на 9 максимум
    public void decreaseStationWhenMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.decreaseStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //переключаем на предыдущую станцию, если установлено на 1
    public void decreaseStationWhenOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.decreaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   //переключаем на предыдущую станцию, если установлено на 0
    public void decreaseStationWhenNull() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
