package p000;

import android.content.Context;
import java.util.Arrays;

/* renamed from: rds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rds implements rdq {

    /* renamed from: a */
    private static final Object f42756a = new Object();

    /* renamed from: c */
    private static int f42757c = 0;

    /* renamed from: d */
    private static volatile rds f42758d = null;

    /* renamed from: b */
    private final beju f42759b;

    /* renamed from: e */
    private volatile rde f42760e = null;

    /* renamed from: f */
    private volatile rde f42761f = null;

    private rds() {
        bejv bejv = new bejv();
        bejv.mo60768a(beku.f111735a);
        bejv.f111685a = bqfb.INSTANCE;
        bejv.f111686b = new befa(Arrays.asList(new befu()));
        this.f42759b = bejv.mo60766a();
        m33430d();
    }

    /* renamed from: c */
    public static rds m33429c() {
        rds rds;
        synchronized (f42756a) {
            f42757c++;
            if (f42758d == null) {
                f42758d = new rds();
            }
            rds = f42758d;
        }
        return rds;
    }

    /* renamed from: d */
    private final void m33430d() {
        rpr b = rpr.m34216b();
        synchronized (f42756a) {
            if (this.f42760e == null) {
                aytw.m84814b();
                Context createDeviceProtectedStorageContext = b.createDeviceProtectedStorageContext();
                createDeviceProtectedStorageContext.deleteDatabase("playlog.db");
                this.f42760e = new rde(createDeviceProtectedStorageContext, this.f42759b);
            }
            if (this.f42761f == null && !aytw.m84813a(b)) {
                b.deleteDatabase("playlog.db");
                this.f42761f = new rde(b, this.f42759b);
            }
        }
    }

    /* renamed from: a */
    public final rdp mo24518a() {
        boolean a = aytw.m84813a(rpr.m34216b());
        m33430d();
        if (!a) {
            return this.f42761f;
        }
        if (this.f42760e != null) {
            return this.f42760e;
        }
        return null;
    }

    /* renamed from: b */
    public final bngx mo24519b() {
        m33430d();
        bngs j = bngx.m109377j();
        if (this.f42760e != null) {
            j.mo67668c(this.f42760e);
        }
        if (this.f42761f != null) {
            j.mo67668c(this.f42761f);
        }
        return j.mo67664a();
    }

    public final void close() {
        synchronized (f42756a) {
            if (f42757c > 0) {
                f42757c--;
            }
            if (f42757c == 0) {
                if (this.f42760e != null) {
                    this.f42760e.close();
                    this.f42760e = null;
                }
                if (this.f42761f != null) {
                    this.f42761f.close();
                    this.f42761f = null;
                }
                f42758d = null;
            }
        }
    }
}
