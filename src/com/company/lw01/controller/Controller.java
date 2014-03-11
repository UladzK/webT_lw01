package com.company.lw01.controller;

import com.company.lw01.bl.*;
import com.company.lw01.view.View;
import com.company.lw01.entity.*;
import com.company.lw01.transfer.*;

/**
 * Created by vova on 3/4/14.
 */

public class Controller {

    private View gnomeView;
    private Command cm;
    private TransferObject transData;
    private CommandFactory cmFactory;
    private Storage container;

    public Controller(){
        this.gnomeView = new View();
        this.cmFactory = new CommandFactory();
        this.container = Storage.getInstance();
    }

    /**
     * <p>Главный метод контроллера, приводящий программу в действие</p>
     * Принимает ввод гномов от пользователя
     * Выполняет цикл по обработке запросов от пользователя
     */
    public void run(){
        gnomeView.showMenu();
        int i = 1;
        int actID;

        //filling gnomes with user input
        container.setGnomeList( gnomeView.inputGnomeList(container.gnomeCount) );

        do{
            //emulating user input
            actID = gnomeView.getUserAction(i);
            //condition for exiting from cycle
            if (i < 3) i++;
            else i = 0;

            /**
             * @exception java.lang.NullPointerException В случае неудачной попытки создать
             * command Object или transger Object
             * @throws java.lang.NullPointerException пользователю
             */
            try{
                if (actID != 0){
                    cm = cmFactory.getCommand(actID);
                    //filling TO
                    transData = gnomeView.setTransferData(actID);
                    cm.execute(transData);
                }
            }
            catch (Exception e){
                gnomeView.show(e.toString());
            }

        }while (actID != 0);
    }

    public void showResult(Gnome g){
        gnomeView.show(g);
    }

    public String getGnomeName(){
        return gnomeView.getGnomeName();
    }
    public void showResult(Gnome[] g){
        gnomeView.showList(g);
    }
}
