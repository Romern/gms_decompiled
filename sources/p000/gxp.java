package p000;

import android.os.SystemClock;

/* renamed from: gxp */
final /* synthetic */ class gxp implements C0038ax {

    /* renamed from: a */
    private final gxt f19182a;

    public gxp(gxt gxt) {
        this.f19182a = gxt;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        gxt gxt = this.f19182a;
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a() && ((Boolean) bmxv.mo66814b()).booleanValue()) {
            long elapsedRealtime = gxt.f19191f.f19331t - (SystemClock.elapsedRealtime() - gxt.f19196k);
            if (elapsedRealtime <= 0) {
                gxt.f19191f.mo12357a(1);
                return;
            }
            gxt.mo12301a();
            gxt.f19194i = new gxr(gxt, elapsedRealtime);
            gxt.f19194i.start();
        }
    }
}
