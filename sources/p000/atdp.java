package p000;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: atdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdp {

    /* renamed from: a */
    public static final ECParameterSpec f90137a;

    /* renamed from: b */
    public static final int f90138b;

    /* renamed from: c */
    private static final boan f90139c = boan.f132472f.mo68788c();

    /* renamed from: d */
    private static final boan f90140d = boan.f132471e;

    /* renamed from: e */
    private static final byte[] f90141e = f90139c.mo68796b("d63c5d696173575e2214e3435c4290d74c6581ab0635cf27cf166844e32ae8bd390c88009c6f9f8a576c87a41baae5712aace6454ccbf830f66f4dfbe915d917");

    /* renamed from: f */
    private static final byte[] f90142f = f90139c.mo68796b("0b4576cc149d1a4eba62f8d303cb2a87f1b938c9123c2c2c24376958917257e39990937693016c0645a3d1d339b7c7bedd4f51322bb99ec12a5ffb3bb9adb217");

    /* renamed from: g */
    private final asma f90143g = new asma(new asmb(MessageDigest.getInstance("SHA-256"), null));

    static {
        BigInteger bigInteger = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        ECParameterSpec eCParameterSpec = new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16)), new ECPoint(new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16), new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16)), new BigInteger("115792089210356248762697446949407573529996955224135760342422259061068512044369"), 1);
        f90137a = eCParameterSpec;
        f90138b = (eCParameterSpec.getCurve().getField().getFieldSize() + 7) / 8;
    }

    /* renamed from: a */
    public final byte[] mo49840a(byte[] bArr, String str, askf askf) {
        boolean z;
        byte[] bArr2;
        Iterator it = bmyx.m108640a('.').mo66918a((CharSequence) str).iterator();
        it.next();
        it.next();
        byte[] b = f90140d.mo68796b((CharSequence) it.next());
        if (b.length == 0) {
            b = new byte[16];
            z = false;
        } else {
            z = true;
        }
        byte[] b2 = f90140d.mo68796b((CharSequence) it.next());
        byte[] b3 = f90140d.mo68796b((CharSequence) it.next());
        if (askc.m74274c(askf.f89125c)) {
            bArr2 = f90141e;
        } else {
            bArr2 = f90142f;
        }
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr2, 0, f90138b)), new BigInteger(1, Arrays.copyOfRange(bArr2, f90138b, bArr2.length))), f90137a));
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        asma asma = this.f90143g;
        KeyAgreement instance = KeyAgreement.getInstance("ECDH");
        instance.init((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(pKCS8EncodedKeySpec));
        instance.doPhase(generatePublic, true);
        byte[] generateSecret = instance.generateSecret();
        asmb asmb = asma.f89217a;
        if (generateSecret != null) {
            byte[] bArr3 = new byte[32];
            int digestLength = asmb.f89218a.getDigestLength();
            long j = (long) digestLength;
            int i = (int) ((31 + j) / j);
            asmb.f89218a.reset();
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                asmb.f89218a.update(asmb.m74367a(i3));
                asmb.f89218a.update(generateSecret);
                int i4 = i2 * digestLength;
                System.arraycopy(asmb.f89218a.digest(), 0, bArr3, i4, Math.min(digestLength, 32 - i4));
                i2 = i3;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher instance2 = Cipher.getInstance("AES/GCM/NoPadding");
            instance2.init(2, secretKeySpec, new IvParameterSpec(b));
            ByteBuffer allocate = ByteBuffer.allocate(instance2.getOutputSize(b2.length + b3.length));
            instance2.update(ByteBuffer.wrap(b2), allocate);
            int doFinal = instance2.doFinal(ByteBuffer.wrap(b3), allocate);
            byte[] bArr4 = new byte[doFinal];
            allocate.rewind();
            allocate.get(bArr4, 0, doFinal);
            if (z) {
                return Arrays.copyOfRange(bArr4, 1, doFinal);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("Invalid secret.");
    }
}
