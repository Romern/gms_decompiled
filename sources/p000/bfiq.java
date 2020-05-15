package p000;

/* renamed from: bfiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfiq {

    /* renamed from: a */
    public long f114029a = -1;

    /* renamed from: b */
    public long f114030b = -1;

    /* renamed from: c */
    public bgjm f114031c = null;

    /* renamed from: d */
    private final bfcy f114032d;

    /* renamed from: e */
    private final bfip f114033e = new bfip();

    public bfiq(bfcy bfcy) {
        this.f114032d = bfcy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo61737a(bfnx bfnx, long j) {
        int i = 0;
        for (int i2 = 0; i2 < bfnx.mo62006b(); i2++) {
            bfcx a = this.f114032d.f113449a.mo61429a(bfnx.mo62003a(i2));
            long j2 = a != null ? a.f113448c : -1;
            if (j2 == -1 || j - j2 > 600000) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61738a(bgjm bgjm, bfmn bfmn, bfnx bfnx) {
        if (bgjm != null) {
            this.f114031c = bgjm;
        }
        if (bfmn != null) {
            this.f114030b = bfmn.f114417g;
            if (bgjm != null) {
                this.f114033e.mo61736a(bfmn, bgjm);
            }
        }
        if (bfnx != null) {
            this.f114029a = bfnx.f114524a;
            bfcy bfcy = this.f114032d;
            if (bfcy != null) {
                long c = bfcy.f113450b.mo62776c();
                for (int i = 0; i < bfnx.mo62006b(); i++) {
                    bfcy.mo61432a(bfnx.mo62003a(i), c).f113448c = c;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo61739a(bfmn bfmn, bgjm bgjm) {
        int i;
        bgjm bgjm2 = bgjm;
        bfip bfip = this.f114033e;
        if (bgjm2 == null) {
            return false;
        }
        String a = bfmn.mo61934a();
        double b = bgjm.mo62896b();
        double c = bgjm.mo62897c();
        int i2 = 0;
        while (i2 < 20) {
            if (!bfip.f114025b[i2] || !bfip.f114024a[i2].equals(a)) {
                i = i2;
            } else {
                i = i2;
                if (ayuo.m84846b(bfip.f114026c[i2], bfip.f114027d[i2], b, c) < 50.0d) {
                    return true;
                }
            }
            i2 = i + 1;
        }
        bfip.mo61736a(bfmn, bgjm2);
        return false;
    }
}
