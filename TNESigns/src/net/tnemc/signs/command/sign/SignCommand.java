package net.tnemc.signs.command.sign;

import net.tnemc.core.TNE;
import net.tnemc.core.commands.TNECommand;
import net.tnemc.signs.command.note.NoteCommandCommand;

/**
 * The New Economy Minecraft Server Plugin
 * <p>
 * Created by creatorfromhell on 7/22/2019.
 * <p>
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/ or send a letter to
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 * Created by creatorfromhell on 06/30/2017.
 */
public class SignCommand extends TNECommand {

  public SignCommand(TNE plugin) {
    super(plugin);
    subCommands.add(new NoteCommandCommand(plugin));
  }

  @Override
  public String getName() {
    return "sign";
  }

  @Override
  public String[] getAliases() {
    return new String[0];
  }

  @Override
  public String getNode() {
    return "";
  }

  @Override
  public boolean console() {
    return false;
  }
}