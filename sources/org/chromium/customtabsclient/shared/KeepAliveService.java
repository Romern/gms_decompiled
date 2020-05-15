package org.chromium.customtabsclient.shared;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeepAliveService extends Service {

    /* renamed from: a */
    private static final Binder f191794a = new Binder();

    public final IBinder onBind(Intent intent) {
        return f191794a;
    }
}
