package p000;

import android.util.Log;

/* renamed from: acem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acem implements bqfp {

    /* renamed from: a */
    final /* synthetic */ acen f59655a;

    public acem(acen acen) {
        this.f59655a = acen;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        acen acen = this.f59655a;
        Log.i("AppsUpload", "Apps list updated");
        ((bads) acen.f59657b.mo16713a()).mo32743a(12006);
        synchronized (acen.f59661f) {
            acen.f59662g = false;
            if (acen.f59663h == null) {
                acen.f59664i.mo69138b((Object) true);
                acen.f59664i = null;
            }
        }
        this.f59655a.mo32710a();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f59655a.mo32712a("Failed to write the installed apps", th);
    }
}
