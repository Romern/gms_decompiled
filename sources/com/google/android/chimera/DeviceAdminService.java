package com.google.android.chimera;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceAdminService extends Service {

    /* renamed from: a */
    private def f7621a;

    public final IBinder onBind(Intent intent) {
        return this.f7621a.onBind(intent);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        def def = new def();
        this.f7621a = def;
        def.attachBaseContext(context);
    }
}
