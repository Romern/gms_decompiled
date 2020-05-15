package p000;

import java.util.Arrays;

/* renamed from: badj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class badj {

    /* renamed from: a */
    public static final badj f100527a = m86640b().mo55645a();

    /* renamed from: b */
    public static final badj f100528b;

    /* renamed from: c */
    private static final byte[] f100529c = new byte[0];

    static {
        badi b = m86640b();
        b.mo55646a(f100529c, 2);
        f100528b = b.mo55645a();
    }

    /* renamed from: b */
    public static badi m86640b() {
        return new badi();
    }

    /* renamed from: a */
    public abstract bngx mo55608a();

    /* renamed from: a */
    public final boolean mo55647a(byte[] bArr) {
        byte[] bArr2;
        boolean z;
        bnre i = mo55608a().listIterator();
        while (i.hasNext()) {
            badp badp = (badp) i.next();
            if (bArr == null) {
                bArr2 = f100529c;
            } else {
                bArr2 = bArr;
            }
            int b = badp.mo55631b();
            if (b == 1) {
                z = Arrays.equals(badp.mo55630a(), bArr2);
                continue;
            } else if (b == 2) {
                z = bacy.m86614a(badp.mo55630a(), bArr2);
                continue;
            } else {
                int b2 = badp.mo55631b();
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown matching type ");
                sb.append(b2);
                throw new IllegalStateException(sb.toString());
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
