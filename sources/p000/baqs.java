package p000;

/* renamed from: baqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baqs {
    /* renamed from: a */
    public static byjk m87414a(byjk byjk, byjh byjh) {
        boolean z;
        bxvd bxvd = (bxvd) byjk.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) byjk);
        boolean z2 = false;
        if (byjk.f166665b || byjh.f166656f) {
            z = true;
        } else {
            z = false;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        byjk byjk2 = (byjk) bxvd.f164949b;
        byjk byjk3 = byjk.f166662e;
        int i = byjk2.f166664a | 1;
        byjk2.f166664a = i;
        byjk2.f166665b = z;
        if (byjk.f166666c || byjh.f166657g) {
            z2 = true;
        }
        byjk2.f166664a = i | 2;
        byjk2.f166666c = z2;
        return (byjk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static byjk m87415a(byjk byjk, byjk byjk2) {
        boolean z;
        bxun bxun;
        if (byjk == null) {
            return byjk2;
        }
        bxvd da = byjk.f166662e.mo74144da();
        boolean z2 = true;
        if (!byjk.f166665b || !byjk2.f166665b) {
            z = false;
        } else {
            z = true;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byjk byjk3 = (byjk) da.f164949b;
        int i = byjk3.f166664a | 1;
        byjk3.f166664a = i;
        byjk3.f166665b = z;
        if (!byjk.f166666c || !byjk2.f166666c) {
            z2 = false;
        }
        byjk3.f166664a = i | 2;
        byjk3.f166666c = z2;
        bxun bxun2 = byjk.f166667d;
        if (bxun2 == null) {
            bxun2 = bxun.f164861c;
        }
        bxun bxun3 = byjk2.f166667d;
        if (bxun3 == null) {
            bxun3 = bxun.f164861c;
        }
        if (bxzr.m124573a(bxun2, bxun3) >= 0 ? (bxun = byjk2.f166667d) == null : (bxun = byjk.f166667d) == null) {
            bxun = bxun.f164861c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byjk byjk4 = (byjk) da.f164949b;
        bxun.getClass();
        byjk4.f166667d = bxun;
        byjk4.f166664a |= 4;
        return (byjk) da.mo74062i();
    }
}
