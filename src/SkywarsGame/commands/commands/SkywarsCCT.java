package SkywarsGame.commands.commands;

import SkywarsGame.commands.CCT;
import SkywarsGame.commands.commands.Skywars.Start;
import SkywarsGame.game.GameManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SkywarsCCT extends CCT implements CommandExecutor{
    private final GameManager gameManager;

    public SkywarsCCT(GameManager gameManager){
        this.gameManager = gameManager;
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings.length != 0)
        {
            if(strings[0].equals("start")) {
                return new Start(gameManager).onCommand(commandSender, command, s, removeCommand(strings));
            }
        }
        return false;
    }
}