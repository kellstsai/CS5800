package main.com.four;
import java.util.List; 

public class CompositionDriver {
    public static void main(String[] args) {

        Folder phpFolder = new Folder("php_demo1"); 
        //first subfolder of php
        phpFolder.addSubFolder(new Folder("Source Files"));
        phpFolder.addSubFolder(new Folder("Include Path"));
        phpFolder.addSubFolder(new Folder("Remote Files"));

        //in source files
        phpFolder.getSubFolders().get(0).addSubFolder(new Folder(".phalcon")); 
        phpFolder.getSubFolders().get(0).addSubFolder(new Folder("app")); 
        phpFolder.getSubFolders().get(0).addSubFolder(new Folder("cache")); 
        phpFolder.getSubFolders().get(0).addSubFolder(new Folder("public")); 

        //in app 
        phpFolder.getSubFolders().get(0).getSubFolders().get(1).addSubFolder(new Folder("config")); 
        phpFolder.getSubFolders().get(0).getSubFolders().get(1).addSubFolder(new Folder("controllers")); 
        phpFolder.getSubFolders().get(0).getSubFolders().get(1).addSubFolder(new Folder("library")); 
        phpFolder.getSubFolders().get(0).getSubFolders().get(1).addSubFolder(new Folder("migrations")); 
        phpFolder.getSubFolders().get(0).getSubFolders().get(1).addSubFolder(new Folder("models")); 
        phpFolder.getSubFolders().get(0).getSubFolders().get(1).addSubFolder(new Folder("views")); 

        //in public
        phpFolder.getSubFolders().get(0).getSubFolders().get(3).addFiles(new File(".htaccess"));
        phpFolder.getSubFolders().get(0).getSubFolders().get(3).addFiles(new File(".htrouter.php"));
        phpFolder.getSubFolders().get(0).getSubFolders().get(3).addFiles(new File("index.html"));

        //phpFolder.printFolder();

        int indexFileDeletion = -1; 

        indexFileDeletion = phpFolder.getSubFolders().get(0).findFolder("app"); 
       // fileName = phpFolder.getSubFolders().get(0).findFolder("app");
        if(indexFileDeletion > 0 ) {
            //deleting app folder
            phpFolder.getSubFolders().get(0).getSubFolders().get(indexFileDeletion).deleteFolder();

            phpFolder.getSubFolders().get(0).getSubFolders().remove(indexFileDeletion); 
        }

        phpFolder.printFolder();

        indexFileDeletion = phpFolder.getSubFolders().get(0).findFolder("public"); 
       // fileName = phpFolder.getSubFolders().get(0).findFolder("app");
        if(indexFileDeletion > 0 ) {
            //deleting app folder
            phpFolder.getSubFolders().get(0).getSubFolders().get(indexFileDeletion).deleteFolder();

            phpFolder.getSubFolders().get(0).getSubFolders().remove(indexFileDeletion); 
        }

        phpFolder.printFolder();

    }
}

