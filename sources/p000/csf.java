package p000;

/* renamed from: csf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class csf extends csk {
    public csf(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo8205a(csn csn) {
        String c = csn.f11918b.mo8282c();
        if ((c.length() & 1) == 0) {
            return czm.m8012a(c);
        }
        String valueOf = String.valueOf(c);
        return czm.m8012a(valueOf.length() == 0 ? new String("0") : "0".concat(valueOf));
    }
}
