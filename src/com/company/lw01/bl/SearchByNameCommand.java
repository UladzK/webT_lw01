package com.company.lw01.bl;

import com.company.lw01.controller.Controller;
import com.company.lw01.entity.Gnome;
import com.company.lw01.entity.Storage;
import com.company.lw01.transfer.SearchByNameTO;
import com.company.lw01.transfer.TransferObject;
import com.company.lw01.view.View;

import javax.management.remote.rmi._RMIServer_Stub;

/**
 * Created by vova on 3/4/14.
 * <p>Реализует паттерн Command для нахождения гнома по имени</p>
 */

public class SearchByNameCommand extends Command {

    public SearchByNameCommand(){
        view = new View();
        container = Storage.getInstance();
    }

    /**
    * @param transData объекта базового класса TransferObject
    *                 для передачи информации о гноме, которого нужно найти
    * @return void Так как модель односторонне напрямую соединена с view
     * что позволяет вывести результат непосредственно без контроллера
    */

    public void execute(TransferObject transData){
        SearchByNameTO transDataCast = (SearchByNameTO) transData;

        String gnomeName = transDataCast.gnomeName;
        Gnome[] gnomes = container.getGnomeList();

        for(Gnome g : gnomes){
            if (g.getName().equals(gnomeName)){
                view.show(g);
            }
        }
    }
}
