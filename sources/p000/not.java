package p000;

import com.google.android.gms.car.diagnostics.CriticalError;

/* renamed from: not */
public final /* synthetic */ class not implements Runnable {

    /* renamed from: a */
    private final nov f36253a;

    /* renamed from: b */
    private final int f36254b;

    /* renamed from: c */
    private final int f36255c;

    public not(nov nov, int i, int i2) {
        this.f36253a = nov;
        this.f36254b = i;
        this.f36255c = i2;
    }

    public final void run() {
        this.f36253a.f36257a.mo21371b(new CriticalError(this.f36254b, this.f36255c));
    }
}
