package com.google.android.gms.auth.account.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.Service;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WorkAccountChimeraService extends Service {

    /* renamed from: a */
    public static final sek f10032a = ght.m13171a("WorkAccount");

    /* renamed from: b */
    private gse f10033b;

    /* renamed from: c */
    private ily f10034c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ChimeraReceiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            sek sek = WorkAccountChimeraService.f10032a;
            String valueOf = String.valueOf(intent.getAction());
            sek.mo25414c(valueOf.length() == 0 ? new String("update authenticator enabled for intent: ") : "update authenticator enabled for intent: ".concat(valueOf), new Object[0]);
            Intent intent2 = new Intent("com.google.android.gms.auth.account.ACTION_UPDATE_WORK_AUTHENTICATOR");
            intent2.setClassName(context, "com.google.android.gms.auth.account.service.WorkAccountService");
            context.startService(intent2);
        }
    }

    public final synchronized IBinder onBind(Intent intent) {
        String action;
        action = intent.getAction();
        f10032a.mo25412b("onBind with action %s", action);
        return action != null ? new gsd(this, this.f10033b, this.f10034c) : null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f10033b = new gse(this, new LifecycleSynchronizer(this));
        this.f10034c = (ily) ily.f21320d.mo13145b();
    }
}
