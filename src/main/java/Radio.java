public class Radio {
    private int currentStation; // номер текущей радиостанции (от 0 до 9)
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public void nex() {
        if (currentStation != maxStation) {
            currentStation++;
            {
                return;
            }
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }


    // Геттеры


    public int getCurrentStation() {
        return currentStation;
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


}
