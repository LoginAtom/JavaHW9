public class Radio {
    private int currentStation; // номер текущей радиостанции (от 0 до 9)
    private int maxStation;
    private int currentVolume;  // уровень громкости (от 0 до 100)

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    // Переключение на следующую станцию
    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0; // зацикливание
        }
    }

    // Переключение на предыдущую станцию
    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation; // зацикливание
        }
    }


    // Геттеры


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    //Сеттеры
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
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
}
