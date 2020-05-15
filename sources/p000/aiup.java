package p000;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* renamed from: aiup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiup extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ int f69808a;

    /* renamed from: b */
    final /* synthetic */ aivd f69809b;

    /* renamed from: c */
    final /* synthetic */ aiuc f69810c;

    public aiup(aivd aivd, int i, aiuc aiuc) {
        this.f69809b = aivd;
        this.f69808a = i;
        this.f69810c = aiuc;
    }

    public final void onAvailable(Network network) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiup", "onAvailable", 545, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Successfully hosted WiFi Aware network.");
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.f69809b.mo38092a(new aiuo(this, linkProperties, this.f69808a, this.f69810c));
    }

    public final void onLost(Network network) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiup", "onLost", 558, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Lost connection to the WiFi Aware network.");
    }
}
