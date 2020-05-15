package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: aanj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aanj extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ aank f28547a;

    public aanj(aank aank) {
        this.f28547a = aank;
    }

    public final void onAvailable(Network network) {
        NetworkCapabilities networkCapabilities;
        if (cecz.m136066n() && !cecz.m136055c() && (networkCapabilities = this.f28547a.f28553b.getNetworkCapabilities(network)) != null && networkCapabilities.hasTransport(1)) {
            this.f28547a.f28571t.mo17064a(1).mo17082b(this.f28547a.f28552a);
        }
        if (cecz.m136073u()) {
            this.f28547a.mo17118a(network, 1);
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (cecz.m136066n() && cecz.m136055c() && networkCapabilities.hasTransport(1)) {
            aamw aamw = this.f28547a.f28571t.mo17064a(1).f28513e;
            if (aamw.mo17073a() == null) {
                aamw.mo17074a(network);
                this.f28547a.f28571t.mo17064a(1).mo17082b(this.f28547a.f28552a);
            }
        }
        if (this.f28547a.f28556e.mo17111b() && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            this.f28547a.mo17123b();
        }
    }

    public final void onLost(Network network) {
        if (cecz.m136066n()) {
            if (cecz.m136055c()) {
                aamw aamw = this.f28547a.f28571t.mo17064a(1).f28513e;
                if (aamw.mo17073a().equals(network)) {
                    aamw.mo17076b();
                    this.f28547a.f28571t.mo17064a(1).mo17081b();
                }
            } else {
                NetworkCapabilities networkCapabilities = this.f28547a.f28553b.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    this.f28547a.f28571t.mo17064a(1).mo17081b();
                }
            }
        }
        if (cecz.m136073u()) {
            this.f28547a.mo17118a(network, 2);
        }
    }
}
