package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: aqyi */
final /* synthetic */ class aqyi implements Runnable {

    /* renamed from: a */
    private final aqyl f87087a;

    /* renamed from: b */
    private final BootstrapProgressResult f87088b;

    public aqyi(aqyl aqyl, BootstrapProgressResult bootstrapProgressResult) {
        this.f87087a = aqyl;
        this.f87088b = bootstrapProgressResult;
    }

    public final void run() {
        aqyl aqyl = this.f87087a;
        aqyl.f87095a.mo48270a(this.f87088b);
    }
}
