package p000;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import javax.crypto.SecretKey;

/* renamed from: byqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqv {

    /* renamed from: a */
    public byqu f167430a = byqu.NOT_STARTED;

    /* renamed from: b */
    public byre f167431b;

    /* renamed from: c */
    public SecretKey f167432c;

    /* renamed from: d */
    public byte[] f167433d;

    /* renamed from: e */
    public byqy f167434e;

    /* renamed from: f */
    private byte[] f167435f;

    /* renamed from: a */
    public final byte[] mo74471a(byte[] bArr) {
        boolean z;
        bmxy.m108581a(bArr);
        if (this.f167430a == byqu.HANDSHAKE_INITIATED) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108605b(z, "wrong state: %s", this.f167430a);
        this.f167430a = byqu.FAILED;
        this.f167435f = bArr;
        try {
            bytd a = bysw.m125312a((byti) GeneratedMessageLite.m124014a(byti.f167671d, this.f167431b.mo74486b(bArr)), this.f167432c, byss.HMAC_SHA256, this.f167432c, bysr.AES_256_CBC, this.f167433d);
            this.f167434e = this.f167431b.mo74489e();
            this.f167431b = null;
            this.f167433d = null;
            this.f167430a = byqu.HANDSHAKE_RESPONDED;
            return a.f167662c.getKey();
        } catch (InvalidKeyException e) {
            throw new SignatureException(e);
        } catch (bxwf e2) {
            throw new SignatureException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public final byte[] mo74472b(byte[] bArr) {
        boolean z;
        bmxy.m108581a(bArr);
        if (this.f167430a == byqu.HANDSHAKE_RESPONDED) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        this.f167430a = byqu.FAILED;
        try {
            bysv bysv = new bysv();
            bysv.f167622a = this.f167435f;
            byte[] k = bysv.mo74498a(this.f167432c, byss.HMAC_SHA256, this.f167432c, bysr.AES_256_CBC, bArr).serializeToBytes();
            this.f167432c = null;
            this.f167435f = null;
            this.f167430a = byqu.COMPLETE;
            return this.f167434e.mo74476a(k);
        } catch (InvalidKeyException e) {
            throw new SignatureException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
