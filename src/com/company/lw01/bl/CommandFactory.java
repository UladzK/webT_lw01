package com.company.lw01.bl;

import java.util.HashMap;

/**
 * Created by vova on 3/5/14.
 */
public class CommandFactory {

    private HashMap<Integer, Command> commandMap;

    /**
     * <p>Конструктор класса, заполняющий HashMap единичными объектами классов комманд</p>
     */
    public CommandFactory(){
        commandMap = new HashMap<Integer, Command>();
        commandMap.put(1, new GetBestGnomeCommand());
        commandMap.put(2, new SearchByNameCommand());
        commandMap.put(3, new GetListCommand());
        commandMap.put(0, new NoCommand());
    }

    /**
     * @param id принимает номер команды, которую нужно выполнить
     * @return объект типа команды, которую нужно выполнить
     */
    public Command getCommand(int id){
        if ( id < 4 && id > 0){
            return commandMap.get(id);
        }
        else
            return commandMap.get(0);
    }
}
