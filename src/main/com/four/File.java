package main.com.four;

public class File {
    private String fileName; 

    public File(String fileName) {
        this.fileName = fileName; 
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilename() {
        return fileName; 
    }

    public void printFileName() {
        System.out.println("The file name is: " + getFilename()); 
    }
}
