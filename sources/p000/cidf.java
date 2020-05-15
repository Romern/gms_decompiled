package p000;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: cidf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cidf implements Closeable, chyg {

    /* renamed from: a */
    public final cidc f189880a;

    /* renamed from: b */
    public int f189881b;

    /* renamed from: c */
    public chrn f189882c;

    /* renamed from: d */
    public chyb f189883d = new chyb();

    /* renamed from: e */
    public long f189884e;

    /* renamed from: f */
    public boolean f189885f = false;

    /* renamed from: g */
    public volatile boolean f189886g = false;

    /* renamed from: h */
    private final ciez f189887h;

    /* renamed from: i */
    private final cifh f189888i;

    /* renamed from: j */
    private int f189889j = 5;

    /* renamed from: k */
    private boolean f189890k;

    /* renamed from: l */
    private chyb f189891l;

    /* renamed from: m */
    private boolean f189892m = false;

    /* renamed from: n */
    private int f189893n = -1;

    /* renamed from: o */
    private int f189894o;

    /* renamed from: p */
    private int f189895p = 1;

    public cidf(cidc cidc, chrn chrn, int i, ciez ciez, cifh cifh) {
        bmxy.m108582a(cidc, "sink");
        this.f189880a = cidc;
        bmxy.m108582a(chrn, "decompressor");
        this.f189882c = chrn;
        this.f189881b = i;
        bmxy.m108582a(ciez, "statsTraceCtx");
        this.f189887h = ciez;
        bmxy.m108582a(cifh, "transportTracer");
        this.f189888i = cifh;
    }

    /* renamed from: a */
    public final boolean mo85982a() {
        return this.f189883d == null;
    }

    /* renamed from: b */
    public final boolean mo85983b() {
        return this.f189883d.f189507a == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r3 <= 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.f189880a.mo85732a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r7.f189895p != 2) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r7.f189887h.mo86024a((long) r3);
        r7.f189894o += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r7.f189885f == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (mo85983b() == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        r7.f189892m = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r3 <= 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7.f189880a.mo85732a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
        if (r7.f189895p != 2) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0071, code lost:
        r7.f189887h.mo86024a((long) r3);
        r7.f189894o += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        r3 = r7.f189895p;
        r4 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r3 == 0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        if (r4 == 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r4 == 1) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        if (r3 == 1) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        r0 = "BODY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r0 = "HEADER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        r4 = new java.lang.StringBuilder(r0.length() + 15);
        r4.append("Invalid state: ");
        r4.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        throw new java.lang.AssertionError(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        r2 = r7.f189887h.f189993b;
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        if (r4 < r3) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r7.f189894o = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r7.f189890k != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b9, code lost:
        r7.f189887h.mo86025b();
        r2 = p000.ciec.m150112a(r7.f189891l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        if (r7.f189882c == p000.chrc.f189024a) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e0, code lost:
        r2 = new p000.cide(r7.f189882c.mo85557a(p000.ciec.m150112a(r7.f189891l)), r7.f189881b, r7.f189887h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r7.f189891l = null;
        r7.f189880a.mo85774a(new p000.cidd(r2));
        r7.f189895p = 1;
        r7.f189889j = 5;
        r7.f189884e--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010e, code lost:
        throw p000.chuv.f189228o.mo85687a("Can't decode compressed gRPC message as compression not configured").mo85691b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        r6 = r2[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0114, code lost:
        r3 = r7.f189891l.mo85810b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011c, code lost:
        if ((r3 & 254) != 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0120, code lost:
        if ((r3 & 1) != 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0122, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0124, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0125, code lost:
        r7.f189890k = r3;
        r3 = r7.f189891l;
        r3.mo85770a(4);
        r3 = r3.mo85810b() | (((r3.mo85810b() << 24) | (r3.mo85810b() << 16)) | (r3.mo85810b() << 8));
        r7.f189889j = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0148, code lost:
        if (r3 < 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014c, code lost:
        if (r3 > r7.f189881b) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014e, code lost:
        r7.f189893n++;
        r3 = r7.f189887h.f189993b;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0159, code lost:
        if (r5 < r4) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015b, code lost:
        r3 = r7.f189888i;
        r3.f190006h.mo85783a();
        r3.f190007i = r3.f190000b.mo86026a();
        r7.f189895p = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016e, code lost:
        r6 = r3[r5];
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a2, code lost:
        throw p000.chuv.f189228o.mo85687a("gRPC frame header malformed: reserved bits not zero").mo85691b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ab, code lost:
        r7.f189880a.mo85732a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b2, code lost:
        if (r7.f189895p == 2) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b4, code lost:
        r7.f189887h.mo86024a((long) r3);
        r7.f189894o += r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ab A[Catch:{ IOException -> 0x00fb, all -> 0x01c0 }] */
    /* renamed from: c */
    public final void mo85984c() {
        int i;
        if (!this.f189892m) {
            this.f189892m = true;
            loop0:
            while (true) {
                if (this.f189884e <= 0) {
                    break;
                }
                try {
                    if (this.f189891l == null) {
                        this.f189891l = new chyb();
                        i = 0;
                    } else {
                        i = 0;
                    }
                    while (true) {
                        try {
                            int i2 = this.f189889j - this.f189891l.f189507a;
                            if (i2 <= 0) {
                                break;
                            }
                            int i3 = this.f189883d.f189507a;
                            if (i3 == 0) {
                                break loop0;
                            }
                            int min = Math.min(i2, i3);
                            i += min;
                            this.f189891l.mo85808a(this.f189883d.mo85812c(min));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (Throwable th) {
                            this.f189892m = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                    if (i > 0) {
                    }
                    throw th;
                }
            }
            throw chuv.f189224k.mo85687a(String.format("gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f189881b), Integer.valueOf(this.f189889j))).mo85691b();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        if (!mo85982a()) {
            chyb chyb = this.f189891l;
            boolean z = false;
            if (chyb != null && chyb.f189507a > 0) {
                z = true;
            }
            try {
                chyb chyb2 = this.f189883d;
                if (chyb2 != null) {
                    chyb2.close();
                }
                chyb chyb3 = this.f189891l;
                if (chyb3 != null) {
                    chyb3.close();
                }
                this.f189883d = null;
                this.f189891l = null;
                this.f189880a.mo85775a(z);
            } catch (Throwable th) {
                this.f189883d = null;
                this.f189891l = null;
                throw th;
            }
        }
    }
}
