package com.google.android.gms.auth.account.p016be.legacy;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: com.google.android.gms.auth.account.be.legacy.GoogleAccountDataChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleAccountDataChimeraService extends Service {

    /* renamed from: a */
    public static final sek f10009a = ght.m13171a("GoogleAccountDataChimeraService", "GLSUser");

    public final IBinder onBind(Intent intent) {
        ilq ilq = new ilq(this);
        return new ixq(new ilw(ilq), new gls(ilq));
    }
}
