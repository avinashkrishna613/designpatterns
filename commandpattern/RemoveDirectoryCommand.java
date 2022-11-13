package org.example.designpatterns.commandpattern;

public class RemoveDirectoryCommand implements Command{
    FileSystem fileSystem;
    String directoryName;

    public RemoveDirectoryCommand(FileSystem fileSystem, String directoryName) {
        this.fileSystem = fileSystem;
        this.directoryName = directoryName;
    }

    @Override
    public void execute() {
        this.fileSystem.deleteDirectory(directoryName);
    }
}
