package p000;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: agsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agsl {

    /* renamed from: a */
    public static final srn f66361a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    public static final Object f66362b = new Object();

    /* renamed from: g */
    public static int f66363g = 2;

    /* renamed from: h */
    private static agsl f66364h;

    /* renamed from: c */
    public final Context f66365c = rpr.m34216b();

    /* renamed from: d */
    public final agza f66366d = new agza();

    /* renamed from: e */
    public agph f66367e;

    /* renamed from: f */
    public final Executor f66368f = snp.m35704b(10);

    private agsl() {
    }

    /* renamed from: a */
    public static synchronized agsl m55046a() {
        agsl agsl;
        synchronized (agsl.class) {
            if (f66364h == null) {
                f66364h = new agsl();
            }
            agsl = f66364h;
        }
        return agsl;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* renamed from: c */
    public static boolean m55047c() {
        long j;
        boolean z = false;
        if (!agyq.m55296q(rpr.m34216b())) {
            f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: activeSimNeedsNewCpid: no supported SIM", "BgTaskManager");
            return false;
        }
        String i = agyq.m55288i(rpr.m34216b());
        if (i == null || ("1234567890987654321".equals(i) && !agqg.m54845L().booleanValue())) {
            f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: activeSimNeedsNewCpid: no ICCID", "BgTaskManager");
            return false;
        }
        if (agpk.m54726a().mo35846f(i) != null) {
            j = agpk.m54726a().mo35846f(i).longValue();
        } else {
            j = 0;
        }
        if (j - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) < cflr.f184273a.mo6606a().mo81407u()) {
            z = true;
        }
        f66361a.mo26019b(agyt.m55307c()).mo68431a("%s: activeSimNeedsNewCpid: %s", (Object) "BgTaskManager", z);
        return z;
    }

    /* renamed from: b */
    public final void mo36056b() {
        this.f66368f.execute(new agsh(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* renamed from: d */
    public final void mo36060d(int i) {
        boolean z;
        agsw agsw = new agsw();
        agsw.f66404a = this.f66365c;
        agsw.f66405b = Integer.valueOf(i);
        agsx agsx = new agsx(agsw.f66404a, agsw.f66405b);
        agsx.f66406a.mo26019b(agyt.m55307c()).mo68431a("%s: runAndAwaitResult: start. runForQuotaCheck? %s", (Object) "BgTaskListCpidEndpoints", true);
        boolean z2 = false;
        try {
            z = ((Boolean) aucu.m76782a(aucu.m76780a(snp.m35704b(10), agsx))).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            agsx.f66406a.mo26019b(agyt.m55307c()).mo68420a("%s: runAndAwaitResult: failed.", "BgTaskListCpidEndpoints");
            z = false;
        }
        f66361a.mo26019b(agyt.m55307c()).mo68431a("%s: runBatchTaskCpidRefresh: quota check? %s", (Object) "BgTaskManager", z);
        if (z) {
            mo36057b(bxzv.TASK_LIST_CPID_ENDPOINTS, bxzu.EVENT_ENDPOINTS_FETCHED, i);
            agst agst = new agst();
            agst.f66391a = this.f66365c;
            agst.f66392b = Integer.valueOf(i);
            try {
                z2 = ((Boolean) aucu.m76782a(aucu.m76780a(snp.m35704b(10), new agsv(agst.f66391a, agst.f66392b)))).booleanValue();
            } catch (InterruptedException | ExecutionException e2) {
                bnsl bnsl = (bnsl) agsv.f66398a.mo68387b();
                bnsl.mo68437a(e2);
                bnsl.mo68420a("%s Timed out, interrupted, or failed while performing background CPID fetch.", "BgTaskGetCpid:");
            }
            f66361a.mo26019b(agyt.m55307c()).mo68431a("%s: runBatchTaskCpidRefresh: cpid fetch? %s", (Object) "BgTaskManager", z2);
            if (z2) {
                this.f66368f.execute(new agsj(this, i));
            }
        }
    }

    /* renamed from: a */
    public final void mo36054a(bxzv bxzv, bxzu bxzu, int i) {
        bxzu bxzu2;
        bony bony;
        agrl a = agrl.m54942a();
        List asList = Arrays.asList(bxzv);
        boot a2 = a.mo35978a(20, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a2);
        bxvd da = bonz.f133873h.mo74144da();
        if (bxzu == null) {
            bxzu2 = bxzu.EVENT_UNKNOWN;
        } else {
            bxzu2 = bxzu;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bonz) da.f164949b).f133875a = bxzu2.mo3214a();
        if (asList == null) {
            bony = bony.f133869c;
        } else {
            bonx bonx = (bonx) bony.f133869c.mo74144da();
            bonx.mo68919a(asList);
            bony = (bony) bonx.mo74062i();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bony.getClass();
        ((bonz) da.f164949b).f133880f = bony;
        bonz bonz = (bonz) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        bonz.getClass();
        ((boot) bxvd.f164949b).f134017t = bonz;
        a.mo35995a((boot) bxvd.mo74062i(), bygd.SET_TRIGGERING_VECTORS, Integer.valueOf(i));
        agza agza = this.f66366d;
        agza.f66898d.execute(new agyy(agza, bxzv, bxzu));
    }

    /* renamed from: b */
    public final void mo36057b(bxzv bxzv, bxzu bxzu, int i) {
        agrl a = agrl.m54942a();
        List asList = Arrays.asList(bxzv);
        boot a2 = a.mo35978a(20, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a2);
        bonx bonx = (bonx) bony.f133869c.mo74144da();
        if (bonx.f164950c) {
            bonx.mo74035c();
            bonx.f164950c = false;
        }
        ((bony) bonx.f164949b).f133871a = true;
        if (asList != null) {
            bonx.mo68919a(asList);
        }
        bxvd da = bonz.f133873h.mo74144da();
        if (bxzu == null) {
            bxzu = bxzu.EVENT_UNKNOWN;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bonz) da.f164949b).f133875a = bxzu.mo3214a();
        bony bony = (bony) bonx.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bony.getClass();
        ((bonz) da.f164949b).f133880f = bony;
        bonz bonz = (bonz) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        bonz.getClass();
        ((boot) bxvd.f164949b).f134017t = bonz;
        a.mo35995a((boot) bxvd.mo74062i(), bygd.SET_TRIGGERING_VECTORS, Integer.valueOf(i));
        agza agza = this.f66366d;
        agza.f66898d.execute(new agyz(agza, bxzv));
    }

    /* renamed from: c */
    public final boolean mo36059c(int i) {
        int i2 = 3;
        if (!this.f66366d.mo36209a(bxzv.TASK_HTTP_CPID_FETCH)) {
            i2 = 6;
        } else if (cflr.m139934k() && cflr.f184273a.mo6606a().mo81395i()) {
            i2 = 2;
        }
        agrl.m54942a().mo36002a(bxzv.TASK_HTTP_CPID_FETCH, i2, i);
        return i2 == 2;
    }

    /* renamed from: a */
    public final boolean mo36055a(int i) {
        int i2 = this.f66366d.mo36209a(bxzv.TASK_GCORE_REGISTER) ? (!cflr.m139934k() || !cflr.m139931h() || !cflx.m140019f()) ? 3 : !cflx.m140017d() ? 3 : 2 : 6;
        agrl.m54942a().mo36002a(bxzv.TASK_GCORE_REGISTER, i2, i);
        f66361a.mo26019b(agyt.m55307c()).mo68424a("%s: shouldRunGCoreRegister: disqualify: %s", "BgTaskManager", i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "NO_TRIGGERS_ACTIVE" : "TASK_ALREADY_RUNNING" : "CACHE_UP_TO_DATE" : "DISABLED_BY_PHENOTYPE" : "NONE");
        return i2 == 2;
    }

    /* renamed from: b */
    public final boolean mo36058b(int i) {
        int i2 = 3;
        if (!this.f66366d.mo36209a(bxzv.TASK_SET_CONSENT_STATUS)) {
            i2 = 6;
        } else if (cflr.m139934k() && cflr.m139932i()) {
            i2 = 2;
        }
        agrl.m54942a().mo36002a(bxzv.TASK_SET_CONSENT_STATUS, i2, i);
        return i2 == 2;
    }
}
