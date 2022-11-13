package org.example.designpatterns.commandpattern;

public class LinuxFileSystem implements FileSystem{
    private void createDirectory(String directoryName) {
        System.out.println("*****CREATED DIRECTORY WITH NAME : " + directoryName);
    }

    private void deleteDirectory(String directoryName) {
        System.out.println("*****DELETED DIRECTORY WITH GIVEN NAME : " + directoryName);
    }

    @Override
    public void executeComamnd(Command command) {
        switch ()
    }
}
