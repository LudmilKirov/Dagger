package com.datecs.dagger.di;

import com.datecs.dagger.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();
}
