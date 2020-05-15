package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: belh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class belh {

    /* renamed from: a */
    public final String f111761a;

    /* renamed from: b */
    public final beli f111762b;

    /* renamed from: c */
    public final blie f111763c;

    /* renamed from: d */
    public final Object f111764d = new Object();

    /* renamed from: e */
    public List f111765e = new ArrayList();

    /* renamed from: f */
    private final bqgg f111766f;

    /* renamed from: g */
    private final beis f111767g;

    /* renamed from: h */
    private final blie f111768h = new blie(new bele(this), bqfb.INSTANCE);

    public belh(beli beli, beis beis, bqgg bqgg) {
        this.f111762b = beli;
        this.f111767g = beis;
        this.f111766f = bqgg;
        this.f111761a = beli.mo60759b();
        this.f111763c = new blie(this.f111762b.mo60755a(), bqfb.INSTANCE);
        mo60779a(new bekz(this));
    }

    /* renamed from: a */
    public final bqgg mo60776a() {
        bljb bljb;
        blkh.m107286a();
        if (!this.f111768h.f126606d.isDone()) {
            String valueOf = String.valueOf(this.f111761a);
            bljb = blkh.m107282a(valueOf.length() == 0 ? new String("Get ") : "Get ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        } else {
            bljb = null;
        }
        try {
            bqgg a = bqdx.m112674a(this.f111768h.mo66570a(), bljx.m107266a(new bela(this)), bqfb.INSTANCE);
            if (bljb != null) {
                bljb.mo66586a(a);
            }
            this.f111767g.mo60747a(bqga.m112772a(this.f111766f));
            if (bljb != null) {
                bljb.close();
            }
            return a;
        } catch (Throwable th) {
            if (bljb != null) {
                bljb.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final bqgg mo60777a(bmxj bmxj, Executor executor) {
        return mo60778a(bljx.m107266a(new belc(bmxj)), executor);
    }

    /* renamed from: a */
    public final bqgg mo60778a(bqeh bqeh, Executor executor) {
        blkh.m107286a();
        String valueOf = String.valueOf(this.f111761a);
        bljb a = blkh.m107282a(valueOf.length() == 0 ? new String("Update ") : "Update ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            bqgg a2 = bqdx.m112674a(this.f111768h.mo66570a(), bljx.m107266a(new belb(this, bqeh, executor)), bqfb.INSTANCE);
            a.mo66586a(a2);
            this.f111767g.mo60748b(bqga.m112772a(this.f111766f));
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo60779a(bqeh bqeh) {
        synchronized (this.f111764d) {
            this.f111765e.add(bqeh);
        }
    }
}
