package p000;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: zrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class zrr {

    /* renamed from: a */
    private final Object f55757a = new Object();

    /* renamed from: b */
    private Object f55758b = null;

    /* renamed from: c */
    private long f55759c;

    /* renamed from: d */
    private final Callable f55760d;

    static {
        zvt.m46581a();
    }

    public zrr(Callable callable) {
        this.f55760d = callable;
    }

    /* renamed from: a */
    public final Object mo31412a() {
        Object b = mo31413b();
        if (b != null) {
            return b;
        }
        try {
            Object call = this.f55760d.call();
            synchronized (this.f55757a) {
                Object obj = this.f55758b;
                if (obj != null) {
                    return obj;
                }
                this.f55758b = call;
                this.f55759c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(cdzv.f182107a.mo6606a().mo78638g());
                return call;
            }
        } catch (Exception e) {
            bmzo.m108687a(e, IOException.class);
            bmzo.m108686a(e);
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object mo31413b() {
        synchronized (this.f55757a) {
            if (this.f55758b != null) {
                if (System.currentTimeMillis() > this.f55759c) {
                    mo31414c();
                    return null;
                }
            }
            Object obj = this.f55758b;
            return obj;
        }
    }

    /* renamed from: c */
    public final void mo31414c() {
        synchronized (this.f55757a) {
            this.f55758b = null;
        }
    }
}
