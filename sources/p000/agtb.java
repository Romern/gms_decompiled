package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: agtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtb {

    /* renamed from: k */
    private static final srn f66426k = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public final Context f66427a;

    /* renamed from: b */
    public final String f66428b;

    /* renamed from: c */
    public final long f66429c;

    /* renamed from: d */
    public final String f66430d;

    /* renamed from: e */
    public final boolean f66431e;

    /* renamed from: f */
    public final int f66432f;

    /* renamed from: g */
    public final long f66433g;

    /* renamed from: h */
    public final int f66434h;

    /* renamed from: i */
    private agrl f66435i;

    /* renamed from: j */
    private final Object f66436j = new Object();

    public agtb(agta agta) {
        long j;
        this.f66427a = agta.f66418a;
        this.f66429c = agta.f66420c.longValue();
        this.f66430d = agta.f66421d;
        this.f66431e = agta.f66422e;
        this.f66428b = agta.f66419b;
        this.f66434h = agta.f66425h;
        int i = 0;
        if (cfmq.m140247r()) {
            Integer num = agta.f66423f;
            this.f66432f = num != null ? num.intValue() : i;
            Long l = agta.f66424g;
            if (l != null) {
                j = l.longValue();
            } else {
                j = agrl.m54947b();
            }
            this.f66433g = j;
            return;
        }
        this.f66432f = 0;
        this.f66433g = 0;
    }

    /* renamed from: a */
    private static boow m55066a(btaq btaq) {
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

    /* renamed from: c */
    private final agrl m55071c() {
        agrl agrl;
        synchronized (this.f66436j) {
            if (this.f66435i == null) {
                this.f66435i = agrl.m54943a(this.f66427a);
            }
            agrl = this.f66435i;
        }
        return agrl;
    }

    /* renamed from: b */
    public static boolean m55070b() {
        bxzy bxzy;
        bxzx c;
        long currentTimeMillis = System.currentTimeMillis();
        agpu b = agpk.m54726a().f66242a.mo35860b(1L);
        if (b != null) {
            bxzy = b.mo35898d();
        } else {
            bxzy = null;
        }
        if (!(bxzy == null || bxzy.f165210a == null || (c = agpk.m54726a().mo35843c()) == null)) {
            bxyk bxyk = bxzy.f165210a;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
            long a = bxzt.m124578a(bxyk);
            bygb a2 = bygb.m124774a(c.f165204f);
            if (a2 == null) {
                a2 = bygb.UNRECOGNIZED;
            }
            if (a2 != bygb.PENDING || currentTimeMillis - a < cfmj.m140164m()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final bygb m55067a(String str) {
        bxzx b = agpk.m54726a().mo35837b(Long.valueOf(this.f66429c), str);
        if (b == null) {
            return bygb.CONSENT_UNSPECIFIED;
        }
        bygb a = bygb.m124774a(b.f165204f);
        if (a == null) {
            return bygb.UNRECOGNIZED;
        }
        return a;
    }

    /* renamed from: a */
    public static void m55068a(agry agry, String str, long j, int i) {
        String str2 = str;
        long currentTimeMillis = System.currentTimeMillis();
        bxvd da = byge.f166289c.mo74144da();
        long mostSignificantBits = UUID.randomUUID().getMostSignificantBits();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((byge) da.f164949b).f166291a = mostSignificantBits;
        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((byge) da.f164949b).f166292b = leastSignificantBits;
        byge byge = (byge) da.mo74062i();
        long b = agrl.m54947b();
        try {
            agry.mo36043a(str, Long.valueOf(j), 7, bygb.OPT_IN, byge, Integer.valueOf(agpk.m54726a().mo35843c().f165206h), bxzt.m124580a(currentTimeMillis), Integer.valueOf(i), Long.valueOf(b));
        } catch (gid e) {
            bnsl bnsl = (bnsl) f66426k.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", bryx.m114908a(e.getMessage()));
            agrl.m54942a().mo36004a(bygd.BACKGROUND_SET_CONSENT_FAILURE, 27009, "MDP_BgTask", agqe.m54828a().mo35931a(str2, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4"), Integer.valueOf(i), Long.valueOf(b));
        } catch (chuw e2) {
            Status a = agrs.m55019a(e2);
            bnsl bnsl2 = (bnsl) f66426k.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68420a("StatusException while setting consent status: %s", bryx.m114908a(a));
            agrl.m54942a().mo36004a(bygd.BACKGROUND_SET_CONSENT_FAILURE, (long) a.f30115i, "MDP_BgTask", agqe.m54828a().mo35931a(str2, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4"), Integer.valueOf(i), Long.valueOf(b));
        }
        agrl.m54942a().mo36014a(str2, i, b);
        agrl.m54942a().mo36003a(bygd.BACKGROUND_SET_CONSENT_OPT_IN_AFTER_TIMEOUT, 20, "GTAF_Server", "MDP_BgTask");
    }

    /* renamed from: a */
    public static boolean m55069a(int i) {
        boolean a = agpk.m54726a().mo35828a(bygb.OPT_IN, "CLIENT_BackgroundService");
        if (cfmq.m140237h()) {
            agrl a2 = agrl.m54942a();
            bxvd da = booc.f133888c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booc) da.f164949b).f133890a = boob.m111380a(7);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booc) da.f164949b).f133891b = a;
            a2.mo35992a((booc) da.mo74062i(), "CLIENT_BackgroundService", Integer.valueOf(i));
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x067c  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0691  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x07f8  */
    /* renamed from: a */
    public final boolean mo36076a() {
        String str;
        int i;
        String str2;
        String str3;
        boolean z;
        btac btac;
        int i2;
        int i3;
        long j;
        btac btac2;
        boolean z2;
        String str4;
        int i4;
        int i5;
        booh booh;
        bxvd da;
        bxvd bxvd;
        Long l;
        String str5;
        f66426k.mo26019b(agyt.m55307c()).mo68426a("Exec GcoreRegister. req: <%s, %s> gcm:%b consentEnabled:%b", Long.valueOf(this.f66429c), this.f66430d, agqg.m54860o(), agqg.m54865t());
        if (!agqg.m54860o().booleanValue()) {
            ((bnsl) f66426k.mo68388c()).mo68405a("GCM is not enabled on device.");
            return false;
        }
        String a = agqz.m54893a().mo35966a(this.f66427a);
        if (TextUtils.isEmpty(a)) {
            ((bnsl) f66426k.mo68388c()).mo68405a("Unable to get a GCM token.");
            return false;
        }
        String q = cfmv.m140318q();
        int intValue = agqg.m54846a().intValue();
        if (!this.f66431e) {
            str = "dummy_cpid_before_consent";
        } else {
            str = this.f66430d;
        }
        agry a2 = agrz.m55030a(this.f66427a, q, this.f66428b, intValue);
        if (cfmj.m140155d() && m55070b()) {
            if (m55069a(this.f66432f)) {
                m55068a(a2, this.f66430d, this.f66429c, this.f66432f);
            } else {
                ((bnsl) f66426k.mo68388c()).mo68405a("Set device consent record failed");
            }
        }
        agpk a3 = agpk.m54726a();
        bygb a4 = m55067a(this.f66430d);
        if (cfmj.m140161j() && a3.mo35843c() != null && (a4 = bygb.m124774a(a3.mo35843c().f165204f)) == null) {
            a4 = bygb.UNRECOGNIZED;
        }
        booh booh2 = (booh) booj.f133916p.mo74144da();
        if (booh2.f164950c) {
            booh2.mo74035c();
            booh2.f164950c = false;
        }
        booj booj = (booj) booh2.f164949b;
        a.getClass();
        booj.f133918a = a;
        q.getClass();
        booj.f133919b = q;
        booj.f133920c = intValue;
        booj.f133921d = this.f66429c;
        str.getClass();
        booj.f133922e = str;
        booj.f133923f = booi.m111389a(this.f66434h);
        String displayName = TimeZone.getDefault().getDisplayName();
        if (booh2.f164950c) {
            booh2.mo74035c();
            booh2.f164950c = false;
        }
        booj booj2 = (booj) booh2.f164949b;
        displayName.getClass();
        booj2.f133924g = displayName;
        booj2.f133925h = a4.mo3214a();
        long j2 = 0;
        if (cfmn.m140202d()) {
            for (agzc agzc : agyq.m55295p(this.f66427a)) {
                String a5 = agzc.mo36193a();
                String b = agzc.mo36194b();
                boolean d = agzc.mo36196d();
                Long b2 = a3.mo35839b(a5);
                String e = a3.mo35845e(a5);
                if (b2 == null || b2.longValue() <= j2) {
                    l = Long.valueOf(!d ? agth.f66446a.longValue() : this.f66429c);
                } else {
                    l = b2;
                }
                if (TextUtils.isEmpty(e)) {
                    str5 = "dummy_cpid_before_retrieval";
                } else if (!a3.mo35849i(a5)) {
                    str5 = "dummy_cpid_before_consent";
                } else {
                    str5 = e;
                }
                bopc bopc = (bopc) bopd.f134098i.mo74144da();
                String str6 = q;
                int i6 = intValue;
                long longValue = l.longValue();
                if (bopc.f164950c) {
                    bopc.mo74035c();
                    bopc.f164950c = false;
                }
                bopd bopd = (bopd) bopc.f164949b;
                bopd.f134100a = longValue;
                str5.getClass();
                bopd.f134101b = str5;
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
                boolean d2 = agzc.mo36196d();
                if (bopc.f164950c) {
                    bopc.mo74035c();
                    bopc.f164950c = false;
                }
                ((bopd) bopc.f164949b).f134104e = d2;
                bygb a6 = m55067a(this.f66430d);
                if (bopc.f164950c) {
                    bopc.mo74035c();
                    bopc.f164950c = false;
                }
                ((bopd) bopc.f164949b).f134105f = a6.mo3214a();
                btas d3 = a3.mo35844d(a5);
                if (d3 != null) {
                    long j3 = d3.f148047b;
                    if (bopc.f164950c) {
                        bopc.mo74035c();
                        bopc.f164950c = false;
                    }
                    ((bopd) bopc.f164949b).f134106g = j3;
                    bxwc bxwc = d3.f148046a;
                    int size = bxwc.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        bopc.mo68926a(m55066a((btaq) bxwc.get(i7)));
                    }
                }
                booh2.mo68921a(bopc);
                q = str6;
                intValue = i6;
                j2 = 0;
            }
            str2 = q;
            i = intValue;
        } else {
            str2 = q;
            i = intValue;
        }
        btas d4 = a3.mo35844d(agyq.m55288i(this.f66427a));
        if (d4 != null) {
            long j4 = d4.f148047b;
            if (booh2.f164950c) {
                booh2.mo74035c();
                booh2.f164950c = false;
            }
            ((booj) booh2.f164949b).f133926i = j4;
            bxwc bxwc2 = d4.f148046a;
            int size2 = bxwc2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                booh2.mo68920a(m55066a((btaq) bxwc2.get(i8)));
            }
        }
        agrq agrq = new agrq();
        boolean b3 = agrq.mo36031b();
        if (booh2.f164950c) {
            booh2.mo74035c();
            booh2.f164950c = false;
        }
        ((booj) booh2.f164949b).f133928k = b3;
        boolean a7 = agrq.mo36028a("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT");
        if (booh2.f164950c) {
            booh2.mo74035c();
            booh2.f164950c = false;
        }
        ((booj) booh2.f164949b).f133931n = a7;
        boolean a8 = agrq.mo36028a("com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE");
        if (booh2.f164950c) {
            booh2.mo74035c();
            booh2.f164950c = false;
        }
        ((booj) booh2.f164949b).f133929l = a8;
        boolean a9 = agrq.mo36028a("com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER");
        if (booh2.f164950c) {
            booh2.mo74035c();
            booh2.f164950c = false;
        }
        ((booj) booh2.f164949b).f133930m = a9;
        m55071c().mo35993a((booj) booh2.mo74062i(), Integer.valueOf(this.f66432f), Long.valueOf(this.f66433g));
        boolean z3 = true;
        if (cfmq.m140242m()) {
            try {
                i3 = 5;
                try {
                    btac2 = a2.mo36040a(a, Long.valueOf(this.f66429c), str, this.f66430d, Integer.valueOf(this.f66432f), Long.valueOf(this.f66433g));
                    j = 0;
                } catch (gid e2) {
                    e = e2;
                    bnsl a10 = f66426k.mo26019b(agyt.m55307c());
                    a10.mo68437a(e);
                    a10.mo68420a("GCoreRegister attempt got auth exception %s.", bryx.m114908a(e.getMessage()));
                    j = 27009;
                    btac2 = null;
                    ((bnsl) f66426k.mo68388c()).mo68405a("Got null response when attempting GcoreRegister");
                    j = 27010;
                    if (btac2 != null) {
                    }
                    if (j == 0) {
                    }
                    String str7 = "GTAF_Server";
                    if (!cfmn.m140202d()) {
                    }
                    agrl c = m55071c();
                    long j5 = this.f66429c;
                    if (j == 0) {
                    }
                    int i9 = this.f66434h;
                    Integer valueOf = Integer.valueOf(this.f66432f);
                    String str8 = str4;
                    Long valueOf2 = Long.valueOf(this.f66433g);
                    booh = (booh) booj.f133916p.mo74144da();
                    String b4 = agyt.m55303b(stm.m36299a(str3));
                    if (booh.f164950c) {
                    }
                    booj booj3 = (booj) booh.f164949b;
                    b4.getClass();
                    booj3.f133918a = b4;
                    str2.getClass();
                    booj3.f133919b = str2;
                    booj3.f133920c = i4;
                    booj3.f133921d = j5;
                    str.getClass();
                    booj3.f133922e = str;
                    booj3.f133923f = booi.m111389a(i9);
                    booj booj4 = (booj) booh.mo74062i();
                    da = boon.f133951i.mo74144da();
                    if (da.f164950c) {
                    }
                    ((boon) da.f164949b).f133953a = bool.m111393a(i5);
                    if (da.f164950c) {
                    }
                    booj4.getClass();
                    ((boon) da.f164949b).f133959g = booj4;
                    boon boon = (boon) da.mo74062i();
                    boot a11 = c.mo35978a(17, i5 != 6 ? str8 : "Error", "MDP_PeriodicService");
                    bxvd = (bxvd) a11.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a11);
                    long longValue2 = valueOf2.longValue();
                    if (bxvd.f164950c) {
                    }
                    boot boot = (boot) bxvd.f164949b;
                    boot boot2 = boot.f133997z;
                    boot.f134015r = longValue2;
                    boon.getClass();
                    boot.f134013p = boon;
                    if (bxvd.f164950c) {
                    }
                    ((boot) bxvd.f164949b).f134003f = j;
                    c.mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, valueOf);
                    z = z2;
                    f66426k.mo26019b(agyt.m55307c()).mo68420a("Register new CPID on gcm token:{%s}", str3);
                    if (z) {
                    }
                    if (z) {
                    }
                    return z;
                } catch (chuw e3) {
                    e = e3;
                    bnsl a12 = f66426k.mo26019b(agyt.m55307c());
                    a12.mo68437a(e);
                    a12.mo68420a("GCoreRegister attempt got StatusException: %s", bryx.m114908a(agrs.m55019a(e).f30116j));
                    j = (long) agrs.m55019a(e).f30115i;
                    btac2 = null;
                    ((bnsl) f66426k.mo68388c()).mo68405a("Got null response when attempting GcoreRegister");
                    j = 27010;
                    if (btac2 != null) {
                    }
                    if (j == 0) {
                    }
                    String str72 = "GTAF_Server";
                    if (!cfmn.m140202d()) {
                    }
                    agrl c2 = m55071c();
                    long j52 = this.f66429c;
                    if (j == 0) {
                    }
                    int i92 = this.f66434h;
                    Integer valueOf3 = Integer.valueOf(this.f66432f);
                    String str82 = str4;
                    Long valueOf22 = Long.valueOf(this.f66433g);
                    booh = (booh) booj.f133916p.mo74144da();
                    String b42 = agyt.m55303b(stm.m36299a(str3));
                    if (booh.f164950c) {
                    }
                    booj booj32 = (booj) booh.f164949b;
                    b42.getClass();
                    booj32.f133918a = b42;
                    str2.getClass();
                    booj32.f133919b = str2;
                    booj32.f133920c = i4;
                    booj32.f133921d = j52;
                    str.getClass();
                    booj32.f133922e = str;
                    booj32.f133923f = booi.m111389a(i92);
                    booj booj42 = (booj) booh.mo74062i();
                    da = boon.f133951i.mo74144da();
                    if (da.f164950c) {
                    }
                    ((boon) da.f164949b).f133953a = bool.m111393a(i5);
                    if (da.f164950c) {
                    }
                    booj42.getClass();
                    ((boon) da.f164949b).f133959g = booj42;
                    boon boon2 = (boon) da.mo74062i();
                    boot a112 = c2.mo35978a(17, i5 != 6 ? str82 : "Error", "MDP_PeriodicService");
                    bxvd = (bxvd) a112.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a112);
                    long longValue22 = valueOf22.longValue();
                    if (bxvd.f164950c) {
                    }
                    boot boot3 = (boot) bxvd.f164949b;
                    boot boot22 = boot.f133997z;
                    boot3.f134015r = longValue22;
                    boon2.getClass();
                    boot3.f134013p = boon2;
                    if (bxvd.f164950c) {
                    }
                    ((boot) bxvd.f164949b).f134003f = j;
                    c2.mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, valueOf3);
                    z = z2;
                    f66426k.mo26019b(agyt.m55307c()).mo68420a("Register new CPID on gcm token:{%s}", str3);
                    if (z) {
                    }
                    if (z) {
                    }
                    return z;
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    bnsl a13 = f66426k.mo26019b(agyt.m55307c());
                    a13.mo68437a(e);
                    a13.mo68420a("GCoreRegister attempt with invalid parameter(s): %s", bryx.m114908a(e.getMessage()));
                    j = 27005;
                    btac2 = null;
                    ((bnsl) f66426k.mo68388c()).mo68405a("Got null response when attempting GcoreRegister");
                    j = 27010;
                    if (btac2 != null) {
                    }
                    if (j == 0) {
                    }
                    String str722 = "GTAF_Server";
                    if (!cfmn.m140202d()) {
                    }
                    agrl c22 = m55071c();
                    long j522 = this.f66429c;
                    if (j == 0) {
                    }
                    int i922 = this.f66434h;
                    Integer valueOf32 = Integer.valueOf(this.f66432f);
                    String str822 = str4;
                    Long valueOf222 = Long.valueOf(this.f66433g);
                    booh = (booh) booj.f133916p.mo74144da();
                    String b422 = agyt.m55303b(stm.m36299a(str3));
                    if (booh.f164950c) {
                    }
                    booj booj322 = (booj) booh.f164949b;
                    b422.getClass();
                    booj322.f133918a = b422;
                    str2.getClass();
                    booj322.f133919b = str2;
                    booj322.f133920c = i4;
                    booj322.f133921d = j522;
                    str.getClass();
                    booj322.f133922e = str;
                    booj322.f133923f = booi.m111389a(i922);
                    booj booj422 = (booj) booh.mo74062i();
                    da = boon.f133951i.mo74144da();
                    if (da.f164950c) {
                    }
                    ((boon) da.f164949b).f133953a = bool.m111393a(i5);
                    if (da.f164950c) {
                    }
                    booj422.getClass();
                    ((boon) da.f164949b).f133959g = booj422;
                    boon boon22 = (boon) da.mo74062i();
                    boot a1122 = c22.mo35978a(17, i5 != 6 ? str822 : "Error", "MDP_PeriodicService");
                    bxvd = (bxvd) a1122.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a1122);
                    long longValue222 = valueOf222.longValue();
                    if (bxvd.f164950c) {
                    }
                    boot boot32 = (boot) bxvd.f164949b;
                    boot boot222 = boot.f133997z;
                    boot32.f134015r = longValue222;
                    boon22.getClass();
                    boot32.f134013p = boon22;
                    if (bxvd.f164950c) {
                    }
                    ((boot) bxvd.f164949b).f134003f = j;
                    c22.mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, valueOf32);
                    z = z2;
                    f66426k.mo26019b(agyt.m55307c()).mo68420a("Register new CPID on gcm token:{%s}", str3);
                    if (z) {
                    }
                    if (z) {
                    }
                    return z;
                }
            } catch (gid e5) {
                e = e5;
                i3 = 5;
                bnsl a102 = f66426k.mo26019b(agyt.m55307c());
                a102.mo68437a(e);
                a102.mo68420a("GCoreRegister attempt got auth exception %s.", bryx.m114908a(e.getMessage()));
                j = 27009;
                btac2 = null;
                ((bnsl) f66426k.mo68388c()).mo68405a("Got null response when attempting GcoreRegister");
                j = 27010;
                if (btac2 != null) {
                }
                if (j == 0) {
                }
                String str7222 = "GTAF_Server";
                if (!cfmn.m140202d()) {
                }
                agrl c222 = m55071c();
                long j5222 = this.f66429c;
                if (j == 0) {
                }
                int i9222 = this.f66434h;
                Integer valueOf322 = Integer.valueOf(this.f66432f);
                String str8222 = str4;
                Long valueOf2222 = Long.valueOf(this.f66433g);
                booh = (booh) booj.f133916p.mo74144da();
                String b4222 = agyt.m55303b(stm.m36299a(str3));
                if (booh.f164950c) {
                }
                booj booj3222 = (booj) booh.f164949b;
                b4222.getClass();
                booj3222.f133918a = b4222;
                str2.getClass();
                booj3222.f133919b = str2;
                booj3222.f133920c = i4;
                booj3222.f133921d = j5222;
                str.getClass();
                booj3222.f133922e = str;
                booj3222.f133923f = booi.m111389a(i9222);
                booj booj4222 = (booj) booh.mo74062i();
                da = boon.f133951i.mo74144da();
                if (da.f164950c) {
                }
                ((boon) da.f164949b).f133953a = bool.m111393a(i5);
                if (da.f164950c) {
                }
                booj4222.getClass();
                ((boon) da.f164949b).f133959g = booj4222;
                boon boon222 = (boon) da.mo74062i();
                boot a11222 = c222.mo35978a(17, i5 != 6 ? str8222 : "Error", "MDP_PeriodicService");
                bxvd = (bxvd) a11222.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a11222);
                long longValue2222 = valueOf2222.longValue();
                if (bxvd.f164950c) {
                }
                boot boot322 = (boot) bxvd.f164949b;
                boot boot2222 = boot.f133997z;
                boot322.f134015r = longValue2222;
                boon222.getClass();
                boot322.f134013p = boon222;
                if (bxvd.f164950c) {
                }
                ((boot) bxvd.f164949b).f134003f = j;
                c222.mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, valueOf322);
                z = z2;
                f66426k.mo26019b(agyt.m55307c()).mo68420a("Register new CPID on gcm token:{%s}", str3);
                if (z) {
                }
                if (z) {
                }
                return z;
            } catch (chuw e6) {
                e = e6;
                i3 = 5;
                bnsl a122 = f66426k.mo26019b(agyt.m55307c());
                a122.mo68437a(e);
                a122.mo68420a("GCoreRegister attempt got StatusException: %s", bryx.m114908a(agrs.m55019a(e).f30116j));
                j = (long) agrs.m55019a(e).f30115i;
                btac2 = null;
                ((bnsl) f66426k.mo68388c()).mo68405a("Got null response when attempting GcoreRegister");
                j = 27010;
                if (btac2 != null) {
                }
                if (j == 0) {
                }
                String str72222 = "GTAF_Server";
                if (!cfmn.m140202d()) {
                }
                agrl c2222 = m55071c();
                long j52222 = this.f66429c;
                if (j == 0) {
                }
                int i92222 = this.f66434h;
                Integer valueOf3222 = Integer.valueOf(this.f66432f);
                String str82222 = str4;
                Long valueOf22222 = Long.valueOf(this.f66433g);
                booh = (booh) booj.f133916p.mo74144da();
                String b42222 = agyt.m55303b(stm.m36299a(str3));
                if (booh.f164950c) {
                }
                booj booj32222 = (booj) booh.f164949b;
                b42222.getClass();
                booj32222.f133918a = b42222;
                str2.getClass();
                booj32222.f133919b = str2;
                booj32222.f133920c = i4;
                booj32222.f133921d = j52222;
                str.getClass();
                booj32222.f133922e = str;
                booj32222.f133923f = booi.m111389a(i92222);
                booj booj42222 = (booj) booh.mo74062i();
                da = boon.f133951i.mo74144da();
                if (da.f164950c) {
                }
                ((boon) da.f164949b).f133953a = bool.m111393a(i5);
                if (da.f164950c) {
                }
                booj42222.getClass();
                ((boon) da.f164949b).f133959g = booj42222;
                boon boon2222 = (boon) da.mo74062i();
                boot a112222 = c2222.mo35978a(17, i5 != 6 ? str82222 : "Error", "MDP_PeriodicService");
                bxvd = (bxvd) a112222.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a112222);
                long longValue22222 = valueOf22222.longValue();
                if (bxvd.f164950c) {
                }
                boot boot3222 = (boot) bxvd.f164949b;
                boot boot22222 = boot.f133997z;
                boot3222.f134015r = longValue22222;
                boon2222.getClass();
                boot3222.f134013p = boon2222;
                if (bxvd.f164950c) {
                }
                ((boot) bxvd.f164949b).f134003f = j;
                c2222.mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, valueOf3222);
                z = z2;
                f66426k.mo26019b(agyt.m55307c()).mo68420a("Register new CPID on gcm token:{%s}", str3);
                if (z) {
                }
                if (z) {
                }
                return z;
            } catch (IllegalArgumentException e7) {
                e = e7;
                i3 = 5;
                bnsl a132 = f66426k.mo26019b(agyt.m55307c());
                a132.mo68437a(e);
                a132.mo68420a("GCoreRegister attempt with invalid parameter(s): %s", bryx.m114908a(e.getMessage()));
                j = 27005;
                btac2 = null;
                ((bnsl) f66426k.mo68388c()).mo68405a("Got null response when attempting GcoreRegister");
                j = 27010;
                if (btac2 != null) {
                }
                if (j == 0) {
                }
                String str722222 = "GTAF_Server";
                if (!cfmn.m140202d()) {
                }
                agrl c22222 = m55071c();
                long j522222 = this.f66429c;
                if (j == 0) {
                }
                int i922222 = this.f66434h;
                Integer valueOf32222 = Integer.valueOf(this.f66432f);
                String str822222 = str4;
                Long valueOf222222 = Long.valueOf(this.f66433g);
                booh = (booh) booj.f133916p.mo74144da();
                String b422222 = agyt.m55303b(stm.m36299a(str3));
                if (booh.f164950c) {
                }
                booj booj322222 = (booj) booh.f164949b;
                b422222.getClass();
                booj322222.f133918a = b422222;
                str2.getClass();
                booj322222.f133919b = str2;
                booj322222.f133920c = i4;
                booj322222.f133921d = j522222;
                str.getClass();
                booj322222.f133922e = str;
                booj322222.f133923f = booi.m111389a(i922222);
                booj booj422222 = (booj) booh.mo74062i();
                da = boon.f133951i.mo74144da();
                if (da.f164950c) {
                }
                ((boon) da.f164949b).f133953a = bool.m111393a(i5);
                if (da.f164950c) {
                }
                booj422222.getClass();
                ((boon) da.f164949b).f133959g = booj422222;
                boon boon22222 = (boon) da.mo74062i();
                boot a1122222 = c22222.mo35978a(17, i5 != 6 ? str822222 : "Error", "MDP_PeriodicService");
                bxvd = (bxvd) a1122222.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a1122222);
                long longValue222222 = valueOf222222.longValue();
                if (bxvd.f164950c) {
                }
                boot boot32222 = (boot) bxvd.f164949b;
                boot boot222222 = boot.f133997z;
                boot32222.f134015r = longValue222222;
                boon22222.getClass();
                boot32222.f134013p = boon22222;
                if (bxvd.f164950c) {
                }
                ((boot) bxvd.f164949b).f134003f = j;
                c22222.mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, valueOf32222);
                z = z2;
                f66426k.mo26019b(agyt.m55307c()).mo68420a("Register new CPID on gcm token:{%s}", str3);
                if (z) {
                }
                if (z) {
                }
                return z;
            }
            if (btac2 == null && j == 0) {
                ((bnsl) f66426k.mo68388c()).mo68405a("Got null response when attempting GcoreRegister");
                j = 27010;
            }
            if (btac2 != null) {
                if (btac2.f147935c != this.f66432f) {
                    ((bnsl) f66426k.mo68388c()).mo68424a("In GCoreRegistration, gRPC response had different eventFlowId from request. Request ID: %s, Response ID: %s", bryx.m114908a(Integer.valueOf(this.f66432f)), bryx.m114908a(Integer.valueOf(btac2.f147935c)));
                }
                if (btac2.f147934b != this.f66433g) {
                    ((bnsl) f66426k.mo68388c()).mo68424a("In GCoreRegistration, gRPC response had different uniqueRequestId from request. Request ID: %s, Response ID: %s", bryx.m114908a(Long.valueOf(this.f66433g)), bryx.m114908a(Long.valueOf(btac2.f147934b)));
                }
            }
            boolean z4 = j == 0;
            String str7222222 = "GTAF_Server";
            if (!cfmn.m140202d()) {
                str3 = a;
                str4 = str7222222;
                z2 = z4;
                i4 = i;
            } else if (!z4 || btac2 == null) {
                str3 = a;
                str4 = str7222222;
                z2 = z4;
                i4 = i;
            } else if (btac2.f147933a.size() > 0) {
                ArrayList arrayList = new ArrayList();
                bxwc bxwc3 = btac2.f147933a;
                int size3 = bxwc3.size();
                int i10 = 0;
                while (i10 < size3) {
                    String str9 = a;
                    String str10 = str7222222;
                    boolean z5 = z4;
                    int i11 = i;
                    btbe btbe = (btbe) bxwc3.get(i10);
                    bopc bopc2 = (bopc) bopd.f134098i.mo74144da();
                    long j6 = btbe.f148107a;
                    if (bopc2.f164950c) {
                        bopc2.mo74035c();
                        bopc2.f164950c = false;
                    }
                    bopd bopd2 = (bopd) bopc2.f164949b;
                    bopd2.f134100a = j6;
                    String str11 = btbe.f148110d;
                    str11.getClass();
                    bopd2.f134101b = str11;
                    String str12 = btbe.f148108b;
                    str12.getClass();
                    bopd2.f134102c = str12;
                    String str13 = btbe.f148109c;
                    str13.getClass();
                    bopd2.f134103d = str13;
                    bopd2.f134104e = btbe.f148115i;
                    bygb a14 = bygb.m124774a(btbe.f148113g);
                    if (a14 == null) {
                        a14 = bygb.UNRECOGNIZED;
                    }
                    if (bopc2.f164950c) {
                        bopc2.mo74035c();
                        bopc2.f164950c = false;
                    }
                    ((bopd) bopc2.f164949b).f134105f = a14.mo3214a();
                    btas btas = btbe.f148112f;
                    if (btas == null) {
                        btas = btas.f148044c;
                    }
                    long j7 = btas.f148047b;
                    if (bopc2.f164950c) {
                        bopc2.mo74035c();
                        bopc2.f164950c = false;
                    }
                    ((bopd) bopc2.f164949b).f134106g = j7;
                    btas btas2 = btbe.f148112f;
                    if (btas2 == null) {
                        btas2 = btas.f148044c;
                    }
                    bxwc bxwc4 = btas2.f148046a;
                    int size4 = bxwc4.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        bopc2.mo68926a(m55066a((btaq) bxwc4.get(i12)));
                    }
                    arrayList.add((bopd) bopc2.mo74062i());
                    i10++;
                    i = i11;
                    str7222222 = str10;
                    a = str9;
                    z4 = z5;
                    i3 = 5;
                }
                agrl c3 = m55071c();
                long j8 = this.f66429c;
                int i13 = this.f66434h;
                int i14 = this.f66432f;
                String str14 = str7222222;
                long j9 = this.f66433g;
                booh booh3 = (booh) booj.f133916p.mo74144da();
                z2 = z4;
                String b5 = agyt.m55303b(stm.m36299a(a));
                str3 = a;
                if (booh3.f164950c) {
                    booh3.mo74035c();
                    booh3.f164950c = false;
                }
                b5.getClass();
                ((booj) booh3.f164949b).f133918a = b5;
                String a15 = stm.m36299a(str2);
                if (booh3.f164950c) {
                    booh3.mo74035c();
                    booh3.f164950c = false;
                }
                booj booj5 = (booj) booh3.f164949b;
                a15.getClass();
                booj5.f133919b = a15;
                booj5.f133920c = i;
                booj5.f133921d = j8;
                String a16 = stm.m36299a(str);
                if (booh3.f164950c) {
                    booh3.mo74035c();
                    booh3.f164950c = false;
                }
                booj booj6 = (booj) booh3.f164949b;
                a16.getClass();
                booj6.f133922e = a16;
                if (i13 == 0) {
                    i13 = 2;
                }
                booj6.f133923f = booi.m111389a(i13);
                if (!sqw.m36041a((Collection) arrayList)) {
                    booh3.mo68922a(arrayList);
                }
                bxvd da2 = boon.f133951i.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((boon) da2.f164949b).f133953a = bool.m111393a(i3);
                booj booj7 = (booj) booh3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                booj7.getClass();
                ((boon) da2.f164949b).f133959g = booj7;
                boon boon3 = (boon) da2.mo74062i();
                boot a17 = c3.mo35978a(17, str14, "MDP_PeriodicService");
                bxvd bxvd2 = (bxvd) a17.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) a17);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                boot boot4 = (boot) bxvd2.f164949b;
                boot boot5 = boot.f133997z;
                boot4.f134015r = j9;
                boon3.getClass();
                boot4.f134013p = boon3;
                if (cfmq.m140242m() && j != 0) {
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    ((boot) bxvd2.f164949b).f134003f = j;
                }
                c3.mo35995a((boot) bxvd2.mo74062i(), bygd.CPID_REGISTER_ACTION, Integer.valueOf(i14));
                z = z2;
            } else {
                str3 = a;
                str4 = str7222222;
                z2 = z4;
                i4 = i;
            }
            agrl c222222 = m55071c();
            long j5222222 = this.f66429c;
            if (j == 0) {
                i5 = 5;
            } else {
                i5 = 6;
            }
            int i9222222 = this.f66434h;
            Integer valueOf322222 = Integer.valueOf(this.f66432f);
            String str8222222 = str4;
            Long valueOf2222222 = Long.valueOf(this.f66433g);
            booh = (booh) booj.f133916p.mo74144da();
            String b4222222 = agyt.m55303b(stm.m36299a(str3));
            if (booh.f164950c) {
                booh.mo74035c();
                booh.f164950c = false;
            }
            booj booj3222222 = (booj) booh.f164949b;
            b4222222.getClass();
            booj3222222.f133918a = b4222222;
            str2.getClass();
            booj3222222.f133919b = str2;
            booj3222222.f133920c = i4;
            booj3222222.f133921d = j5222222;
            str.getClass();
            booj3222222.f133922e = str;
            booj3222222.f133923f = booi.m111389a(i9222222);
            booj booj4222222 = (booj) booh.mo74062i();
            da = boon.f133951i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boon) da.f164949b).f133953a = bool.m111393a(i5);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            booj4222222.getClass();
            ((boon) da.f164949b).f133959g = booj4222222;
            boon boon222222 = (boon) da.mo74062i();
            boot a11222222 = c222222.mo35978a(17, i5 != 6 ? str8222222 : "Error", "MDP_PeriodicService");
            bxvd = (bxvd) a11222222.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a11222222);
            long longValue2222222 = valueOf2222222.longValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot322222 = (boot) bxvd.f164949b;
            boot boot2222222 = boot.f133997z;
            boot322222.f134015r = longValue2222222;
            boon222222.getClass();
            boot322222.f134013p = boon222222;
            if (cfmq.m140242m() && j != 0) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ((boot) bxvd.f164949b).f134003f = j;
            }
            c222222.mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, valueOf322222);
            z = z2;
        } else {
            str3 = a;
            String str15 = str2;
            int i15 = i;
            boolean z6 = false;
            try {
                btac = a2.mo36040a(str3, Long.valueOf(this.f66429c), str, this.f66430d, Integer.valueOf(this.f66432f), Long.valueOf(this.f66433g));
            } catch (chuw | gid | IllegalArgumentException e8) {
                bnsl a18 = f66426k.mo26019b(agyt.m55307c());
                a18.mo68437a(e8);
                a18.mo68405a("Cannot register new CPID.");
                btac = null;
                z3 = false;
            }
            if (btac == null) {
                ((bnsl) f66426k.mo68388c()).mo68405a("Got null response when attempting GcoreRegister");
            } else {
                z6 = z3;
            }
            if (btac != null) {
                if (btac.f147935c != this.f66432f) {
                    ((bnsl) f66426k.mo68388c()).mo68424a("In GCoreRegistration, gRPC response had different eventFlowId from request. Request ID: %s, Response ID: %s", bryx.m114908a(Integer.valueOf(this.f66432f)), bryx.m114908a(Integer.valueOf(btac.f147935c)));
                }
                if (btac.f147934b != this.f66433g) {
                    ((bnsl) f66426k.mo68388c()).mo68424a("In GCoreRegistration, gRPC response had different uniqueRequestId from request. Request ID: %s, Response ID: %s", bryx.m114908a(Long.valueOf(this.f66433g)), bryx.m114908a(Long.valueOf(btac.f147934b)));
                }
            }
            agrl c4 = m55071c();
            long j10 = this.f66429c;
            if (!z6) {
                i2 = 6;
            } else {
                i2 = 5;
            }
            c4.mo36015a(str3, str15, i15, j10, str, i2, this.f66434h, Integer.valueOf(this.f66432f), Long.valueOf(this.f66433g));
            z = z6;
        }
        f66426k.mo26019b(agyt.m55307c()).mo68420a("Register new CPID on gcm token:{%s}", str3);
        if (z) {
            new agza().mo36208a(bxzv.TASK_GCORE_REGISTER, bxzt.m124580a(System.currentTimeMillis()).f165097a);
        }
        if (z) {
            new agza().mo36208a(bxzv.TASK_GCORE_REGISTER, bxzt.m124580a(System.currentTimeMillis()).f165097a);
        }
        return z;
    }
}
