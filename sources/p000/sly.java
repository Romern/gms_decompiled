package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.nio.charset.Charset;

/* renamed from: sly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sly implements Closeable {

    /* renamed from: a */
    private final InputStream f44712a;

    /* renamed from: b */
    private final byte[] f44713b = new byte[4096];

    /* renamed from: c */
    private int f44714c;

    /* renamed from: d */
    private boolean f44715d;

    public sly(InputStream inputStream) {
        this.f44712a = inputStream;
    }

    /* renamed from: a */
    private final void m35620a(int i) {
        byte[] bArr = this.f44713b;
        System.arraycopy(bArr, i, bArr, 0, this.f44714c - i);
        int i2 = this.f44714c - i;
        this.f44714c = i2;
        if (i2 == 0) {
            mo25726a();
        }
    }

    /* renamed from: b */
    private final NumberFormatException m35621b(int i) {
        String str = new String(this.f44713b, 0, i, Charset.forName("US-ASCII"));
        return new NumberFormatException(str.length() == 0 ? new String("invalid long: ") : "invalid long: ".concat(str));
    }

    /* renamed from: g */
    private final int m35622g() {
        if (this.f44715d) {
            return -1;
        }
        int i = 0;
        while (true) {
            if (i < this.f44714c) {
                byte b = this.f44713b[i];
                if (b == 10) {
                    this.f44715d = true;
                    return i;
                } else if (b == 32) {
                    return i;
                } else {
                    i++;
                }
            } else if (mo25726a() <= 0) {
                throw new ProtocolException("End of stream while looking for token boundary");
            }
        }
    }

    /* renamed from: b */
    public final boolean mo25727b() {
        return this.f44714c > 0;
    }

    /* renamed from: c */
    public final void mo25728c() {
        int i = 0;
        if (!this.f44715d) {
            while (true) {
                if (i < this.f44714c) {
                    byte b = this.f44713b[i];
                    i++;
                    if (b == 10) {
                        m35620a(i);
                        return;
                    }
                } else if (mo25726a() <= 0) {
                    throw new ProtocolException("End of stream while looking for line boundary");
                }
            }
        } else {
            this.f44715d = false;
        }
    }

    public final void close() {
        this.f44712a.close();
    }

    /* renamed from: d */
    public final String mo25730d() {
        int g = m35622g();
        if (g != -1) {
            String str = new String(this.f44713b, 0, g, Charset.forName("US-ASCII"));
            m35620a(g + 1);
            return str;
        }
        throw new ProtocolException("Missing required string");
    }

    /* renamed from: e */
    public final long mo25731e() {
        int g = m35622g();
        if (g != -1) {
            int i = 0;
            byte b = this.f44713b[0];
            if (b == 45) {
                i = 1;
            }
            long j = 0;
            while (i < g) {
                int i2 = this.f44713b[i] - 48;
                if (i2 < 0 || i2 > 9) {
                    throw m35621b(g);
                }
                long j2 = (10 * j) - ((long) i2);
                if (j2 <= j) {
                    i++;
                    j = j2;
                } else {
                    throw m35621b(g);
                }
            }
            m35620a(g + 1);
            return b != 45 ? -j : j;
        }
        throw new ProtocolException("Missing required long");
    }

    /* renamed from: f */
    public final int mo25732f() {
        long e = mo25731e();
        if (e <= 2147483647L && e >= -2147483648L) {
            return (int) e;
        }
        throw new NumberFormatException("parsed value larger than integer");
    }

    /* renamed from: a */
    public final int mo25726a() {
        byte[] bArr = this.f44713b;
        int i = this.f44714c;
        int length = bArr.length - i;
        if (length != 0) {
            int read = this.f44712a.read(bArr, i, length);
            if (read != -1) {
                this.f44714c += read;
            }
            return read;
        }
        throw new IOException("attempting to fill already-full buffer");
    }
}
