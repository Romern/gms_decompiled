package p000;

/* renamed from: bfmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmm {

    /* renamed from: a */
    private bfmn f114407a;

    /* renamed from: b */
    private Boolean f114408b;

    /* renamed from: c */
    private long f114409c;

    /* renamed from: d */
    private boolean f114410d;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        return 0;
     */
    /* renamed from: a */
    public final synchronized int mo61943a() {
        if (this.f114410d) {
            return 1;
        }
        if (this.f114408b != null && this.f114407a != null) {
            return 0;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo61946b() {
        boolean z;
        Boolean bool;
        z = false;
        if (mo61943a() == 1 || ((bool = this.f114408b) != null && bool.booleanValue())) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo61944a(long j, bfmn bfmn) {
        bfmn bfmn2;
        if (bfmn != null) {
            if (bfmn.mo61950e()) {
                Boolean bool = this.f114408b;
                if (bool != null && !bool.booleanValue() && ((int) (Math.abs(j - this.f114409c) / 1000)) > 3 && (bfmn2 = this.f114407a) != null && !bfmn.mo61949b(bfmn2)) {
                    this.f114410d = true;
                }
                this.f114407a = bfmn;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61945a(boolean z, long j) {
        this.f114409c = j;
        this.f114408b = Boolean.valueOf(z);
    }
}
