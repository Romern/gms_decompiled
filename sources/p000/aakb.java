package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.gcm.DozeChangeReceiver;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;

/* renamed from: aakb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakb {

    /* renamed from: m */
    private static aakb f28338m;

    /* renamed from: n */
    private static Boolean f28339n;

    /* renamed from: a */
    protected aakr f28340a;

    /* renamed from: b */
    public aakw f28341b;

    /* renamed from: c */
    public aalt f28342c;

    /* renamed from: d */
    protected aank f28343d;

    /* renamed from: e */
    public HeartbeatChimeraAlarm f28344e;

    /* renamed from: f */
    protected aajt f28345f;

    /* renamed from: g */
    public aakk f28346g;

    /* renamed from: h */
    protected aarc f28347h;

    /* renamed from: i */
    public aamu f28348i;

    /* renamed from: j */
    protected aaqx f28349j;

    /* renamed from: k */
    protected aand f28350k;

    /* renamed from: l */
    public aamf f28351l;

    public aakb() {
    }

    /* renamed from: a */
    public static synchronized aakb m21381a() {
        aakb aakb;
        synchronized (aakb.class) {
            if (f28338m == null) {
                f28339n = Boolean.valueOf(aytw.m84813a(rpr.m34216b()));
                f28338m = new aakb(null);
            }
            aakb = f28338m;
        }
        return aakb;
    }

    /* renamed from: b */
    public static synchronized boolean m21382b() {
        boolean equals;
        synchronized (aakb.class) {
            if (ceck.m135995e()) {
                sdo.m34959a(f28339n);
            }
            equals = Boolean.TRUE.equals(f28339n);
        }
        return equals;
    }

    /* renamed from: c */
    public final aakr mo16918c() {
        sdo.m34970a(aajg.m21343c());
        return this.f28340a;
    }

    /* renamed from: d */
    public final aank mo16919d() {
        sdo.m34970a(aajg.m21343c());
        return this.f28343d;
    }

    /* renamed from: e */
    public final aaqx mo16920e() {
        sdo.m34970a(aajg.m21343c());
        return this.f28349j;
    }

    /* renamed from: f */
    public final aajt mo16921f() {
        sdo.m34970a(aajg.m21343c());
        return this.f28345f;
    }

    /* renamed from: g */
    public final aand mo16922g() {
        sdo.m34970a(aajg.m21343c());
        return this.f28350k;
    }

    /* renamed from: h */
    public final aarc mo16923h() {
        sdo.m34970a(aajg.m21343c());
        return this.f28347h;
    }

    public aakb(byte[] bArr) {
        aamg aamg;
        rpr b = rpr.m34216b();
        aaka.m21380e(b);
        aajg.m21335a((Context) b);
        this.f28340a = new aakr();
        this.f28341b = new aakw(b);
        this.f28342c = new aalt();
        this.f28351l = new aamf(b);
        if (aajg.m21343c()) {
            srb srb = srb.f45012a;
            qws qws = new qws(b, "GCM", null);
            this.f28346g = new aakk(qws, new qxq(qws, "GCM_COUNTERS", 1024), aeat.m51532a(b));
            aajg.m21339a();
            if (aajg.f28258a) {
                aamg = new aamg();
            } else {
                aamg = null;
            }
            aamc aamc = new aamc(b);
            aaml aaml = new aaml(b, this.f28346g);
            aakl aakl = new aakl(b, this.f28346g);
            aamu aamu = new aamu(b, aeat.m51532a(b), aakl, srb);
            this.f28348i = aamu;
            this.f28343d = new aank(b, srb, aamu, aaqx.f28952a);
            this.f28344e = new HeartbeatChimeraAlarm(b, this.f28343d, this.f28348i, new aams(b, "GCM_HB_ALARM", "com.google.android.gms.gcm.HEARTBEAT_ALARM"));
            aamk aamk = new aamk(new aanz(aaka.m21378c(b)));
            aamr aamr = new aamr(b, new aaoa(b), aaml, this.f28346g.f28364a, aakl);
            aamn aamn = new aamn(this.f28340a, aaml, aamk, aamr);
            abop abop = new abop(b, "Android-GCM/1.5", false);
            aaqs aaqs = new aaqs(b, this.f28351l, aamk);
            this.f28349j = new aaqx(b, abop, this.f28341b, aaqs, this.f28342c);
            aalx aalx = new aalx(b, aamk, aakl);
            bqgj b2 = snp.m35704b(10);
            aank aank = this.f28343d;
            aaqx aaqx = this.f28349j;
            aalt aalt = this.f28342c;
            qxq qxq = this.f28346g.f28364a;
            aamf aamf = this.f28351l;
            aajt aajt = new aajt(b, b2, aamg, aank, aamc, aaqx, aaqs, aalt, aamn, aamr, aalx, aaml, qxq, aamf, new aaod(aamf, aalx));
            this.f28345f = aajt;
            aaqx aaqx2 = this.f28349j;
            aakr aakr = this.f28340a;
            aaqt aaqt = new aaqt(aajt, aaqx2, aaqs);
            aakr.mo16945a(aaqt, aaqt.f28945a);
            aamt aamt = new aamt();
            aanm aanm = new aanm(aamt);
            aanb aanb = new aanb(b);
            aarc aarc = new aarc(b);
            this.f28347h = aarc;
            this.f28350k = new aanr(b, aanb, aamc, this.f28344e, this.f28343d, this.f28345f, aamg, this.f28341b, aanm, aamt, aakl, aarc);
            this.f28340a.mo16945a(new aame(b, this.f28350k, this.f28345f, aamr), snp.m35704b(10));
            int i = Build.VERSION.SDK_INT;
            DozeChangeReceiver dozeChangeReceiver = new DozeChangeReceiver();
            IntentFilter intentFilter = new IntentFilter();
            int i2 = Build.VERSION.SDK_INT;
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            int i3 = Build.VERSION.SDK_INT;
            intentFilter.addAction("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED");
            b.registerReceiver(dozeChangeReceiver, intentFilter);
            Intent intent = new Intent();
            intent.setClassName(b, "com.google.android.gms.gcm.GcmService");
            b.startService(intent);
            return;
        }
        this.f28343d = null;
        this.f28349j = null;
        this.f28345f = null;
        this.f28346g = null;
        this.f28344e = null;
        this.f28350k = null;
        this.f28347h = null;
        this.f28348i = null;
    }
}
