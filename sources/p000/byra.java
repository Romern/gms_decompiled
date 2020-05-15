package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.SecretKey;

/* renamed from: byra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byra extends byqy {

    /* renamed from: a */
    private final SecretKey f167448a;

    /* renamed from: b */
    private final SecretKey f167449b;

    /* renamed from: c */
    private int f167450c;

    /* renamed from: d */
    private int f167451d;

    public byra(SecretKey secretKey, SecretKey secretKey2, int i, int i2) {
        this.f167448a = secretKey;
        this.f167449b = secretKey2;
        this.f167450c = i;
        this.f167451d = i2;
    }

    /* renamed from: a */
    public final byte[] mo74475a() {
        byte[] bArr;
        SecretKey secretKey = this.f167448a;
        if (secretKey == null || this.f167449b == null) {
            throw new IllegalStateException("Connection has not been correctly initialized; encode key or decode key is null");
        }
        byte[] encoded = secretKey.getEncoded();
        byte[] encoded2 = this.f167449b.getEncoded();
        if (Arrays.hashCode(encoded) < Arrays.hashCode(encoded2)) {
            bArr = encoded;
        } else {
            bArr = encoded2;
        }
        if (bArr == encoded) {
            encoded = encoded2;
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(byrb.f167452a);
        instance.update(bArr);
        instance.update(encoded);
        return instance.digest();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo74477b() {
        this.f167450c++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo74479c() {
        this.f167451d++;
    }

    /* renamed from: d */
    public final int mo74480d() {
        return this.f167450c;
    }

    /* renamed from: e */
    public final int mo74481e() {
        return this.f167451d;
    }

    /* renamed from: f */
    public final SecretKey mo74482f() {
        return this.f167448a;
    }

    /* renamed from: g */
    public final SecretKey mo74483g() {
        return this.f167449b;
    }

    /* renamed from: h */
    public final byte[] mo74484h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(m125144a(this.f167450c));
            byteArrayOutputStream.write(m125144a(this.f167451d));
            byteArrayOutputStream.write(this.f167448a.getEncoded());
            byteArrayOutputStream.write(this.f167449b.getEncoded());
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            bqye.m113758a(e);
            return null;
        }
    }
}
