package com.globallogic.file;

import java.io.File;
import java.util.List;

/**
 *
 */
public interface FileHelper {

    boolean createFile(String path);

    boolean createDir(String path);

    List<File> dir(File root);

    String fileContent(File file);

    boolean delete(File file);

    boolean deepEquals(File one, File two);

    List<File> search(File dir, String keyWord, boolean deep);

    void copy(File src, File dest);



}
