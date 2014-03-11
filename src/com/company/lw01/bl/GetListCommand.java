package com.company.lw01.bl;

import com.company.lw01.controller.*;
import com.company.lw01.entity.*;
import com.company.lw01.transfer.TransferObject;
import com.company.lw01.view.View;

/**
 * Created by vova on 3/5/14.
 * <p>Реализует паттерн Command для вывода списка гномов</p>
 */
public class GetListCommand extends Command{

    public GetListCommand(){
        view = new View();
        container = Storage.getInstance();
    }

    public void execute(TransferObject transData){
        Gnome[] gnomeList = container.getGnomeList();
        view.showList(gnomeList);
    }
}
