public class Radio {
    private int currentStation; // номер текущей радиостанции (от 0 до 9)
    private int currentVolume;  // уровень громкости (от 0 до 100)

    // Геттеры


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //Сеттеры
    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    // Увеличиваем звук на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    // Уменьшаем звук на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    // Переключение на следующую станцию
    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    // Переключение на предыдущую станцию
    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }

}