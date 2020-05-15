package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.WorkSource;

/* renamed from: spf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class spf {

    /* renamed from: a */
    public final Object f44920a = new Object();

    /* renamed from: b */
    protected final Context f44921b;

    /* renamed from: c */
    protected final skc f44922c;

    /* renamed from: d */
    public final asfb f44923d;

    /* renamed from: e */
    private final C1245ok f44924e;

    /* renamed from: a */
    public static spf m35821a(Context context) {
        skc skc = new skc(context.getApplicationContext());
        Context applicationContext = context.getApplicationContext();
        if (cdjz.f181084a.mo6606a().mo77788q()) {
            int i = Build.VERSION.SDK_INT;
            return new spi(applicationContext, skc);
        }
        int i2 = Build.VERSION.SDK_INT;
        return new spm(applicationContext, skc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract spe mo25929a(spb spb, String str, int i);

    /* renamed from: a */
    public abstract void mo25931a(String str, int i, long j, spe spe, Handler handler, WorkSource workSource);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25934a(spe spe);

    protected spf(Context context, skc skc) {
        this.f44921b = context;
        this.f44922c = skc;
        this.f44924e = new C1245ok(2);
        this.f44923d = new asfb(this.f44921b, 1, "AlarmManagerCompat");
    }

    /* renamed from: a */
    public final spe mo25928a(String str, int i, spb spb, Handler handler, bqgj bqgj) {
        mo25932a(spb);
        spe a = mo25929a(spb, str, i);
        this.f44924e.put(spb, a);
        if (bqgj == null) {
            a.mo25926a(handler);
        } else {
            a.f44917d = bqgj;
            a.mo25926a(null);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo25930a(String str, int i, long j, spb spb, Handler handler, WorkSource workSource) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        synchronized (this.f44920a) {
            mo25931a(str, i, j, mo25928a(str, i, spb, handler, null), handler, workSource);
        }
    }

    /* renamed from: a */
    public final void mo25932a(spb spb) {
        synchronized (this.f44920a) {
            mo25933a(spb, true);
        }
    }

    /* renamed from: a */
    public final void mo25933a(spb spb, boolean z) {
        spe spe = (spe) this.f44924e.remove(spb);
        if (spe != null) {
            if (z) {
                mo25934a(spe);
            }
            spe.mo25925a();
        }
    }
}
