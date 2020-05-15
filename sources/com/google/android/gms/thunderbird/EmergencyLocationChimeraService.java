package com.google.android.gms.thunderbird;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmergencyLocationChimeraService extends Service {

    /* renamed from: a */
    public static final Object f109049a = new Object();

    /* renamed from: b */
    public static asfb f109050b = null;

    /* renamed from: c */
    public augv f109051c;

    /* renamed from: d */
    public qws f109052d;

    /* renamed from: e */
    public auhv f109053e;

    /* renamed from: f */
    public final ArrayList f109054f = new ArrayList(1);

    /* renamed from: g */
    public int f109055g = 0;

    /* renamed from: h */
    private asfb f109056h;

    /* renamed from: a */
    public static void m93346a(Context context) {
        synchronized (f109049a) {
            if (f109050b != null) {
                f109050b.mo49120c();
                if (!f109050b.mo49124e()) {
                    f109050b = null;
                }
            } else {
                auho.m77069a(context, new IllegalStateException("unbalanced release of start service wakelock"));
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        C1223np npVar = auho.f91828a;
        this.f109056h = new asfb(this, 1, "Thunderbird", "Thunderbird", "com.google.android.gms", "com.google.android.gms.thunderbird");
        augv augv = new augv(this, new soj(this.f109056h));
        qws qws = new qws(this, "THUNDERBIRD", null);
        if (this.f109051c == null) {
            this.f109051c = augv;
        }
        if (this.f109052d == null) {
            this.f109052d = qws;
            qws.mo24337a(cagz.FAST_IF_RADIO_AWAKE);
        }
        this.f109053e = auhv.m77087a(this);
    }

    public final void onDestroy() {
        synchronized (augv.class) {
            if (augv.f91795b != null) {
                augv.f91795b.shutdown();
                augv.f91795b = null;
            }
        }
        this.f109051c.f91796a.shutdown();
        try {
            this.f109051c.f91796a.awaitTermination(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.f109051c.f91796a.shutdownNow();
        if (!this.f109054f.isEmpty()) {
            auho.m77069a(this, new IllegalStateException("service destroyed with outstanding emergencies"));
            this.f109054f.clear();
        }
        if (this.f109056h.mo49124e()) {
            auho.m77069a(this, new IllegalStateException("service destroyed with held wakelock"));
            do {
                this.f109056h.mo49120c();
            } while (this.f109056h.mo49124e());
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f109051c.f91796a.execute(new aufm(this, i2, intent));
        if (!intent.getBooleanExtra("thunderbird.intent.extra.IS_WAKEFUL", false)) {
            return 2;
        }
        m93346a(this);
        return 2;
    }
}
