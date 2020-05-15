package p000;

/* renamed from: awgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awgz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f94322a;

    /* renamed from: b */
    final /* synthetic */ boolean f94323b;

    /* renamed from: c */
    final /* synthetic */ awhb f94324c;

    public awgz(awhb awhb, int i, boolean z) {
        this.f94324c = awhb;
        this.f94322a = i;
        this.f94323b = z;
    }

    public final void run() {
        int i;
        boolean z;
        awhb awhb = this.f94324c;
        Runnable runnable = awhb.f94341j;
        if (runnable == null) {
            int g = awhb.f94332a.mo59882g();
            awhb awhb2 = this.f94324c;
            if (awhb2.f94342k) {
                i = awhb2.f94332a.mo59881f();
            } else {
                double d = (double) this.f94322a;
                double d2 = awhb2.f94332a.f110116v;
                Double.isNaN(d);
                i = g + ((int) (d * d2));
            }
            if (this.f94324c.getScrollY() < i) {
                awhb awhb3 = this.f94324c;
                if (!awhb3.f94332a.f110108n || !this.f94323b) {
                    z = false;
                } else {
                    z = true;
                }
                awhb3.mo71902a(i, z, false);
                return;
            }
            return;
        }
        runnable.run();
        this.f94324c.f94341j = null;
    }
}
