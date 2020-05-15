package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: ciqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqc implements ciqr {

    /* renamed from: a */
    private int f191225a = 0;

    /* renamed from: b */
    private final cipw f191226b;

    /* renamed from: c */
    private final Inflater f191227c;

    /* renamed from: d */
    private final ciqd f191228d;

    /* renamed from: e */
    private final CRC32 f191229e = new CRC32();

    public ciqc(ciqr ciqr) {
        if (ciqr != null) {
            this.f191227c = new Inflater(true);
            this.f191226b = ciqh.m150828a(ciqr);
            this.f191228d = new ciqd(this.f191226b, this.f191227c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    private final void m150813a(cipu cipu, long j, long j2) {
        ciqn ciqn = cipu.f191212a;
        while (true) {
            long j3 = (long) (ciqn.f191252c - ciqn.f191251b);
            if (j < j3) {
                break;
            }
            j -= j3;
            ciqn = ciqn.f191255f;
        }
        while (j2 > 0) {
            int i = (int) (((long) ciqn.f191251b) + j);
            int min = (int) Math.min((long) (ciqn.f191252c - i), j2);
            this.f191229e.update(ciqn.f191250a, i, min);
            j2 -= (long) min;
            ciqn = ciqn.f191255f;
            j = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        if (r0 == 2) goto L_0x013b;
     */
    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        long j2;
        cipu cipu2 = cipu;
        long j3 = j;
        if (j3 < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        } else if (j3 == 0) {
            return 0;
        } else {
            int i = this.f191225a;
            if (i == 0) {
                this.f191226b.mo86285a(10);
                byte c = ((ciqm) this.f191226b).f191247a.mo86297c(3L);
                int i2 = (c >> 1) & 1;
                if (i2 != 0) {
                    m150813a(((ciqm) this.f191226b).f191247a, 0, 10);
                }
                m150814a("ID1ID2", 8075, this.f191226b.mo86310f());
                this.f191226b.mo86317h(8);
                if (((c >> 2) & 1) == 1) {
                    this.f191226b.mo86285a(2);
                    if (i2 != 0) {
                        m150813a(((ciqm) this.f191226b).f191247a, 0, 2);
                    }
                    long h = (long) ((ciqm) this.f191226b).f191247a.mo86315h();
                    this.f191226b.mo86285a(h);
                    if (i2 != 0) {
                        j2 = h;
                        m150813a(((ciqm) this.f191226b).f191247a, 0, h);
                    } else {
                        j2 = h;
                    }
                    this.f191226b.mo86317h(j2);
                }
                if (((c >> 3) & 1) == 1) {
                    long q = this.f191226b.mo86331q();
                    if (q != -1) {
                        if (i2 != 0) {
                            m150813a(((ciqm) this.f191226b).f191247a, 0, q + 1);
                        }
                        this.f191226b.mo86317h(q + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((c >> 4) & 1) == 1) {
                    long q2 = this.f191226b.mo86331q();
                    if (q2 != -1) {
                        if (i2 != 0) {
                            m150813a(((ciqm) this.f191226b).f191247a, 0, q2 + 1);
                        }
                        this.f191226b.mo86317h(q2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (i2 != 0) {
                    ciqm ciqm = (ciqm) this.f191226b;
                    ciqm.mo86285a(2);
                    m150814a("FHCRC", ciqm.f191247a.mo86315h(), (short) ((int) this.f191229e.getValue()));
                    this.f191229e.reset();
                }
                this.f191225a = 1;
                i = 1;
            }
            if (i == 1) {
                long j4 = cipu2.f191213b;
                long c2 = this.f191228d.mo74995c(cipu2, j3);
                if (c2 == -1) {
                    this.f191225a = 2;
                } else {
                    m150813a(cipu, j4, c2);
                    return c2;
                }
            }
            m150814a("CRC", this.f191226b.mo86319i(), (int) this.f191229e.getValue());
            m150814a("ISIZE", this.f191226b.mo86319i(), (int) this.f191227c.getBytesWritten());
            this.f191225a = 3;
            if (!this.f191226b.mo86295b()) {
                throw new IOException("gzip finished without exhausting source");
            }
            return -1;
        }
    }

    public final void close() {
        this.f191228d.close();
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f191226b.mo74997df();
    }

    /* renamed from: a */
    private static final void m150814a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
