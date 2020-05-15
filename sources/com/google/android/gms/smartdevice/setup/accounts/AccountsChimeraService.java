package com.google.android.gms.smartdevice.setup.accounts;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountsChimeraService extends Service {

    /* renamed from: a */
    public static final sek f108108a = ascp.m73787a("Setup", "Accounts", "AccountsService");

    /* renamed from: b */
    public aruc f108109b;

    /* renamed from: c */
    public Handler f108110c;

    public final IBinder onBind(Intent intent) {
        f108108a.mo25409a("onBind()", new Object[0]);
        if ("com.google.android.gms.smartdevice.setup.accounts.AccountsService.START".equals(intent.getAction())) {
            return new artp(this);
        }
        return null;
    }

    public final void onCreate() {
        f108108a.mo25409a("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("AccountBootstrapBackground", 10);
        handlerThread.start();
        this.f108110c = new adzt(handlerThread.getLooper());
    }

    public final void onDestroy() {
        f108108a.mo25409a("onDestroy()", new Object[0]);
        aruc aruc = this.f108109b;
        if (aruc != null) {
            aruc.mo48824a();
            this.f108109b = null;
        }
        super.onDestroy();
    }
}
