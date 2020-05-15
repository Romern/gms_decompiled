package com.google.android.chimera;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.telecom.Phone;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class InCallService extends Service {

    /* renamed from: a */
    private dek f7632a;

    @Deprecated
    public Phone getPhone() {
        return this.f7632a.getPhone();
    }

    public IBinder onBind(Intent intent) {
        return this.f7632a.onBind(intent);
    }

    @Deprecated
    public abstract void onPhoneCreated(Phone phone);

    @Deprecated
    public abstract void onPhoneDestroyed(Phone phone);

    public boolean onUnbind(Intent intent) {
        return this.f7632a.onUnbind(intent);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        dek dek = new dek(this);
        this.f7632a = dek;
        dek.attachBaseContext(context);
    }
}
