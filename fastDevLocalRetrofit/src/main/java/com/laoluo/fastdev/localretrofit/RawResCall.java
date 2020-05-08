package com.laoluo.fastdev.localretrofit;

import java.io.IOException;
import java.io.InputStream;

import static com.laoluo.fastdev.localretrofit.Utils.readString;

final class RawResCall implements RawCall {
    private final int rawResId;

    RawResCall(int rawResId){
        this.rawResId = rawResId;
    }

    @Override
    public String execute() throws IOException {
        InputStream in = InitProvider.getApplicationContext().getResources().openRawResource(rawResId);
        return readString(in);
    }
}
