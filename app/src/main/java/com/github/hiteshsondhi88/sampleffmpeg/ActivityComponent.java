package com.github.hiteshsondhi88.sampleffmpeg;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = FFmpegMoudle.class)
public interface ActivityComponent {
    void inject(Home home );
}
