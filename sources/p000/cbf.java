package p000;

/* renamed from: cbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbf {
    static {
        cbf.class.getSimpleName();
    }

    private cbf() {
    }

    /* renamed from: a */
    public static void m3887a(bxm bxm) {
        int i = cbd.f6383a;
        if (!bxm.f5988j.mo3583b(bxz.f6075a)) {
            throw new RuntimeException("CID is missing");
        } else if (bxm.f5988j.mo3606u().mo3563i()[0] == Byte.MIN_VALUE) {
            bxm.f5985g = bxn.APPROVED;
        } else if (!bxm.f5988j.mo3583b(bxz.f6075a)) {
            throw new RuntimeException("CID is missing");
        } else if (bxm.f5988j.mo3606u().mo3563i()[0] == 0) {
            bxm.f5985g = bxn.DECLINED;
        }
    }
}
