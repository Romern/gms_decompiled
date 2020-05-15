package com.google.android.gms.icing.appindexing.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppIndexingChimeraService extends Service {

    /* renamed from: a */
    private acri f79064a;

    public final IBinder onBind(Intent intent) {
        return new abwh(this, this.f79064a);
    }

    public final void onCreate() {
        if (cemq.m137369f()) {
            this.f79064a = acri.m49734a("main", getApplicationContext());
        }
        super.onCreate();
    }

    public final void onDestroy() {
        acri acri = this.f79064a;
        if (acri != null) {
            acri.mo33015a();
        }
        super.onDestroy();
    }
}
