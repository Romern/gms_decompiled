package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: bikd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bikd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bikf f120768a;

    public bikd(bikf bikf) {
        this.f120768a = bikf;
    }

    public final void run() {
        if (this.f120768a.isVisible()) {
            bikf bikf = this.f120768a;
            if (bikf.f120774f) {
                bikf.mo64700a((int) C0126R.string.common_unknown);
            }
        }
    }
}
