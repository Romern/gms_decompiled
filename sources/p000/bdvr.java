package p000;

/* renamed from: bdvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdvr {
    /* renamed from: a */
    public static bdwf m91495a(Exception exc) {
        bnha h = bnhe.m109414h();
        h.mo67695b(chuw.class, bdvl.f106506a);
        h.mo67695b(chux.class, bdvm.f106507a);
        h.mo67695b(bdqv.class, bdvn.f106508a);
        h.mo67695b(bdqx.class, bdvo.f106509a);
        h.mo67695b(bdqy.class, bdvp.f106510a);
        h.mo67695b(bdqw.class, bdvq.f106511a);
        bnhe b = h.mo67618b();
        for (Throwable th : bmzo.m108691c(exc)) {
            bmxj bmxj = (bmxj) b.get(th.getClass());
            if (bmxj != null) {
                return (bdwf) bmxj.apply(th);
            }
        }
        return bdwf.m91508a(3);
    }
}
