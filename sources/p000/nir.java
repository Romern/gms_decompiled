package p000;

import android.app.ActivityManager;
import android.os.Handler;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: nir */
final /* synthetic */ class nir implements Runnable {

    /* renamed from: a */
    private final nit f35754a;

    public nir(nit nit) {
        this.f35754a = nit;
    }

    public final void run() {
        oey oey;
        nit nit = this.f35754a;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) nit.f35763d.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (!TextUtils.isEmpty(runningAppProcessInfo.processName) && nit.f35765f.contains(runningAppProcessInfo.processName)) {
                    synchronized (nit.f35768i) {
                        nis nis = (nis) nit.f35772m.get(runningAppProcessInfo.processName);
                        if (nis != null) {
                            if (!(runningAppProcessInfo == null || (runningAppProcessInfo.importance == nis.f35755a && runningAppProcessInfo.lru == nis.f35758d && runningAppProcessInfo.uid == nis.f35759e))) {
                                String nis2 = nis.toString();
                                nis.f35755a = runningAppProcessInfo.importance;
                                nis.f35756b = runningAppProcessInfo.importanceReasonCode;
                                nis.f35757c = runningAppProcessInfo.importanceReasonPid;
                                nis.f35758d = runningAppProcessInfo.lru;
                                nis.f35759e = runningAppProcessInfo.uid;
                                ((bnfd) nit.f35771l.get(runningAppProcessInfo.processName)).offer(String.format(Locale.US, "%s:%s", nit.f35770k.format(new Date()), nis));
                                bnsi d = nit.f35760a.mo68390d();
                                d.mo68432a("nit", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d.mo68425a("Process info changed %s:%s->%s", runningAppProcessInfo.processName, nis2, nis);
                            }
                            if (runningAppProcessInfo.importance >= 400) {
                                String str = runningAppProcessInfo.processName;
                                synchronized (nit.f35768i) {
                                    if (!nit.f35773n.contains(str) && (oey = (oey) nit.f35769j.get(str)) != null) {
                                        ofd.m28611a(nit.f35763d, "com.google.android.gms.car.PROCESS_STATE_CACHED", oey);
                                        bnsi c = nit.f35760a.mo68388c();
                                        c.mo68432a("nit", "a", 187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        c.mo68420a("Process in cached state - not expected %s", bryx.m114908a(str));
                                        nit.f35773n.add(str);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        synchronized (nit.f35768i) {
            if (nit.f35774o) {
                ((Handler) nit.f35766g.mo6606a()).postDelayed(nit.f35767h, 5000);
            }
        }
    }
}
