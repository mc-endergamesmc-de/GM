package de.gamemode.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;

public class GmSurvivalCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("gm.gm0")) {
				if(args.length == 0) {
					
					player.setGameMode(GameMode.SURVIVAL);
					
					player.sendMessage("�cDu befindest dich jetzt im �b�l�berlebensmodus�c!");
					
				} else
					player.sendMessage("�cBitte benutze �6/gm0 �c!");
			} else
				player.sendMessage("�cDazu hast du keine Rechte!");
		}

		return false;
	}


}
