package p000;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: blkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blkt extends InputStream {

    /* renamed from: a */
    private final RandomAccessFile f126767a;

    /* renamed from: b */
    private long f126768b = -1;

    /* renamed from: c */
    private long f126769c;

    /* renamed from: d */
    private long f126770d;

    /* renamed from: e */
    private final long f126771e;

    /* renamed from: f */
    private long f126772f;

    public blkt(File file) {
        long length = file.length();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.f126767a = randomAccessFile;
        this.f126771e = randomAccessFile.length();
        mo66613a(0, length);
    }

    /* renamed from: a */
    public final void mo66613a(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("rangeOffset must be >= 0");
        } else if (j2 >= 0) {
            long j3 = j + j2;
            if (j3 > this.f126771e) {
                throw new IllegalArgumentException("Read range exceeds file length");
            } else if (j3 >= 0) {
                this.f126769c = j;
                this.f126770d = j2;
                if (j != this.f126772f) {
                    this.f126767a.seek(j);
                    this.f126772f = j;
                }
                this.f126768b = -1;
            } else {
                throw new IllegalArgumentException("Insane input size not supported");
            }
        } else {
            throw new IllegalArgumentException("rangeLength must be >= 0");
        }
    }

    public final int available() {
        long j = this.f126770d - (this.f126772f - this.f126769c);
        if (j <= 2147483647L) {
            return (int) j;
        }
        return Integer.MAX_VALUE;
    }

    public final void close() {
        this.f126767a.close();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
    }

    public final void mark(int i) {
        this.f126768b = this.f126772f;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        this.f126772f++;
        return this.f126767a.read();
    }

    public final void reset() {
        long j = this.f126768b;
        if (j >= 0) {
            this.f126767a.seek(j);
            this.f126772f = this.f126768b;
            return;
        }
        throw new IOException("mark not set");
    }

    public final long skip(long j) {
        int available;
        if (j <= 0 || (available = available()) <= 0) {
            return 0;
        }
        long min = (long) ((int) Math.min((long) available, j));
        long j2 = this.f126772f + min;
        this.f126772f = j2;
        this.f126767a.seek(j2);
        return min;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        int read = this.f126767a.read(bArr, i, Math.min(i2, available));
        this.f126772f += (long) read;
        return read;
    }
}
