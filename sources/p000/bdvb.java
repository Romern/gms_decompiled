package p000;

import com.google.android.gms.facs.cache.FacsCacheCallOptions;

/* renamed from: bdvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdvb implements bdul {

    /* renamed from: a */
    public final Object f106486a = new Object();

    /* renamed from: b */
    public volatile bdva f106487b;

    /* renamed from: c */
    public final bdvj f106488c;

    /* renamed from: d */
    private bqgg f106489d = bqga.m112775a((Object) null);

    public bdvb(bdvc bdvc, bdvj bdvj) {
        bmxy.m108581a(bdvc);
        bmxy.m108581a(bdvj);
        this.f106488c = bdvj;
    }

    /* renamed from: a */
    public static bqgg m91478a(bqgg bqgg) {
        return bqdx.m112673a(bqgg, bduq.f106476a, bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final bqgg mo58389b() {
        bqgg a;
        synchronized (this.f106486a) {
            a = mo58391a(new bdut(this));
        }
        return a;
    }

    /* renamed from: c */
    public final boolean mo58393c() {
        return this.f106487b == null;
    }

    /* renamed from: b */
    public final bqgg mo58392b(bqgg bqgg) {
        return bqdx.m112673a(bqgg, new bdur(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo58388a() {
        bqgg bqgg;
        if (!mo58393c()) {
            bqgg = bqga.m112775a(bxom.IN_MEMORY_CACHE);
        } else {
            synchronized (this.f106486a) {
                if (mo58393c()) {
                    bqgg a = mo58391a(new bdum(this));
                    bqgg = a;
                } else {
                    bqgg a2 = bqga.m112775a(bxom.IN_MEMORY_CACHE);
                    bqgg = a2;
                }
            }
        }
        return bqdx.m112673a(bqgg, new bdus(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo58390a(bdvh bdvh) {
        bqgg bqgg;
        bdvj bdvj = this.f106488c;
        bdvh bdvh2 = bdvh.FORCED_SYNC;
        int ordinal = bdvh.ordinal();
        if (ordinal == 0) {
            wez wez = bdvj.f106504a;
            FacsCacheCallOptions a = bdvj.mo58397a();
            roz b = rpa.m34196b();
            b.f43472a = new weo(a);
            bqgg = bdvj.m91492a(wez.mo24701a(b.mo24977a()));
        } else if (ordinal == 1) {
            wez wez2 = bdvj.f106504a;
            FacsCacheCallOptions a2 = bdvj.mo58397a();
            roz b2 = rpa.m34196b();
            b2.f43472a = new weq(a2);
            bqgg = bdvj.m91492a(wez2.mo24701a(b2.mo24977a()));
        } else {
            throw new AssertionError(bdvh);
        }
        return bqdx.m112674a(bqdx.m112673a(bqfl.m112747c(bqgg), bduy.f106485a, bqfb.INSTANCE), new bduz(), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo58391a(bqeg bqeg) {
        bqgg a = bqga.m112783b(this.f106489d).mo69214a(bqeg, bqfb.INSTANCE);
        this.f106489d = m91478a(a);
        return a;
    }
}
