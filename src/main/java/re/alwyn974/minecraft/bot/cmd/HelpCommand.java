package re.alwyn974.minecraft.bot.cmd;

import re.alwyn974.minecraft.bot.MinecraftBOT;
import re.alwyn974.minecraft.bot.cmd.utils.CommandHandler;
import re.alwyn974.minecraft.bot.cmd.utils.ICommand;
import re.alwyn974.minecraft.bot.entity.EntityBOT;

/**
 * The help Command
 * @author <a href="https://github.com/alwyn974">Alwyn974</a>
 * @since 1.0.4
 * @version 1.0.4
 */
public class HelpCommand implements ICommand {

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "Display this";
    }

    @Override
    public String getUsage() {
        return String.format("%s%s", getPrefix(), getName());
    }

    @Override
    public boolean needToBeConnected() {
        return false;
    }

    @Override
    public void execute(EntityBOT bot, String message, String... args) {
        CommandHandler.getCommands().forEach(cmd -> {
            MinecraftBOT.getLogger().info("Command: [%s] (%s)", cmd.getName(), cmd.getDescription());
            MinecraftBOT.getLogger().info("Usage: %s", cmd.getUsage());
        });
    }

}
