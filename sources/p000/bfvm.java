package p000;

import android.os.SystemClock;

/* renamed from: bfvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfvm extends bfvi {

    /* renamed from: a */
    public boolean f115414a = false;

    /* renamed from: b */
    final /* synthetic */ bfvn f115415b;

    /* renamed from: c */
    private final Runnable f115416c = new bfvl(this);

    /* renamed from: d */
    private long f115417d = 0;

    public bfvm(bfvn bfvn) {
        this.f115415b = bfvn;
    }

    /* renamed from: c */
    private final long m97996c() {
        return SystemClock.elapsedRealtime() - this.f115417d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62314a() {
        this.f115417d = SystemClock.elapsedRealtime();
        bfsd bfsd = this.f115415b.f115418a;
        if (bfsd.f115105b != null) {
            bfsd.f115107d.mo26009a(42);
            bfsd.f115108e = 0;
            bfsd.f115104a.registerListener(bfsd, bfsd.f115105b, (int) cevw.f183465a.mo6606a().pressureSamplingIntervalUs(), bfsd.f115106c);
        }
        this.f115415b.f115423f.mo49111a(5000);
        this.f115415b.f115420c.postDelayed(this.f115416c, !this.f115414a ? cevw.m138327l() : cevw.m138326k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62316b() {
        bfsd bfsd = this.f115415b.f115418a;
        if (bfsd.f115105b != null) {
            bfsd.f115104a.unregisterListener(bfsd);
            bfsd.f115107d.mo26010a(44, bfsd.f115108e);
            bfsd.f115107d.mo26009a(43);
        }
        this.f115417d = 0;
        this.f115415b.f115420c.removeCallbacks(this.f115416c);
        if (this.f115415b.f115423f.mo49124e()) {
            this.f115415b.f115423f.mo49120c();
        }
    }

    /* renamed from: a */
    public final void mo62315a(int i) {
        if (i == 3) {
            if (m97996c() >= cevw.m138327l()) {
                bfvn bfvn = this.f115415b;
                bfvn.mo62318a(bfvn.f115421d);
            }
        } else if (i == 2) {
            long k = cevw.m138326k() - m97996c();
            if (k > 0) {
                this.f115415b.f115420c.removeCallbacks(this.f115416c);
                this.f115415b.f115420c.postDelayed(this.f115416c, k);
            }
        }
    }
}
