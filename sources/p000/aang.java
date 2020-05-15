package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;

/* renamed from: aang */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aang {

    /* renamed from: a */
    private ConnectivityManager.NetworkCallback f28534a;

    /* renamed from: b */
    private final ConnectivityManager f28535b;

    public aang(Context context) {
        this.f28535b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public final synchronized void mo17103a() {
        if (mo17105b()) {
            this.f28535b.unregisterNetworkCallback(this.f28534a);
            this.f28534a = null;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo17105b() {
        return this.f28534a != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo17104a(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        if (!mo17105b()) {
            this.f28535b.registerNetworkCallback(networkRequest, networkCallback);
            this.f28534a = networkCallback;
        }
    }
}
