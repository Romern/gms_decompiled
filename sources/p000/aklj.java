package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: aklj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aklj extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ aklk f72197a;

    public aklj(aklk aklk) {
        this.f72197a = aklk;
    }

    public final void onAvailable(Network network) {
        aklk aklk = this.f72197a;
        int i = aklk.f72200k;
        aklk.mo39540a(network);
    }
}
