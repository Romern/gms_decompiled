package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;

/* renamed from: cawz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawz implements cavo {

    /* renamed from: a */
    private final cipv f176297a;

    /* renamed from: b */
    private final cipu f176298b = new cipu();

    /* renamed from: c */
    private final cipv f176299c;

    /* renamed from: d */
    private final boolean f176300d;

    /* renamed from: e */
    private boolean f176301e;

    public cawz(cipv cipv, boolean z) {
        this.f176297a = cipv;
        this.f176300d = z;
        Deflater deflater = new Deflater();
        deflater.setDictionary(caxa.f176302a);
        this.f176299c = ciqh.m150827a(new cipy(ciqh.m150827a((ciqq) this.f176298b), deflater));
    }

    /* renamed from: a */
    public final synchronized void mo74973a() {
    }

    /* renamed from: a */
    public final void mo74978a(cawx cawx) {
    }

    /* renamed from: b */
    public final synchronized void mo74981b() {
        if (!this.f176301e) {
            this.f176297a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public final int mo74983c() {
        return 16383;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cavk.a(java.io.Closeable, java.io.Closeable):void
     arg types: [cipv, cipv]
     candidates:
      cavk.a(long, long):void
      cavk.a(ciqr, java.util.concurrent.TimeUnit):boolean
      cavk.a(java.lang.Object, java.lang.Object):boolean
      cavk.a(java.lang.String[], java.lang.String):boolean
      cavk.a(java.io.Closeable, java.io.Closeable):void */
    public final synchronized void close() {
        this.f176301e = true;
        cavk.m127311a((Closeable) this.f176297a, (Closeable) this.f176299c);
    }

    /* renamed from: a */
    public final synchronized void mo74974a(int i, int i2) {
        if (this.f176301e) {
            throw new IOException("closed");
        } else if (this.f176300d != (i & true)) {
            this.f176297a.mo86307e(-2147287034);
            this.f176297a.mo86307e(4);
            this.f176297a.mo86307e(i);
            this.f176297a.flush();
        } else {
            throw new IllegalArgumentException("payload != reply");
        }
    }

    /* renamed from: b */
    public final synchronized void mo74982b(cawx cawx) {
        if (!this.f176301e) {
            int a = cawx.mo75031a();
            this.f176297a.mo86307e(-2147287036);
            this.f176297a.mo86307e(((a * 8) + 4) & 16777215);
            this.f176297a.mo86307e(a);
            for (int i = 0; i <= 10; i++) {
                if (cawx.mo75033a(i)) {
                    this.f176297a.mo86307e((cawx.mo75037c(i) << 24) | (i & 16777215));
                    this.f176297a.mo86307e(cawx.mo75035b(i));
                }
            }
            this.f176297a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo74975a(int i, long j) {
        if (this.f176301e) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            StringBuilder sb = new StringBuilder(74);
            sb.append("windowSizeIncrement must be between 1 and 0x7fffffff: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.f176297a.mo86307e(-2147287031);
            this.f176297a.mo86307e(8);
            this.f176297a.mo86307e(i);
            this.f176297a.mo86307e((int) j);
            this.f176297a.flush();
        }
    }

    /* renamed from: a */
    public final synchronized void mo74976a(int i, cavl cavl) {
        if (this.f176301e) {
            throw new IOException("closed");
        } else if (cavl.f176160t != -1) {
            this.f176297a.mo86307e(-2147287037);
            this.f176297a.mo86307e(8);
            this.f176297a.mo86307e(i & Integer.MAX_VALUE);
            this.f176297a.mo86307e(cavl.f176160t);
            this.f176297a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final synchronized void mo74977a(int i, cavl cavl, byte[] bArr) {
        if (this.f176301e) {
            throw new IOException("closed");
        } else if (cavl.f176161u != -1) {
            this.f176297a.mo86307e(-2147287033);
            this.f176297a.mo86307e(8);
            this.f176297a.mo86307e(i);
            this.f176297a.mo86307e(cavl.f176161u);
            this.f176297a.flush();
        } else {
            throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
        }
    }

    /* renamed from: a */
    public final synchronized void mo74979a(boolean z, int i, cipu cipu, int i2) {
        if (!this.f176301e) {
            long j = (long) i2;
            if (j <= 16777215) {
                this.f176297a.mo86307e(i & Integer.MAX_VALUE);
                this.f176297a.mo86307e(((z ? 1 : 0) << true) | (16777215 & i2));
                if (i2 > 0) {
                    this.f176297a.mo74930a(cipu, j);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("FRAME_TOO_LARGE max size is 16Mib: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IOException("closed");
    }

    /* renamed from: a */
    public final synchronized void mo74980a(boolean z, int i, List list) {
        if (!this.f176301e) {
            this.f176299c.mo86307e(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                cipx cipx = ((cawh) list.get(i2)).f176243h;
                this.f176299c.mo86307e(cipx.mo86345e());
                this.f176299c.mo86300c(cipx);
                cipx cipx2 = ((cawh) list.get(i2)).f176244i;
                this.f176299c.mo86307e(cipx2.mo86345e());
                this.f176299c.mo86300c(cipx2);
            }
            this.f176299c.flush();
            long j = this.f176298b.f191213b;
            this.f176297a.mo86307e(-2147287039);
            this.f176297a.mo86307e(((z ? 1 : 0) << true) | (((int) (j + 10)) & 16777215));
            this.f176297a.mo86307e(i & Integer.MAX_VALUE);
            this.f176297a.mo86307e(0);
            this.f176297a.mo86311f(0);
            cipv cipv = this.f176297a;
            cipu cipu = this.f176298b;
            if (cipu != null) {
                while (cipu.mo74995c(((ciqk) cipv).f191243a, 8192) != -1) {
                    ((ciqk) cipv).mo86330p();
                }
                this.f176297a.flush();
            } else {
                throw new IllegalArgumentException("source == null");
            }
        } else {
            throw new IOException("closed");
        }
    }
}
