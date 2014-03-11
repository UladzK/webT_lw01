package com.company.lw01.view;

import com.company.lw01.entity.Gnome;
import com.company.lw01.transfer.*;

import java.util.Random;

/**
 * Created by vova on 3/4/14.
 */

public class View {

    public void showMenu(){
        System.out.println("Menu:");
        System.out.println("1: Get the Best Gnome");
        System.out.println("2: Get Gnome by Name");
        System.out.println("3: Get Gnome List");
        System.out.println("0: Exit");
    }

    public void show(Gnome gnome){
        System.out.println("Name: " + gnome.getName() + ", Age: " + gnome.getAge() + ", Capacity: " + gnome.getCapacity());
    }

    /**
     * <p>Заполняет передаваемые командам данные</p>
     * @param actID номер действия, выбранного пользователем
     * @return объект базового класса TransferObject
     */
    public TransferObject setTransferData(int actID){
        TransferObject transData;

        //if we need specific data
        if (actID == 2){
            transData = (TransferObject)setSearchByNameTO();
            return transData;
        }

        return new TransferObject();
    }

    public SearchByNameTO setSearchByNameTO(){
        SearchByNameTO searchTO = new SearchByNameTO();
        searchTO.gnomeName = getGnomeName();

        return searchTO;
    }

    //exception printing
    public void show(String out){
        System.out.println(out);
    }

    public void showList(Gnome[] gnomes){
        for(Gnome g : gnomes){
            show(g);
        }
    }

    public Gnome[] inputGnomeList(int length){
        Random rand = new Random();

        Gnome[] gnomeList = new Gnome[length];

        System.out.println("Enter gnomes:");
        for(int i = 0; i < length; i++){
            gnomeList[i] = new Gnome(rand.nextInt(100) + 1, rand.nextInt(100) + 1, "Gnome#" + i );
            show(gnomeList[i]);
        }
        return gnomeList;
    }

    //takes and returns id because of _emulating_ input from user
    public int getUserAction(int id){
        System.out.print("Enter your action: ");
        System.out.println(id);

        return id;
    }

    public String getGnomeName(){
        Random rand = new Random();
        String gnomeNameIn;

        System.out.print("Enter gnome name to find: ");
        gnomeNameIn = "Gnome#" + rand.nextInt(6);
        System.out.println(gnomeNameIn);

        return gnomeNameIn;
    }
}

