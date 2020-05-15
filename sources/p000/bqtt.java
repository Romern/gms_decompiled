package p000;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: bqtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtt extends bqnq {
    public bqtt(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69296a(Object obj) {
        bqsv bqsv = (bqsv) obj;
        int i = 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) bqvo.f141695g.mo69341a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, bqsv.f141585c.getKey()), new BigInteger(1, bqsv.f141586d.getKey())));
        bqst bqst = bqsv.f141584b;
        if (bqst == null) {
            bqst = bqst.f141568b;
        }
        int b = bqry.m113304b(bqst.f141570a);
        if (b != 0) {
            i = b;
        }
        return new bqwh(rSAPublicKey, bqua.m113406a(i));
    }
}
