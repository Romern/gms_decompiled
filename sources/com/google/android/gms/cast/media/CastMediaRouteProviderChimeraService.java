package com.google.android.gms.cast.media;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CastMediaRouteProviderChimeraService extends Service {

    /* renamed from: a */
    private final qav f29895a = new qav("CastMRPService");

    /* renamed from: b */
    private final pux f29896b = new pux();

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.f29896b.attachBaseContext(context);
    }

    public final IBinder onBind(Intent intent) {
        this.f29895a.mo23856a("onBind %s", intent);
        return this.f29896b.onBind(intent);
    }

    public final void onCreate() {
        super.onCreate();
        this.f29895a.mo23861b("onCreate");
        this.f29896b.onCreate();
    }

    public final void onDestroy() {
        this.f29895a.mo23861b("onDestroy");
        this.f29896b.onDestroy();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.f29896b.onStartCommand(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        this.f29895a.mo23856a("onUnbind %s", intent);
        return this.f29896b.onUnbind(intent);
    }
}
