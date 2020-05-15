package p000;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: ufj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufj extends FilterInputStream {

    /* renamed from: a */
    public MessageDigest f47436a;

    /* renamed from: b */
    private boolean f47437b;

    /* renamed from: c */
    private MessageDigest f47438c;

    public ufj(InputStream inputStream, String str) {
        super(inputStream);
        MessageDigest b = spn.m35868b(str);
        this.f47436a = b;
        sdo.m34966a(b, str.length() == 0 ? new String("Unable to create message digest for ") : "Unable to create message digest for ".concat(str));
        if (inputStream.markSupported()) {
            this.f47437b = true;
            m38278a();
        }
    }

    /* renamed from: a */
    private final void m38278a() {
        try {
            this.f47438c = (MessageDigest) this.f47436a.clone();
        } catch (CloneNotSupportedException e) {
            this.f47437b = false;
            this.f47438c = null;
        }
    }

    public final synchronized void mark(int i) {
        sdo.m34970a(this.f47437b);
        m38278a();
        super.mark(i);
    }

    public final boolean markSupported() {
        return this.f47437b;
    }

    public final int read() {
        int read = super.read();
        if (read >= 0) {
            this.f47436a.update((byte) (read & 255));
        }
        return read;
    }

    public final synchronized void reset() {
        sdo.m34970a(this.f47437b);
        this.f47436a = this.f47438c;
        m38278a();
        super.reset();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final long skip(long j) {
        int read;
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (j > 0 && (read = super.read(bArr, 0, (int) Math.min(j, 1024L))) >= 0) {
            this.f47436a.update(bArr, 0, read);
            long j3 = (long) read;
            j -= j3;
            j2 += j3;
        }
        return j2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f47436a.update(bArr, i, read);
        }
        return read;
    }
}
