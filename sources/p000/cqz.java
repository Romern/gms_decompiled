package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: cqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cqz extends FilterInputStream {

    /* renamed from: a */
    private int f11872a = Integer.MIN_VALUE;

    public cqz(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private final long m7379a(long j) {
        int i = this.f11872a;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE) {
            long j2 = (long) i;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    /* renamed from: b */
    private final void m7380b(long j) {
        int i = this.f11872a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f11872a = (int) (((long) i) - j);
        }
    }

    public final int available() {
        int i = this.f11872a;
        if (i != Integer.MIN_VALUE) {
            return Math.min(i, super.available());
        }
        return super.available();
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.f11872a = i;
    }

    public final int read() {
        if (m7379a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m7380b(1);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f11872a = Integer.MIN_VALUE;
    }

    public final long skip(long j) {
        long a = m7379a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m7380b(skip);
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int a = (int) m7379a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m7380b((long) read);
        return read;
    }
}
