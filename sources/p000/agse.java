package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;

/* renamed from: agse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agse {

    /* renamed from: a */
    public static final srn f66352a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static void m55045a(Context context) {
        if (cflr.m139929f()) {
            int i = Build.VERSION.SDK_INT;
            f66352a.mo26019b(agyt.m55307c()).mo68420a("%s: register", "CellularMonitor");
            agrl a = agrl.m54942a();
            boot a2 = a.mo35978a(20, "GTAF_Server", "MDP_PeriodicService");
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((bxvk) a2);
            bxvd da = bonz.f133873h.mo74144da();
            bxzu bxzu = bxzu.EVENT_MODULE_INITIALIZED;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bonz) da.f164949b).f133875a = bxzu.mo3214a();
            bxvd da2 = bons.f133851b.mo74144da();
            int i2 = !cflr.m139929f() ? 4 : 3;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bons) da2.f164949b).f133853a = bonr.m111370a(i2);
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
            a.mo35994a((boot) bxvd.mo74062i(), bygd.REGISTER_CELL_NETWORK_EVENT_CALLBACK);
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(0).addCapability(12);
            ((ConnectivityManager) context.getSystemService("connectivity")).requestNetwork(builder.build(), new agsd(context));
        }
    }
}
