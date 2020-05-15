package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: agsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agsq implements Callable {

    /* renamed from: a */
    private static final srn f66379a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private final Context f66380b;

    /* renamed from: c */
    private final int f66381c;

    /* renamed from: d */
    private final long f66382d;

    /* renamed from: e */
    private Long f66383e;

    /* renamed from: f */
    private agrl f66384f;

    public agsq(Context context, Integer num) {
        this.f66380b = context;
        this.f66381c = num == null ? agrl.m54949c() : num.intValue();
        this.f66382d = agrl.m54947b();
    }

    /* renamed from: a */
    private static boow m55056a(btaq btaq) {
        bxvd da = boow.f134030f.mo74144da();
        int b = bwcc.m121742b(btaq.f148038a);
        if (b == 0) {
            b = 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boow) da.f164949b).f134032a = bwcc.m121741a(b);
        long j = btaq.f148039b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boow) da.f164949b).f134033b = j;
        bxyk bxyk = btaq.f148041d;
        if (bxyk == null) {
            bxyk = bxyk.f165095c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxyk.getClass();
        ((boow) da.f164949b).f134034c = bxyk;
        bxyk bxyk2 = btaq.f148042e;
        if (bxyk2 == null) {
            bxyk2 = bxyk.f165095c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boow boow = (boow) da.f164949b;
        bxyk2.getClass();
        boow.f134035d = bxyk2;
        boow.f134036e = btaq.f148043f;
        return (boow) da.mo74062i();
    }

    /* renamed from: b */
    private final agrl m55057b() {
        if (this.f66384f == null) {
            this.f66384f = agrl.m54943a(this.f66380b);
        }
        return this.f66384f;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        int i;
        int i2;
        boolean z;
        bygb bygb;
        String str2 = "BgTaskGcoreRegister";
        f66379a.mo26019b(agyt.m55307c()).mo68420a("%s: call: start", str2);
        if (this.f66380b == null) {
            f66379a.mo26019b(agyt.m55307c()).mo68420a("%s: call: null context; quitting.", str2);
            return false;
        }
        String a = agqz.m54893a().mo35966a(this.f66380b);
        if (TextUtils.isEmpty(a)) {
            f66379a.mo26019b(agyt.m55307c()).mo68420a("%s: call: no GCM token.", str2);
            return false;
        }
        String e = agpk.m54726a().mo35845e(agyq.m55288i(this.f66380b));
        if (e != null) {
            this.f66383e = agpk.m54726a().mo35851k(e);
        } else {
            e = "dummy_cpid_before_retrieval";
        }
        if (this.f66383e == null) {
            this.f66383e = agth.f66446a;
        }
        agpk a2 = agpk.m54726a();
        booh booh = (booh) booj.f133916p.mo74144da();
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        a.getClass();
        ((booj) booh.f164949b).f133918a = a;
        String q = cfmv.m140318q();
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        q.getClass();
        ((booj) booh.f164949b).f133919b = q;
        int r = (int) cfmv.m140319r();
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        booj booj = (booj) booh.f164949b;
        booj.f133920c = r;
        booj.f133923f = booi.m111389a(2);
        String displayName = TimeZone.getDefault().getDisplayName();
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        displayName.getClass();
        ((booj) booh.f164949b).f133924g = displayName;
        for (agzc agzc : agyq.m55295p(this.f66380b)) {
            String a3 = agzc.mo36193a();
            String b = agzc.mo36194b();
            Long b2 = a2.mo35839b(a3);
            String e2 = a2.mo35845e(a3);
            if (b2 == null || b2.longValue() <= 0) {
                b2 = agth.f66446a;
            }
            if (TextUtils.isEmpty(e2)) {
                e2 = "dummy_cpid_before_retrieval";
            } else if (!a2.mo35849i(a3)) {
                e2 = "dummy_cpid_before_consent";
            }
            bopc bopc = (bopc) bopd.f134098i.mo74144da();
            String str3 = str2;
            long longValue = b2.longValue();
            if (bopc.f164950c) {
                bopc.mo74035c();
                bopc.f164950c = false;
            }
            bopd bopd = (bopd) bopc.f164949b;
            bopd.f134100a = longValue;
            e2.getClass();
            bopd.f134101b = e2;
            String substring = b.substring(0, 3);
            if (bopc.f164950c) {
                bopc.mo74035c();
                bopc.f164950c = false;
            }
            substring.getClass();
            ((bopd) bopc.f164949b).f134102c = substring;
            String substring2 = b.substring(3);
            if (bopc.f164950c) {
                bopc.mo74035c();
                bopc.f164950c = false;
            }
            substring2.getClass();
            ((bopd) bopc.f164949b).f134103d = substring2;
            boolean d = agzc.mo36196d();
            if (bopc.f164950c) {
                bopc.mo74035c();
                bopc.f164950c = false;
            }
            ((bopd) bopc.f164949b).f134104e = d;
            bxzx j = agpk.m54726a().mo35850j(a3);
            if (j == null) {
                bygb = bygb.NOT_ASKED;
            } else {
                bygb = bygb.m124774a(j.f165204f);
                if (bygb == null) {
                    bygb = bygb.UNRECOGNIZED;
                }
            }
            if (bopc.f164950c) {
                bopc.mo74035c();
                bopc.f164950c = false;
            }
            ((bopd) bopc.f164949b).f134105f = bygb.mo3214a();
            btas d2 = a2.mo35844d(a3);
            if (d2 != null) {
                long j2 = d2.f148047b;
                if (bopc.f164950c) {
                    bopc.mo74035c();
                    bopc.f164950c = false;
                }
                ((bopd) bopc.f164949b).f134106g = j2;
                bxwc bxwc = d2.f148046a;
                int size = bxwc.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bopc.mo68926a(m55056a((btaq) bxwc.get(i3)));
                }
            }
            booh.mo68921a(bopc);
            str2 = str3;
        }
        String str4 = str2;
        btas d3 = a2.mo35844d(agyq.m55288i(this.f66380b));
        if (d3 != null) {
            long j3 = d3.f148047b;
            if (booh.f164950c) {
                booh.mo74035c();
                booh.f164950c = false;
            }
            ((booj) booh.f164949b).f133926i = j3;
            bxwc bxwc2 = d3.f148046a;
            int size2 = bxwc2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                booh.mo68920a(m55056a((btaq) bxwc2.get(i4)));
            }
        }
        agrq agrq = new agrq();
        boolean b3 = agrq.mo36031b();
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        ((booj) booh.f164949b).f133928k = b3;
        boolean a4 = agrq.mo36028a("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT");
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        ((booj) booh.f164949b).f133931n = a4;
        boolean a5 = agrq.mo36028a("com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE");
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        ((booj) booh.f164949b).f133929l = a5;
        boolean a6 = agrq.mo36028a("com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER");
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        ((booj) booh.f164949b).f133930m = a6;
        m55057b().mo35993a((booj) booh.mo74062i(), Integer.valueOf(this.f66381c), Long.valueOf(this.f66382d));
        agry a7 = agrz.m55030a(this.f66380b, cfmv.m140318q(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", (int) cfmv.m140319r());
        if (cfmj.m140155d() && agtb.m55070b()) {
            if (agtb.m55069a(this.f66381c)) {
                agtb.m55068a(a7, e, this.f66383e.longValue(), this.f66381c);
            } else {
                ((bnsl) f66379a.mo68388c()).mo68405a("Set device consent record failed");
            }
        }
        btac btac = null;
        try {
            f66379a.mo26019b(agyt.m55307c()).mo68426a("%s: call: ignoreDefault %b, preferSys %b, registerAll %b", "BgTaskGcoreRegister", Boolean.valueOf(cflr.m139936m()), Boolean.valueOf(cfmn.m140201c()), Boolean.valueOf(cfmn.m140202d()));
            btac = a7.mo36040a(a, null, null, null, Integer.valueOf(this.f66381c), Long.valueOf(this.f66382d));
            str = str4;
            i = 0;
        } catch (gid e3) {
            str = str4;
            bnsl a8 = f66379a.mo26019b(agyt.m55307c());
            a8.mo68437a(e3);
            a8.mo68424a("%s: call: got auth exception %s.", str, bryx.m114908a(e3.getMessage()));
            i = 27009;
        } catch (chuw e4) {
            str = str4;
            bnsl a9 = f66379a.mo26019b(agyt.m55307c());
            a9.mo68437a(e4);
            a9.mo68424a("%s: call: got StatusException: %s", str, bryx.m114908a(agrs.m55019a(e4).f30116j));
            i = agrs.m55019a(e4).f30115i;
        } catch (IllegalArgumentException e5) {
            bnsl a10 = f66379a.mo26019b(agyt.m55307c());
            a10.mo68437a(e5);
            str = str4;
            a10.mo68424a("%s: call: invalid parameter(s): %s", str, bryx.m114908a(e5.getMessage()));
            i = 27004;
        }
        if (btac == null && i == 0) {
            ((bnsl) f66379a.mo68388c()).mo68420a("%s: call: Got null response from GTAF", str);
            i2 = 27010;
        } else {
            i2 = i;
        }
        if (btac == null) {
            z = false;
        } else {
            z = i2 == 0;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            bxwc bxwc3 = btac.f147933a;
            int size3 = bxwc3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                btbe btbe = (btbe) bxwc3.get(i5);
                bopc bopc2 = (bopc) bopd.f134098i.mo74144da();
                long j4 = btbe.f148107a;
                if (bopc2.f164950c) {
                    bopc2.mo74035c();
                    bopc2.f164950c = false;
                }
                bopd bopd2 = (bopd) bopc2.f164949b;
                bopd2.f134100a = j4;
                String str5 = btbe.f148110d;
                str5.getClass();
                bopd2.f134101b = str5;
                String str6 = btbe.f148108b;
                str6.getClass();
                bopd2.f134102c = str6;
                String str7 = btbe.f148109c;
                str7.getClass();
                bopd2.f134103d = str7;
                bopd2.f134104e = btbe.f148115i;
                bygb a11 = bygb.m124774a(btbe.f148113g);
                if (a11 == null) {
                    a11 = bygb.UNRECOGNIZED;
                }
                if (bopc2.f164950c) {
                    bopc2.mo74035c();
                    bopc2.f164950c = false;
                }
                ((bopd) bopc2.f164949b).f134105f = a11.mo3214a();
                btas btas = btbe.f148112f;
                if (btas == null) {
                    btas = btas.f148044c;
                }
                long j5 = btas.f148047b;
                if (bopc2.f164950c) {
                    bopc2.mo74035c();
                    bopc2.f164950c = false;
                }
                ((bopd) bopc2.f164949b).f134106g = j5;
                btas btas2 = btbe.f148112f;
                if (btas2 == null) {
                    btas2 = btas.f148044c;
                }
                bxwc bxwc4 = btas2.f148046a;
                int size4 = bxwc4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    bopc2.mo68926a(m55056a((btaq) bxwc4.get(i6)));
                }
                arrayList.add((bopd) bopc2.mo74062i());
            }
            m55057b().mo36013a(a, 19, i2, this.f66381c, this.f66382d, arrayList);
        } else {
            m55057b().mo36013a(a, 20, i2, this.f66381c, this.f66382d, (List) null);
        }
        if (z) {
            if (btac.f147935c != this.f66381c) {
                f66379a.mo26019b(agyt.m55307c()).mo68425a("%s: call: response had different eventFlowIds. Request: %s, Response: %s", str, Integer.valueOf(this.f66381c), Integer.valueOf(btac.f147935c));
            }
            if (btac.f147934b != this.f66382d) {
                f66379a.mo26019b(agyt.m55307c()).mo68425a("%s: call: response had different uniqueRequestId. Request: %s, Response: %s", str, Long.valueOf(this.f66382d), Long.valueOf(btac.f147934b));
            }
            new agza().mo36208a(bxzv.TASK_GCORE_REGISTER, bxzt.m124580a(System.currentTimeMillis()).f165097a);
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final boolean mo36063a() {
        f66379a.mo26019b(agyt.m55307c()).mo68420a("%s: runAndAwaitResult: start", "BgTaskGcoreRegister");
        try {
            return ((Boolean) aucu.m76782a(aucu.m76780a(snp.m35704b(10), this))).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            f66379a.mo26019b(agyt.m55307c()).mo68420a("%s: runAndAwaitResult: failed.", "BgTaskGcoreRegister");
            return false;
        }
    }
}
