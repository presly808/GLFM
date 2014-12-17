package com.globallogic.file;

import java.io.File;
import java.util.List;

/**
 * Created by admin on 17.12.2014.
 */
public class FileHelperImpl implements FileHelper {
    @Override
    public boolean createFile(String path) {
        return false;
    }

    @Override
    public boolean createDir(String path) {
        return false;
    }

    @Override
    public List<File> dir(File root) {
        return null;
    }

    @Override
    public String fileContent(File file) {
        return null;
    }

    @Override
    public boolean delete(File file) {
        return false;
    }

    @Override
    public boolean deepEquals(File one, File two) {
        return false;
    }

    @Override
    public List<File> search(File dir, String keyWord, boolean deep) {
        return null;
    }

    @Override
    public void copy(File src, File dest) {

    }
}
