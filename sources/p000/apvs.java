package p000;

import java.util.concurrent.Executor;

/* renamed from: apvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apvs implements apwr {

    /* renamed from: f */
    public static final /* synthetic */ int f85001f = 0;

    /* renamed from: a */
    public final qws f85002a = new qws(rpr.m34216b(), "GPP_UI", null);

    /* renamed from: b */
    public volatile boolean f85003b = false;

    /* renamed from: c */
    public aucb f85004c = null;

    /* renamed from: d */
    public final Object f85005d = new Object();

    /* renamed from: e */
    public volatile int f85006e = 1;

    /* renamed from: g */
    private final Executor f85007g = adzl.f62962b.mo25879b(2);

    static {
        apvs.class.getName();
    }

    public apvs() {
        mo47663a();
    }

    /* renamed from: b */
    public static apwr m71077b() {
        return apvr.f85000a;
    }

    /* renamed from: a */
    public final void mo47663a() {
        synchronized (this.f85005d) {
            this.f85004c = avtz.m79338b(rpr.m34216b()).mo24673E();
        }
    }

    /* renamed from: a */
    public final void mo47664a(int i) {
        this.f85006e = i;
    }

    /* renamed from: a */
    public final void mo47665a(int i, int i2) {
        this.f85007g.execute(new apvp(this, i2, i));
    }
}
