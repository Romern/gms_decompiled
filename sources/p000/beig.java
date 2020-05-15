package p000;

import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.util.Arrays;

/* renamed from: beig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beig extends DigestInputStream implements begu {

    /* renamed from: a */
    final byte[] f111577a = new byte[4096];

    /* renamed from: b */
    byte[] f111578b;

    /* renamed from: c */
    byte[] f111579c;

    /* renamed from: d */
    final begk f111580d;

    /* renamed from: e */
    befw f111581e;

    /* renamed from: a */
    private final void m95126a() {
        if (this.f111579c == null) {
            this.f111579c = this.digest.digest();
            befw befw = this.f111581e;
            if (befw != null) {
                begj a = this.f111580d.mo60691a();
                a.mo60690a("sha256", Base64.encodeToString(this.f111579c, 2));
                befw.mo60675a(a.mo60688a());
            }
            byte[] bArr = this.f111578b;
            if (bArr != null && !Arrays.equals(this.f111579c, bArr)) {
                String encodeToString = Base64.encodeToString(this.f111579c, 2);
                String encodeToString2 = Base64.encodeToString(this.f111578b, 2);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 30 + String.valueOf(encodeToString2).length());
                sb.append("Mismatched digest: ");
                sb.append(encodeToString);
                sb.append(" expected: ");
                sb.append(encodeToString2);
                throw new IOException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo60706a(befw befw) {
        this.f111581e = befw;
    }

    public final void close() {
        super.close();
        m95126a();
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            return read;
        }
        m95126a();
        return -1;
    }

    public final long skip(long j) {
        return (long) read(this.f111577a, 0, Math.min(this.f111577a.length, bqcn.m112578a(j)));
    }

    public beig(InputStream inputStream, begk begk) {
        super(inputStream, beih.m95129d());
        this.f111580d = begk;
        String a = begk.mo60692a("sha256");
        if (!TextUtils.isEmpty(a)) {
            this.f111578b = Base64.decode(a, 2);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        m95126a();
        return -1;
    }
}
