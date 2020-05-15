package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: agtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtj extends aaab {

    /* renamed from: g */
    private static final srn f66466g = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    private final agrf f66467a;

    /* renamed from: b */
    private final MdpDataPlanStatusRequest f66468b;

    /* renamed from: c */
    private final Object f66469c = new Object();

    /* renamed from: d */
    private volatile Context f66470d;

    /* renamed from: e */
    private agrl f66471e;

    /* renamed from: f */
    private agqd f66472f;

    /* renamed from: a */
    private final agrl m55091a() {
        agrl agrl;
        synchronized (this.f66469c) {
            if (this.f66471e == null) {
                this.f66471e = agrl.m54943a(this.f66470d);
            }
            agrl = this.f66471e;
        }
        return agrl;
    }

    public agtj(agrf agrf, MdpDataPlanStatusRequest mdpDataPlanStatusRequest) {
        super(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, "GetDataPlanStatus");
        this.f66467a = agrf;
        if (cfmq.m140247r()) {
            if (mdpDataPlanStatusRequest != null && mdpDataPlanStatusRequest.f80185d == null) {
                agop agop = new agop(mdpDataPlanStatusRequest);
                Long valueOf = Long.valueOf(agrl.m54947b());
                MdpDataPlanStatusRequest mdpDataPlanStatusRequest2 = agop.f66187a;
                mdpDataPlanStatusRequest2.f80185d = valueOf;
                mdpDataPlanStatusRequest = mdpDataPlanStatusRequest2;
            }
            if (mdpDataPlanStatusRequest != null && mdpDataPlanStatusRequest.f80184c == null) {
                agop agop2 = new agop(mdpDataPlanStatusRequest);
                agop2.mo35797a(0);
                mdpDataPlanStatusRequest = agop2.f66187a;
            }
        }
        this.f66468b = mdpDataPlanStatusRequest;
    }

    /* renamed from: a */
    private final void m55092a(MdpDataPlanStatusResponse mdpDataPlanStatusResponse, boolean z, boolean z2) {
        String str;
        agqd agqd = this.f66472f;
        if (agqd != null) {
            str = agqd.f66263c;
        } else {
            str = "CLIENT_TestInvalid";
        }
        f66466g.mo26019b(agyt.m55307c()).mo68427a("DataPlanStatus <%s> for %s. FromCache:%b, Response:{%s}\nCachePutSuccess:%b", this.f66468b.f80182a, str, Boolean.valueOf(z), mdpDataPlanStatusResponse, Boolean.valueOf(z2));
        try {
            if (cfmq.m140235f()) {
                m55091a().mo36009a(this.f66468b, mdpDataPlanStatusResponse, z, str);
            } else {
                m55091a().mo36009a((MdpDataPlanStatusRequest) null, mdpDataPlanStatusResponse, z, str);
            }
            new agyo().mo36192a(mdpDataPlanStatusResponse);
            this.f66467a.mo35763a(Status.f30107a, mdpDataPlanStatusResponse);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66466g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api callback with success response:{%s} because of exception %s", bryx.m114908a(mdpDataPlanStatusResponse), bryx.m114908a(e.getMessage()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0172, code lost:
        if (r10 == p000.bygb.NOT_REQUIRED) goto L_0x01a2;
     */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        agrx agrx;
        Throwable th;
        Bundle bundle;
        boolean z2;
        int i;
        MdpDataPlanStatusRequest mdpDataPlanStatusRequest;
        Bundle bundle2;
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse;
        String string;
        bxzx bxzx;
        Object obj;
        long j;
        Context context2 = context;
        if (cfmv.m140303b() > 0 && cfmv.m140324w() > 0) {
            bqhi.m112839a(cfmv.m140324w(), TimeUnit.MILLISECONDS);
        }
        f66466g.mo26019b(agyt.m55307c()).mo68420a("Exec GetDataPlan. req:{%s}", this.f66468b);
        this.f66470d = context2;
        if (cflx.m140023j()) {
            ((bnsl) f66466g.mo68388c()).mo68405a("MDP_MODULE_DISABLED. Likely because the carrier is not supported.");
            mo6503a(new Status(27101, "MDP_MODULE_DISABLED. Likely because the carrier is not supported."));
            return;
        } else if (!agqg.m54868w().booleanValue()) {
            ((bnsl) f66466g.mo68388c()).mo68405a("MDP_NOT_ENABLED. The API is not enabled on this device.");
            mo6503a(new Status(27013, "MDP_NOT_ENABLED. The API is not enabled on this device."));
            return;
        } else {
            MdpDataPlanStatusRequest mdpDataPlanStatusRequest2 = this.f66468b;
            if (mdpDataPlanStatusRequest2 == null || (str = mdpDataPlanStatusRequest2.f80182a) == null || str.isEmpty()) {
                ((bnsl) f66466g.mo68387b()).mo68405a("Invalid arguments. Need an non-empty Carrier Plan Id.");
                new agzb(context2).mo36211a("Empty Carrier Plan Id at getDataPlanStatusOperation", new IllegalArgumentException());
                mo6503a(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. Need an non-empty Carrier Plan Id."));
                return;
            }
            agqe a = agqe.m54828a();
            MdpDataPlanStatusRequest mdpDataPlanStatusRequest3 = this.f66468b;
            String str5 = mdpDataPlanStatusRequest3.f80182a;
            Bundle bundle3 = mdpDataPlanStatusRequest3.f80183b;
            if (bundle3 != null) {
                str2 = bundle3.getString("for_test");
            } else {
                str2 = null;
            }
            agqd b = a.mo35932b(str5, str2);
            this.f66472f = b;
            String str6 = "CLIENT_TestInvalid";
            if (b != null) {
                str3 = b.f66263c;
            } else {
                str3 = str6;
            }
            cfma.m140064b();
            agrl a2 = m55091a();
            MdpDataPlanStatusRequest mdpDataPlanStatusRequest4 = this.f66468b;
            if (mdpDataPlanStatusRequest4 != null) {
                boot a3 = a2.mo35978a(4, "GTAF_Server", str3);
                bxvd bxvd = (bxvd) a3.mo74142c(5);
                bxvd.mo73625a((bxvk) a3);
                if (cfmq.m140238i()) {
                    agrl.m54945a(bxvd, mdpDataPlanStatusRequest4.f80183b);
                }
                String str7 = mdpDataPlanStatusRequest4.f80182a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boot boot = boot.f133997z;
                str7.getClass();
                ((boot) bxvd.f164949b).f134000c = str7;
                Long l = mdpDataPlanStatusRequest4.f80185d;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ((boot) bxvd.f164949b).f134015r = j;
                a2.mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_DP_STATUS_REQUEST, mdpDataPlanStatusRequest4.f80184c);
            }
            agqd agqd = this.f66472f;
            if (agqd != null) {
                str4 = agqd.f66264d;
            } else {
                str4 = null;
            }
            if (agqg.m54865t().booleanValue() && cfmg.m140136b()) {
                Long k = agpk.m54726a().mo35851k(str4);
                if (!cfmg.m140137c() || !cfmv.m140304c().isEmpty()) {
                    bxzx = agpk.m54726a().mo35850j(agyq.m55288i(context));
                } else {
                    bxzx = agpk.m54726a().mo35837b(k, str4);
                }
                if (bxzx != null) {
                    bygb a4 = bygb.m124774a(bxzx.f165204f);
                    if (a4 == null) {
                        a4 = bygb.UNRECOGNIZED;
                    }
                    if (a4 != bygb.CONSENTED) {
                        bygb a5 = bygb.m124774a(bxzx.f165204f);
                        if (a5 == null) {
                            a5 = bygb.UNRECOGNIZED;
                        }
                    }
                }
                bnsl a6 = f66466g.mo26019b(agyt.m55307c());
                if (bxzx != null) {
                    obj = bygb.m124774a(bxzx.f165204f);
                    if (obj == null) {
                        obj = bygb.UNRECOGNIZED;
                    }
                } else {
                    obj = "no record";
                }
                a6.mo68420a("User has not consented yet. Status: %s", obj);
                mo6503a(new Status(27023, "MDP_REQUIRE_CONSENT. User has not consented yet."));
                return;
            }
            boolean z3 = true;
            if (cfma.m140064b() && ((bundle2 = (mdpDataPlanStatusRequest = this.f66468b).f80183b) == null || bundle2.size() <= 0 || (string = mdpDataPlanStatusRequest.f80183b.getString("bypass_local_cache")) == null || !string.equalsIgnoreCase("true"))) {
                try {
                    mdpDataPlanStatusResponse = agpk.m54726a().mo35848h(str4);
                } catch (SQLiteException e) {
                    bnsl bnsl = (bnsl) f66466g.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68420a("Unexpected exception in reading cache in GetDataPlanStatusOperation: %s", bryx.m114908a(e.getMessage()));
                    new agzb(context2).mo36211a("Unexpected exception in reading cache in GetDataPlanStatusOperation ", e);
                    mdpDataPlanStatusResponse = null;
                }
                if (mdpDataPlanStatusResponse != null) {
                    if (cfmq.m140247r()) {
                        agor agor = new agor(mdpDataPlanStatusResponse);
                        MdpDataPlanStatusRequest mdpDataPlanStatusRequest5 = this.f66468b;
                        agor.f66193f = mdpDataPlanStatusRequest5.f80184c;
                        agor.f66194g = mdpDataPlanStatusRequest5.f80185d;
                        mdpDataPlanStatusResponse = agor.mo35800a();
                    }
                    m55092a(mdpDataPlanStatusResponse, true, false);
                    return;
                }
            }
            if (this.f66472f == null) {
                ((bnsl) f66466g.mo68388c()).mo68405a("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId.");
                String valueOf = String.valueOf(this.f66468b.f80182a);
                mo6503a(new Status(27005, valueOf.length() == 0 ? new String("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ") : "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ".concat(valueOf)));
                return;
            } else if (cfma.m140066d() && !agyq.m55276a(context)) {
                ((bnsl) f66466g.mo68388c()).mo68405a("MDP_NO_NETWORK: Need a valid network connection.");
                mo6503a(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."));
                return;
            } else {
                agqd agqd2 = this.f66472f;
                String str8 = agqd2.f66261a;
                String str9 = agqd2.f66264d;
                agry a7 = agrz.m55030a(context2, cfmv.m140318q(), str8, agqg.m54846a().intValue());
                try {
                    MdpDataPlanStatusRequest mdpDataPlanStatusRequest6 = this.f66468b;
                    bxvd da = btaf.f147952j.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    str9.getClass();
                    ((btaf) da.f164949b).f147954a = str9;
                    String c = agyt.m55306c(a7.f66343e);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    c.getClass();
                    ((btaf) da.f164949b).f147959f = c;
                    agqg.m54847b();
                    if (agqg.m54847b().longValue() > 0) {
                        long longValue = agqg.m54847b().longValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((btaf) da.f164949b).f147958e = longValue;
                    }
                    String f = agyq.m55285f(a7.f66343e);
                    if (agyq.m55275a()) {
                        if (f != null) {
                            String substring = f.substring(0, 3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            substring.getClass();
                            ((btaf) da.f164949b).f147955b = substring;
                            String substring2 = f.substring(3);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            substring2.getClass();
                            ((btaf) da.f164949b).f147956c = substring2;
                        }
                    }
                    Bundle bundle4 = mdpDataPlanStatusRequest6.f80183b;
                    if (!agqg.m54835B().booleanValue()) {
                        z = false;
                    } else if (bundle4 == null || bundle4.size() <= 0) {
                        z = false;
                    } else {
                        if (bundle4.getBoolean("return-stats")) {
                            bundle4.remove("return-stats");
                            z = true;
                        } else {
                            z = false;
                        }
                        bszu bszu = (bszu) bszw.f147894b.mo74144da();
                        for (String str10 : bundle4.keySet()) {
                            Object obj2 = bundle4.get(str10);
                            if (obj2 instanceof String) {
                                bszu.mo70729a(str10, (String) obj2);
                                z3 = true;
                            } else {
                                if (obj2 != null) {
                                    obj2.getClass().getName();
                                }
                                bszu.mo70729a(str10, "INVALID_NON_STRING");
                                z3 = true;
                            }
                        }
                        "bypass_gtaf_cache".getClass();
                        Map unmodifiableMap = Collections.unmodifiableMap(((bszw) bszu.f164949b).f147896a);
                        String str11 = "false";
                        if (unmodifiableMap.containsKey("bypass_gtaf_cache")) {
                            str11 = (String) unmodifiableMap.get("bypass_gtaf_cache");
                        }
                        if (bmwb.m108443a(str11, "true")) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((btaf) da.f164949b).f147957d = z3;
                        }
                        String encodeToString = Base64.encodeToString(((bszw) bszu.mo74062i()).mo73642k(), 10);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        encodeToString.getClass();
                        ((btaf) da.f164949b).f147960g = encodeToString;
                    }
                    if (cfmq.m140247r()) {
                        Integer num = mdpDataPlanStatusRequest6.f80184c;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((btaf) da.f164949b).f147962i = intValue;
                        }
                        Long l2 = mdpDataPlanStatusRequest6.f80185d;
                        if (l2 != null) {
                            long longValue2 = l2.longValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((btaf) da.f164949b).f147961h = longValue2;
                        }
                    }
                    agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("GetPlan req:{%s}\n", da.mo74062i());
                    agrx = new agrx(a7);
                    agqf a8 = agrx.mo36038a();
                    ClientContext clientContext = a7.f66339a;
                    btaf btaf = (btaf) da.mo74062i();
                    if (agqf.f66270c == null) {
                        agqf.f66270c = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileDataPlanService/GetDataPlanStatus", ciie.m150370a(btaf.f147952j), ciie.m150370a(btag.f147963j));
                    }
                    btag btag = (btag) a8.f66277a.mo25553a(agqf.f66270c, clientContext, btaf, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
                    agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("GetPlan rsp:{%s}\n", btag);
                    if (agqg.m54835B().booleanValue()) {
                        bszw bszw = btag.f147967c;
                        if (bszw == null) {
                            bszw = bszw.f147894b;
                        }
                        if (bszw.f147896a.size() > 0) {
                            bundle = new Bundle();
                            bszw bszw2 = btag.f147967c;
                            if (bszw2 == null) {
                                bszw2 = bszw.f147894b;
                            }
                            for (Map.Entry entry : Collections.unmodifiableMap(bszw2.f147896a).entrySet()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (z) {
                                ChimeraPeriodicUpdaterService.m67288a(bundle);
                            }
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    MdpDataPlanStatusResponse a9 = agsc.m55039a(btag, mdpDataPlanStatusRequest6.f80182a, bundle);
                    agrx.close();
                    if (a9 == null) {
                        ((bnsl) f66466g.mo68388c()).mo68405a("MDP_SERVER_GTAF_EMPTY_RESPONSE. Empty dataPlanStatus.");
                        mo6503a(new Status(27010, "MDP_SERVER_GTAF_EMPTY_RESPONSE. Empty dataPlanStatus."));
                        return;
                    }
                    if (cfma.m140064b()) {
                        try {
                            z2 = agpk.m54726a().mo35834a(str9, a9);
                        } catch (SQLiteException e2) {
                            bnsl bnsl2 = (bnsl) f66466g.mo68387b();
                            bnsl2.mo68437a(e2);
                            bnsl2.mo68420a("Unexpected exception in writing SimDB cache in GetDataPlanStatusOperation: %s", bryx.m114908a(e2.getMessage()));
                            new agzb(context2).mo36211a("Unexpected exception in writing SimDB cache in GetDataPlanStatusOperation", e2);
                            z2 = false;
                        }
                        if (cfmq.m140237h()) {
                            agrl a10 = agrl.m54942a();
                            bxvd da2 = booc.f133888c.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((booc) da2.f164949b).f133890a = boob.m111380a(8);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((booc) da2.f164949b).f133891b = z2;
                            booc booc = (booc) da2.mo74062i();
                            agqd agqd3 = this.f66472f;
                            if (agqd3 != null) {
                                str6 = agqd3.f66263c;
                            }
                            Integer num2 = this.f66468b.f80184c;
                            if (num2 != null) {
                                i = num2.intValue();
                            } else {
                                i = 0;
                            }
                            a10.mo35992a(booc, str6, Integer.valueOf(i));
                        }
                    } else {
                        z2 = false;
                    }
                    m55092a(a9, false, z2);
                    return;
                } catch (gid e3) {
                    bnsl bnsl3 = (bnsl) f66466g.mo68388c();
                    bnsl3.mo68437a(e3);
                    bnsl3.mo68420a("MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", bryx.m114908a(e3.getMessage()));
                    mo6503a(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."));
                    return;
                } catch (chuw e4) {
                    bnsl bnsl4 = (bnsl) f66466g.mo68388c();
                    bnsl4.mo68437a(e4);
                    bnsl4.mo68420a("StatusException while getting data plan status: %s", bryx.m114908a(e4.getMessage()));
                    mo6503a(agrs.m55019a(e4));
                    return;
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        String str;
        String str2;
        Integer num;
        Long l;
        f66466g.mo26019b(agyt.m55307c()).mo68420a("Error status:{%s}", status);
        agqd agqd = this.f66472f;
        if (agqd != null) {
            str = agqd.f66263c;
        } else {
            str = "CLIENT_TestInvalid";
        }
        if (cfmq.m140235f()) {
            agrl a = m55091a();
            Bundle bundle = this.f66468b.f80183b;
            bygd bygd = bygd.MODULE_DP_STATUS_RESPONSE_FAILURE;
            long j = (long) status.f30115i;
            MdpDataPlanStatusRequest mdpDataPlanStatusRequest = this.f66468b;
            if (mdpDataPlanStatusRequest != null) {
                str2 = mdpDataPlanStatusRequest.f80182a;
            } else {
                str2 = null;
            }
            if (mdpDataPlanStatusRequest != null) {
                num = mdpDataPlanStatusRequest.f80184c;
            } else {
                num = null;
            }
            if (mdpDataPlanStatusRequest != null) {
                l = mdpDataPlanStatusRequest.f80185d;
            } else {
                l = null;
            }
            a.mo35991a(bundle, bygd, j, str, str2, num, l);
        } else {
            agrl a2 = m55091a();
            bygd bygd2 = bygd.MODULE_DP_STATUS_RESPONSE_FAILURE;
            long j2 = (long) status.f30115i;
            MdpDataPlanStatusRequest mdpDataPlanStatusRequest2 = this.f66468b;
            a2.mo36004a(bygd2, j2, str, mdpDataPlanStatusRequest2 != null ? mdpDataPlanStatusRequest2.f80182a : null, mdpDataPlanStatusRequest2 != null ? mdpDataPlanStatusRequest2.f80184c : null, mdpDataPlanStatusRequest2 != null ? mdpDataPlanStatusRequest2.f80185d : null);
        }
        try {
            this.f66467a.mo35763a(status, (MdpDataPlanStatusResponse) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66466g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api callback for failure: %s with status:{%s}", bryx.m114908a(e.getMessage()), bryx.m114908a(status));
        }
    }
}
