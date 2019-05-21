package com.github.hiteshsondhi88.sampleffmpeg;

import android.content.Context;

import com.github.hiteshsondhi88.libffmpeg.FFmpeg;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Module
public class FFmpegMoudle {

    private final Context context;

    FFmpegMoudle(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    FFmpeg provideFFmpeg() {
        return FFmpeg.getInstance(context.getApplicationContext());
    }

}
