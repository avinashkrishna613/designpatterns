package org.example.designpatterns.commandpattern;

public class CreateDirectoryCommand implements Command{
    String directoryName;
    String commandName;

    public CreateDirectoryCommand(String commandName, String directoryName) {
        this.commandName = commandName;
        this.directoryName = directoryName;
    }

    @Override
    public void execute() {
        this.fileSystem.createDirectory(directoryName);
    }
}
