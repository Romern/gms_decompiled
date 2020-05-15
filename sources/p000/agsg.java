package p000;

import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: agsg */
public final /* synthetic */ class agsg implements Runnable {

    /* renamed from: a */
    private final agsl f66354a;

    public agsg(agsl agsl) {
        this.f66354a = agsl;
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
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d8 A[EDGE_INSN: B:80:0x00d8->B:14:0x00d8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x009a  */
    public final void run() {
        int i;
        boolean z;
        agsl agsl = this.f66354a;
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68425a("%s: periodicTimerTriggered: workflow: %b. cellular monitor: %b", "BgTaskManager", Boolean.valueOf(cflr.m139935l()), Boolean.valueOf(cflr.m139929f()));
        int c = agrl.m54949c();
        if (agsl.m55047c()) {
            agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: periodicTimerTriggered: CpidFetch needed", "BgTaskManager");
            agsl.mo36054a(bxzv.TASK_HTTP_CPID_FETCH, bxzu.EVENT_REFRESH_CPID_TTL_DUE, c);
        }
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - agsl.f66366d.f66897b.getLong(String.valueOf(bxzv.TASK_GCORE_REGISTER.name()).concat("_last_try_time"), 0) > cflx.m140021h()) {
            agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: periodicTimerTriggered: GcoreRegister needed", "BgTaskManager");
            agsl.mo36054a(bxzv.TASK_GCORE_REGISTER, bxzu.EVENT_REFRESH_GCORE_REGISTER_DUE, c);
        }
        Iterator it = agyq.m55295p(agsl.f66365c).iterator();
        while (true) {
            if (!it.hasNext()) {
                bxyk c2 = agpk.m54726a().mo35842c(agpk.m54726a().mo35839b(((agzc) it.next()).mo36193a()));
                if (c2 == null || c2.f165097a > cfmd.m140087g()) {
                    agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: periodicTimerTriggered: ConsentFetch needed", "BgTaskManager");
                    agsl.mo36054a(bxzv.TASK_GET_CONSENT_INFO, bxzu.EVENT_REFRESH_CONSENT_TEXT_DUE, c);
                }
                if (!it.hasNext()) {
                    break;
                }
            }
        }
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: periodicTimerTriggered: ConsentFetch needed", "BgTaskManager");
        agsl.mo36054a(bxzv.TASK_GET_CONSENT_INFO, bxzu.EVENT_REFRESH_CONSENT_TEXT_DUE, c);
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: workFlow: starts", "BgTaskManager");
        boolean z2 = true;
        if (!cflr.m139935l()) {
            agrl.m54942a().mo35979a(4, c);
            z2 = false;
        } else {
            synchronized (agsl.f66362b) {
                i = 3;
                if (agsl.f66363g != 3) {
                    agsl.f66363g = 3;
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: workFlow: already running; aborting.", "BgTaskManager");
                agrl.m54942a().mo35979a(5, c);
                z2 = false;
            } else {
                agrl.m54942a().mo35979a(3, c);
                if (agsl.f66367e == null) {
                    agsl.f66367e = agpg.m54719a(agsl.f66365c, agpe.m54718a());
                }
                if (agsl.mo36055a(c)) {
                    agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: workFlow: run GcoreRegister", "BgTaskManager");
                    agsp agsp = new agsp();
                    agsp.f66377a = agsl.f66365c;
                    agsp.f66378b = Integer.valueOf(c);
                    if (agsp.mo36062a().mo36063a()) {
                        agsl.mo36057b(bxzv.TASK_GCORE_REGISTER, bxzu.EVENT_GCORE_REGISTER_PERFORMED, c);
                    }
                }
                if (!agsl.f66366d.mo36209a(bxzv.TASK_GET_CONSENT_INFO)) {
                    i = 6;
                } else if (cflr.m139934k() && cflr.m139930g()) {
                    i = 2;
                }
                agrl.m54942a().mo36002a(bxzv.TASK_GET_CONSENT_INFO, i, c);
                if (i == 2) {
                    agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: workFlow: run ConsentFetch", "BgTaskManager");
                    agsr agsr = new agsr();
                    agsr.f66385a = agsl.f66365c;
                    agsr.f66386b = Integer.valueOf(c);
                    try {
                        if (((Boolean) aucu.m76782a(aucu.m76780a(snp.m35704b(10), new agss(agsr.f66385a, agsr.f66386b)))).booleanValue()) {
                            agsl.mo36057b(bxzv.TASK_GET_CONSENT_INFO, bxzu.EVENT_CONSENT_TEXT_FETCHED, c);
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        bnsl a = agss.f66387a.mo26019b(!(e instanceof ExecutionException) ? Level.WARNING : Level.SEVERE);
                        a.mo68437a(e);
                        a.mo68420a("%s: Exception during background consent fetch", "BgTaskGetConsent");
                    }
                }
                if (agsl.mo36058b(c)) {
                    agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: workFlow: run SetConsent", "BgTaskManager");
                    agsy agsy = new agsy();
                    agsy.f66411a = agsl.f66365c;
                    agsy.f66412b = Integer.valueOf(c);
                    if (agsy.mo36072a().mo36073a()) {
                        agsl.mo36057b(bxzv.TASK_SET_CONSENT_STATUS, bxzu.EVENT_CONSENT_STATUS_PROPAGATED, c);
                    }
                }
                if (agsl.mo36059c(c)) {
                    agsl.f66361a.mo26019b(agyt.m55307c()).mo68420a("%s: workFlow: run CpidRefresh", "BgTaskManager");
                    agsl.mo36060d(c);
                }
                synchronized (agsl.f66362b) {
                    agsl.f66363g = 2;
                }
            }
        }
        agsl.f66361a.mo26019b(agyt.m55307c()).mo68431a("%s: periodicTimerTriggered: workflow ran ? %s", (Object) "BgTaskManager", z2);
    }
}
