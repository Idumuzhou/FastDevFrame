package com.laoluo.fastdev.localretrofit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static com.laoluo.fastdev.localretrofit.Utils.readString;

final class FileRawCall implements RawCall{
    private final String filePath;

    FileRawCall(String filePath){
        this.filePath = filePath;
    }

    @Override
    public String execute() throws IOException {
        InputStream in = new FileInputStream(new File(filePath));
        return readString(in);
    }
}
