package org.example.designpatterns.commandpattern;

public class Terminal {
    String name;
    int width;
    int height;
    FileSystem fileSystem;

    Terminal(String fileSystemType) {
        this.fileSystem = getFileSystemFactory(fileSystemType);
    }

    private FileSystem getFileSystemFactory(String fileSystemType) {
        FileSystem fileSystem = null;
        switch (fileSystemType) {
            case "Linux": fileSystem =  new LinuxFileSystem();
            break;
        }
        return fileSystem;
    }

    void executeCommand(String commandString) throws Exception {
        Command command = getCommandFactory(commandString);
        if (command == null) {
            throw new Exception("Invalid command");
        }
    }

    private Command getCommandFactory(String commandString) {
        String[] commandParts = commandString.split(" ");
        Command command = null;
        switch ( commandParts[0] ) {
            case "mkdir": command = new CreateDirectoryCommand(commandParts[1]);
        }
        return command;
    }
}
