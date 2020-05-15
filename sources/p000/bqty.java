package p000;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: bqty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqty extends bqnq {
    public bqty(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69296a(Object obj) {
        bqsz bqsz = (bqsz) obj;
        int i = 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) bqvo.f141695g.mo69341a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, bqsz.f141611c.mo73780k()), new BigInteger(1, bqsz.f141612d.mo73780k())));
        bqsx bqsx = bqsz.f141610b;
        if (bqsx == null) {
            bqsx = bqsx.f141592d;
        }
        int b = bqry.m113304b(bqsx.f141594a);
        if (b == 0) {
            b = 1;
        }
        int a = bqua.m113406a(b);
        int b2 = bqry.m113304b(bqsx.f141595b);
        if (b2 != 0) {
            i = b2;
        }
        return new bqwj(rSAPublicKey, a, bqua.m113406a(i), bqsx.f141596c);
    }
}
