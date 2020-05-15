package p000;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bzsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzsf implements bzrx {

    /* renamed from: a */
    private final int f171230a;

    /* renamed from: b */
    private final int f171231b;

    /* renamed from: c */
    private final InputStream f171232c;

    /* renamed from: d */
    private long f171233d;

    /* renamed from: e */
    private long f171234e;

    /* renamed from: f */
    private boolean f171235f;

    /* renamed from: g */
    private long f171236g;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        return 0;
     */
    /* renamed from: a */
    public final synchronized int mo20316a(byte[] bArr, int i, int i2) {
        boolean z;
        if (bArr.length - i >= i2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Cannot read into a buffer smaller than given length");
        if (i2 == 0) {
            return 0;
        }
        if (this.f171235f) {
            this.f171232c.reset();
            this.f171235f = false;
        }
        int read = this.f171232c.read(bArr, i, (int) Math.min((long) i2, ((long) this.f171230a) - (this.f171234e - this.f171233d)));
        if (read != -1) {
            long j = this.f171234e + ((long) read);
            this.f171234e = j;
            long j2 = this.f171236g;
            if (j2 != -1) {
                if (j > j2) {
                    throw new IOException("The stream continues beyond expected size");
                }
            }
        } else {
            long j3 = this.f171236g;
            if (j3 == -1) {
                this.f171236g = this.f171234e;
            } else if (this.f171234e < j3) {
                throw new IOException("The stream ended before all expected bytes were read");
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo20320b() {
        if (this.f171233d != this.f171234e) {
            this.f171232c.mark(this.f171231b);
        }
        this.f171233d = this.f171234e;
    }

    /* renamed from: c */
    public final synchronized long mo20321c() {
        return this.f171233d;
    }

    public final synchronized void close() {
        this.f171232c.close();
    }

    /* renamed from: d */
    public final synchronized long mo20323d() {
        return this.f171234e;
    }

    /* renamed from: e */
    public final synchronized long mo20324e() {
        return (long) this.f171230a;
    }

    /* renamed from: f */
    public final synchronized void mo20325f() {
        this.f171234e = this.f171233d;
        this.f171235f = true;
    }

    /* renamed from: g */
    public final synchronized long mo20326g() {
        return this.f171236g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return true;
     */
    /* renamed from: h */
    public final synchronized boolean mo20327h() {
        if (this.f171235f) {
            this.f171232c.reset();
            this.f171235f = false;
        }
        if (this.f171232c.available() <= 0) {
            if (this.f171232c.read() != -1) {
                this.f171232c.reset();
                long j = this.f171234e;
                long j2 = this.f171233d;
                while (true) {
                    j -= j2;
                    if (j <= 0) {
                        break;
                    }
                    j2 = this.f171232c.skip(j);
                }
            } else {
                this.f171236g = this.f171234e;
                return false;
            }
        }
    }

    public bzsf(InputStream inputStream, int i) {
        if (!inputStream.markSupported()) {
            this.f171232c = new BufferedInputStream(inputStream);
        } else {
            this.f171232c = inputStream;
        }
        this.f171236g = -1;
        this.f171230a = i;
        int i2 = i + 1;
        this.f171231b = i2;
        this.f171232c.mark(i2);
    }

    /* renamed from: a */
    public final synchronized long mo20317a(long j) {
        long min = Math.min(j, ((long) this.f171230a) - (this.f171234e - this.f171233d));
        if (min == 0) {
            return 0;
        }
        if (this.f171235f) {
            this.f171232c.reset();
            this.f171235f = false;
        }
        long skip = this.f171232c.skip(min);
        if (skip != 0 || !mo20327h()) {
            this.f171234e += skip;
            return skip;
        }
        do {
            skip = this.f171232c.skip(min);
        } while (skip == 0);
        this.f171234e += skip;
        return skip;
    }
}
