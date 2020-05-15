package com.google.android.gms.mobiledataplan.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraPeriodicUpdaterService extends aeah implements aubw, aubt {

    /* renamed from: a */
    public static final srn f80303a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private static final Set f80304b = Collections.unmodifiableSet(new HashSet(Arrays.asList(27021, 27001, 27005, 27007)));

    /* renamed from: c */
    private final LinkedBlockingQueue f80305c;

    /* renamed from: d */
    private final agru f80306d;

    /* renamed from: e */
    private final AtomicInteger f80307e;

    /* renamed from: g */
    private final AtomicInteger f80308g;

    /* renamed from: h */
    private final Object f80309h;

    /* renamed from: i */
    private int f80310i;

    /* renamed from: j */
    private agph f80311j;

    /* renamed from: k */
    private Context f80312k;

    /* renamed from: l */
    private final Object f80313l;

    /* renamed from: m */
    private long f80314m;

    public ChimeraPeriodicUpdaterService() {
        this.f80307e = new AtomicInteger();
        this.f80308g = new AtomicInteger();
        this.f80309h = new Object();
        this.f80313l = new Object();
        if (cfmv.f184430a.mo6606a().mo81537F()) {
            this.f80305c = new LinkedBlockingQueue();
            agru agru = new agru(this.f80305c);
            this.f80306d = agru;
            agru.start();
        } else {
            this.f80305c = null;
            this.f80306d = null;
        }
        this.f80310i = 0;
    }

    /* renamed from: a */
    public static void m67283a(Context context) {
        Long l;
        String str;
        f80303a.mo26019b(agyt.m55307c()).mo68428a("%s: GcoreRegister: interval %d flex %d. schedule:%b update:%b disableLegacy:%b", "PeriodicService", Long.valueOf(cflx.m140021h()), Long.valueOf(cflx.m140020g()), Boolean.valueOf(cflx.m140019f()), Boolean.valueOf(cflx.m140017d()), Boolean.valueOf(cflr.m139937n()));
        if (!cflx.m140019f() || cflr.m139937n()) {
            f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: GcoreRegister: not enabled, skip scheduling.", "PeriodicService");
            return;
        }
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        aebl.f63099k = "mobiledataplan_register";
        int i = 0;
        aebl.mo34023a(0);
        aebl.mo34024a(0, cdny.m134339d() ? 1 : 0);
        aebl.mo34027b(1);
        long h = cflx.m140021h();
        long g = cflx.m140020g();
        if (!cdny.m134349n()) {
            aebl.f63070a = h;
            aebl.f63071b = g;
        } else {
            aebl.mo34009a(aebh.m51568a(h));
        }
        if (cfmq.m140231b()) {
            i = agrl.m54949c();
            Bundle bundle = new Bundle();
            bundle.putInt("event_flow_id", i);
            aebl.f63107s = bundle;
        }
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
        String a = agqz.m54893a().mo35966a(context);
        String i2 = agyq.m55288i(context);
        String e = agpk.m54726a().mo35845e(i2);
        if (e != null) {
            l = agpk.m54726a().mo35851k(e);
        } else {
            l = null;
            e = "dummy_cpid_before_retrieval";
        }
        if (l == null) {
            l = agth.f66446a;
        }
        if (agpk.m54726a().mo35849i(i2)) {
            str = e;
        } else {
            str = "dummy_cpid_before_consent";
        }
        agrl.m54943a(context).mo36015a(a, cfmv.m140318q(), (int) cfmv.m140319r(), l.longValue(), str, 9, 5, Integer.valueOf(i), null);
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
    /* renamed from: b */
    public static void m67290b(Context context) {
        long j;
        long j2;
        f80303a.mo26019b(agyt.m55307c()).mo68431a("%s: ConsentFetch: enabled %s", (Object) "PeriodicService", cfmd.m140084d());
        if (cfmd.m140084d()) {
            agpk a = agpk.m54726a();
            Long b = a.mo35839b(agyq.m55288i(context));
            bxyk c = a.mo35842c(b);
            int i = 0;
            if (c == null || bxzr.m124573a(bxzt.m124579a(c, bxzt.m124580a(System.currentTimeMillis())), bxzr.m124576a(cfmd.f184339a.mo6606a().mo81453e(), 0)) > 0 || a.mo35838b(b) == null) {
                j2 = cfmd.m140087g();
                j = cfmd.f184339a.mo6606a().mo81463o();
            } else {
                j2 = cfmd.f184339a.mo6606a().mo81469u();
                j = cfmd.f184339a.mo6606a().mo81468t();
            }
            f80303a.mo26019b(agyt.m55307c()).mo68425a("%s: ConsentFetch: interval %d flex %d.", "PeriodicService", Long.valueOf(j2), Long.valueOf(j));
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            aebl.f63099k = "mobiledataplan_consent_fetch";
            aebl.mo34023a(0);
            aebl.mo34027b(1);
            if (!cdny.m134349n()) {
                aebl.f63070a = j2;
                aebl.f63071b = j;
            } else {
                aebl.mo34009a(aebh.m51568a(j2));
            }
            if (cfmq.m140231b()) {
                i = agrl.m54949c();
                Bundle bundle = new Bundle();
                bundle.putInt("event_flow_id", i);
                aebl.f63107s = bundle;
            }
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
            agrl.m54943a(context).mo35983a(12, bygd.BACKGROUND_CONSENT_SCHEDULE, Integer.valueOf(i), (Long) null);
        }
    }

    /* renamed from: c */
    public static void m67292c(Context context) {
        f80303a.mo26019b(agyt.m55307c()).mo68426a("%s: BgWorkflow: enabled %s interval %d flex %d.", "PeriodicService", Boolean.valueOf(cflr.m139935l()), Long.valueOf(cflr.m139926c()), Long.valueOf(cflr.m139925b()));
        if (cflr.m139935l()) {
            Bundle bundle = new Bundle();
            if (cflr.m139927d()) {
                bundle.putLong("task_interval_key", cflr.m139926c());
                bundle.putLong("task_flex_key", cflr.m139925b());
            }
            agrl a = agrl.m54942a();
            long c = cflr.m139926c();
            long b = cflr.m139925b();
            boot a2 = a.mo35978a(20, "GTAF_Server", "MDP_PeriodicService");
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a2);
            bxvd da = bonz.f133873h.mo74144da();
            bxzu bxzu = bxzu.EVENT_MODULE_INITIALIZED;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bonz) da.f164949b).f133875a = bxzu.mo3214a();
            bxvd da2 = bonw.f133865c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonw bonw = (bonw) da2.f164949b;
            bonw.f133867a = c;
            bonw.f133868b = b;
            bonw bonw2 = (bonw) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bonw2.getClass();
            ((bonz) da.f164949b).f133877c = bonw2;
            bonz bonz = (bonz) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            bonz.getClass();
            ((boot) bxvd.f164949b).f134017t = bonz;
            a.mo35994a((boot) bxvd.mo74062i(), bygd.SCHEDULE_PERIODIC_WORKFLOW);
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            aebl.f63099k = "mobiledataplan_bg_periodic_checker";
            aebl.mo34023a(0);
            aebl.mo34027b(1);
            aebl.f63107s = bundle;
            long c2 = cflr.m139926c();
            long b2 = cflr.m139925b();
            if (!cdny.m134349n()) {
                aebl.f63070a = c2;
                aebl.f63071b = b2;
            } else {
                aebl.mo34009a(aebh.m51568a(c2));
            }
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
        }
    }

    public ChimeraPeriodicUpdaterService(agph agph, Context context) {
        this();
        this.f80311j = agph;
        this.f80312k = context;
    }

    /* renamed from: a */
    public static void m67284a(Context context, int i) {
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        aebi.f63099k = "mobiledataplan_consent_status_conversion";
        aebi.mo34004a(cfmj.m140153b(), cfmj.m140154c());
        aebi.mo34023a(2);
        aebi.mo34027b(1);
        Bundle bundle = new Bundle();
        bundle.putInt("event_flow_id", i);
        aebi.f63107s = bundle;
        cfmj.m140153b();
        cfmj.m140154c();
        agrl.m54942a().mo36005a(bygd.CONSENT_STATUS_CONVERSION_SCHEDULED, Integer.valueOf(i));
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: b */
    private static void m67291b(Context context, long j, long j2, boom boom) {
        new agrt().start();
        m67287a(context, j, j2, boom, Integer.valueOf(agrl.m54949c()));
    }

    /* renamed from: a */
    public static void m67285a(Context context, long j, long j2, boom boom) {
        m67286a(context, j, j2, boom, booa.f133882e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agrl.a(booc, java.lang.String, java.lang.Integer):void
     arg types: [booc, java.lang.String, int]
     candidates:
      agrl.a(int, java.lang.String, java.lang.String):boot
      agrl.a(int, boom, booa):void
      agrl.a(int, java.lang.Integer, java.lang.Long):void
      agrl.a(booj, java.lang.Integer, java.lang.Long):void
      agrl.a(boot, bygd, java.lang.Integer):void
      agrl.a(bopn, bygd, java.lang.Integer):void
      agrl.a(bxzv, int, int):void
      agrl.a(bygd, java.lang.String, java.lang.String):void
      agrl.a(java.lang.String, int, long):void
      agrl.a(booc, java.lang.String, java.lang.Integer):void */
    /* renamed from: a */
    public static void m67286a(Context context, long j, long j2, boom boom, booa booa) {
        bxvd bxvd;
        Long f;
        bxzz h;
        boom boom2 = boom;
        booa booa2 = booa;
        if (cfmv.m140313l()) {
            if (cflx.f184311a.mo6606a().mo81432j()) {
                String i = agyq.m55288i(context);
                if ((boom2 == boom.ACTIVE_SIM_SWITCH_EVENT || boom2 == boom.SIM_CHANGE_EVENT || (cfmd.f184339a.mo6606a().mo81458j() && boom2 == boom.MODULE_INIT_EVENT)) && i != null && !"1234567890987654321".equals(i) && (f = agpk.m54726a().mo35846f(i)) != null && f.longValue() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) && f.longValue() - cfmd.f184339a.mo6606a().mo81454f() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    agpw a = agpk.m54726a().f66242a.mo35854a(i);
                    Long l = null;
                    if (!(a == null || (h = a.mo35917h()) == null)) {
                        l = Long.valueOf(h.f165215c);
                    }
                    if (l != null && l.longValue() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) && l.longValue() < f.longValue()) {
                        if (cfmq.m140236g()) {
                            bxvd bxvd2 = (bxvd) booa2.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) booa2);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            booa booa3 = booa.f133882e;
                            ((booa) bxvd2.f164949b).f133887d = true;
                            agrl.m54942a().mo35981a(10, boom2, (booa) bxvd2.mo74062i());
                            return;
                        }
                        return;
                    }
                }
                if (i != null) {
                    agpk a2 = agpk.m54726a();
                    Long valueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j);
                    if (a2.f66242a.mo35854a(i) == null || a2.f66242a.mo35854a(i).mo35917h() == null) {
                        bxvd = bxzz.f165211e.mo74144da();
                    } else {
                        bxzz h2 = a2.f66242a.mo35854a(i).mo35917h();
                        bxvd = (bxvd) h2.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) h2);
                    }
                    agpv agpv = new agpv();
                    agpv.mo35908b(i);
                    long longValue = valueOf.longValue();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bxzz bxzz = bxzz.f165211e;
                    ((bxzz) bxvd.f164949b).f165215c = longValue;
                    agpv.mo35902a((bxzz) bxvd.mo74062i());
                    boolean a3 = a2.f66242a.mo35857a(agpv.mo35900a());
                    if (cfmq.m140237h()) {
                        agrl a4 = agrl.m54942a();
                        bxvd da = booc.f133888c.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((booc) da.f164949b).f133890a = boob.m111380a(4);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((booc) da.f164949b).f133891b = a3;
                        a4.mo35992a((booc) da.mo74062i(), "MDP_PeriodicService", (Integer) 0);
                    }
                }
            }
            if (cfmq.m140236g()) {
                agrl.m54942a().mo35981a(3, boom2, booa2);
            }
            m67291b(context, j, j2, boom);
        }
    }

    /* renamed from: a */
    private static void m67287a(Context context, long j, long j2, boom boom, Integer num) {
        int i;
        if (cfmq.m140231b()) {
            i = num.intValue();
        } else {
            i = 0;
        }
        agrl a = agrl.m54943a(context);
        boot a2 = a.mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a2);
        bxvd da = boon.f133951i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boon) da.f164949b).f133953a = bool.m111393a(3);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boon boon = (boon) da.f164949b;
        boon.f133956d = j;
        boon.f133954b = boom.mo3214a();
        boon boon2 = (boon) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        boon2.getClass();
        ((boot) bxvd.f164949b).f134013p = boon2;
        a.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_SCHEDULE, Integer.valueOf(i));
        Bundle bundle = new Bundle();
        bundle.putInt("cpid_update_cause", boom.mo3214a());
        bundle.putInt("event_flow_id", i);
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        aebl.f63107s = bundle;
        aebl.f63099k = "mobiledataplan_cpid_refresher";
        aebl.mo34023a(0);
        aebl.mo34027b(1);
        if (cdny.m134349n()) {
            double h = cdnj.m134212h();
            double d = (double) j;
            Double.isNaN(d);
            aebl.mo34008a(j, (long) (h * d), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        } else {
            aebl.f63070a = j;
            aebl.f63071b = j2;
        }
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
        f80303a.mo26019b(agyt.m55307c()).mo68427a("%s: CpidFetch: interval %d flex %d. Service %b Update %b.", "PeriodicService", Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(cfmv.m140313l()), Boolean.valueOf(cfmv.m140317p()));
    }

    /* renamed from: a */
    public static void m67288a(Bundle bundle) {
        try {
            for (Map.Entry entry : new rtj(rpr.m34216b(), "mdp-stats-data", false, false).getAll().entrySet()) {
                if (entry.getValue().getClass() == Long.class) {
                    bundle.putLong((String) entry.getKey(), ((Long) entry.getValue()).longValue());
                }
            }
        } catch (rti e) {
            ((bnsl) f80303a.mo68388c()).mo68405a("SharedPreferences failed to populate stats.");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static final void m67289a(String str, boom boom, booa booa) {
        char c;
        int i;
        aeat.m51532a(rpr.m34216b()).mo33986a(str, "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService");
        switch (str.hashCode()) {
            case -1959874559:
                if (str.equals("mobiledataplan_bg_periodic_checker")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1712408421:
                if (str.equals("mobiledataplan_cpid_refresher")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 348189707:
                if (str.equals("mobiledataplan_consent_fetch")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 776613677:
                if (str.equals("mobiledataplan_register")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            i = c != 1 ? c != 2 ? c != 3 ? 18 : 17 : 16 : 15;
        } else {
            i = 14;
        }
        if (cfmq.f184403a.mo6606a().mo81525r()) {
            agrl.m54942a().mo35981a(i, boom, booa);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0221, code lost:
        if (r2 != p000.bygb.NOT_REQUIRED) goto L_0x0249;
     */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        Bundle bundle;
        int i;
        aecc aecc2 = aecc;
        String str = aecc2.f63128a;
        boolean z = true;
        switch (str.hashCode()) {
            case -1959874559:
                if (str.equals("mobiledataplan_bg_periodic_checker")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1712408421:
                if (str.equals("mobiledataplan_cpid_refresher")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 122567508:
                if (str.equals("mobiledataplan_consent_status_conversion")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 348189707:
                if (str.equals("mobiledataplan_consent_fetch")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 776613677:
                if (str.equals("mobiledataplan_register")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            Long l = null;
            if (c == 1) {
                f80303a.mo26019b(agyt.m55307c()).mo68426a("%s: GcoreRegister: exec schedule:%b update:%b disableLegacy:%b", "PeriodicService", Boolean.valueOf(cflx.m140019f()), Boolean.valueOf(cflx.m140017d()), Boolean.valueOf(cflr.m139937n()));
                synchronized (this.f80309h) {
                    if (this.f80312k == null) {
                        this.f80312k = getApplicationContext();
                    }
                }
                if (cflr.m139937n() || !cflx.m140019f() || !cflx.m140017d()) {
                    f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: GcoreRegister: skip exec", "PeriodicService");
                    if (cflr.m139937n() || (cflr.m139928e() && agyq.m55287h(this.f80312k) == null)) {
                        f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: GcoreRegister: cancel task", "PeriodicService");
                        m67289a("mobiledataplan_register", boom.UPDATE_DISABLED, booa.f133882e);
                        return 2;
                    }
                    m67283a(this.f80312k);
                    return 0;
                }
                String i2 = agyq.m55288i(this.f80312k);
                String e = agpk.m54726a().mo35845e(i2);
                if (e != null) {
                    l = agpk.m54726a().mo35851k(e);
                } else {
                    e = "dummy_cpid_before_retrieval";
                }
                if (l == null) {
                    l = agth.f66446a;
                }
                agta agta = new agta();
                agta.f66418a = this.f80312k;
                agta.f66419b = "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4";
                agta.f66420c = l;
                agta.f66421d = e;
                agta.f66422e = agpk.m54726a().mo35849i(i2);
                agta.f66425h = 5;
                agtb a = agta.mo36075a();
                if (cfmq.m140231b() && (bundle = aecc2.f63129b) != null) {
                    int i3 = bundle.getInt("event_flow_id");
                    agta agta2 = new agta(a);
                    agta2.f66423f = Integer.valueOf(i3);
                    a = agta2.mo36075a();
                }
                boolean a2 = a.mo36076a();
                if (a2) {
                    f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: GcoreRegister: completed.", "PeriodicService");
                }
                m67283a(this.f80312k);
                return !a2 ? 2 : 0;
            } else if (c == 2) {
                f80303a.mo26019b(agyt.m55307c()).mo68425a("%s: ConsentFetch: exec service %b enabled %b", "PeriodicService", Boolean.valueOf(cfmv.m140313l()), Boolean.valueOf(cfmd.m140084d()));
                synchronized (this.f80309h) {
                    if (this.f80312k == null) {
                        this.f80312k = getApplicationContext();
                    }
                }
                if (!cfmd.m140084d()) {
                    f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: ConsentFetch: skip exec", "PeriodicService");
                    if (!cflr.m139928e() || agyq.m55287h(this.f80312k) != null) {
                        return 0;
                    }
                    f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: ConsentFetch: cancel task", "PeriodicService");
                    m67289a("mobiledataplan_consent_fetch", boom.UPDATE_DISABLED, booa.f133882e);
                    return 2;
                }
                Bundle bundle2 = aecc2.f63129b;
                Integer valueOf = bundle2 != null ? Integer.valueOf(bundle2.getInt("event_flow_id")) : null;
                bxzx j = agpk.m54726a().mo35850j(agyq.m55288i(this.f80312k));
                if (j != null) {
                    bygb a3 = bygb.m124774a(j.f165204f);
                    if (a3 == null) {
                        a3 = bygb.UNRECOGNIZED;
                    }
                    if (a3 != bygb.CONSENTED) {
                        bygb a4 = bygb.m124774a(j.f165204f);
                        if (a4 == null) {
                            a4 = bygb.UNRECOGNIZED;
                        }
                    }
                    f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: ConsentFetch: Skipping unnecessary background consent fetch", "PeriodicService");
                    m67290b(this.f80312k);
                    agrl.m54943a(this.f80312k).mo35983a(13, bygd.BACKGROUND_CONSENT_SCHEDULE, valueOf, (Long) null);
                    return 0;
                }
                agsm agsm = new agsm();
                agsm.f66369a = this.f80312k;
                agsm.f66370b = valueOf;
                agsm.f66371c = agyq.m55288i(this.f80312k);
                try {
                    aucu.m76782a(aucu.m76780a(snp.m35704b(10), new agso(agsm.f66369a, agsm.f66371c, agsm.f66370b)));
                } catch (ExecutionException e2) {
                    bnsl bnsl = (bnsl) f80303a.mo68387b();
                    bnsl.mo68437a(e2);
                    bnsl.mo68405a("ExecutionException during background consent fetch");
                    z = false;
                } catch (InterruptedException e3) {
                    bnsl bnsl2 = (bnsl) f80303a.mo68388c();
                    bnsl2.mo68437a(e3);
                    bnsl2.mo68405a("InterruptedException while waiting for background consent fetch");
                    z = false;
                }
                if (z) {
                    f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: ConsentFetch: completed.", "PeriodicService");
                }
                m67290b(this.f80312k);
                return !z ? 2 : 0;
            } else if (c == 3) {
                f80303a.mo26019b(agyt.m55307c()).mo68424a("%s: BgWorkflow: exec enabled: %s", "PeriodicService", bryx.m114908a(Boolean.valueOf(cflr.m139933j())));
                synchronized (this.f80309h) {
                    if (this.f80312k == null) {
                        this.f80312k = getApplicationContext();
                    }
                }
                Bundle bundle3 = aecc2.f63129b;
                if (!cflr.m139927d() || bundle3 == null || bundle3.getLong("task_interval_key") != cflr.m139926c() || bundle3.getLong("task_flex_key") != cflr.m139925b()) {
                    f80303a.mo26019b(agyt.m55307c()).mo68425a("%s: BgWorkflow: changed interval %d flex %d", "PeriodicService", Long.valueOf(cflr.m139926c()), Long.valueOf(cflr.m139925b()));
                    m67292c(this.f80312k);
                }
                if (cflr.m139933j()) {
                    agsl a5 = agsl.m55046a();
                    a5.f66368f.execute(new agsg(a5));
                } else {
                    f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: BgWorkflow: skip exec", "PeriodicService");
                    if (cflr.m139928e() && agyq.m55287h(this.f80312k) == null) {
                        f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: BgWorkflow: cancel task", "PeriodicService");
                        m67289a("mobiledataplan_bg_periodic_checker", boom.UPDATE_DISABLED, booa.f133882e);
                        return 2;
                    }
                }
                return 0;
            } else if (c != 4) {
                ((bnsl) f80303a.mo68388c()).mo68420a("Unknown periodic task tag: %s", new bryx(1, str));
                if (cflr.f184273a.mo6606a().mo81389c()) {
                    m67289a(aecc2.f63128a, boom.UPDATE_DISABLED, booa.f133882e);
                }
                return 2;
            } else {
                synchronized (this.f80309h) {
                    if (this.f80312k == null) {
                        this.f80312k = getApplicationContext();
                    }
                }
                Bundle bundle4 = aecc2.f63129b;
                if (bundle4 != null) {
                    i = bundle4.getInt("event_flow_id");
                } else {
                    i = 0;
                }
                return agrv.m55021a(this.f80312k, Integer.valueOf(i)) ? 0 : 2;
            }
        } else {
            cfmv.m140313l();
            cfmv.m140317p();
            Bundle bundle5 = aecc2.f63129b;
            boom boom = boom.UNKNOWN;
            if (bundle5 != null) {
                boom = boom.m111394a(bundle5.getInt("cpid_update_cause"));
                if (cfmq.m140231b()) {
                    this.f80310i = bundle5.getInt("event_flow_id");
                }
                f80303a.mo26019b(agyt.m55307c()).mo68425a("%s: CpidFetch: called w/ cause %s, event flow id %d", "PeriodicService", boom, Integer.valueOf(this.f80310i));
            } else if (cfmq.m140231b()) {
                this.f80310i = agrl.m54949c();
            }
            agrl a6 = agrl.m54943a(rpr.m34216b());
            int i4 = this.f80310i;
            boot a7 = a6.mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
            bxvd bxvd = (bxvd) a7.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a7);
            bxvd da = boon.f133951i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boon) da.f164949b).f133953a = bool.m111393a(4);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boon) da.f164949b).f133954b = boom.mo3214a();
            boon boon = (boon) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            boon.getClass();
            ((boot) bxvd.f164949b).f134013p = boon;
            a6.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_REQUEST, Integer.valueOf(i4));
            if (!cfmv.m140313l() || !cfmv.m140317p()) {
                f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: CpidFetch: skip exec", "PeriodicService");
                if (!cflr.m139928e() || agyq.m55287h(this.f80312k) != null) {
                    m67285a(rpr.m34216b(), cfmv.m140300C(), cfmv.m140298A(), boom.UPDATE_DISABLED);
                    return 0;
                }
                f80303a.mo26019b(agyt.m55307c()).mo68420a("%s: CpidFetch: cancel task", "PeriodicService");
                m67289a("mobiledataplan_cpid_refresher", boom.UPDATE_DISABLED, booa.f133882e);
                return 2;
            }
            synchronized (this.f80309h) {
                if (this.f80312k == null) {
                    this.f80312k = getApplicationContext();
                }
                if (this.f80311j == null) {
                    this.f80311j = agpg.m54719a(this.f80312k, agpe.m54718a());
                }
            }
            agoj agoj = new agoj();
            agoj.mo35775a("AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4");
            agoj.mo35774a(Integer.valueOf(this.f80310i));
            mo44109a(agoj.f66175a, this.f80311j);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0144 A[SYNTHETIC, Splitter:B:50:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015d A[RETURN] */
    /* renamed from: a */
    public final void mo44109a(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest, agph agph) {
        int i;
        bxvd bxvd;
        bxvd da;
        bxvd da2;
        int i2;
        rti e;
        aucb a = agph.mo35768a(mdpCarrierPlanIdRequest);
        a.mo50373a((aubw) this);
        a.mo50372a((aubt) this);
        synchronized (this.f80313l) {
            int n = (int) cfmv.f184430a.mo6606a().mo81589n();
            long j = -1;
            if (n > 0) {
                boolean z = true;
                try {
                    rtj rtj = new rtj(rpr.m34216b(), "mdp-svc-data", true, false);
                    boolean z2 = rtj.getBoolean("retry-active", false);
                    if (!z2) {
                        try {
                            SharedPreferences.Editor edit = rtj.edit();
                            edit.putInt("retry-count", 1);
                            edit.putBoolean("retry-active", true);
                            edit.apply();
                            i = 0;
                        } catch (rti e2) {
                            e = e2;
                            z = z2;
                            i2 = 0;
                            bnsl bnsl = (bnsl) f80303a.mo68388c();
                            bnsl.mo68437a(e);
                            bnsl.mo68405a("SharedPreferences failed to update retry backoff status.");
                            i = i2;
                            f80303a.mo26019b(agyt.m55307c()).mo68409a("Retry %d", i);
                            agrl a2 = agrl.m54943a(rpr.m34216b());
                            long g = cfmv.m140308g();
                            int i3 = this.f80310i;
                            boot a3 = a2.mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
                            bxvd = (bxvd) a3.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) a3);
                            da = book.f133933e.mo74144da();
                            if (da.f164950c) {
                            }
                            book book = (book) da.f164949b;
                            book.f133935a = n;
                            book.f133936b = z;
                            book.f133937c = i;
                            book.f133938d = g;
                            book book2 = (book) da.mo74062i();
                            da2 = boon.f133951i.mo74144da();
                            if (da2.f164950c) {
                            }
                            ((boon) da2.f164949b).f133953a = bool.m111393a(7);
                            if (da2.f164950c) {
                            }
                            book2.getClass();
                            ((boon) da2.f164949b).f133958f = book2;
                            boon boon = (boon) da2.mo74062i();
                            if (bxvd.f164950c) {
                            }
                            boot boot = boot.f133997z;
                            boon.getClass();
                            ((boot) bxvd.f164949b).f134013p = boon;
                            a2.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_REQUEST, Integer.valueOf(i3));
                            j = cfmv.m140308g() << i;
                            this.f80314m = j;
                            if (!cflu.f184297a.mo6606a().mo81414e()) {
                            }
                        }
                        f80303a.mo26019b(agyt.m55307c()).mo68409a("Retry %d", i);
                        agrl a22 = agrl.m54943a(rpr.m34216b());
                        long g2 = cfmv.m140308g();
                        int i32 = this.f80310i;
                        boot a32 = a22.mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
                        bxvd = (bxvd) a32.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) a32);
                        da = book.f133933e.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        book book3 = (book) da.f164949b;
                        book3.f133935a = n;
                        book3.f133936b = z;
                        book3.f133937c = i;
                        book3.f133938d = g2;
                        book book22 = (book) da.mo74062i();
                        da2 = boon.f133951i.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ((boon) da2.f164949b).f133953a = bool.m111393a(7);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        book22.getClass();
                        ((boon) da2.f164949b).f133958f = book22;
                        boon boon2 = (boon) da2.mo74062i();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        boot boot2 = boot.f133997z;
                        boon2.getClass();
                        ((boot) bxvd.f164949b).f134013p = boon2;
                        a22.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_REQUEST, Integer.valueOf(i32));
                        j = cfmv.m140308g() << i;
                    } else {
                        try {
                            i = rtj.getInt("retry-count", Integer.MAX_VALUE);
                            if (i < n) {
                                try {
                                    SharedPreferences.Editor edit2 = rtj.edit();
                                    edit2.putInt("retry-count", i + 1);
                                    edit2.apply();
                                } catch (rti e3) {
                                    z = z2;
                                    i2 = i;
                                    e = e3;
                                }
                                f80303a.mo26019b(agyt.m55307c()).mo68409a("Retry %d", i);
                                agrl a222 = agrl.m54943a(rpr.m34216b());
                                long g22 = cfmv.m140308g();
                                int i322 = this.f80310i;
                                boot a322 = a222.mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
                                bxvd = (bxvd) a322.mo74142c(5);
                                bxvd.mo73625a((GeneratedMessageLite) a322);
                                da = book.f133933e.mo74144da();
                                if (da.f164950c) {
                                }
                                book book32 = (book) da.f164949b;
                                book32.f133935a = n;
                                book32.f133936b = z;
                                book32.f133937c = i;
                                book32.f133938d = g22;
                                book book222 = (book) da.mo74062i();
                                da2 = boon.f133951i.mo74144da();
                                if (da2.f164950c) {
                                }
                                ((boon) da2.f164949b).f133953a = bool.m111393a(7);
                                if (da2.f164950c) {
                                }
                                book222.getClass();
                                ((boon) da2.f164949b).f133958f = book222;
                                boon boon22 = (boon) da2.mo74062i();
                                if (bxvd.f164950c) {
                                }
                                boot boot22 = boot.f133997z;
                                boon22.getClass();
                                ((boot) bxvd.f164949b).f134013p = boon22;
                                a222.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_REQUEST, Integer.valueOf(i322));
                                j = cfmv.m140308g() << i;
                            }
                        } catch (rti e4) {
                            e = e4;
                            z = z2;
                            i2 = -1;
                            bnsl bnsl2 = (bnsl) f80303a.mo68388c();
                            bnsl2.mo68437a(e);
                            bnsl2.mo68405a("SharedPreferences failed to update retry backoff status.");
                            i = i2;
                            f80303a.mo26019b(agyt.m55307c()).mo68409a("Retry %d", i);
                            agrl a2222 = agrl.m54943a(rpr.m34216b());
                            long g222 = cfmv.m140308g();
                            int i3222 = this.f80310i;
                            boot a3222 = a2222.mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
                            bxvd = (bxvd) a3222.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) a3222);
                            da = book.f133933e.mo74144da();
                            if (da.f164950c) {
                            }
                            book book322 = (book) da.f164949b;
                            book322.f133935a = n;
                            book322.f133936b = z;
                            book322.f133937c = i;
                            book322.f133938d = g222;
                            book book2222 = (book) da.mo74062i();
                            da2 = boon.f133951i.mo74144da();
                            if (da2.f164950c) {
                            }
                            ((boon) da2.f164949b).f133953a = bool.m111393a(7);
                            if (da2.f164950c) {
                            }
                            book2222.getClass();
                            ((boon) da2.f164949b).f133958f = book2222;
                            boon boon222 = (boon) da2.mo74062i();
                            if (bxvd.f164950c) {
                            }
                            boot boot222 = boot.f133997z;
                            boon222.getClass();
                            ((boot) bxvd.f164949b).f134013p = boon222;
                            a2222.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_REQUEST, Integer.valueOf(i3222));
                            j = cfmv.m140308g() << i;
                            this.f80314m = j;
                            if (!cflu.f184297a.mo6606a().mo81414e()) {
                            }
                        }
                    }
                } catch (rti e5) {
                    e = e5;
                    i2 = -1;
                    bnsl bnsl22 = (bnsl) f80303a.mo68388c();
                    bnsl22.mo68437a(e);
                    bnsl22.mo68405a("SharedPreferences failed to update retry backoff status.");
                    i = i2;
                    f80303a.mo26019b(agyt.m55307c()).mo68409a("Retry %d", i);
                    agrl a22222 = agrl.m54943a(rpr.m34216b());
                    long g2222 = cfmv.m140308g();
                    int i32222 = this.f80310i;
                    boot a32222 = a22222.mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
                    bxvd = (bxvd) a32222.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a32222);
                    da = book.f133933e.mo74144da();
                    if (da.f164950c) {
                    }
                    book book3222 = (book) da.f164949b;
                    book3222.f133935a = n;
                    book3222.f133936b = z;
                    book3222.f133937c = i;
                    book3222.f133938d = g2222;
                    book book22222 = (book) da.mo74062i();
                    da2 = boon.f133951i.mo74144da();
                    if (da2.f164950c) {
                    }
                    ((boon) da2.f164949b).f133953a = bool.m111393a(7);
                    if (da2.f164950c) {
                    }
                    book22222.getClass();
                    ((boon) da2.f164949b).f133958f = book22222;
                    boon boon2222 = (boon) da2.mo74062i();
                    if (bxvd.f164950c) {
                    }
                    boot boot2222 = boot.f133997z;
                    boon2222.getClass();
                    ((boot) bxvd.f164949b).f134013p = boon2222;
                    a22222.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_REQUEST, Integer.valueOf(i32222));
                    j = cfmv.m140308g() << i;
                    this.f80314m = j;
                    if (!cflu.f184297a.mo6606a().mo81414e()) {
                    }
                }
            }
            this.f80314m = j;
        }
        if (!cflu.f184297a.mo6606a().mo81414e()) {
            try {
                aucu.m76783a(a, cflu.f184297a.mo6606a().mo81413d(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e6) {
                mo10476a(e6);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        long j;
        String str;
        synchronized (this.f80313l) {
            j = this.f80314m;
        }
        boolean z = exc instanceof rjp;
        agrl.m54943a(rpr.m34216b()).mo35989a((long) (z ? ((rjp) exc).mo24655a() : 13), j, this.f80310i, 0);
        if (z) {
            rjp rjp = (rjp) exc;
            bnsl a = f80303a.mo26019b(agyt.m55307c());
            int a2 = rjp.mo24655a();
            int a3 = rjp.mo24655a();
            if (a3 == 27100) {
                str = "MDP_NOT_IMPLEMENTED";
            } else if (a3 != 27101) {
                switch (a3) {
                    case 27000:
                        str = "MDP_INVALID_ARGUMENT";
                        break;
                    case 27001:
                        str = "MDP_UNSUPPORTED_CARRIER";
                        break;
                    case 27002:
                        str = "MDP_NOT_FOUND";
                        break;
                    case 27003:
                        str = "MDP_BAD_RESPONSE";
                        break;
                    case 27004:
                        str = "MDP_INVALID_API_KEY";
                        break;
                    case 27005:
                        str = "MDP_INVALID_CARRIER_PLAN_ID";
                        break;
                    case 27006:
                        str = "MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT";
                        break;
                    case 27007:
                        str = "MDP_SERVER_CARRIER_FAILURE";
                        break;
                    case 27008:
                        str = "MDP_SERVER_CARRIER_INVALID_RESPONSE";
                        break;
                    default:
                        switch (a3) {
                            case 27010:
                                str = "MDP_SERVER_GTAF_EMPTY_RESPONSE";
                                break;
                            case 27011:
                                str = "MDP_SERVER_GTAF_FAILURE";
                                break;
                            case 27012:
                                str = "MDP_SERVER_GTAF_RESOURCE_EXHAUSTED";
                                break;
                            case 27013:
                                str = "MDP_NOT_ENABLED";
                                break;
                            case 27014:
                                str = "MDP_EVENT_LISTENER_ALREADY_EXISTED";
                                break;
                            case 27015:
                                str = "MDP_EVENT_LISTENER_NOT_EXISTED";
                                break;
                            case 27016:
                                str = "MDP_INTERNAL_ERROR";
                                break;
                            case 27017:
                                str = "MDP_INCONSISTENT_CARRIER";
                                break;
                            case 27018:
                                str = "MDP_NO_NETWORK";
                                break;
                            case 27019:
                                str = "MDP_NOT_ON_CELLULAR";
                                break;
                            case 27020:
                                str = "MDP_BAD_CPID_END_POINT";
                                break;
                            case 27021:
                                str = "MDP_GET_MCC_MNC_FAILURE";
                                break;
                            case 27022:
                                str = "MDP_SERVER_GTAF_UNAVAILABLE";
                                break;
                            case 27023:
                                str = "MDP_REQUIRE_CONSENT";
                                break;
                            default:
                                switch (a3) {
                                    case 27030:
                                        str = "MDP_INSUFFICIENT_FUNDS";
                                        break;
                                    case 27031:
                                        str = "MDP_SERVER_GTAF_CANCELLED";
                                        break;
                                    case 27032:
                                        str = "MDP_SERVER_GTAF_UNKNOWN";
                                        break;
                                    case 27033:
                                        str = "MDP_SERVER_GTAF_INVALID_ARGUMENT";
                                        break;
                                    case 27034:
                                        str = "MDP_SERVER_GTAF_DEADLINE_EXCEEDED";
                                        break;
                                    default:
                                        switch (a3) {
                                            case 27036:
                                                str = "MDP_SERVER_GTAF_ALREADY_EXISTS";
                                                break;
                                            case 27037:
                                                str = "MDP_SERVER_GTAF_PERMISSION_DENIED";
                                                break;
                                            case 27038:
                                                str = "MDP_SERVER_GTAF_UNAUTHENTICATED";
                                                break;
                                            case 27039:
                                                str = "MDP_SERVER_GTAF_ABORTED";
                                                break;
                                            case 27040:
                                                str = "MDP_SERVER_GTAF_UNIMPLEMENTED";
                                                break;
                                            case 27041:
                                                str = "MDP_SERVER_GTAF_INTERNAL";
                                                break;
                                            case 27042:
                                                str = "MDP_SERVER_GTAF_DATA_LOSS";
                                                break;
                                            case 27043:
                                                str = "MDP_SERVER_UNHANDLED_GRPC_ERROR";
                                                break;
                                            case 27044:
                                                str = "MDP_NOT_ON_CELLULAR_PRECHECK";
                                                break;
                                            case 27045:
                                                str = "MDP_NOT_ON_CELLULAR_TIMEOUT";
                                                break;
                                            case 27046:
                                                str = "MDP_NOT_ON_CELLULAR_UNAVAILABLE";
                                                break;
                                            case 27047:
                                                str = "MDP_NOT_ON_CELLULAR_PERMISSION_DENIED";
                                                break;
                                            case 27048:
                                                str = "MDP_INCONSISTENT_CARRIER_MISSING_ID";
                                                break;
                                            case 27049:
                                                str = "MDP_SYSTEM_SERVICE_UNAVAILABLE";
                                                break;
                                            case 27050:
                                                str = "MDP_CACHE_PUT_FAILURE";
                                                break;
                                            case 27051:
                                                str = "MDP_SERVER_CARRIER_FAILURE_AFTER_CONNECTING";
                                                break;
                                            case 27052:
                                                str = "MDP_SERVER_GTAF_FAILURE_ASYNC";
                                                break;
                                            case 27053:
                                                str = "MDP_SERVER_CARRIER_INVALID_TTL";
                                                break;
                                            case 27054:
                                                str = "MDP_MCC_MNC_UNSUPPORTED";
                                                break;
                                            case 27055:
                                                str = "MDP_MCC_MNC_UNSUPPORTED_BY_CLIENT";
                                                break;
                                            default:
                                                str = rjs.m33677c(a3);
                                                break;
                                        }
                                }
                        }
                }
            } else {
                str = "MDP_MODULE_DISABLED";
            }
            a.mo68413a("Status code %d (%s)", a2, (Object) str);
            if (!f80304b.contains(Integer.valueOf(rjp.mo24655a()))) {
                if (j > 0) {
                    long max = Math.max(TimeUnit.MILLISECONDS.toSeconds(Math.min(j, cfmv.f184430a.mo6606a().mo81588m())), cfmv.m140302E());
                    m67287a(this.f80312k, max, max >> 2, boom.FAILED_UPDATE, Integer.valueOf(this.f80310i));
                    bnsl a4 = f80303a.mo26019b(agyt.m55307c());
                    a4.mo68437a(exc);
                    a4.mo68415a("Recoverable error, retry scheduled in %d seconds", max);
                    return;
                }
                bnsl a5 = f80303a.mo26019b(agyt.m55307c());
                a5.mo68437a(exc);
                a5.mo68405a("Error, no (further) retry scheduled");
                m67285a(this.f80312k, cfmv.m140300C(), cfmv.m140298A(), boom.FAILED_UPDATE);
                return;
            }
        }
        bnsl a6 = f80303a.mo26019b(agyt.m55307c());
        a6.mo68437a(exc);
        a6.mo68405a("Terminal error, cancelling further retries");
        this.f80308g.incrementAndGet();
        LinkedBlockingQueue linkedBlockingQueue = this.f80305c;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.offer(new Pair("failure-count", 1L));
        }
        m67285a(this.f80312k, cfmv.m140300C(), cfmv.m140298A(), boom.FAILED_UPDATE);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.Integer]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        long j;
        long j2;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = (MdpCarrierPlanIdResponse) obj;
        f80303a.mo26019b(agyt.m55307c()).mo68423a("%s: CpidFetch: success with ttl of %d.", "PeriodicService", mdpCarrierPlanIdResponse.f80152b);
        this.f80307e.incrementAndGet();
        LinkedBlockingQueue linkedBlockingQueue = this.f80305c;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.offer(new Pair("success-count", 1L));
        }
        long j3 = mdpCarrierPlanIdResponse.f80152b >> 1;
        long A = cfmv.m140298A();
        if (j3 > cfmv.m140300C()) {
            j2 = cfmv.m140300C();
            j = A;
        } else {
            if (j3 < cfmv.m140302E()) {
                j3 = cfmv.m140302E();
                A = cfmv.f184430a.mo6606a().mo81572an();
            }
            j2 = j3;
            j = A;
        }
        if (cfmq.m140231b()) {
            Integer num = mdpCarrierPlanIdResponse.f80159i;
            if (num == null || num.intValue() == 0) {
                agol agol = new agol(mdpCarrierPlanIdResponse);
                agol.f66183h = Integer.valueOf(this.f80310i);
                mdpCarrierPlanIdResponse = agol.mo35778a();
            } else if (mdpCarrierPlanIdResponse.f80159i.intValue() != this.f80310i) {
                ((bnsl) f80303a.mo68388c()).mo68413a("Received MdpCarrierPlanIdResponse in periodic updater service w/ different cpidRefreshEventFlowId than was sent (request ID: %d, response ID: %d", this.f80310i, (Object) mdpCarrierPlanIdResponse.f80159i);
            }
        }
        agrl a = agrl.m54943a(rpr.m34216b());
        boot a2 = a.mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a2);
        bxvd da = booo.f133961c.mo74144da();
        String str = mdpCarrierPlanIdResponse.f80151a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        booo booo = (booo) da.f164949b;
        str.getClass();
        booo.f133963a = str;
        booo.f133964b = mdpCarrierPlanIdResponse.f80152b;
        booo booo2 = (booo) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        booo2.getClass();
        ((boot) bxvd.f164949b).f134004g = booo2;
        bxvd da2 = boon.f133951i.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((boon) da2.f164949b).f133953a = bool.m111393a(5);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((boon) da2.f164949b).f133956d = j2;
        boon boon = (boon) da2.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boon.getClass();
        ((boot) bxvd.f164949b).f134013p = boon;
        a.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_RESPONSE_SUCCESS, mdpCarrierPlanIdResponse.f80159i);
        m67291b(this.f80312k, j2, j, boom.SUCCESSFUL_UPDATE);
    }
}
