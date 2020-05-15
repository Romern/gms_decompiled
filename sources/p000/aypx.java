package p000;

import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyAgreement;

/* renamed from: aypx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aypx {

    /* renamed from: a */
    public final aypp f98219a;

    /* renamed from: b */
    public final String f98220b;

    /* renamed from: c */
    public final int f98221c;

    public aypx(aypp aypp, String str, int i) {
        this.f98219a = aypp;
        this.f98220b = str;
        this.f98221c = i;
    }

    /* renamed from: a */
    private final aypw m84472a(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 64) {
            KeyPair a = ayos.m84394a();
            ayos ayos = new ayos((ECPublicKey) a.getPublic(), (ECPrivateKey) a.getPrivate());
            ECPublicKey eCPublicKey = ayos.f98131a;
            if (eCPublicKey != null) {
                ECPoint w = eCPublicKey.getW();
                bArr2 = bqce.m112562a(ayos.m84395a(w.getAffineX().toByteArray()), ayos.m84395a(w.getAffineY().toByteArray()));
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68432a("aypx", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Handshake %s, generates key by ECDH.", this.f98220b);
                KeyAgreement keyAgreement = (KeyAgreement) ayos.m84393a(ayop.f98126a);
                keyAgreement.init(ayos.f98132b);
                keyAgreement.doPhase(((KeyFactory) ayos.m84393a(ayoq.f98127a)).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, 32)), new BigInteger(1, Arrays.copyOfRange(bArr, 32, 64))), ((ECPublicKey) ayos.m84394a().getPublic()).getParams())), true);
                return new aypw(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(keyAgreement.generateSecret()), 16), bArr2);
            }
            throw new GeneralSecurityException("Failed to do ECDH.");
        } else if (length == 16) {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypx", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Handshake %s, using the given secret.", this.f98220b);
            return new aypw(bArr, new byte[0]);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Key length is not correct: ");
            sb.append(length);
            throw new GeneralSecurityException(sb.toString());
        }
    }

    /* renamed from: b */
    private final byte[] m84474b(byte[] bArr) {
        ayri a = this.f98219a.mo54203a();
        a.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98221c));
        ayrh c = a.mo54316c(ayod.f98113a, aynz.f98106a);
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypx", "b", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Writing handshake packet to address=%s", this.f98220b);
        a.mo54313a(ayod.f98113a, aynz.f98106a, bArr);
        bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
        bnsl2.mo68432a("aypx", "b", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Waiting handshake packet from address=%s", this.f98220b);
        return c.mo54309a(TimeUnit.SECONDS.toMillis((long) this.f98221c));
    }

    /* renamed from: a */
    private final String m84473a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 16) {
            String valueOf = String.valueOf(boan.f132472f.mo68794a(bArr2));
            throw new PairingException(valueOf.length() == 0 ? new String("Handshake failed because of incorrect response: ") : "Handshake failed because of incorrect response: ".concat(valueOf), new Object[0]);
        }
        byte[] b = aynf.m84294b(bArr, bArr2);
        byte b2 = b[0];
        if (b2 == 1) {
            String a = aynj.m84357a(Arrays.copyOfRange(b, 1, 7));
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypx", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Handshake success with public %s, ble %s", a, this.f98220b);
            return a;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Handshake response type incorrect: ");
        sb.append((int) b2);
        throw new PairingException(sb.toString(), new Object[0]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, byte):void
     arg types: [java.lang.String, java.lang.String, byte]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void */
    /* renamed from: a */
    public final aypj mo54210a(byte[] bArr, aypt aypt) {
        aypw aypw;
        byte[] bArr2;
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        if (length == 64) {
            KeyPair a = ayos.m84394a();
            ayos ayos = new ayos((ECPublicKey) a.getPublic(), (ECPrivateKey) a.getPrivate());
            ECPublicKey eCPublicKey = ayos.f98131a;
            if (eCPublicKey != null) {
                ECPoint w = eCPublicKey.getW();
                bArr2 = bqce.m112562a(ayos.m84395a(w.getAffineX().toByteArray()), ayos.m84395a(w.getAffineY().toByteArray()));
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68432a("aypx", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Handshake %s, generates key by ECDH.", this.f98220b);
                KeyAgreement keyAgreement = (KeyAgreement) ayos.m84393a(ayop.f98126a);
                keyAgreement.init(ayos.f98132b);
                keyAgreement.doPhase(((KeyFactory) ayos.m84393a(ayoq.f98127a)).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOf(bArr3, 32)), new BigInteger(1, Arrays.copyOfRange(bArr3, 32, 64))), ((ECPublicKey) ayos.m84394a().getPublic()).getParams())), true);
                aypw = new aypw(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(keyAgreement.generateSecret()), 16), bArr2);
            } else {
                throw new GeneralSecurityException("Failed to do ECDH.");
            }
        } else if (length == 16) {
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypx", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Handshake %s, using the given secret.", this.f98220b);
            aypw = new aypw(bArr3, new byte[0]);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Key length is not correct: ");
            sb.append(length);
            throw new GeneralSecurityException(sb.toString());
        }
        bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
        bnsl3.mo68432a("aypx", "a", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68421a("Handshake %s, flags %s.", (Object) this.f98220b, aypt.f98213b);
        byte[] a2 = bqce.m112562a(aynf.m84293a(aypw.f98217a, aypt.mo54206a()), aypw.f98218b);
        ayri a3 = this.f98219a.mo54203a();
        a3.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98221c));
        ayrh c = a3.mo54316c(ayod.f98113a, aynz.f98106a);
        bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
        bnsl4.mo68432a("aypx", "b", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68420a("Writing handshake packet to address=%s", this.f98220b);
        a3.mo54313a(ayod.f98113a, aynz.f98106a, a2);
        bnsl bnsl5 = (bnsl) aypn.f98194a.mo68390d();
        bnsl5.mo68432a("aypx", "b", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl5.mo68420a("Waiting handshake packet from address=%s", this.f98220b);
        byte[] a4 = c.mo54309a(TimeUnit.SECONDS.toMillis((long) this.f98221c));
        byte[] bArr4 = aypw.f98217a;
        if (a4.length != 16) {
            String valueOf = String.valueOf(boan.f132472f.mo68794a(a4));
            throw new PairingException(valueOf.length() == 0 ? new String("Handshake failed because of incorrect response: ") : "Handshake failed because of incorrect response: ".concat(valueOf), new Object[0]);
        }
        byte[] b = aynf.m84294b(bArr4, a4);
        byte b2 = b[0];
        if (b2 == 1) {
            String a5 = aynj.m84357a(Arrays.copyOfRange(b, 1, 7));
            bnsl bnsl6 = (bnsl) aypn.f98194a.mo68390d();
            bnsl6.mo68432a("aypx", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68424a("Handshake success with public %s, ble %s", a5, this.f98220b);
            return new ayng(aypw.f98217a, a5);
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Handshake response type incorrect: ");
        sb2.append((int) b2);
        throw new PairingException(sb2.toString(), new Object[0]);
    }
}
