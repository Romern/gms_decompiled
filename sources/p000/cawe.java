package p000;

import java.io.IOException;

/* renamed from: cawe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawe implements ciqr {

    /* renamed from: a */
    public final cipu f176219a = new cipu();

    /* renamed from: b */
    public final cipu f176220b = new cipu();

    /* renamed from: c */
    public final long f176221c;

    /* renamed from: d */
    public boolean f176222d;

    /* renamed from: e */
    public boolean f176223e;

    /* renamed from: f */
    final /* synthetic */ cawg f176224f;

    public cawe(cawg cawg, long j) {
        this.f176224f = cawg;
        this.f176221c = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        r10 = r7.f176224f.f176229d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2 = r7.f176224f.f176229d;
        r3 = r2.f176204j + r8;
        r2.f176204j = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r3 < ((long) (r2.f176206l.mo75036c() / 2))) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r7.f176224f.f176229d;
        r2.mo74986a(0, r2.f176204j);
        r7.f176224f.f176229d.f176204j = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d4, code lost:
        r7.f176224f.f176233h.mo75000b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        throw r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        if (j >= 0) {
            synchronized (this.f176224f) {
                this.f176224f.f176233h.mo86273c();
                while (true) {
                    if (this.f176220b.f191213b != 0) {
                        break;
                    } else if (!this.f176223e && !this.f176222d) {
                        cawg cawg = this.f176224f;
                        if (cawg.f176235j == null) {
                            cawg.mo75012h();
                        }
                    }
                }
                this.f176224f.f176233h.mo75000b();
                if (!this.f176222d) {
                    cavl cavl = this.f176224f.f176235j;
                    if (cavl == null) {
                        cipu cipu2 = this.f176220b;
                        long j2 = cipu2.f191213b;
                        if (j2 == 0) {
                            return -1;
                        }
                        long c = cipu2.mo74995c(cipu, Math.min(j, j2));
                        cawg cawg2 = this.f176224f;
                        long j3 = cawg2.f176226a + c;
                        cawg2.f176226a = j3;
                        if (j3 >= ((long) (cawg2.f176229d.f176206l.mo75036c() / 2))) {
                            cawg cawg3 = this.f176224f;
                            cawg3.f176229d.mo74986a(cawg3.f176228c, cawg3.f176226a);
                            this.f176224f.f176226a = 0;
                        }
                    } else {
                        String valueOf = String.valueOf(cavl);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                        sb.append("stream was reset: ");
                        sb.append(valueOf);
                        throw new IOException(sb.toString());
                    }
                } else {
                    throw new IOException("stream closed");
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("byteCount < 0: ");
            sb2.append(j);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final void close() {
        synchronized (this.f176224f) {
            this.f176222d = true;
            this.f176220b.mo86328n();
            this.f176224f.notifyAll();
        }
        this.f176224f.mo75010f();
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f176224f.f176233h;
    }
}
