public class Converter {
    int convertToKm(int steps){
        int km = (steps*75) / 100000;
        return km;

        // Y необязательно в данном случае создавать целую переменную
        // нужное значение можно сразу возвращать
        // return (steps * 75) / 100000;
    }
    int convertStepsToKilocalories(int steps){
        int kilocal = (steps * 50) / 1000;
        return kilocal;

        // Y необязательно в данном случае создавать целую переменную
        // нужное значение можно сразу возвращать
    }

}
