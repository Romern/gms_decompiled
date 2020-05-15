package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: osv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class osv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ osw f38368a;

    public osv(osw osw) {
        this.f38368a = osw;
    }

    public final void run() {
        osw osw = this.f38368a;
        if (osw.f38369a) {
            osw.f38370b.f29563B = Boolean.TRUE;
            CarSetupServiceImpl carSetupServiceImpl = this.f38368a.f38370b;
            if (carSetupServiceImpl.f29586c == 2) {
                carSetupServiceImpl.f29586c = 3;
                carSetupServiceImpl.f29589f.mo22220b();
                return;
            }
            return;
        }
        osw.f38370b.f29563B = Boolean.FALSE;
        this.f38368a.f38370b.mo17419c();
    }
}
