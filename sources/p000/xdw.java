package p000;

import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: xdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xdw {

    /* renamed from: a */
    public final xkb f52030a;

    /* renamed from: b */
    public final xjz f52031b;

    /* renamed from: c */
    public final xlu f52032c;

    /* renamed from: d */
    private final PublicKey f52033d;

    public xdw(PublicKey publicKey, xkb xkb, xjz xjz, xlu xlu) {
        bmxy.m108582a(publicKey, "Public key is null");
        this.f52033d = publicKey;
        bmxy.m108582a(xkb, "Key handle is null");
        this.f52030a = xkb;
        bmxy.m108582a(xjz, "Credential identifier is null");
        this.f52031b = xjz;
        this.f52032c = xlu;
    }

    /* renamed from: a */
    public final xlx mo29669a() {
        bmxy.m108600b("EC".equals(this.f52033d.getAlgorithm()));
        ECPoint w = ((ECPublicKey) this.f52033d).getW();
        return new xlz(xpr.ES256, xly.SECP256R1, w.getAffineX(), w.getAffineY());
    }
}
