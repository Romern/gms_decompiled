package p000;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bqqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqqm extends bqnq {
    public bqqm(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69296a(Object obj) {
        bqrz bqrz = (bqrz) obj;
        bqsb bqsb = bqrz.f141499b;
        if (bqsb == null) {
            bqsb = bqsb.f141505c;
        }
        int b = bqry.m113304b(bqsb.f141507a);
        if (b == 0) {
            b = 1;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bqrz.f141500c.mo73780k(), "HMAC");
        bqsb bqsb2 = bqrz.f141499b;
        if (bqsb2 == null) {
            bqsb2 = bqsb.f141505c;
        }
        int i = bqsb2.f141508b;
        int i2 = b - 2;
        if (i2 == 1) {
            return new bqwc("HMACSHA1", secretKeySpec, i);
        }
        if (i2 == 3) {
            return new bqwc("HMACSHA256", secretKeySpec, i);
        }
        if (i2 == 4) {
            return new bqwc("HMACSHA512", secretKeySpec, i);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
