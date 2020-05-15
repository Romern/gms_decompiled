package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: agsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agsz implements Callable {

    /* renamed from: a */
    private static final srn f66413a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private final Context f66414b;

    /* renamed from: c */
    private final int f66415c;

    /* renamed from: d */
    private final agpk f66416d;

    /* renamed from: e */
    private agrl f66417e;

    public agsz(Context context, Integer num) {
        this.f66414b = context;
        this.f66415c = num == null ? agrl.m54949c() : num.intValue();
        this.f66416d = agpk.m54726a();
    }

    /* renamed from: b */
    private final synchronized agrl m55063b() {
        if (this.f66417e == null) {
            this.f66417e = agrl.m54943a(this.f66414b);
        }
        return this.f66417e;
    }

    /* renamed from: a */
    public final boolean mo36073a() {
        try {
            return ((Boolean) aucu.m76782a(aucu.m76780a(snp.m35704b(10), this))).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) f66413a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Timed out, interrupted, or failed while getting TriggeringVector from SharedPreferences.");
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        long j;
        long j2;
        boolean z2;
        boolean z3 = false;
        if (this.f66414b != null) {
            List<String> b = this.f66416d.mo35840b();
            ArrayList arrayList = new ArrayList();
            for (String str : b) {
                bxzx j3 = this.f66416d.mo35850j(str);
                if (j3 != null) {
                    bygb a = bygb.m124774a(j3.f165204f);
                    if (a == null) {
                        a = bygb.UNRECOGNIZED;
                    }
                    if (a != bygb.DECLINED || cfmg.m140138d()) {
                        bygb a2 = bygb.m124774a(j3.f165204f);
                        if (a2 == null) {
                            a2 = bygb.UNRECOGNIZED;
                        }
                        if (a2 != bygb.NOT_REQUIRED) {
                            bygb a3 = bygb.m124774a(j3.f165204f);
                            if (a3 == null) {
                                a3 = bygb.UNRECOGNIZED;
                            }
                            if (!(a3 == bygb.NOT_ASKED || j3.f165207i || this.f66416d.mo35845e(str) == null)) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            bngx a4 = bngx.m109368a((Collection) arrayList);
            if (!a4.isEmpty()) {
                bnre i = a4.listIterator();
                boolean z4 = true;
                while (i.hasNext()) {
                    String str2 = (String) i.next();
                    bxvd da = byge.f166289c.mo74144da();
                    long mostSignificantBits = UUID.randomUUID().getMostSignificantBits();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z3;
                    }
                    ((byge) da.f164949b).f166291a = mostSignificantBits;
                    long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z3;
                    }
                    ((byge) da.f164949b).f166292b = leastSignificantBits;
                    byge byge = (byge) da.mo74062i();
                    long b2 = agrl.m54947b();
                    String e = this.f66416d.mo35845e(str2);
                    Long b3 = this.f66416d.mo35839b(str2);
                    bxzx j4 = this.f66416d.mo35850j(str2);
                    String str3 = stm.m36302d(e) ? "MDP_INVALID_CARRIER_PLAN_ID " : "";
                    if (b3 == null) {
                        str3 = str3.concat("MDP_REQUIRE_CARRIER_ID ");
                    }
                    if (j4 == null) {
                        str3 = String.valueOf(str3).concat("MDP_REQUIRE_CONSENT_RECORD ");
                    }
                    if (!str3.isEmpty()) {
                        ((bnsl) f66413a.mo68388c()).mo68420a("Failed to get data needed from cache for background SetConsent gRPC. Error: %s", bryx.m114908a(str3));
                        z4 = false;
                    } else {
                        agrl b4 = m55063b();
                        int i2 = j4.f165206h;
                        UUID randomUUID = UUID.randomUUID();
                        bygb a5 = bygb.m124774a(j4.f165204f);
                        if (a5 == null) {
                            a5 = bygb.UNRECOGNIZED;
                        }
                        String str4 = str2;
                        long j5 = j4.f165205g;
                        int i3 = this.f66415c;
                        boolean z5 = z4;
                        bnre bnre = i;
                        byge byge2 = byge;
                        boot a6 = b4.mo35978a(20, "GTAF_Server", "MDP_BgTask");
                        bxvd bxvd = (bxvd) a6.mo74142c(5);
                        bxvd.mo73625a((bxvk) a6);
                        String a7 = stm.m36299a(e);
                        String str5 = "MDP_BgTask";
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        boot boot = (boot) bxvd.f164949b;
                        boot boot2 = boot.f133997z;
                        a7.getClass();
                        boot.f134000c = a7;
                        boot.f134015r = b2;
                        bxvd da2 = bopi.f134125e.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ((bopi) da2.f164949b).f134130d = i2;
                        bxyk a8 = bxzt.m124580a(j5);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bopi bopi = (bopi) da2.f164949b;
                        a8.getClass();
                        bopi.f134129c = a8;
                        if (a5 != null) {
                            bopi.f134128b = a5.mo3214a();
                        }
                        if (randomUUID != null) {
                            bxvd da3 = bopl.f134141c.mo74144da();
                            long mostSignificantBits2 = randomUUID.getMostSignificantBits();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            ((bopl) da3.f164949b).f134143a = mostSignificantBits2;
                            long leastSignificantBits2 = randomUUID.getLeastSignificantBits();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            ((bopl) da3.f164949b).f134144b = leastSignificantBits2;
                            bopl bopl = (bopl) da3.mo74062i();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bopl.getClass();
                            ((bopi) da2.f164949b).f134127a = bopl;
                        }
                        bopi bopi2 = (bopi) da2.mo74062i();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bopi2.getClass();
                        ((boot) bxvd.f164949b).f134012o = bopi2;
                        b4.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_SET_CONSENT_ATTEMPT, Integer.valueOf(i3));
                        agry a9 = agrz.m55030a(this.f66414b, cfmv.m140318q(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", agqg.m54846a().intValue());
                        try {
                            bygb a10 = bygb.m124774a(j4.f165204f);
                            String str6 = str5;
                            bxzx bxzx = j4;
                            long j6 = b2;
                            try {
                                a9.mo36043a(e, b3, 7, a10 != null ? a10 : bygb.UNRECOGNIZED, byge2, Integer.valueOf(j4.f165206h), bxzt.m124580a(j4.f165205g), Integer.valueOf(this.f66415c), Long.valueOf(b2));
                                m55063b().mo36014a(e, this.f66415c, j6);
                                agpk agpk = this.f66416d;
                                bxvd bxvd2 = (bxvd) bxzx.mo74142c(5);
                                bxvd2.mo73625a((bxvk) bxzx);
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                bxzx bxzx2 = bxzx.f165197j;
                                ((bxzx) bxvd2.f164949b).f165207i = true;
                                bxzx bxzx3 = (bxzx) bxvd2.mo74062i();
                                agpl agpl = agpk.f66242a;
                                agpw a11 = agpl.mo35854a(str4);
                                if (a11 != null) {
                                    agpv i4 = a11.mo35918i();
                                    i4.mo35901a(bxzx3);
                                    z2 = agpl.mo35857a(i4.mo35900a());
                                } else {
                                    z2 = false;
                                }
                                agrl b5 = m55063b();
                                bxvd da4 = booc.f133888c.mo74144da();
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                ((booc) da4.f164949b).f133890a = boob.m111380a(7);
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                ((booc) da4.f164949b).f133891b = z2;
                                b5.mo35992a((booc) da4.mo74062i(), str6, Integer.valueOf(this.f66415c));
                                z4 = z5;
                                i = bnre;
                                z3 = false;
                            } catch (gid e2) {
                                e = e2;
                                j = j6;
                                bnsl bnsl = (bnsl) f66413a.mo68388c();
                                bnsl.mo68437a(e);
                                bnsl.mo68420a("MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", bryx.m114908a(e.getMessage()));
                                m55063b().mo36004a(bygd.BACKGROUND_SET_CONSENT_FAILURE, 27009, "MDP_BgTask", agqe.m54828a().mo35931a(e, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4"), Integer.valueOf(this.f66415c), Long.valueOf(j));
                                i = bnre;
                                z4 = false;
                                z3 = false;
                            } catch (chuw e3) {
                                e = e3;
                                j2 = j6;
                                Status a12 = agrs.m55019a(e);
                                bnsl bnsl2 = (bnsl) f66413a.mo68388c();
                                bnsl2.mo68437a(e);
                                bnsl2.mo68420a("StatusException while setting consent status: %s", bryx.m114908a(a12));
                                m55063b().mo36004a(bygd.BACKGROUND_SET_CONSENT_FAILURE, (long) a12.f30115i, "MDP_BgTask", agqe.m54828a().mo35931a(e, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4"), Integer.valueOf(this.f66415c), Long.valueOf(j2));
                                i = bnre;
                                z4 = false;
                                z3 = false;
                            }
                        } catch (gid e4) {
                            e = e4;
                            j = b2;
                            bnsl bnsl3 = (bnsl) f66413a.mo68388c();
                            bnsl3.mo68437a(e);
                            bnsl3.mo68420a("MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", bryx.m114908a(e.getMessage()));
                            m55063b().mo36004a(bygd.BACKGROUND_SET_CONSENT_FAILURE, 27009, "MDP_BgTask", agqe.m54828a().mo35931a(e, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4"), Integer.valueOf(this.f66415c), Long.valueOf(j));
                            i = bnre;
                            z4 = false;
                            z3 = false;
                        } catch (chuw e5) {
                            e = e5;
                            j2 = b2;
                            Status a122 = agrs.m55019a(e);
                            bnsl bnsl22 = (bnsl) f66413a.mo68388c();
                            bnsl22.mo68437a(e);
                            bnsl22.mo68420a("StatusException while setting consent status: %s", bryx.m114908a(a122));
                            m55063b().mo36004a(bygd.BACKGROUND_SET_CONSENT_FAILURE, (long) a122.f30115i, "MDP_BgTask", agqe.m54828a().mo35931a(e, "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4"), Integer.valueOf(this.f66415c), Long.valueOf(j2));
                            i = bnre;
                            z4 = false;
                            z3 = false;
                        }
                    }
                }
                z = z4;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        ((bnsl) f66413a.mo68388c()).mo68405a("Background consent task called with null context.");
        return false;
    }
}
