package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.SecretKey;

/* renamed from: byqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqz extends byqy {

    /* renamed from: a */
    private final SecretKey f167446a;

    /* renamed from: b */
    private int f167447b;

    public byqz(SecretKey secretKey, int i) {
        this.f167446a = secretKey;
        this.f167447b = i;
    }

    /* renamed from: a */
    public final byte[] mo74475a() {
        if (this.f167446a != null) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(byrb.f167452a);
            return instance.digest(this.f167446a.getEncoded());
        }
        throw new IllegalStateException("Connection has not been correctly initialized; shared key is null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo74477b() {
        this.f167447b++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo74479c() {
        this.f167447b++;
    }

    /* renamed from: d */
    public final int mo74480d() {
        return this.f167447b;
    }

    /* renamed from: e */
    public final int mo74481e() {
        return this.f167447b;
    }

    /* renamed from: f */
    public final SecretKey mo74482f() {
        return this.f167446a;
    }

    /* renamed from: g */
    public final SecretKey mo74483g() {
        return this.f167446a;
    }

    /* renamed from: h */
    public final byte[] mo74484h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(m125144a(this.f167447b));
            byteArrayOutputStream.write(this.f167446a.getEncoded());
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            bqye.m113758a(e);
            return null;
        }
    }
}
