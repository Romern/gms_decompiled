package p000;

/* renamed from: bzsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzsy {

    /* renamed from: a */
    private final bzse f171304a;

    public bzsy(bzse bzse) {
        this.f171304a = bzse;
    }

    /* renamed from: a */
    public static bzsx m126181a(bzse bzse) {
        return new bzsx(bzse);
    }

    /* renamed from: a */
    public final bzsq mo74581a(String str, String str2, bzsa bzsa, bzrx bzrx, String str3, bzsw bzsw) {
        bzsw bzsw2 = bzsw;
        boolean z = true;
        if (!str2.equalsIgnoreCase("put") && !str2.equalsIgnoreCase("post")) {
            z = false;
        }
        bmxy.m108588a(z);
        if (bzsw2 != null) {
            if (!bzsw2.f171302c) {
                if (bzrx.mo20326g() != -1) {
                    if (bzrx.mo20326g() >= 0) {
                    }
                }
            }
            return new bzsj(str, str2, bzsa, bzrx, str3, this.f171304a, bzsw);
        }
        return new bzso(str, str2, bzsa, bzrx, str3, bzsw);
    }
}
