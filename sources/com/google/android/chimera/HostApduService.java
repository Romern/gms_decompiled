package com.google.android.chimera;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class HostApduService extends Service {
    public static final int DEACTIVATION_DESELECTED = 1;
    public static final int DEACTIVATION_LINK_LOSS = 0;
    public static final String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_APDU_SERVICE";
    public static final String SERVICE_META_DATA = "android.nfc.cardemulation.host_apdu_service";

    /* renamed from: a */
    private dej f7631a;

    public final void notifyUnhandled() {
        this.f7631a.notifyUnhandled();
    }

    public final IBinder onBind(Intent intent) {
        return this.f7631a.onBind(intent);
    }

    public abstract void onDeactivated(int i);

    public abstract byte[] processCommandApdu(byte[] bArr, Bundle bundle);

    public final void sendResponseApdu(byte[] bArr) {
        this.f7631a.sendResponseApdu(bArr);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        dej dej = new dej(this);
        this.f7631a = dej;
        dej.attachBaseContext(context);
    }
}
