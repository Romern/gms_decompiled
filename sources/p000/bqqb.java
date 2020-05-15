package p000;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: bqqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqqb {
    /* renamed from: a */
    public static String m113227a(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(Integer.toString(bqry.m113303a(i)));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: b */
    public static int m113229b(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        String valueOf = String.valueOf(bqrw.m113301c(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: c */
    public static int m113230c(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(Integer.toString(bqrh.m113282a(i)));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static void m113228a(bqrp bqrp) {
        bqrs bqrs = bqrp.f141462a;
        if (bqrs == null) {
            bqrs = bqrs.f141476d;
        }
        int b = bqrw.m113300b(bqrs.f141478a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        bqvm.m113479a(m113229b(b));
        bqrs bqrs2 = bqrp.f141462a;
        if (bqrs2 == null) {
            bqrs2 = bqrs.f141476d;
        }
        int b2 = bqry.m113304b(bqrs2.f141479b);
        if (b2 != 0) {
            i = b2;
        }
        m113227a(i);
        int b3 = bqrh.m113283b(bqrp.f141464c);
        if (b3 != 0 && b3 == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        bqrn bqrn = bqrp.f141463b;
        if (bqrn == null) {
            bqrn = bqrn.f141454b;
        }
        bqsf bqsf = bqrn.f141456a;
        if (bqsf == null) {
            bqsf = bqsf.f141514d;
        }
        bqok.m113103a(bqsf);
    }
}
