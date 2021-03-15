package com.company;

public class Main {

    public static void main(String[] args) {
        Garage <Toyota> garageForToyota= new Garage<>();
        Toyota toyota= new Toyota();
        garageForToyota.setGarage(toyota);
        garageForToyota.print(toyota);


        Garage<Porshe> garageForPoshe= new Garage<>();
        Porshe porshe= new Porshe();
        garageForPoshe.setGarage(porshe);
        garageForPoshe.print(porshe);


        Garage <Mercedes> garageForMercedes= new Garage<>();
        Mercedes mercedes= new Mercedes();
        garageForMercedes.setGarage(mercedes);
        garageForMercedes.print(mercedes);
        



    }
}
