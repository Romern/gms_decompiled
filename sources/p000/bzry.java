package p000;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: bzry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzry implements bzrx {

    /* renamed from: a */
    private final RandomAccessFile f171215a;

    /* renamed from: b */
    private long f171216b = 0;

    /* renamed from: c */
    private long f171217c = 0;

    public bzry(File file) {
        this.f171215a = new RandomAccessFile(file, "r");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
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
        bmxy.m108589a(z, "Buffer length must be greater than desired number of bytes.");
        if (i2 != 0) {
            if (this.f171217c != this.f171215a.getFilePointer()) {
                this.f171215a.seek(this.f171217c);
            }
            int read = this.f171215a.read(bArr, i, i2);
            if (read != -1) {
                this.f171217c += (long) read;
                return read;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo20320b() {
        this.f171216b = this.f171217c;
    }

    /* renamed from: c */
    public final synchronized long mo20321c() {
        return this.f171216b;
    }

    public final synchronized void close() {
        this.f171215a.close();
    }

    /* renamed from: d */
    public final synchronized long mo20323d() {
        return this.f171217c;
    }

    /* renamed from: e */
    public final synchronized long mo20324e() {
        return Long.MAX_VALUE;
    }

    /* renamed from: f */
    public final synchronized void mo20325f() {
        this.f171217c = this.f171216b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: g */
    public final synchronized long mo20326g() {
        long j;
        j = this.f171215a.length();
        return j;
    }

    /* renamed from: h */
    public final synchronized boolean mo20327h() {
        return this.f171217c < this.f171215a.length();
    }

    /* renamed from: a */
    public final synchronized long mo20317a(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Can't skip negative bytes.");
        if (j != 0) {
            long min = Math.min(this.f171217c + j, this.f171215a.length());
            this.f171215a.seek(min);
            long j2 = this.f171217c;
            this.f171217c = min;
            j = min - j2;
        }
        return j;
    }
}
