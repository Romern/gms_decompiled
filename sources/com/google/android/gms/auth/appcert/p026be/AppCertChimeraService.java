package com.google.android.gms.auth.appcert.p026be;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: com.google.android.gms.auth.appcert.be.AppCertChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppCertChimeraService extends Service {

    /* renamed from: a */
    public static final sek f10369a = new sek("GLSUser", "AppCertChimeraService");

    public final IBinder onBind(Intent intent) {
        return new iek(new ilw(new ilq(this)), iem.m15329a(this));
    }
}
