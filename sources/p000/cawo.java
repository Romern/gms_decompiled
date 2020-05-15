package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* renamed from: cawo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawo implements cavo {

    /* renamed from: a */
    private final cipv f176270a;

    /* renamed from: b */
    private final boolean f176271b;

    /* renamed from: c */
    private final cipu f176272c = new cipu();

    /* renamed from: d */
    private final cawj f176273d = new cawj(this.f176272c);

    /* renamed from: e */
    private int f176274e = AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;

    /* renamed from: f */
    private boolean f176275f;

    public cawo(cipv cipv, boolean z) {
        this.f176270a = cipv;
        this.f176271b = z;
    }

    /* renamed from: a */
    public final synchronized void mo74973a() {
        if (this.f176275f) {
            throw new IOException("closed");
        } else if (this.f176271b) {
            if (cawp.f176276a.isLoggable(Level.FINE)) {
                cawp.f176276a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", cawp.f176277b.mo86342c()));
            }
            this.f176270a.mo86289a(cawp.f176277b.mo86347f());
            this.f176270a.flush();
        }
    }

    /* renamed from: b */
    public final synchronized void mo74981b() {
        if (!this.f176275f) {
            this.f176270a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public final int mo74983c() {
        return this.f176274e;
    }

    public final synchronized void close() {
        this.f176275f = true;
        this.f176270a.close();
    }

    /* renamed from: b */
    public final synchronized void mo74982b(cawx cawx) {
        int i;
        if (!this.f176275f) {
            int i2 = 0;
            mo75025a(0, cawx.mo75031a() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (cawx.mo75033a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f176270a.mo86311f(i);
                    this.f176270a.mo86307e(cawx.mo75035b(i2));
                }
                i2++;
            }
            this.f176270a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo74974a(int i, int i2) {
        if (!this.f176275f) {
            mo75025a(0, 8, (byte) 6, (byte) 1);
            this.f176270a.mo86307e(i);
            this.f176270a.mo86307e(i2);
            this.f176270a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo75025a(int i, int i2, byte b, byte b2) {
        if (cawp.f176276a.isLoggable(Level.FINE)) {
            cawp.f176276a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$Writer", "frameHeader", cawm.m127407a(false, i, i2, b, b2));
        }
        int i3 = this.f176274e;
        if (i2 > i3) {
            throw cawp.m127426a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            cipv cipv = this.f176270a;
            cipv.mo86316h((i2 >>> 16) & 255);
            cipv.mo86316h((i2 >>> 8) & 255);
            cipv.mo86316h(i2 & 255);
            this.f176270a.mo86316h(b);
            this.f176270a.mo86316h(b2);
            this.f176270a.mo86307e(i & Integer.MAX_VALUE);
        } else {
            throw cawp.m127426a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final synchronized void mo74975a(int i, long j) {
        if (this.f176275f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw cawp.m127426a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            mo75025a(i, 4, (byte) 8, (byte) 0);
            this.f176270a.mo86307e((int) j);
            this.f176270a.flush();
        }
    }

    /* renamed from: a */
    public final synchronized void mo74976a(int i, cavl cavl) {
        if (this.f176275f) {
            throw new IOException("closed");
        } else if (cavl.f176159s != -1) {
            mo75025a(i, 4, (byte) 3, (byte) 0);
            this.f176270a.mo86307e(cavl.f176159s);
            this.f176270a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final synchronized void mo74977a(int i, cavl cavl, byte[] bArr) {
        if (this.f176275f) {
            throw new IOException("closed");
        } else if (cavl.f176159s != -1) {
            int length = bArr.length;
            mo75025a(0, length + 8, (byte) 7, (byte) 0);
            this.f176270a.mo86307e(i);
            this.f176270a.mo86307e(cavl.f176159s);
            if (length > 0) {
                this.f176270a.mo86289a(bArr);
            }
            this.f176270a.flush();
        } else {
            throw cawp.m127426a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void mo74978a(cawx cawx) {
        if (!this.f176275f) {
            int i = this.f176274e;
            if ((cawx.f176290a & 32) != 0) {
                i = cawx.f176293d[5];
            }
            this.f176274e = i;
            mo75025a(0, 0, (byte) 4, (byte) 1);
            this.f176270a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo74979a(boolean z, int i, cipu cipu, int i2) {
        if (!this.f176275f) {
            mo75025a(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.f176270a.mo74930a(cipu, (long) i2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: a */
    public final synchronized void mo74980a(boolean z, int i, List list) {
        int i2;
        byte b;
        if (!this.f176275f) {
            cawj cawj = this.f176273d;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                cipx d = ((cawh) list.get(i3)).f176243h.mo86344d();
                Integer num = (Integer) cawk.f176256b.get(d);
                if (num != null) {
                    cawj.mo75022a(num.intValue() + 1, 15);
                    cawj.mo75023a(((cawh) list.get(i3)).f176244i);
                } else {
                    cawj.f176254a.mo86316h(0);
                    cawj.mo75023a(d);
                    cawj.mo75023a(((cawh) list.get(i3)).f176244i);
                }
            }
            long j = this.f176272c.f191213b;
            int min = (int) Math.min((long) this.f176274e, j);
            long j2 = (long) min;
            if (j == j2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            mo75025a(i, min, (byte) 1, (byte) i2);
            this.f176270a.mo74930a(this.f176272c, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int min2 = (int) Math.min((long) this.f176274e, j3);
                    long j4 = (long) min2;
                    j3 -= j4;
                    if (j3 == 0) {
                        b = 4;
                    } else {
                        b = 0;
                    }
                    mo75025a(i, min2, (byte) 9, b);
                    this.f176270a.mo74930a(this.f176272c, j4);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }
}
