package com.google.android.chimera;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class SettingInjectorService extends Service {
    public static final String ACTION_INJECTED_SETTING_CHANGED = "android.location.InjectedSettingChanged";
    public static final String ACTION_SERVICE_INTENT = "android.location.SettingInjectorService";
    public static final String ATTRIBUTES_NAME = "injected-location-setting";
    public static final String META_DATA_NAME = "android.location.SettingInjectorService";

    /* renamed from: a */
    private der f7663a;

    /* renamed from: b */
    private final String f7664b;

    public SettingInjectorService(String str) {
        this.f7664b = str;
    }

    public static void refreshSettings(Context context) {
        android.location.SettingInjectorService.refreshSettings(context);
    }

    public final IBinder onBind(Intent intent) {
        return this.f7663a.onBind(intent);
    }

    public abstract boolean onGetEnabled();

    public abstract String onGetSummary();

    public final void onStart(Intent intent, int i) {
        this.f7663a.onStart(intent, i);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.f7663a.onStartCommand(intent, i, i2);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        der der = new der(this, this.f7664b);
        this.f7663a = der;
        der.attachBaseContext(context);
    }
}
