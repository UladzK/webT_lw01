package com.company.lw01.bl;

import com.company.lw01.controller.Controller;
import com.company.lw01.entity.Gnome;
import com.company.lw01.entity.Storage;
import com.company.lw01.transfer.TransferObject;
import com.company.lw01.view.*;
/**
 * Created by vova on 3/5/14.
 */
public class GetBestGnomeCommand extends Command {

    public GetBestGnomeCommand(){
        view = new View();
        container = Storage.getInstance();
    }

    public void execute(TransferObject transData){
        Gnome[] gnomeList = container.getGnomeList();
        int maxCapacity = 0, gnomeCapacity;
        Gnome bestGnome = null;

        for (Gnome g : gnomeList){
            gnomeCapacity = g.getCapacity();
            if (gnomeCapacity >= maxCapacity){
                maxCapacity = gnomeCapacity;
                bestGnome = g;
            }
        }

        view.show(bestGnome);
    }
}
