package p000;

import android.net.Network;
import android.net.NetworkInfo;
import java.util.Comparator;

/* renamed from: veu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class veu implements Comparator {

    /* renamed from: a */
    final /* synthetic */ vev f49145a;

    public veu(vev vev) {
        this.f49145a = vev;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        boolean z;
        Network network = (Network) obj;
        Network network2 = (Network) obj2;
        boolean z2 = false;
        if (network.equals(network2)) {
            return 0;
        }
        NetworkInfo networkInfo = this.f49145a.f49147b.getNetworkInfo(network);
        NetworkInfo networkInfo2 = this.f49145a.f49147b.getNetworkInfo(network2);
        if (networkInfo == null && networkInfo2 == null) {
            return 0;
        }
        if (networkInfo == null || networkInfo2 == null) {
            return networkInfo != null ? -1 : 1;
        }
        int compare = Boolean.compare(networkInfo.isRoaming(), networkInfo2.isRoaming());
        if (compare != 0) {
            return compare;
        }
        if (networkInfo.getType() != 1) {
            z = true;
        } else {
            z = false;
        }
        if (networkInfo2.getType() != 1) {
            z2 = true;
        }
        return Boolean.compare(z, z2);
    }
}
