package p000;

import android.util.Log;

/* renamed from: axun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axun implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axuk f96402a;

    /* renamed from: b */
    final /* synthetic */ ayev f96403b;

    public axun(axuk axuk, ayev ayev) {
        this.f96402a = axuk;
        this.f96403b = ayev;
    }

    public final void run() {
        axuk axuk = this.f96402a;
        ayea ayea = this.f96403b.f97380c;
        if (ayea == null) {
            ayea = ayea.f97270c;
        }
        String str = ayea.f97273b;
        if (Log.isLoggable("assets", 2)) {
            String valueOf = String.valueOf(str);
            Log.v("assets", valueOf.length() == 0 ? new String("acked asset, digest=") : "acked asset, digest=".concat(valueOf));
        }
        axuk.f96391a.remove(str);
    }
}
