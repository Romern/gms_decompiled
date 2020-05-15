package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.IOException;
import java.security.MessageDigest;

/* renamed from: bzsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzsg implements bzrx {

    /* renamed from: a */
    private final String f171237a;

    /* renamed from: b */
    private final bzrx f171238b;

    /* renamed from: c */
    private bzsp f171239c;

    /* renamed from: d */
    private bzsp f171240d;

    /* renamed from: e */
    private bzsp f171241e;

    /* renamed from: f */
    private long f171242f = 0;

    /* renamed from: g */
    private long f171243g = 0;

    /* renamed from: h */
    private final long f171244h;

    /* renamed from: i */
    private final MessageDigest f171245i;

    /* renamed from: j */
    private boolean f171246j;

    /* renamed from: k */
    private int f171247k = 1;

    public bzsg(String str, String str2, bzsa bzsa, bzrx bzrx, MessageDigest messageDigest) {
        this.f171237a = str;
        this.f171238b = bzrx;
        this.f171245i = messageDigest;
        this.f171239c = new bzsp("--" + this.f171237a + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + "\r\n");
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f171237a);
        sb.append("\r\n");
        for (String str3 : bzsa.mo74558a()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(bzsa.mo74563c(str3));
            sb.append("\r\n");
        }
        if (this.f171238b.mo20326g() >= 0 && bzsa.mo74561b(DataParser.CONTENT_LENGTH_KEY).isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.f171238b.mo20326g());
            sb.append("\r\n");
        }
        sb.append("\r\n");
        this.f171240d = new bzsp(sb.toString());
        if (bzrx.mo20326g() != -1 && messageDigest == null) {
            this.f171241e = m126122a();
            this.f171244h = this.f171239c.mo20326g() + this.f171240d.mo20326g() + bzrx.mo20326g() + this.f171241e.mo20326g();
            return;
        }
        this.f171244h = -1;
    }

    /* renamed from: a */
    private final bzsp m126122a() {
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n--");
        sb.append(this.f171237a);
        MessageDigest messageDigest = this.f171245i;
        if (messageDigest == null || (!messageDigest.getAlgorithm().equalsIgnoreCase("md5") && !this.f171245i.getAlgorithm().equalsIgnoreCase("sha-1"))) {
            sb.append("--");
            return new bzsp(sb.toString());
        }
        sb.append("\r\n\r\nX-Goog-Hash:");
        if (this.f171245i.getAlgorithm().equalsIgnoreCase("md5")) {
            sb.append(" md5=");
        } else {
            sb.append(" sha1=");
        }
        sb.append(boan.f132470d.mo68794a(this.f171245i.digest()));
        sb.append("\r\n--");
        sb.append(this.f171237a);
        sb.append("--");
        return new bzsp(sb.toString());
    }

    /* renamed from: b */
    public final void mo20320b() {
        this.f171243g = this.f171242f;
    }

    /* renamed from: c */
    public final long mo20321c() {
        return this.f171243g;
    }

    public final void close() {
        this.f171246j = true;
        this.f171238b.close();
    }

    /* renamed from: d */
    public final long mo20323d() {
        return this.f171242f;
    }

    /* renamed from: e */
    public final long mo20324e() {
        return Long.MAX_VALUE;
    }

    /* renamed from: f */
    public final void mo20325f() {
        throw new UnsupportedOperationException("Cannot call rewind.");
    }

    /* renamed from: g */
    public final long mo20326g() {
        return this.f171244h;
    }

    /* renamed from: h */
    public final boolean mo20327h() {
        return this.f171247k != 5;
    }

    /* renamed from: a */
    public final int mo20316a(byte[] bArr, int i, int i2) {
        boolean z;
        if (!this.f171246j) {
            if (bArr.length - i >= i2) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "Buffer length must be greater than or equal to desired number of bytes.");
            if (i2 == 0) {
                return 0;
            }
            long j = this.f171242f;
            while (true) {
                long j2 = this.f171242f;
                if (j2 != j) {
                    return (int) (j2 - j);
                }
                int i3 = this.f171247k;
                int i4 = i3 - 1;
                bzrx bzrx = null;
                if (i3 != 0) {
                    if (i4 == 0) {
                        bzrx = this.f171239c;
                        i3 = 2;
                    } else if (i4 == 1) {
                        bzrx = this.f171240d;
                        i3 = 3;
                    } else if (i4 == 2) {
                        bzrx = this.f171238b;
                        i3 = 4;
                    } else if (i4 == 3) {
                        if (this.f171241e == null) {
                            this.f171241e = m126122a();
                        }
                        bzrx = this.f171241e;
                        i3 = 5;
                    } else if (i4 == 4) {
                        return 0;
                    }
                    this.f171242f += (long) bzrx.mo20316a(bArr, i, i2);
                    if (bzrx.mo20324e() < Long.MAX_VALUE) {
                        bzrx.mo20320b();
                    }
                    if (!bzrx.mo20327h()) {
                        this.f171247k = i3;
                    }
                } else {
                    throw null;
                }
            }
        } else {
            throw new IOException("Trying to read from an already-closed stream.");
        }
    }

    /* renamed from: a */
    public final long mo20317a(long j) {
        throw new UnsupportedOperationException("Cannot call skip.");
    }
}
