package p000;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: ndb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndb extends FilterInputStream {

    /* renamed from: a */
    private final blbl f35305a;

    /* renamed from: b */
    private boolean f35306b = false;

    /* renamed from: c */
    private final MessageDigest f35307c;

    public ndb(InputStream inputStream, blbl blbl, MessageDigest messageDigest) {
        super(inputStream);
        this.f35305a = blbl;
        sdo.m34959a(messageDigest);
        this.f35307c = messageDigest;
        messageDigest.reset();
    }

    /* renamed from: a */
    public final blbn mo20473a() {
        if (!this.f35306b && !ccmn.m130690b()) {
            return null;
        }
        return this.f35305a.mo66452a();
    }

    public final void close() {
        super.close();
        this.f35306b = true;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int read = super.read();
        if (read >= 0) {
            byte b = (byte) read;
            this.f35305a.mo66453a(b);
            this.f35307c.update(b);
        } else {
            this.f35306b = true;
        }
        return read;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final long skip(long j) {
        int read;
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (j > j2 && (read = read(bArr, 0, (int) Math.min(1024L, j - j2))) > 0) {
            j2 += (long) read;
        }
        return j2;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f35305a.mo66454a(bArr, i, read);
            this.f35307c.update(bArr, i, read);
        } else {
            this.f35306b = true;
        }
        return read;
    }
}
