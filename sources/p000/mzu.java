package p000;

import android.net.TrafficStats;
import java.util.concurrent.Callable;

/* renamed from: mzu */
final /* synthetic */ class mzu implements Callable {

    /* renamed from: a */
    private final nab f35064a;

    public mzu(nab nab) {
        this.f35064a = nab;
    }

    public final Object call() {
        int i;
        myt myt;
        nab nab = this.f35064a;
        if (nab.f35095b != -1) {
            TrafficStats.setThreadStatsTagBackup();
            TrafficStats.setThreadStatsUid(nab.f35095b);
        }
        try {
            if (!nab.f35102i.booleanValue()) {
                nab.mo20368a("lastKvBackupPassTimeMs");
                i = nab.mo20372b();
                Logger Logger = nab.f35075a;
                String valueOf = String.valueOf(nab.f35097d);
                Logger.mo25414c(valueOf.length() == 0 ? new String("Backup finished for ") : "Backup finished for ".concat(valueOf), new Object[0]);
            } else {
                nab.mo20368a("lastFullBackupPassTimeMs");
                mzb mzb = nab.f35103j;
                if (mzb == null || (myt = mzb.f35010k) == null) {
                    i = 0;
                } else {
                    i = myt.mo20337c();
                }
                nab.f35103j = null;
                nab.f35102i = false;
                Logger logger2 = nab.f35075a;
                String valueOf2 = String.valueOf(nab.f35097d);
                logger2.mo25414c(valueOf2.length() == 0 ? new String("Backup finished for ") : "Backup finished for ".concat(valueOf2), new Object[0]);
            }
            TrafficStats.clearThreadStatsTag();
            TrafficStats.clearThreadStatsUid();
            nab.f35095b = -1;
            nab.f35096c = null;
            nab.f35097d = null;
            nab.f35117x.mo19821a(3);
            return Integer.valueOf(i);
        } catch (Throwable th) {
            Logger logger3 = nab.f35075a;
            String valueOf3 = String.valueOf(nab.f35097d);
            logger3.mo25414c(valueOf3.length() == 0 ? new String("Backup finished for ") : "Backup finished for ".concat(valueOf3), new Object[0]);
            TrafficStats.clearThreadStatsTag();
            TrafficStats.clearThreadStatsUid();
            nab.f35095b = -1;
            nab.f35096c = null;
            nab.f35097d = null;
            nab.f35117x.mo19821a(3);
            throw th;
        }
    }
}
