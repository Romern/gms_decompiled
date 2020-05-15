package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: bny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bny extends FilterInputStream {

    /* renamed from: a */
    private final long f5220a;

    /* renamed from: b */
    private long f5221b;

    public bny(InputStream inputStream, long j) {
        super(inputStream);
        this.f5220a = j;
    }

    /* renamed from: a */
    public final long mo3313a() {
        return this.f5220a - this.f5221b;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f5221b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f5221b += (long) read;
        }
        return read;
    }
}
