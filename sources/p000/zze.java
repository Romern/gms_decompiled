package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: zze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zze implements bqfp {

    /* renamed from: a */
    public final List f56246a;

    /* renamed from: b */
    public final Object f56247b = new Object();

    /* renamed from: c */
    public ScheduledFuture f56248c;

    /* renamed from: d */
    public int f56249d = 0;

    /* renamed from: e */
    private final Context f56250e;

    /* renamed from: f */
    private final zxn f56251f;

    /* renamed from: g */
    private final ExecutorService f56252g;

    /* renamed from: h */
    private final zxv f56253h;

    /* renamed from: i */
    private final bmza f56254i;

    /* renamed from: j */
    private bqgg f56255j = null;

    /* renamed from: k */
    private int f56256k;

    public zze(zxn zxn, ExecutorService executorService, zxv zxv, Context context, bmza bmza, List list) {
        this.f56251f = zxn;
        this.f56252g = executorService;
        this.f56253h = zxv;
        this.f56250e = context;
        this.f56246a = list;
        this.f56254i = bmza;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zxv.a(zxi, zxh, boolean):java.io.File
     arg types: [zxi, zxh, int]
     candidates:
      zxv.a(java.io.File, zxi, zxh):java.io.File
      zxv.a(long, java.io.File, java.io.File):boolean
      zxv.a(zxi, zxh, boolean):java.io.File */
    /* renamed from: a */
    public final void mo31616a() {
        bqgg bqgg;
        int i;
        int i2;
        C1240of ofVar;
        synchronized (this.f56247b) {
            bqgg = this.f56255j;
        }
        C1240of ofVar2 = null;
        if (bqgg != null) {
            synchronized (this.f56247b) {
                if (!this.f56246a.isEmpty()) {
                    ofVar = (C1240of) this.f56246a.remove(0);
                } else {
                    ofVar = null;
                }
            }
            this.f56251f.mo31559b(zxv.m46649a(((zxi) ofVar.f26798a).f56105b, (zxh) ofVar.f26799b));
        }
        synchronized (this.f56247b) {
            if (!this.f56246a.isEmpty()) {
                ofVar2 = (C1240of) this.f56246a.get(0);
            }
        }
        synchronized (this.f56247b) {
            i = this.f56249d;
        }
        if (ofVar2 != null && i == 0) {
            zxi zxi = (zxi) ofVar2.f26798a;
            zxh zxh = (zxh) ofVar2.f26799b;
            String a = zxv.m46649a(zxi.f56105b, zxh);
            if (this.f56253h.mo31570a(zxi, zxh, true) == null) {
                zxv zxv = this.f56253h;
                zxf zxf = zxh.f56097a;
                if (zxf == null) {
                    zxf = zxf.f56084e;
                }
                if (zxv.mo31574b(zxf.f56088c)) {
                    bqgg a2 = this.f56251f.mo31558a(a);
                    synchronized (this.f56247b) {
                        this.f56255j = a2;
                    }
                    bqga.m112781a(a2, this, this.f56252g);
                    zyh.m46683c("FontsSharedState", String.format(Locale.ENGLISH, "Extraction queued for %s", a), new Object[0]);
                    return;
                }
                return;
            }
            return;
        }
        this.f56248c.cancel(false);
        if (i == 0) {
            mo31617a(18);
        }
        Context context = this.f56250e;
        bmza bmza = this.f56254i;
        synchronized (this.f56247b) {
            i2 = this.f56256k;
        }
        zzi.m46734a(context, bmza, i, i2);
    }

    /* renamed from: a */
    public final void mo31617a(int i) {
        synchronized (this.f56247b) {
            int i2 = this.f56249d;
            if (i2 != 0) {
                zyh.m46683c("FontsSharedState", "Attempted to set multiple end states for pre-extract; is %d, assigned %d", Integer.valueOf(i2), Integer.valueOf(i));
                return;
            }
            this.f56249d = i;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Status status = (Status) obj;
        synchronized (this.f56247b) {
            this.f56256k++;
        }
        mo31616a();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        mo31616a();
    }
}
