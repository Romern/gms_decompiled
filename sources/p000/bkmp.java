package p000;

import java.util.Random;

/* renamed from: bkmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkmp extends bkmt {

    /* renamed from: a */
    private final long f124904a = Math.abs(new Random().nextLong());

    public bkmp(bkpx bkpx) {
        super(bkpx);
    }

    /* renamed from: a */
    public final synchronized bkpv mo66114a(blhg blhg) {
        bkpv bkpv;
        bkpv = new bkpv(this.f124904a, blhg, System.currentTimeMillis());
        this.f124905c.add(bkpv);
        return bkpv;
    }

    /* renamed from: a */
    public final void mo66115a() {
        throw null;
    }

    /* renamed from: b */
    public final synchronized bkqi mo66117b() {
        return bkqi.f125113a;
    }

    /* renamed from: c */
    public final synchronized boolean mo66118c() {
        return false;
    }
}
