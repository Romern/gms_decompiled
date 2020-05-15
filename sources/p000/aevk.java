package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: aevk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aevk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aevn f63895a;

    public aevk(aevn aevn) {
        this.f63895a = aevn;
    }

    public final void run() {
        this.f63895a.mo34614e();
        this.f63895a.f63906f.postDelayed(this, TimeUnit.MINUTES.toMillis(1));
    }
}
