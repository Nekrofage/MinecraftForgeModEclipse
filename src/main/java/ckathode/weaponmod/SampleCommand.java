package ckathode.weaponmod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

/*
 * Add sample command
 */

public class SampleCommand implements ICommand
{
  private List aliases;
  public SampleCommand()
  {
    this.aliases = new ArrayList();
    this.aliases.add("sample");
  }

  @Override
  public String getCommandName()
  {
    return "sample";
  }

  @Override
  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "sample <text>";
  }

  @Override
  public List getCommandAliases()
  {
    return this.aliases;
  }

  @Override
  public void processCommand(ICommandSender icommandsender, String[] astring)
  {
    if(astring.length == 0)
    {
      icommandsender.addChatMessage(new ChatComponentText("Invalid argument"));
      return;
    }
   
    icommandsender.addChatMessage(new ChatComponentText("Sample: [" + astring[0] + "]"));
   
  }

  @Override
  public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
  {
    return true;
  }

  @Override
  public List addTabCompletionOptions(ICommandSender icommandsender,
      String[] astring)
  {
    return null;
  }

  @Override
  public boolean isUsernameIndex(String[] astring, int i)
  {
    return false;
  }

  @Override
  public int compareTo(Object o)
  {
    return 0;
  }
}