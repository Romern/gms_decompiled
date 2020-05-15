package com.google.android.gms.lockbox;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockboxChimeraService extends TracingIntentService {

    /* renamed from: a */
    public aeyc f79788a;

    /* renamed from: b */
    final bqgj f79789b = new soc(1, 10);

    /* renamed from: c */
    public rjx f79790c;

    /* renamed from: d */
    private skc f79791d;

    /* renamed from: e */
    private sqv f79792e;

    public LockboxChimeraService() {
        super("LockboxService");
    }

    /* renamed from: a */
    public final void mo43832a(long j) {
        this.f79791d.mo25675a("LockboxService", 3, SystemClock.elapsedRealtime() + j, PendingIntent.getBroadcast(this, 0, LockboxAlarmChimeraReceiver.m67120a(this), 0), "com.google.android.gms");
    }

    public final void onCreate() {
        super.onCreate();
        this.f79792e = srb.f45012a;
        this.f79788a = new aeyc(this);
        this.f79791d = new skc(this);
        rjo rjo = aeyf.f64000a;
        this.f79790c = avtz.m79336a(this, new avty());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        aeyc aeyc = this.f79788a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aeyc.f63998a < 0 || elapsedRealtime - aeyc.f63998a > cfbo.f183592a.mo6606a().mo80812b()) {
            aeyc.f63998a = elapsedRealtime;
            if (aeyc.mo34649a()) {
                new aeyb(aeyc.f63999b).mo25219a("");
            }
        }
        try {
            aeyl aeyl = new aeyl(this);
            aeyl.f64008a.f79790c.mo24755k("LB_AS").mo50378a(aeyl.f64008a.f79789b, new aeyk(aeyl));
        } catch (IllegalStateException e) {
        }
    }
}
