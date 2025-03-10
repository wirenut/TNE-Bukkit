package net.tnemc.core.commands.admin;

import net.tnemc.core.TNE;
import net.tnemc.core.commands.TNECommand;
import net.tnemc.core.common.utils.MISCUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import java.sql.SQLException;

/**
 * The New Economy Minecraft Server Plugin
 *
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/ or send a letter to
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 * Created by Daniel on 7/10/2017.
 */
public class AdminIDExportCommand extends TNECommand {

  public AdminIDExportCommand(TNE plugin) {
    super(plugin);
  }

  @Override
  public String getName() {
    return "idexport";
  }

  @Override
  public String[] getAliases() {
    return new String[] {
        "ide"
    };
  }

  @Override
  public String getNode() {
    return "tne.admin.ide";
  }

  @Override
  public boolean console() {
    return true;
  }

  @Override
  public String getHelp() {
    return "/tne idexport";
  }

  @Override
  public boolean execute(CommandSender sender, String command, String[] arguments) {
    Bukkit.getScheduler().runTaskAsynchronously(TNE.instance(), () -> {
      try {
        MISCUtils.idExtract(sender);
      } catch (SQLException e) {
        TNE.debug(e);
      }
    });
    return true;
  }
}