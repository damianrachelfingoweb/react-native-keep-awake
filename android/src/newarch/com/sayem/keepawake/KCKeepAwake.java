package com.sayem.keepawake;

import android.os.Build;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.turbomodule.core.interfaces.annotations.ReactModule;

import android.util.Log;

@ReactModule(name = KCKeepAwakeModule.NAME)
public class KCKeepAwakeSpec extends NativeKCKeepAwakeSpec {

    private final KCKeepAwakeImpl delegate;

    public KCKeepAwake(ReactApplicationContext reactContext) {
        super(reactContext);
        delegate = new KCKeepAwakeImpl(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return KCKeepAwakeImpl.NAME;
    }
    
    @Override
    public void activate() {
        delegate.activate();
    }
    
    @Override
    public void deactivate() {
        delegate.deactivate();
    }
}
