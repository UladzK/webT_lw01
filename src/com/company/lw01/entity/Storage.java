package com.company.lw01.entity;

/**
 * Created by vova on 3/4/14.
 */
public class Storage {

    private Gnome[] gnomeList;
    /**
     * @value gnomeCount отвечает за кол-во гномов. В сказке это число равно 7
     */
    public final int gnomeCount = 7;
    private static Storage instance;

    private Storage(){}

    private static class LazyHolder{
        private static final Storage INSTANCE = new Storage();
    }

    /**
     * <p>Метод getInstance для реализации синглтона</p>
     * <p>Синглтон реализован через ленивую потоко-безопасный паттерн</p>
     * @return ссылку на объект типа Storage
     */

    public static Storage getInstance(){
        return LazyHolder.INSTANCE;
    }

    public Gnome[] getGnomeList(){
        return gnomeList;
    }

    public void setGnomeList(Gnome[] gnomeList){
        this.gnomeList = gnomeList;
    }
}
