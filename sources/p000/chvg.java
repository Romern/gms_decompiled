package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: chvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvg extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ chvi f189258a;

    /* renamed from: b */
    private boolean f189259b = false;

    public chvg(chvi chvi) {
        this.f189258a = chvi;
    }

    public final void onAvailable(Network network) {
        if (this.f189259b) {
            this.f189258a.f189262a.mo85628g();
        } else {
            this.f189258a.f189262a.mo85627f();
        }
        this.f189259b = true;
    }

    public final void onLost(Network network) {
        this.f189259b = false;
    }
}
