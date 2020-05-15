package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: agsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agsx implements Callable {

    /* renamed from: a */
    public static final srn f66406a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private final Context f66407b;

    /* renamed from: c */
    private final Integer f66408c;

    /* renamed from: d */
    private final Long f66409d;

    /* renamed from: e */
    private final agpk f66410e;

    public agsx(Context context, Integer num) {
        this.f66407b = context;
        this.f66408c = Integer.valueOf(num == null ? agrl.m54949c() : num.intValue());
        this.f66409d = Long.valueOf(agrl.m54947b());
        this.f66410e = agpk.m54726a();
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
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        btap btap;
        int i;
        bygd bygd;
        Boolean bool;
        Context context = this.f66407b;
        boolean z2 = false;
        if (context == null) {
            f66406a.mo26019b(agyt.m55307c()).mo68420a("%s: call: null context; quitting.", "BgTaskListCpidEndpoints");
            return false;
        }
        Iterator it = agyq.m55295p(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                f66406a.mo26019b(agyt.m55307c()).mo68420a("%s: runForCpidQuotaCheck: supported SIMs are not default SIM.", "BgTaskListCpidEndpoints");
                z = false;
                break;
            }
            agzc agzc = (agzc) it.next();
            if (agzc.mo36196d()) {
                f66406a.mo26019b(agyt.m55307c()).mo68424a("%s: runForCpidQuotaCheck: mccmnc: %s.", "BgTaskListCpidEndpoints", agzc.mo36194b());
                String a = agzc.mo36193a();
                agrl a2 = agrl.m54942a();
                int intValue = this.f66408c.intValue();
                long longValue = this.f66409d.longValue();
                String str = "GTAF_Server";
                boot a3 = a2.mo35978a(17, str, "MDP_BgTask");
                bxvd bxvd = (bxvd) a3.mo74142c(5);
                bxvd.mo73625a((bxvk) a3);
                bxvd da = bopk.f134134f.mo74144da();
                String b = agzc.mo36194b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = z2;
                }
                b.getClass();
                ((bopk) da.f164949b).f134136a = b;
                boolean d = agzc.mo36196d();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = z2;
                }
                ((bopk) da.f164949b).f134137b = d;
                long c = agzc.mo36195c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bopk) da.f164949b).f134138c = c;
                bopk bopk = (bopk) da.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boot boot = (boot) bxvd.f164949b;
                boot boot2 = boot.f133997z;
                bopk.getClass();
                boot.f134019v = bopk;
                boot.f134015r = longValue;
                a2.mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_LIST_CPID_ENDPOINTS_ATTEMPT, Integer.valueOf(intValue));
                Status status = null;
                try {
                    btap = agrz.m55030a(this.f66407b, cfmv.m140318q(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", agqg.m54846a().intValue()).mo36041a(this.f66408c, this.f66409d, "MDP_BgTask");
                } catch (gid e) {
                    bnsl a4 = f66406a.mo26019b(agyt.m55307c());
                    a4.mo68437a(e);
                    a4.mo68424a("%s: makeGrpcCall: MDP_SERVER_GTAF_AUTH_FAILURE. message: %s", "BgTaskListCpidEndpoints", e.getMessage());
                    status = new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure.");
                    btap = null;
                } catch (chuw e2) {
                    chuv chuv = e2.f189236a;
                    if (chuv != null && chuv.f189233s == chus.NOT_FOUND) {
                        f66406a.mo26019b(agyt.m55307c()).mo68420a("%s: call: MDP_UNSUPPORTED_CARRIER.", "BgTaskListCpidEndpoints");
                        String valueOf = String.valueOf(chuv);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                        sb.append("MDP_UNSUPPORTED_CARRIER. ");
                        sb.append(valueOf);
                        status = new Status(27001, sb.toString());
                        btap = null;
                    } else {
                        bnsl a5 = f66406a.mo26019b(agyt.m55307c());
                        a5.mo68437a(e2);
                        a5.mo68424a("%s: makeGrpcCall: StatusException. message: %s", "BgTaskListCpidEndpoints", e2.getMessage());
                        status = agrs.m55019a(e2);
                        btap = null;
                    }
                }
                if (cfmd.m140083c()) {
                    String b2 = agzc.mo36194b();
                    if (!TextUtils.isEmpty(b2)) {
                        boolean a6 = agpk.m54726a().mo35836a(a, b2.substring(0, 3), b2.substring(3));
                        if (cfmq.m140237h()) {
                            agrl a7 = agrl.m54942a();
                            bxvd da2 = booc.f133888c.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            booc booc = (booc) da2.f164949b;
                            booc.f133891b = a6;
                            booc.f133890a = boob.m111380a(12);
                            a7.mo35992a((booc) da2.mo74062i(), "MDP_BgTask", this.f66408c);
                        }
                    }
                }
                if (status == null) {
                    if (btap == null) {
                        status = new Status(27003, "MDP_BAD_RESPONSE. ListCpidEndpointsResponse object is null.");
                    } else if (btap.f148029a.size() == 0) {
                        status = new Status(27006, "MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT. Carrier endpoints are empty.");
                    } else {
                        long j = btap.f148030b;
                        if (j <= 0) {
                            StringBuilder sb2 = new StringBuilder(58);
                            sb2.append("MDP_BAD_RESPONSE. Carrier ID is <= 0: ");
                            sb2.append(j);
                            status = new Status(27003, sb2.toString());
                        } else {
                            Long k = this.f66410e.mo35851k(a);
                            if (!(k == null || k.longValue() <= 0 || btap.f148030b == k.longValue())) {
                                f66406a.mo26019b(agyt.m55307c()).mo68425a("%s: makeGrpcCall: cached carrierId: %s, rpc carrierId:%s", "BgTaskListCpidEndpoints", k, Long.valueOf(btap.f148030b));
                            }
                        }
                    }
                }
                agrl a8 = agrl.m54942a();
                if (status != null) {
                    i = status.f30115i;
                } else {
                    i = 0;
                }
                int intValue2 = this.f66408c.intValue();
                long longValue2 = this.f66409d.longValue();
                if (!(i == 0 || i == 16)) {
                    str = "Error";
                }
                boot a9 = a8.mo35978a(17, str, "MDP_BgTask");
                bxvd bxvd2 = (bxvd) a9.mo74142c(5);
                bxvd2.mo73625a((bxvk) a9);
                bxvd da3 = bopk.f134134f.mo74144da();
                String b3 = agzc.mo36194b();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                b3.getClass();
                ((bopk) da3.f164949b).f134136a = b3;
                boolean d2 = agzc.mo36196d();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((bopk) da3.f164949b).f134137b = d2;
                long c2 = agzc.mo36195c();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((bopk) da3.f164949b).f134138c = c2;
                bopk bopk2 = (bopk) da3.mo74062i();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                boot boot3 = (boot) bxvd2.f164949b;
                bopk2.getClass();
                boot3.f134019v = bopk2;
                String str2 = a;
                boot3.f134003f = (long) i;
                boot3.f134015r = longValue2;
                if (i != 0) {
                    bygd = i != 16 ? bygd.BACKGROUND_LIST_CPID_ENDPOINTS_FAILURE : bygd.BACKGROUND_LIST_CPID_ENDPOINTS_SKIPPED;
                } else {
                    bygd = bygd.BACKGROUND_LIST_CPID_ENDPOINTS_SUCCESS;
                }
                a8.mo35995a((boot) bxvd2.mo74062i(), bygd, Integer.valueOf(intValue2));
                if (!cfmq.m140244o() || status == null) {
                    if (!(btap == null || btap.f148035g == this.f66408c.intValue())) {
                        f66406a.mo26019b(agyt.m55307c()).mo68425a("%s: makeGrpcCall: response had different EventFlowId. Request: %s, Response: %s", "BgTaskListCpidEndpoints", this.f66408c, Integer.valueOf(btap.f148035g));
                    }
                    if (!(btap == null || btap.f148034f == this.f66409d.longValue())) {
                        f66406a.mo26019b(agyt.m55307c()).mo68425a("%s: makeGrpcCall: response had different uniqueRequestId. Request: %s, Response: %s", "BgTaskListCpidEndpoints", this.f66409d, Long.valueOf(btap.f148034f));
                    }
                    boolean a10 = agpk.m54726a().mo35832a(str2, btap);
                    if (cfmq.m140237h()) {
                        agrl a11 = agrl.m54942a();
                        bxvd da4 = booc.f133888c.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        ((booc) da4.f164949b).f133890a = boob.m111380a(10);
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        ((booc) da4.f164949b).f133891b = a10;
                        a11.mo35992a((booc) da4.mo74062i(), "MDP_BgTask", this.f66408c);
                    }
                    if (cfmq.m140244o()) {
                        agrl.m54942a().mo35997a(btap, "MDP_BgTask");
                    }
                    f66406a.mo26019b(agyt.m55307c()).mo68431a("%s: makeGrpcCall: saved in cache? %s", (Object) "BgTaskListCpidEndpoints", a10);
                    bool = Boolean.valueOf(a10);
                } else {
                    agrl.m54942a().mo35986a(status.f30115i, "MDP_BgTask", this.f66408c, this.f66409d);
                    f66406a.mo26019b(agyt.m55307c()).mo68424a("%s: makeGrpcCall: failure: %s", "BgTaskListCpidEndpoints", status);
                    bool = null;
                }
                z = bool.booleanValue();
            } else {
                z2 = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
