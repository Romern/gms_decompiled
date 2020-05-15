package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdmq extends bdml implements bdkj {

    /* renamed from: a */
    public static final bnrt f105985a = bnrt.m110178a("bdmq");

    /* renamed from: b */
    public final Application f105986b;

    /* renamed from: c */
    public final bqgk f105987c;

    /* renamed from: d */
    public final cijl f105988d;

    /* renamed from: e */
    public final bdkg f105989e;

    /* renamed from: f */
    public final bdmv f105990f;

    /* renamed from: g */
    private bdmk f105991g;

    public bdmq(bdkh bdkh, Application application, bqgk bqgk, cijl cijl, bdmv bdmv) {
        new AtomicReference(bdme.f105961a);
        new ConcurrentHashMap();
        this.f105989e = bdkh.mo58105a(bqgk, bdpz.m91272a(new bdmm(cijl)));
        this.f105986b = application;
        this.f105987c = bqgk;
        this.f105988d = cijl;
        this.f105990f = bdmv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bqgg mo58187a(cimz cimz, String str, int i, boolean z, String str2) {
        bdmf bdmf;
        if (((bdmd) this.f105988d.mo6445a()).mo58165e()) {
            System.gc();
            System.runFinalization();
            System.gc();
        }
        if (cimz == null && (bdmf = (bdmf) ((bdmd) this.f105988d.mo6445a()).mo58164d().mo66815c()) != null) {
            try {
                cimz = bdmf.mo58179a();
            } catch (RuntimeException e) {
                bnrq bnrq = (bnrq) f105985a.mo68387b();
                bnrq.mo68437a(e);
                bnrq.mo68432a("bdmq", "a", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Metric extension provider failed.");
            }
        }
        cimz cimz2 = cimz;
        if (!((bdmd) this.f105988d.mo6445a()).mo58163c()) {
            bxvd da = cios.f191113s.mo74144da();
            cine a = this.f105990f.mo58189a(i, Process.myPid(), null, str2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cios cios = (cios) da.f164949b;
            a.getClass();
            cios.f191116b = a;
            cios.f191115a |= 1;
            return this.f105989e.mo58101a(str, z, (cios) da.mo74062i(), cimz2, null);
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = bdjb.m90889a(this.f105986b).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            ArrayList arrayList = new ArrayList(runningAppProcesses.size());
            this.f105986b.getPackageName();
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            if (it.hasNext()) {
                ActivityManager.RunningAppProcessInfo next = it.next();
                int i2 = Build.VERSION.SDK_INT;
                bxvd da2 = cios.f191113s.mo74144da();
                cine a2 = this.f105990f.mo58189a(i, next.pid, next.processName, str2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cios cios2 = (cios) da2.f164949b;
                a2.getClass();
                cios2.f191116b = a2;
                cios2.f191115a |= 1;
                arrayList.add(this.f105989e.mo58101a(str, z, (cios) da2.mo74062i(), cimz2, null));
                return bqga.m112785c(arrayList).mo69216a(bqel.m112709a(), bqfb.INSTANCE);
            }
        }
        return bqga.m112775a((Object) null);
    }

    /* renamed from: b */
    public final synchronized void mo58031b() {
        bdmk bdmk = this.f105991g;
        if (bdmk != null) {
            bdmk.f105973f.mo57956b(bdmk.f105974g);
            bdmk.f105973f.mo57956b(bdmk.f105975h);
            this.f105991g = null;
        }
    }

    /* renamed from: c */
    public final void mo58086c() {
    }

    /* renamed from: a */
    public final bqgg mo58184a(String str) {
        return mo58188a(str, true, 1, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo58188a(String str, boolean z, int i, String str2) {
        return this.f105989e.mo58100a(new bdmp(this, str, i, z, str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo58185a() {
        if (this.f105991g == null) {
            bdmk bdmk = new bdmk(new bdmn(this), this.f105986b, new bdmo(this));
            this.f105991g = bdmk;
            if (bdmk.f105969b.getAndSet(true)) {
                bnrq bnrq = (bnrq) bdmk.f105968a.mo68388c();
                bnrq.mo68432a("bdmk", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored.");
                return;
            }
            bdmk.f105973f.mo57955a(bdmk.f105974g);
            bdmk.f105973f.mo57955a(bdmk.f105975h);
        }
    }
}
