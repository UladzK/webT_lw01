package com.company.lw01.bl;

import com.company.lw01.transfer.TransferObject;
import com.company.lw01.view.View;

/**
 * Created by vova on 3/6/14.
 */
public class NoCommand extends Command {

    public NoCommand(){
        view = new View();
    }

    public void execute(TransferObject transData){
        view.show("Command not found");
    }
}
