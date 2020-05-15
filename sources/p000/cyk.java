package p000;

/* renamed from: cyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cyk implements cyn {
    /* renamed from: a */
    public final cut mo8390a(cuo cuo, cyp cyp) {
        byte[] bArr = null;
        if (!"D1".equalsIgnoreCase(cuo.mo8307g())) {
            return null;
        }
        byte[] a = cyp.mo8399a("UCOA");
        byte[] a2 = cyp.mo8399a("COA");
        if (!(a == null || a2 == null)) {
            bArr = cvz.m7720b(cwd.m7750a(cvz.m7704a(cvz.m7714a(cvz.m7724c(a) - cvz.m7724c(a2))), 12, "0"));
        }
        return cut.m7621a(cuo.mo8309i().mo8318a(bArr));
    }
}
