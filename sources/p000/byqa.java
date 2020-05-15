package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: byqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqa implements Closeable {

    /* renamed from: a */
    public bypz f167369a;

    /* renamed from: b */
    public final byqb f167370b = new byqb(false);

    /* renamed from: c */
    private final InputStream f167371c;

    /* renamed from: d */
    private final byte[] f167372d = new byte[8];

    public byqa(InputStream inputStream) {
        this.f167371c = inputStream;
    }

    /* renamed from: a */
    private final void m125100a(int i) {
        m125101a(this.f167372d, i);
    }

    /* renamed from: e */
    private final void m125102e() {
        this.f167369a = null;
    }

    /* renamed from: b */
    public final byte[] mo74453b() {
        mo74456d();
        long c = mo74454c();
        if (c < 0 || c > 2147483647L) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
        } else if (((long) this.f167371c.available()) >= c) {
            int i = (int) c;
            byte[] bArr = new byte[i];
            m125101a(bArr, i);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public final long mo74454c() {
        byte b = this.f167369a.f167368b;
        if (b < 24) {
            m125102e();
            return (long) b;
        } else if (b == 24) {
            int read = this.f167371c.read();
            if (read != -1) {
                m125102e();
                return ((long) read) & 255;
            }
            throw new EOFException();
        } else if (b == 25) {
            m125100a(2);
            byte[] bArr = this.f167372d;
            return (((long) bArr[1]) & 255) | ((((long) bArr[0]) & 255) << 8);
        } else if (b == 26) {
            m125100a(4);
            byte[] bArr2 = this.f167372d;
            long j = (((long) bArr2[1]) & 255) << 16;
            return (((long) bArr2[3]) & 255) | j | ((((long) bArr2[0]) & 255) << 24) | ((((long) bArr2[2]) & 255) << 8);
        } else if (b == 27) {
            m125100a(8);
            byte[] bArr3 = this.f167372d;
            long j2 = (((long) bArr3[1]) & 255) << 48;
            return (((long) bArr3[7]) & 255) | j2 | ((((long) bArr3[0]) & 255) << 56) | ((((long) bArr3[2]) & 255) << 40) | ((((long) bArr3[3]) & 255) << 32) | ((((long) bArr3[4]) & 255) << 24) | ((((long) bArr3[5]) & 255) << 16) | ((((long) bArr3[6]) & 255) << 8);
        } else {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(b), Integer.valueOf(this.f167369a.mo74450a())));
        }
    }

    public final void close() {
        this.f167371c.close();
        this.f167370b.mo74457a();
    }

    /* renamed from: d */
    public final void mo74456d() {
        mo74451a();
        if (this.f167369a.f167368b == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", (byte) 31));
        }
    }

    /* renamed from: a */
    private final void m125101a(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.f167371c.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        m125102e();
    }

    /* renamed from: a */
    public final bypz mo74451a() {
        if (this.f167369a == null) {
            int read = this.f167371c.read();
            if (read == -1) {
                this.f167370b.mo74457a();
                return null;
            }
            bypz bypz = new bypz(read);
            this.f167369a = bypz;
            byte b = bypz.f167367a;
            if (!(b == Byte.MIN_VALUE || b == -96 || b == -64)) {
                if (b != -32) {
                    if (!(b == 0 || b == 32)) {
                        if (b == 64) {
                            this.f167370b.mo74458a(-1);
                        } else if (b == 96) {
                            this.f167370b.mo74458a(-2);
                        } else {
                            throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(bypz.mo74450a())));
                        }
                        this.f167370b.mo74463c();
                    }
                } else if (bypz.f167368b == 31) {
                    byqb byqb = this.f167370b;
                    long d = byqb.mo74464d();
                    if (d >= 0) {
                        byqb.mo74460a("expected indefinite length scope but found %s", Long.valueOf(d));
                    } else if (d == -5) {
                        byqb.mo74459a("expected a value for dangling key in indefinite-length map");
                    }
                    byqb.f167373a.pop();
                }
            }
            this.f167370b.mo74461b();
            this.f167370b.mo74463c();
        }
        return this.f167369a;
    }

    /* renamed from: a */
    public final void mo74452a(byte b) {
        mo74451a();
        if (this.f167369a.f167367a != b) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b >> 5) & 7), Integer.valueOf(this.f167369a.mo74450a())));
        }
    }
}
