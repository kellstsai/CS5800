package main.com.four;
import java.util.List; 

public class Composition {
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

        //phpFolder.printFolder();

        indexFileDeletion = phpFolder.getSubFolders().get(0).findFolder("public"); 
       // fileName = phpFolder.getSubFolders().get(0).findFolder("app");
        if(indexFileDeletion > 0 ) {
            //deleting app folder
            phpFolder.getSubFolders().get(0).getSubFolders().get(indexFileDeletion).deleteFolder();

            phpFolder.getSubFolders().get(0).getSubFolders().remove(indexFileDeletion); 
        }

        phpFolder.printFolder();









        
        /* 
        //List<Folder> allFolders = phpFolder.getAllFolders(); 
        
        //Folder phpFolder = new Folder("php_demo1");
        Folder sourceFilesFolder = new Folder("Source Files");
        Folder phalconFolder = new Folder(".phalcon");
        Folder appFolder = new Folder("app"); 
        Folder configFolder = new Folder("config"); 
        Folder controllersFolder = new Folder("controllers");
        Folder libraryFolder = new Folder("library");
        Folder migrationsFolder = new Folder("migrations");
        Folder modelsFolder = new Folder("models");
        Folder viewsFolder = new Folder("views");
        Folder cacheFolder = new Folder("cache");
        Folder publicFolder = new Folder("public");
        File htaccessFolder = new File(".htaccess");
        File htrouterFolder = new File(".htrouter.php");
        File indexFolder = new File("index.html");
        Folder includePathFolder = new Folder("Include Path");
        Folder RemoteFilesFolder = new Folder("Remote Files"); 


        //adding subfolders to php_demo1
        phpFolder.addSubFolder(sourceFilesFolder);
        phpFolder.addSubFolder(includePathFolder);
        phpFolder.addSubFolder(RemoteFilesFolder);
        //adding subfolders to sourcefiles
        sourceFilesFolder.addSubFolder(phalconFolder);
        sourceFilesFolder.addSubFolder(appFolder);
        sourceFilesFolder.addSubFolder(cacheFolder);
        sourceFilesFolder.addSubFolder(publicFolder);
        //adding subfolders to app
        appFolder.addSubFolder(configFolder);
        appFolder.addSubFolder(controllersFolder);
        appFolder.addSubFolder(libraryFolder);
        appFolder.addSubFolder(migrationsFolder);
        appFolder.addSubFolder(modelsFolder);
        appFolder.addSubFolder(viewsFolder);
        //adding subfolders to public
        publicFolder.addFiles(htaccessFolder);
        publicFolder.addFiles(htrouterFolder);
        publicFolder.addFiles(indexFolder);
        
        //phpFolder.printFolder();

        appFolder.deleteFolder();

        phpFolder.printFolder();
        */
        

        /* 
        File firstFile = new File("publicFolder");
        File secondFile = new File("privateFolder");

        Folder documentFolder = new Folder("Documents");

        documentFolder.addFiles(firstFile);
        documentFolder.addFiles(secondFile);

        Folder rootFolder = new Folder("Root");
        rootFolder.addSubFolder(documentFolder);

        System.out.println("Before deletion: ");
        rootFolder.printFolder();

        System.out.println("\nAfter Deletion: ");
        rootFolder.printFolder();
        */
    }
}

