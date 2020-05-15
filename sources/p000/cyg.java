package p000;

/* renamed from: cyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cyg extends cym {
    public cyg(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo8392a(cyp cyp) {
        String a = cyp.f12399b.mo8423a();
        if ((a.length() & 1) == 0) {
            return cvz.m7720b(a);
        }
        String valueOf = String.valueOf(a);
        return cvz.m7720b(valueOf.length() == 0 ? new String("0") : "0".concat(valueOf));
    }
}
