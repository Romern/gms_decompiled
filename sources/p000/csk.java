package p000;

/* renamed from: csk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class csk implements csl {

    /* renamed from: a */
    private final String f11913a;

    protected csk(String str) {
        this.f11913a = str;
    }

    /* renamed from: a */
    public final csr mo8208a(String str, crv crv, csn csn) {
        if (!this.f11913a.equals(str)) {
            return null;
        }
        byte[] a = mo8205a(csn);
        csm.m7452a(crv, a);
        return csr.m7475a(crv.mo8199g().mo8232a(a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte[] mo8205a(csn csn);
}
