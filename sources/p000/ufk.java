package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: ufk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufk extends FilterOutputStream {

    /* renamed from: a */
    public final MessageDigest f47439a = spn.m35868b("SHA-256");

    /* renamed from: b */
    public long f47440b;

    public ufk(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(int i) {
        this.out.write(i);
        this.f47440b++;
        this.f47439a.update((byte) i);
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        this.f47440b += (long) bArr.length;
        this.f47439a.update(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f47440b += (long) i2;
        this.f47439a.update(bArr, i, i2);
    }
}
