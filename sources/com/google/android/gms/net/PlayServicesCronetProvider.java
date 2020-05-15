package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlayServicesCronetProvider extends CronetProvider {
    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m67637a() {
        try {
            akjj.m59878a(this.mContext);
        } catch (rfw e) {
            if (Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        } catch (rfv e2) {
            if (Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }

    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            akjj.m59878a(this.mContext);
            Throwable th = null;
            try {
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) akjj.m59880b().f50364e.getClassLoader().loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                builder = null;
                th = e;
            }
            if (th == null) {
                sdo.checkIfNull(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th);
        } catch (rfw e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e2);
        } catch (rfv e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext))) {
            return true;
        }
        return false;
    }

    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public String getVersion() {
        String str;
        m67637a();
        synchronized (akjj.f72089a) {
            str = akjj.f72090b;
        }
        return str;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    public boolean isEnabled() {
        m67637a();
        return akjj.m59879a();
    }
}
