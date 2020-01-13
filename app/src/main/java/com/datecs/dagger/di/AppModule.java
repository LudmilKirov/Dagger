package com.datecs.dagger.di;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.provider.Telephony;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.datecs.dagger.R;

import dagger.Provides;

public class AppModule {

    @Provides
    static RequestOptions provideRequestOptions(){
        return RequestOptions.placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background);
    }

    @Provides
    static RequestManager provideGlideInstance(Application application,RequestOptions requestOptions){
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Provides
    static Drawable provideAppDrawable(Application application){
        return ContextCompat.getDrawable(application,R.drawable.logo);
    }
}
