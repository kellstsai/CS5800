package main.com.four;
import java.util.List; 
import java.util.ArrayList; 
import java.util.Iterator;

public class Folder {
    
    private String folderName; 
    private List<File> files;
    private List<Folder> subFolders;  

    public Folder(String folderName) {
        this.folderName = folderName; 
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>(); 
    }

    public List<Folder> getAllFolders() {
        List<Folder> allFolders = new ArrayList<>(); 
        collectAllFolders(this, allFolders); 
        return allFolders;
    }

    private void collectAllFolders(Folder folder, List<Folder> allFolders) {
        allFolders.add(folder);
        for(Folder subFolder : folder.subFolders) {
            collectAllFolders(subFolder, allFolders);
        }
    }

    //setters and getters
    public void setFolderName(String foldderName) {
        this.folderName = foldderName; 
    }

    public String getFolderName() {
        return folderName; 
    }

    public void setFile(List<File> files) {
        this.files = files; 
    }

    public List<File> getFile() {
        return files; 
    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders; 
    }

    public List<Folder> getSubFolders() {
        return subFolders; 
    }

    //method to add a subfolder to the folder
    public void addSubFolder(Folder subFolder) {
        subFolders.add(subFolder); 
    }

    //method to add files
    public void addFiles(File fileName) {
        files.add(fileName); 
    }

    //method to delete files in folder
    /*
    public void deleteFolder(){
        System.out.println("Folder being deleted: " + folderName); 
        files.clear();

        for(int i = 0; i < subFolders.size(); i++){
            subFolders.get(i).deleteFolder();
        }
        subFolders.clear();
    }
    */

    private Folder parent;

    public void setParent(Folder parent) {
        this.parent = parent; 
    }

    public void deleteFolderName(String folderName) {
        System.out.println("Deleting Folder: " + folderName);

        // Delete files
        for (File file : files) {
            file.printFileName(); // Print before deleting for demonstration
        }
        files.clear();

        // Delete sub-folders
        for (Folder subFolder : subFolders) {
            subFolder.deleteFolder();
        }
        subFolders.clear();

        // Remove this folder from its parent's list of subfolders
        if (parent != null) {
            parent.subFolders.remove(this);
        }
    }
    

    
    


    /* 
    public void deleteFolder() {
        System.out.println("Foldering being deleted: " + folderName);
        files.clear();
        subFolders.clear();
    }
    */

    public void deleteFolder() {
        files.clear();

        for (Folder subFolder : subFolders) {
            subFolder.deleteFolder();
        }
        subFolders.clear();
    }

    

    //print function that prints out all the subfolders and files
    public void printFolder() {
        System.out.println("Folder: " + folderName);
        System.out.println("Files: ");
        for(int i = 0; i < files.size(); i++) {
            files.get(i).printFileName();
        }

        for(int i = 0; i < subFolders.size(); i++) {
            System.out.println("Parent folder: " + folderName);

            subFolders.get(i).printFolder();
        }
    }

    public int findFolder (String folderName) {
        int returnindex = -1; 
        for (int index = 0; index < subFolders.size(); index++) {
            String subFolderName = subFolders.get(index).getFolderName(); 
            if(folderName == subFolderName){
                returnindex = index; 
            }

        } 
        return returnindex; 
    }

}
