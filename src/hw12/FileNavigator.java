package hw12;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {
    private final Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(FileData fileData) {
        if(!fileMap.containsKey(fileData.getFilePath())) {
            fileMap.put(fileData.getFilePath(), new ArrayList<>());
        }
//        // check unique 1
//        if(fileMap.get(fileData.getFilePath()).stream().filter(fileData1 -> fileData1.getFileName().equals(fileData.getFileName())).toList().size() == 0) {
//            fileMap.get(fileData.getFilePath()).add(fileData);
//        }
        // check unique 2
        for(FileData fd: fileMap.get(fileData.getFilePath())) {
            if(fd.getFileName().equals(fileData.getFileName())) return;
        }
        fileMap.get(fileData.getFilePath()).add(fileData);
    }

    public void add(String path, FileData fileData) {
        // task 7
        if(!path.equals(fileData.getFilePath())) {
            System.out.println("шлях-ключ і шлях до файлу не співпадають");
            return;
        }
        add(fileData);
    }

    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(int size) {
        List<FileData> lst = new ArrayList<>();
        for(String key: fileMap.keySet()) {
            for(FileData fileData: fileMap.get(key)) {
                if(fileData.getSize() <= size) {
                    lst.add(fileData);
                }
            }
        }
        return lst;
    }

    public List<FileData> sortBySize() {
        List<FileData> newLst = new ArrayList<>();
        for(List<FileData> fileData: fileMap.values()) {
            newLst.addAll(fileData);
        }
        newLst.sort(Comparator.comparing(FileData::getSize));
        return newLst;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public void print() {
        for(String key: fileMap.keySet()) {
            System.out.println(key + " " + fileMap.get(key));
        }
    }
}
