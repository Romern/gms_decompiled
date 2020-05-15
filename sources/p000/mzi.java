package p000;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* renamed from: mzi */
final /* synthetic */ class mzi implements Callable {

    /* renamed from: a */
    private final nab f35042a;

    public mzi(nab nab) {
        this.f35042a = nab;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lvr.a(android.content.Context, long):void
     arg types: [android.content.Context, int]
     candidates:
      lvr.a(android.content.Context, int):void
      lvr.a(android.content.Context, boolean):void
      lvr.a(android.content.Context, long):void */
    public final Object call() {
        nab nab = this.f35042a;
        int i = Build.VERSION.SDK_INT;
        TrafficStats.clearThreadStatsTag();
        TrafficStats.clearThreadStatsUid();
        if (Settings.Global.getLong(nab.f35110q.getContentResolver(), "wifi_bounce_delay_override_ms", -1) == ccnf.m130740i()) {
            nab.f35117x.mo19837b(4);
            nab.f35077B.mo19650a(nab.f35110q, 60000L);
        }
        myr myr = nab.f35107n;
        if (myr != null) {
            myr.f34965d = null;
            nab.f35107n = null;
            nab.f35075a.mo25414c("d2d restore finished", new Object[0]);
            nab.f35117x.mo19832a(3, nab.f35084I, nab.f35085J);
        } else {
            nab.f35098e = null;
            nab.f35100g = null;
            ndv ndv = nab.f35106m;
            Context context = nab.f35110q;
            for (bxvd bxvd : ndv.f35369d) {
                mqj mqj = mqj.UNKNOWN;
                int i2 = ((mqk) bxvd.f164949b).f34284a;
                if ((i2 & 8) != 0) {
                    mqj = mqj.COMMON_RESTORE;
                } else if ((i2 & 32) != 0) {
                    mqj = mqj.FULL_DATA_RESTORE;
                }
                ndv.mo20495a(context, bxvd, mqj);
            }
            ndv.f35369d.clear();
            ndv.f35370e = null;
            nab.f35106m = null;
            nab.f35075a.mo25414c("restore finished", new Object[0]);
            nab.f35117x.mo19832a(3, nab.f35084I, nab.f35085J);
        }
        return null;
    }
}
