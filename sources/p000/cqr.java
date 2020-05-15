package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cqr extends FilterInputStream {

    /* renamed from: a */
    private final long f11858a;

    /* renamed from: b */
    private int f11859b;

    public cqr(InputStream inputStream, long j) {
        super(inputStream);
        this.f11858a = j;
    }

    /* renamed from: a */
    private final void m7368a(int i) {
        if (i < 0) {
            long j = this.f11858a;
            int i2 = this.f11859b;
            if (j - ((long) i2) > 0) {
                StringBuilder sb = new StringBuilder(87);
                sb.append("Failed to read all expected data, expected: ");
                sb.append(j);
                sb.append(", but read: ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
            return;
        }
        this.f11859b += i;
    }

    public final synchronized int available() {
        return (int) Math.max(this.f11858a - ((long) this.f11859b), (long) this.in.available());
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        m7368a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        m7368a(read);
        return read;
    }
}
