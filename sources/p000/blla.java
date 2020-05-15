package p000;

import java.io.InputStream;

/* renamed from: blla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blla extends blku {

    /* renamed from: a */
    private final blku f126782a;

    /* renamed from: b */
    private final long f126783b;

    /* renamed from: c */
    private final long f126784c;

    public blla(blku blku, long j, long j2) {
        this.f126782a = blku;
        long a = m107318a(j);
        this.f126783b = a;
        this.f126784c = m107318a(a + j2);
    }

    /* renamed from: a */
    private final long m107318a(long j) {
        long j2 = 0;
        if (j >= 0) {
            j2 = ((blkw) this.f126782a).f126774b;
            if (j <= j2) {
                return j;
            }
        }
        return j2;
    }

    /* renamed from: a */
    public final long mo66624a() {
        return this.f126784c - this.f126783b;
    }

    public final void close() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final InputStream mo66625a(long j, long j2) {
        long a = m107318a(this.f126783b + j);
        return this.f126782a.mo66625a(a, m107318a(j2 + a) - a);
    }
}
