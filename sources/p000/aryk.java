package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: aryk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aryk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aryp f88455a;

    public aryk(aryp aryp) {
        this.f88455a = aryp;
    }

    public final void run() {
        this.f88455a.mo48944d();
        this.f88455a.f88460b.mo48937e();
        aryp aryp = this.f88455a;
        aryp.f88462d.mo71363a(aryp.getString(C0126R.string.common_no_devices_found));
        this.f88455a.mo48941a(false);
        this.f88455a.f88463e.mo64885a(0);
    }
}
