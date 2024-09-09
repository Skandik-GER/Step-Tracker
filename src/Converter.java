public class Converter {
    int convertToKm(int steps){
        int km = (steps*75) / 100000;
        return km;
    }
    int convertStepsToKilocalories(int steps){
        int kilocal = (steps * 50) / 1000;
        return kilocal;
    }

}
