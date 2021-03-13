package com.company;

public class Main {

    public static void main(String[] args) {
        Garage <Toyota> garageForToyota= new Garage<>();
        Toyota toyota= new Toyota();
        garageForToyota.print(toyota);


        Garage<Porshe> garageForPoshe= new Garage<>();
        Porshe porshe= new Porshe();
        garageForPoshe.print(porshe);


        Garage <Mercedes> garageForMercedes= new Garage<>();
        Mercedes mercedes= new Mercedes();
        garageForMercedes.print(mercedes);
        



    }
}
