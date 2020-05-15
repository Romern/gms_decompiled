package p000;

import android.util.Log;

/* renamed from: acel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acel implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bonk f59653a;

    /* renamed from: b */
    final /* synthetic */ acen f59654b;

    public acel(acen acen, bonk bonk) {
        this.f59654b = acen;
        this.f59653a = bonk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            acen acen = this.f59654b;
            Log.i("AppsUpload", "Apps list not changed: skip upload");
            synchronized (acen.f59661f) {
                acen.f59662g = false;
                if (acen.f59663h == null) {
                    acen.f59664i.mo69138b((Object) false);
                    acen.f59664i = null;
                }
            }
            this.f59654b.mo32710a();
            return;
        }
        this.f59654b.mo32711a(this.f59653a);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f59654b.mo32712a("Failed to read the installed apps", th);
    }
}
