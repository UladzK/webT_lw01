package com.company.lw01.bl;

import com.company.lw01.controller.Controller;
import com.company.lw01.entity.Storage;
import com.company.lw01.transfer.TransferObject;
import com.company.lw01.view.*;
/**
 * Created by vova on 3/4/14.
 */
public abstract class Command {
    View view;
    Storage container;

    public abstract void execute( TransferObject transData);
}
