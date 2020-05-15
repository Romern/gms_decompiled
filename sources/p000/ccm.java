package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: ccm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ccm implements Closeable {

    /* renamed from: a */
    public final Charset f6502a;

    /* renamed from: b */
    public int f6503b;

    /* renamed from: c */
    private final InputStream f6504c;

    /* renamed from: d */
    private byte[] f6505d;

    /* renamed from: e */
    private int f6506e;

    public ccm(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(ccn.f6507a)) {
            this.f6504c = inputStream;
            this.f6502a = charset;
            this.f6505d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: b */
    private final void m3958b() {
        InputStream inputStream = this.f6504c;
        byte[] bArr = this.f6505d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f6506e = 0;
            this.f6503b = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public final String mo3714a() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f6504c) {
            if (this.f6505d != null) {
                if (this.f6506e >= this.f6503b) {
                    m3958b();
                }
                int i3 = this.f6506e;
                while (true) {
                    int i4 = this.f6503b;
                    if (i3 != i4) {
                        byte[] bArr2 = this.f6505d;
                        if (bArr2[i3] != 10) {
                            i3++;
                        } else {
                            int i5 = this.f6506e;
                            if (i3 != i5) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i5, i2 - i5, this.f6502a.name());
                                    this.f6506e = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            String str2 = new String(bArr2, i5, i2 - i5, this.f6502a.name());
                            this.f6506e = i3 + 1;
                            return str2;
                        }
                    } else {
                        ccl ccl = new ccl(this, (i4 - this.f6506e) + 80);
                        loop1:
                        while (true) {
                            byte[] bArr3 = this.f6505d;
                            int i6 = this.f6506e;
                            ccl.write(bArr3, i6, this.f6503b - i6);
                            this.f6503b = -1;
                            m3958b();
                            i = this.f6506e;
                            while (true) {
                                if (i != this.f6503b) {
                                    bArr = this.f6505d;
                                    if (bArr[i] == 10) {
                                        break loop1;
                                    }
                                    i++;
                                }
                            }
                        }
                        int i7 = this.f6506e;
                        if (i != i7) {
                            ccl.write(bArr, i7, i - i7);
                        }
                        this.f6506e = i + 1;
                        String byteArrayOutputStream = ccl.toString();
                        return byteArrayOutputStream;
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    public final void close() {
        synchronized (this.f6504c) {
            if (this.f6505d != null) {
                this.f6505d = null;
                this.f6504c.close();
            }
        }
    }
}
