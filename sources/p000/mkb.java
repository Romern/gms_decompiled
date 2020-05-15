package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mkb {

    /* renamed from: a */
    public static final lvn f33866a = new lvn("UsbReceiver");

    /* renamed from: b */
    public final mkt f33867b;

    /* renamed from: c */
    public final mkn f33868c;

    /* renamed from: d */
    public final AtomicBoolean f33869d = new AtomicBoolean(true);

    /* renamed from: e */
    public final lys f33870e;

    /* renamed from: f */
    public miu f33871f = null;

    /* renamed from: g */
    public final mka f33872g;

    public mkb(mkt mkt, mkn mkn, bqgj bqgj, lys lys) {
        sdo.m34970a(true);
        sdo.m34970a(true);
        this.f33867b = mkt;
        this.f33868c = mkn;
        this.f33872g = new mka(this, bqgj);
        this.f33870e = lys;
    }

    /* renamed from: a */
    public final void mo20116a() {
        boolean z = true;
        sdo.m34970a(true);
        if (this.f33871f != null) {
            z = false;
        }
        sdo.m34970a(z);
        this.f33871f = this.f33867b.f33841a.mo20029a();
    }

    /* renamed from: b */
    public final void mo20118b() {
        this.f33869d.set(false);
    }

    /* renamed from: a */
    public final void mo20117a(int i) {
        sdo.m34970a(true);
        this.f33871f.mo20024a(i);
        this.f33871f = null;
    }
}
