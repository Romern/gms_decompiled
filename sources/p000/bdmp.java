package p000;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bdmp */
final /* synthetic */ class bdmp implements bqeg {

    /* renamed from: a */
    private final bdmq f105980a;

    /* renamed from: b */
    private final String f105981b;

    /* renamed from: c */
    private final boolean f105982c;

    /* renamed from: d */
    private final String f105983d;

    /* renamed from: e */
    private final int f105984e;

    public bdmp(bdmq bdmq, String str, int i, boolean z, String str2) {
        this.f105980a = bdmq;
        this.f105981b = str;
        this.f105984e = i;
        this.f105982c = z;
        this.f105983d = str2;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        cimz cimz;
        bdmq bdmq = this.f105980a;
        String str = this.f105981b;
        int i = this.f105984e;
        boolean z = this.f105982c;
        String str2 = this.f105983d;
        if (((bdmd) bdmq.f105988d.mo6445a()).mo58165e()) {
            System.gc();
            System.runFinalization();
            System.gc();
        }
        bdmf bdmf = (bdmf) ((bdmd) bdmq.f105988d.mo6445a()).mo58164d().mo66815c();
        if (bdmf != null) {
            try {
                cimz = bdmf.mo58179a();
            } catch (RuntimeException e) {
                bnrq bnrq = (bnrq) bdmq.f105985a.mo68387b();
                bnrq.mo68437a(e);
                bnrq.mo68432a("bdmq", "a", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Metric extension provider failed.");
                cimz = null;
            }
        } else {
            cimz = null;
        }
        if (!((bdmd) bdmq.f105988d.mo6445a()).mo58163c()) {
            bxvd da = cios.f191113s.mo74144da();
            cine a = bdmq.f105990f.mo58189a(i, Process.myPid(), null, str2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cios cios = (cios) da.f164949b;
            a.getClass();
            cios.f191116b = a;
            cios.f191115a |= 1;
            return bdmq.f105989e.mo58101a(str, z, (cios) da.mo74062i(), cimz, null);
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = bdjb.m90889a(bdmq.f105986b).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            ArrayList arrayList = new ArrayList(runningAppProcesses.size());
            bdmq.f105986b.getPackageName();
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            if (it.hasNext()) {
                ActivityManager.RunningAppProcessInfo next = it.next();
                int i2 = Build.VERSION.SDK_INT;
                bxvd da2 = cios.f191113s.mo74144da();
                cine a2 = bdmq.f105990f.mo58189a(i, next.pid, next.processName, str2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cios cios2 = (cios) da2.f164949b;
                a2.getClass();
                cios2.f191116b = a2;
                cios2.f191115a |= 1;
                arrayList.add(bdmq.f105989e.mo58101a(str, z, (cios) da2.mo74062i(), cimz, null));
                return bqga.m112785c(arrayList).mo69216a(bqel.m112709a(), bqfb.INSTANCE);
            }
        }
        return bqga.m112775a((Object) null);
    }
}
