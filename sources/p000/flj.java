package p000;

import android.os.Looper;

/* renamed from: flj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class flj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ flk f16856a;

    public flj(flk flk) {
        this.f16856a = flk;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f16856a.f16858b.mo10958b().mo10886a(this);
            return;
        }
        boolean b = this.f16856a.mo11009b();
        this.f16856a.f16860d = 0;
        if (b) {
            this.f16856a.mo10965a();
        }
    }
}
