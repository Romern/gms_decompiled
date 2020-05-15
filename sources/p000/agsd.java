package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: agsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agsd extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ Context f66351a;

    public agsd(Context context) {
        this.f66351a = context;
    }

    public final void onAvailable(Network network) {
        agse.f66352a.mo26019b(agyt.m55307c()).mo68424a("%s: available: %s", "CellularMonitor", network);
        agrl a = agrl.m54942a();
        boot a2 = a.mo35978a(20, "GTAF_Server", "MDP_PeriodicService");
        int i = 5;
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((bxvk) a2);
        bxvd da = bonz.f133873h.mo74144da();
        bxzu bxzu = bxzu.EVENT_CELLULAR_NETWORK_AVAILABLE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bonz) da.f164949b).f133875a = bxzu.mo3214a();
        bxvd da2 = bons.f133851b.mo74144da();
        if (!cflr.m139929f()) {
            i = 4;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bons) da2.f164949b).f133853a = bonr.m111370a(i);
        bons bons = (bons) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bons.getClass();
        ((bonz) da.f164949b).f133879e = bons;
        bonz bonz = (bonz) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        bonz.getClass();
        ((boot) bxvd.f164949b).f134017t = bonz;
        a.mo35994a((boot) bxvd.mo74062i(), bygd.NEW_CELL_NETWORK_AVAILABLE);
        if (cflr.m139929f() && cflr.m139933j()) {
            agsl.m55046a().mo36056b();
        }
    }

    public final void onLost(Network network) {
        agse.f66352a.mo26019b(agyt.m55307c()).mo68424a("%s: lost: %s", "CellularMonitor", network);
        agrl a = agrl.m54942a();
        boot a2 = a.mo35978a(20, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((bxvk) a2);
        bxvd da = bonz.f133873h.mo74144da();
        bxvd da2 = bons.f133851b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bons) da2.f164949b).f133853a = bonr.m111370a(6);
        bons bons = (bons) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bons.getClass();
        ((bonz) da.f164949b).f133879e = bons;
        bonz bonz = (bonz) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        bonz.getClass();
        ((boot) bxvd.f164949b).f134017t = bonz;
        a.mo35994a((boot) bxvd.mo74062i(), bygd.CELL_NETWORK_LOST);
    }

    public final void onUnavailable() {
        agse.f66352a.mo26019b(agyt.m55307c()).mo68420a("%s: unavailable: re-register.", "CellularMonitor");
        if (cflr.m139929f()) {
            agse.m55045a(this.f66351a);
        }
    }
}
