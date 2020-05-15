package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bquz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bquz implements bqnk {

    /* renamed from: a */
    private static final byte[] f141652a = new byte[0];

    /* renamed from: b */
    private final bqvb f141653b;

    /* renamed from: c */
    private final String f141654c;

    /* renamed from: d */
    private final byte[] f141655d;

    /* renamed from: e */
    private final bqux f141656e;

    /* renamed from: f */
    private final int f141657f;

    public bquz(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, bqux bqux) {
        bqvm.m113481a(eCPublicKey);
        this.f141653b = new bqvb(eCPublicKey);
        this.f141655d = bArr;
        this.f141654c = str;
        this.f141657f = i;
        this.f141656e = bqux;
    }

    /* renamed from: a */
    public final byte[] mo69285a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        bqng bqng;
        bqvb bqvb = this.f141653b;
        String str = this.f141654c;
        byte[] bArr4 = this.f141655d;
        int i = ((bqqc) this.f141656e).f141354b;
        int i2 = this.f141657f;
        KeyPair a = bqvm.m113476a(bqvb.f141660a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPublicKey eCPublicKey2 = bqvb.f141660a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            byte[] a2 = bqvm.m113483a(eCPrivateKey, eCPublicKey2.getW());
            byte[] a3 = bqvm.m113484a(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
            int i3 = 1;
            byte[] a4 = bqup.m113434a(a3, a2);
            Mac mac = (Mac) bqvo.f141690b.mo69341a(str);
            if (i <= mac.getMacLength() * 255) {
                if (bArr4 == null || bArr4.length == 0) {
                    mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                } else {
                    mac.init(new SecretKeySpec(bArr4, str));
                }
                byte[] bArr5 = new byte[i];
                mac.init(new SecretKeySpec(mac.doFinal(a4), str));
                byte[] bArr6 = new byte[0];
                int i4 = 0;
                while (true) {
                    mac.update(bArr6);
                    mac.update(bArr2);
                    mac.update((byte) i3);
                    bArr6 = mac.doFinal();
                    int length = bArr6.length;
                    int i5 = i4 + length;
                    if (i5 >= i) {
                        break;
                    }
                    System.arraycopy(bArr6, 0, bArr5, i4, length);
                    i3++;
                    i4 = i5;
                }
                System.arraycopy(bArr6, 0, bArr5, i4, i - i4);
                bqva bqva = new bqva(a3, bArr5);
                bqux bqux = this.f141656e;
                bqwa bqwa = bqva.f141659b;
                byte[] bArr7 = null;
                if (bqwa != null) {
                    bArr3 = bqwa.mo69343a();
                } else {
                    bArr3 = null;
                }
                bqqc bqqc = (bqqc) bqux;
                if (bArr3.length == bqqc.f141354b) {
                    if (bqqc.f141353a.equals(bqom.f141342b)) {
                        bxvd da = bqrd.f141422c.mo74144da();
                        da.mo73625a((GeneratedMessageLite) bqqc.f141355c);
                        ByteString a5 = ByteString.m123262a(bArr3, 0, bqqc.f141354b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a5.getClass();
                        ((bqrd) da.f164949b).f141425b = a5;
                        bqng = (bqng) bqok.m113106a(bqqc.f141353a, (bqrd) da.mo74062i(), bqng.class);
                    } else if (bqqc.f141353a.equals(bqom.f141341a)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, bqqc.f141357e);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, bqqc.f141357e, bqqc.f141354b);
                        bxvd da2 = bqqx.f141398d.mo74144da();
                        bqqx bqqx = bqqc.f141356d.f141392b;
                        if (bqqx == null) {
                            bqqx = bqqx.f141398d;
                        }
                        da2.mo73625a((GeneratedMessageLite) bqqx);
                        ByteString a6 = ByteString.m123261a(copyOfRange);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        a6.getClass();
                        ((bqqx) da2.f164949b).f141402c = a6;
                        bqqx bqqx2 = (bqqx) da2.mo74062i();
                        bxvd da3 = bqrz.f141496d.mo74144da();
                        bqrz bqrz = bqqc.f141356d.f141393c;
                        if (bqrz == null) {
                            bqrz = bqrz.f141496d;
                        }
                        da3.mo73625a((GeneratedMessageLite) bqrz);
                        ByteString a7 = ByteString.m123261a(copyOfRange2);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        a7.getClass();
                        ((bqrz) da3.f164949b).f141500c = a7;
                        bqrz bqrz2 = (bqrz) da3.mo74062i();
                        bxvd da4 = bqqv.f141389d.mo74144da();
                        int i6 = bqqc.f141356d.f141391a;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bqqv bqqv = (bqqv) da4.f164949b;
                        bqqv.f141391a = i6;
                        bqqx2.getClass();
                        bqqv.f141392b = bqqx2;
                        bqrz2.getClass();
                        bqqv.f141393c = bqrz2;
                        bqng = (bqng) bqok.m113106a(bqqc.f141353a, (bqqv) da4.mo74062i(), bqng.class);
                    } else {
                        throw new GeneralSecurityException("unknown DEM key type");
                    }
                    byte[] a8 = bqng.mo69281a(bArr, f141652a);
                    bqwa bqwa2 = bqva.f141658a;
                    if (bqwa2 != null) {
                        bArr7 = bqwa2.mo69343a();
                    }
                    return ByteBuffer.allocate(bArr7.length + a8.length).put(bArr7).put(a8).array();
                }
                throw new GeneralSecurityException("Symmetric key has incorrect length");
            }
            throw new GeneralSecurityException("size too large");
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }
}
