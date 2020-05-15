package p000;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* renamed from: byrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class byrb {

    /* renamed from: a */
    static final byte[] f167452a = {-126, -86, 85, -96, -45, -105, -8, -125, 70, -54, 28, -18, -115, 57, 9, -71, 95, 19, -6, 125, -21, 29, 74, -77, -125, 118, -72, 37, 109, -88, 85, 16};

    /* renamed from: b */
    public static final /* synthetic */ int f167453b = 0;

    /* renamed from: a */
    static byri m125173a(SecretKey secretKey, byte[] bArr) {
        try {
            byrz a = m125174a(bArr, secretKey);
            if (bysa.DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD.equals(a.f167530a)) {
                return (byri) GeneratedMessageLite.m124014a(byri.f167474d, a.f167531b);
            }
            throw new SignatureException("wrong message type in responder hello");
        } catch (bxwf e) {
            throw new SignatureException(e);
        } catch (InvalidKeyException e2) {
            throw new SignatureException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new SignatureException(e3);
        }
    }

    /* renamed from: a */
    static byrz m125174a(byte[] bArr, SecretKey secretKey) {
        if (bArr == null) {
            throw null;
        } else if (secretKey != null) {
            try {
                bytd a = bysw.m125311a((byti) GeneratedMessageLite.m124014a(byti.f167671d, bArr), secretKey, byss.HMAC_SHA256, secretKey, bysr.AES_256_CBC);
                bytc bytc = a.f167661b;
                if (bytc == null) {
                    bytc = bytc.f167647i;
                }
                if ((bytc.f167649a & 32) != 0) {
                    bytc bytc2 = a.f167661b;
                    if (bytc2 == null) {
                        bytc2 = bytc.f167647i;
                    }
                    byrv byrv = (byrv) GeneratedMessageLite.m124007a(byrv.f167517d, bytc2.f167655g);
                    int i = 1;
                    if (byrv.f167521c <= 1) {
                        int a2 = byrx.m125235a(byrv.f167520b);
                        if (a2 != 0) {
                            i = a2;
                        }
                        return new byrz(bysa.m125238b(i), a.f167662c.getKey());
                    }
                    throw new SignatureException("Unsupported protocol version");
                }
                throw new SignatureException("missing metadata");
            } catch (bxwf e) {
                throw new SignatureException(e);
            } catch (IllegalArgumentException e2) {
                throw new SignatureException(e2);
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    static SecretKey m125175a(PrivateKey privateKey, bytb bytb) {
        try {
            return byrp.m125222a(privateKey, bysu.m125293a(bytb));
        } catch (InvalidKeySpecException e) {
            throw new SignatureException(e);
        } catch (InvalidKeyException e2) {
            throw new SignatureException(e2);
        }
    }

    /* renamed from: a */
    static SecretKey m125176a(SecretKey secretKey, String str) {
        return byrr.m125225a(byst.m125284a(secretKey, f167452a, str.getBytes()));
    }

    /* renamed from: a */
    static byte[] m125177a(byrz byrz, SecretKey secretKey) {
        return m125178a(byrz, secretKey, null);
    }

    /* renamed from: a */
    static byte[] m125178a(byrz byrz, SecretKey secretKey, byte[] bArr) {
        if (secretKey != null) {
            bysv bysv = new bysv();
            bxvd da = byrv.f167517d.mo74144da();
            int i = byrz.f167530a.f167549q;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byrv byrv = (byrv) da.f164949b;
            int i2 = i - 1;
            if (i != 0) {
                byrv.f167520b = i2;
                byrv.f167519a |= 1;
                byrv.m125232a(byrv);
                bysv.mo74501b(((byrv) da.mo74062i()).serializeToBytes());
                if (bArr != null) {
                    bysv.mo74500a(bArr);
                }
                return bysv.mo74498a(secretKey, byss.HMAC_SHA256, secretKey, bysr.AES_256_CBC, byrz.f167531b).serializeToBytes();
            }
            throw null;
        }
        throw null;
    }
}
