package p000;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: byqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqx {

    /* renamed from: a */
    public byqw f167441a = byqw.NOT_STARTED;

    /* renamed from: b */
    public byqy f167442b;

    /* renamed from: c */
    public byte[] f167443c;

    /* renamed from: d */
    private byre f167444d;

    /* renamed from: e */
    private SecretKey f167445e;

    /* renamed from: a */
    static int m125139a(byti byti, List list) {
        int i = 0;
        while (i < list.size()) {
            try {
                bysw.m125313a(byti, (SecretKey) list.get(i), byss.HMAC_SHA256, null);
                return i;
            } catch (SignatureException e) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private final void m125140a(byte[] bArr, SecretKey secretKey, byte[] bArr2) {
        boolean z;
        if (this.f167441a == byqw.NOT_STARTED) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        this.f167441a = byqw.FAILED;
        try {
            this.f167445e = secretKey;
            byte[] k = bysw.m125309a((byti) GeneratedMessageLite.m124014a(byti.f167671d, bArr)).f167655g.getKey();
            bysv bysv = new bysv();
            bysv.f167622a = bArr;
            byte[] k2 = bysv.mo74498a(this.f167445e, byss.HMAC_SHA256, this.f167445e, bysr.AES_256_CBC, bArr2).serializeToBytes();
            byrd b = byrd.m125181b();
            this.f167444d = b;
            b.mo74486b(k);
            this.f167443c = this.f167444d.mo74485a(k2);
            this.f167441a = byqw.HANDSHAKE_INITIATED;
        } catch (bxwf e) {
            throw new SignatureException(e);
        } catch (InvalidKeyException e2) {
            throw new SignatureException(e2);
        }
    }

    /* renamed from: a */
    public final int mo74473a(byte[] bArr, List list, byte[] bArr2) {
        SecretKey secretKey;
        bmxy.m108581a(bArr);
        bmxy.m108581a(bArr2);
        bmxy.m108588a(!list.isEmpty());
        try {
            int a = m125139a((byti) GeneratedMessageLite.m124014a(byti.f167671d, bArr), list);
            if (a < 0) {
                byte[] bArr3 = new byte[32];
                new SecureRandom().nextBytes(bArr3);
                secretKey = new SecretKeySpec(bArr3, "AES");
            } else {
                secretKey = (SecretKey) list.get(a);
            }
            m125140a(bArr, secretKey, bArr2);
            return a;
        } catch (bxwf e) {
            throw new SignatureException(e);
        } catch (InvalidKeyException e2) {
            throw new SignatureException(e2);
        }
    }

    /* renamed from: a */
    public final void mo74474a(byte[] bArr) {
        boolean z;
        bmxy.m108581a(bArr);
        if (this.f167441a == byqw.HANDSHAKE_INITIATED) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108605b(z, "wrong state: %s", this.f167441a);
        this.f167441a = byqw.FAILED;
        byqy e = this.f167444d.mo74489e();
        this.f167442b = e;
        try {
            bytd a = bysw.m125312a((byti) GeneratedMessageLite.m124014a(byti.f167671d, e.mo74478b(bArr)), this.f167445e, byss.HMAC_SHA256, this.f167445e, bysr.AES_256_CBC, this.f167443c);
            this.f167444d = null;
            this.f167443c = null;
            this.f167445e = null;
            this.f167441a = byqw.COMPLETE;
            a.f167662c.getKey();
        } catch (InvalidKeyException e2) {
            throw new SignatureException(e2);
        } catch (bxwf e3) {
            throw new SignatureException(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }
}
