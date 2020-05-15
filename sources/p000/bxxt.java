package p000;

import java.io.InputStream;

/* renamed from: bxxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxt extends InputStream {

    /* renamed from: a */
    final /* synthetic */ bxxu f165053a;

    /* renamed from: b */
    private bxxs f165054b;

    /* renamed from: c */
    private bxtt f165055c;

    /* renamed from: d */
    private int f165056d;

    /* renamed from: e */
    private int f165057e;

    /* renamed from: f */
    private int f165058f;

    /* renamed from: g */
    private int f165059g;

    public bxxt(bxxu bxxu) {
        this.f165053a = bxxu;
        m124310a();
    }

    /* renamed from: a */
    private final int m124309a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            m124311b();
            if (this.f165055c == null) {
                break;
            }
            int min = Math.min(this.f165056d - this.f165057e, i3);
            if (bArr != null) {
                this.f165055c.mo73774b(bArr, this.f165057e, i, min);
                i += min;
            }
            this.f165057e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    /* renamed from: b */
    private final void m124311b() {
        int i;
        if (this.f165055c != null && this.f165057e == (i = this.f165056d)) {
            this.f165058f += i;
            int i2 = 0;
            this.f165057e = 0;
            if (this.f165054b.hasNext()) {
                bxtt a = this.f165054b.next();
                this.f165055c = a;
                i2 = a.mo73744a();
            } else {
                this.f165055c = null;
            }
            this.f165056d = i2;
        }
    }

    public final int available() {
        return this.f165053a.f165062d - (this.f165058f + this.f165057e);
    }

    public final void mark(int i) {
        this.f165059g = this.f165058f + this.f165057e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        m124311b();
        bxtt bxtt = this.f165055c;
        if (bxtt == null) {
            return -1;
        }
        int i = this.f165057e;
        this.f165057e = i + 1;
        return bxtt.mo73743a(i) & 255;
    }

    public final synchronized void reset() {
        m124310a();
        m124309a(null, 0, this.f165059g);
    }

    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) m124309a(null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw null;
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            int a = m124309a(bArr, i, i2);
            if (a == 0) {
                return -1;
            }
            return a;
        }
    }

    /* renamed from: a */
    private final void m124310a() {
        bxxs bxxs = new bxxs(this.f165053a);
        this.f165054b = bxxs;
        bxtt a = bxxs.next();
        this.f165055c = a;
        this.f165056d = a.mo73744a();
        this.f165057e = 0;
        this.f165058f = 0;
    }
}
