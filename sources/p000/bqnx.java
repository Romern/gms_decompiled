package p000;

import java.security.GeneralSecurityException;

@Deprecated
/* renamed from: bqnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqnx {
    @Deprecated
    /* renamed from: a */
    public static final bqns m113072a(byte[] bArr) {
        try {
            bqsj bqsj = (bqsj) GeneratedMessageLite.m124016a(bqsj.f141531c, bArr, bxus.m123743b());
            m113073a(bqsj);
            return bqns.m113055a(bqsj);
        } catch (bxwf e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    /* renamed from: a */
    public static void m113073a(bqsj bqsj) {
        bxwc bxwc = bqsj.f141534b;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bqsi bqsi = (bqsi) bxwc.get(i);
            bqsd bqsd = bqsi.f141527a;
            if (bqsd == null) {
                bqsd = bqsd.f141509d;
            }
            int b = bqsc.m113309b(bqsd.f141513c);
            if (b == 0 || b != 2) {
                bqsd bqsd2 = bqsi.f141527a;
                if (bqsd2 == null) {
                    bqsd2 = bqsd.f141509d;
                }
                int b2 = bqsc.m113309b(bqsd2.f141513c);
                if (b2 == 0 || b2 != 3) {
                    bqsd bqsd3 = bqsi.f141527a;
                    if (bqsd3 == null) {
                        bqsd3 = bqsd.f141509d;
                    }
                    int b3 = bqsc.m113309b(bqsd3.f141513c);
                    if (b3 == 0) {
                        b3 = 1;
                    }
                    i++;
                    if (b3 == 4) {
                    }
                }
            }
            throw new GeneralSecurityException("keyset contains secret key material");
        }
    }
}
