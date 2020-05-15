package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: agtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtl extends aaab {

    /* renamed from: g */
    private static final srn f66480g = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    private final agrf f66481a;

    /* renamed from: b */
    private final MdpPurchaseOfferRequest f66482b;

    /* renamed from: c */
    private final Object f66483c = new Object();

    /* renamed from: d */
    private volatile Context f66484d;

    /* renamed from: e */
    private agrl f66485e;

    /* renamed from: f */
    private agqd f66486f;

    /* renamed from: a */
    private final agrl m55099a() {
        agrl agrl;
        synchronized (this.f66483c) {
            if (this.f66485e == null) {
                this.f66485e = agrl.m54943a(this.f66484d);
            }
            agrl = this.f66485e;
        }
        return agrl;
    }

    public agtl(agrf agrf, MdpPurchaseOfferRequest mdpPurchaseOfferRequest) {
        super(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, "PurchaseOffer");
        this.f66481a = agrf;
        if (cfmq.m140247r()) {
            if (mdpPurchaseOfferRequest != null && mdpPurchaseOfferRequest.f80204g == null) {
                agou agou = new agou(mdpPurchaseOfferRequest);
                agou.f66202g = Long.valueOf(agrl.m54947b());
                mdpPurchaseOfferRequest = agou.mo35806a();
            }
            if (mdpPurchaseOfferRequest != null && mdpPurchaseOfferRequest.f80203f == null) {
                agou agou2 = new agou(mdpPurchaseOfferRequest);
                agou2.f66201f = 0;
                mdpPurchaseOfferRequest = agou2.mo35806a();
            }
        }
        this.f66482b = mdpPurchaseOfferRequest;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b8, code lost:
        if (r7 == p000.bygb.NOT_REQUIRED) goto L_0x01e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03fd A[Catch:{ all -> 0x05a6, all -> 0x05ac, gid -> 0x05d3, chuw -> 0x05b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03fe A[Catch:{ all -> 0x05a6, all -> 0x05ac, gid -> 0x05d3, chuw -> 0x05b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x058e  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        agrx agrx;
        Throwable th;
        btbk btbk;
        MdpPurchaseOfferResponse mdpPurchaseOfferResponse;
        Bundle bundle;
        bxzx bxzx;
        Object obj;
        long j;
        Context context2 = context;
        if (cfmv.m140303b() > 0 && cfmv.m140325x() > 0) {
            bqhi.m112839a(cfmv.m140325x(), TimeUnit.MILLISECONDS);
        }
        f66480g.mo26019b(agyt.m55307c()).mo68420a("Exec PurchaseOffer. req:{%s}", this.f66482b);
        this.f66484d = context2;
        if (cflx.m140023j()) {
            ((bnsl) f66480g.mo68388c()).mo68405a("MDP_MODULE_DISABLED. Likely because the carrier is not supported.");
            mo6503a(new Status(27101, "MDP_MODULE_DISABLED. Likely because the carrier is not supported."));
            return;
        } else if (!agqg.m54869x().booleanValue()) {
            ((bnsl) f66480g.mo68388c()).mo68405a("MDP_NOT_ENABLED. The API is not enabled on this device.");
            mo6503a(new Status(27013, "MDP_NOT_ENABLED. The API is not enabled on this device."));
            return;
        } else {
            MdpPurchaseOfferRequest mdpPurchaseOfferRequest = this.f66482b;
            if (mdpPurchaseOfferRequest == null || (str = mdpPurchaseOfferRequest.f80198a) == null || str.isEmpty()) {
                ((bnsl) f66480g.mo68387b()).mo68405a("Invalid arguments. Need an non-empty Carrier Plan Id.");
                new agzb(context2).mo36211a("Empty CarrierPlanId at purchaseOfferOperation", new IllegalArgumentException());
                mo6503a(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. Need an non-empty Carrier Plan Id."));
                return;
            }
            agqe a = agqe.m54828a();
            MdpPurchaseOfferRequest mdpPurchaseOfferRequest2 = this.f66482b;
            String str5 = mdpPurchaseOfferRequest2.f80198a;
            Bundle bundle2 = mdpPurchaseOfferRequest2.f80202e;
            if (bundle2 != null) {
                str2 = bundle2.getString("for_test");
            } else {
                str2 = null;
            }
            agqd b = a.mo35932b(str5, str2);
            this.f66486f = b;
            String str6 = "CLIENT_TestInvalid";
            if (b != null) {
                str3 = b.f66263c;
            } else {
                str3 = str6;
            }
            agrl a2 = m55099a();
            MdpPurchaseOfferRequest mdpPurchaseOfferRequest3 = this.f66482b;
            if (mdpPurchaseOfferRequest3 != null) {
                boot a3 = a2.mo35978a(10, "GTAF_Server", str3);
                bxvd bxvd = (bxvd) a3.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a3);
                if (cfmq.m140238i()) {
                    agrl.m54945a(bxvd, mdpPurchaseOfferRequest3.f80202e);
                }
                int b2 = byed.m124702b(mdpPurchaseOfferRequest3.f80205h);
                if (b2 != 0) {
                    if (b2 == 1) {
                        b2 = 2;
                    }
                    bxvd da = bopa.f134085e.mo74144da();
                    String str7 = mdpPurchaseOfferRequest3.f80199b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bopa bopa = (bopa) da.f164949b;
                    str7.getClass();
                    bopa.f134087a = str7;
                    String str8 = mdpPurchaseOfferRequest3.f80201d;
                    str8.getClass();
                    bopa.f134088b = str8;
                    String str9 = mdpPurchaseOfferRequest3.f80200c;
                    str9.getClass();
                    bopa.f134089c = str9;
                    bopa.f134090d = byed.m124701a(b2);
                    bopa bopa2 = (bopa) da.mo74062i();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    boot boot = (boot) bxvd.f164949b;
                    boot boot2 = boot.f133997z;
                    bopa2.getClass();
                    boot.f134007j = bopa2;
                    String str10 = mdpPurchaseOfferRequest3.f80198a;
                    str10.getClass();
                    boot.f134000c = str10;
                    Long l = mdpPurchaseOfferRequest3.f80204g;
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
                    a2.mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_PURCHASE_REQUEST, mdpPurchaseOfferRequest3.f80203f);
                } else {
                    throw null;
                }
            }
            agqd agqd = this.f66486f;
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
                bnsl a6 = f66480g.mo26019b(agyt.m55307c());
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
            if (this.f66486f == null) {
                ((bnsl) f66480g.mo68388c()).mo68405a("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId.");
                String valueOf = String.valueOf(this.f66482b.f80198a);
                mo6503a(new Status(27005, valueOf.length() == 0 ? new String("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ") : "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ".concat(valueOf)));
                return;
            } else if (cfma.m140066d() && !agyq.m55276a(context)) {
                ((bnsl) f66480g.mo68388c()).mo68405a("MDP_NO_NETWORK: Need a valid network connection.");
                mo6503a(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."));
                return;
            } else {
                agqd agqd2 = this.f66486f;
                String str11 = agqd2.f66261a;
                String str12 = agqd2.f66264d;
                agry a7 = agrz.m55030a(context2, cfmv.m140318q(), str11, agqg.m54846a().intValue());
                try {
                    agou agou = new agou(this.f66482b);
                    agou.f66196a = str12;
                    MdpPurchaseOfferRequest a8 = agou.mo35806a();
                    bxvd da2 = btbj.f148135i.mo74144da();
                    String str13 = a8.f80198a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    str13.getClass();
                    ((btbj) da2.f164949b).f148137a = str13;
                    agqg.m54847b();
                    if (agqg.m54847b().longValue() > 0) {
                        long longValue = agqg.m54847b().longValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ((btbj) da2.f164949b).f148141e = longValue;
                    }
                    String f = agyq.m55285f(a7.f66343e);
                    if (agyq.m55275a()) {
                        if (f != null) {
                            String substring = f.substring(0, 3);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            substring.getClass();
                            ((btbj) da2.f164949b).f148138b = substring;
                            String substring2 = f.substring(3);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            substring2.getClass();
                            ((btbj) da2.f164949b).f148139c = substring2;
                        }
                    }
                    if (cfmq.m140247r()) {
                        Integer num = a8.f80203f;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((btbj) da2.f164949b).f148144h = intValue;
                        }
                        Long l2 = a8.f80204g;
                        if (l2 != null) {
                            long longValue2 = l2.longValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((btbj) da2.f164949b).f148143g = longValue2;
                        }
                    }
                    bxvd da3 = btbb.f148093d.mo74144da();
                    String str14 = a8.f80199b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    btbb btbb = (btbb) da3.f164949b;
                    str14.getClass();
                    btbb.f148095a = str14;
                    String str15 = a8.f80201d;
                    str15.getClass();
                    btbb.f148096b = str15;
                    String a9 = stm.m36299a(a8.f80200c);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    a9.getClass();
                    ((btbb) da3.f164949b).f148097c = a9;
                    btbb btbb2 = (btbb) da3.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btbb2.getClass();
                    ((btbj) da2.f164949b).f148140d = btbb2;
                    Bundle bundle3 = a8.f80202e;
                    if (agqg.m54839F().booleanValue()) {
                        if (bundle3 != null) {
                            if (bundle3.size() > 0) {
                                bszu bszu = (bszu) bszw.f147894b.mo74144da();
                                for (String str16 : bundle3.keySet()) {
                                    Object obj2 = bundle3.get(str16);
                                    if (!(obj2 instanceof String)) {
                                        obj2.getClass().getName();
                                        bszu.mo70729a(str16, "INVALID_NON_STRING");
                                    } else {
                                        bszu.mo70729a(str16, (String) obj2);
                                    }
                                }
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bszw bszw = (bszw) bszu.mo74062i();
                                bszw.getClass();
                                ((btbj) da2.f164949b).f148142f = bszw;
                            }
                        }
                        agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("UpdatePlan req:{%s}\n", da2.mo74062i());
                        agrx = new agrx(a7);
                        agqf a10 = agrx.mo36038a();
                        ClientContext clientContext = a7.f66339a;
                        btbj btbj = (btbj) da2.mo74062i();
                        if (agqf.f66274g != null) {
                            agqf.f66274g = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileDataPlanService/GcoreUpdateUserDataPlan", ciie.m150370a(btbj.f148135i), ciie.m150370a(btbk.f148145f));
                        }
                        btbk = (btbk) a10.f66277a.mo25553a(agqf.f66274g, clientContext, btbj, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
                        agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("UpdatePlan rsp:{%s}\n", btbk);
                        if (btbk != null || btbk.f148147a == null) {
                            agrx.close();
                            mdpPurchaseOfferResponse = null;
                        } else {
                            btbp btbp = btbk.f148148b;
                            if (btbp == null) {
                                btbp = btbp.f148186l;
                            }
                            if (agqg.m54839F().booleanValue()) {
                                bszw bszw2 = btbk.f148149c;
                                if (bszw2 == null) {
                                    bszw2 = bszw.f147894b;
                                }
                                if (bszw2.f147896a.size() > 0) {
                                    bundle = new Bundle();
                                    bszw bszw3 = btbk.f148149c;
                                    if (bszw3 == null) {
                                        bszw3 = bszw.f147894b;
                                    }
                                    for (Map.Entry entry : Collections.unmodifiableMap(bszw3.f147896a).entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                } else {
                                    bundle = null;
                                }
                            } else {
                                bundle = null;
                            }
                            agow agow = new agow();
                            btbc btbc = btbk.f148147a;
                            if (btbc == null) {
                                btbc = btbc.f148098f;
                            }
                            agow.f66206a = btbc.f148100a;
                            btbc btbc2 = btbk.f148147a;
                            if (btbc2 == null) {
                                btbc2 = btbc.f148098f;
                            }
                            agow.f66207b = btbc2.f148101b;
                            btbc btbc3 = btbk.f148147a;
                            if (btbc3 == null) {
                                btbc3 = btbc.f148098f;
                            }
                            agow.f66208c = btbc3.f148103d;
                            btbc btbc4 = btbk.f148147a;
                            if (btbc4 == null) {
                                btbc4 = btbc.f148098f;
                            }
                            agow.f66209d = btbc4.f148102c;
                            long j2 = btbp.f148188a;
                            if (j2 < 0) {
                                j2 = -1;
                            }
                            agow.f66210e = j2;
                            agow.f66211f = btbp.f148189b;
                            btbc btbc5 = btbk.f148147a;
                            if (btbc5 == null) {
                                btbc5 = btbc.f148098f;
                            }
                            agow.f66212g = btbc5.f148104e;
                            agow.f66213h = bundle;
                            if (cfmq.m140247r()) {
                                int i = btbk.f148151e;
                                if (i != 0) {
                                    agow.f66214i = Integer.valueOf(i);
                                }
                                long j3 = btbk.f148150d;
                                if (j3 != 0) {
                                    agow.f66215j = Long.valueOf(j3);
                                }
                            }
                            MdpPurchaseOfferResponse mdpPurchaseOfferResponse2 = new MdpPurchaseOfferResponse(agow.f66206a, agow.f66207b, agow.f66208c, agow.f66209d, agow.f66210e, agow.f66211f, agow.f66212g, agow.f66213h, agow.f66214i, agow.f66215j);
                            agrx.close();
                            mdpPurchaseOfferResponse = mdpPurchaseOfferResponse2;
                        }
                        if (mdpPurchaseOfferResponse == null) {
                            f66480g.mo26019b(agyt.m55307c()).mo68425a("PurchaseOffer <%s> for %s. Response:{%s}", this.f66482b.f80198a, this.f66486f.f66263c, mdpPurchaseOfferResponse);
                            agqd agqd3 = this.f66486f;
                            if (agqd3 != null) {
                                str6 = agqd3.f66263c;
                            }
                            if (cfmq.m140235f()) {
                                agrl a11 = m55099a();
                                MdpPurchaseOfferRequest mdpPurchaseOfferRequest4 = this.f66482b;
                                a11.mo36010a(mdpPurchaseOfferRequest4, mdpPurchaseOfferResponse, mdpPurchaseOfferRequest4.f80198a, str6);
                            } else {
                                m55099a().mo36010a((MdpPurchaseOfferRequest) null, mdpPurchaseOfferResponse, this.f66482b.f80198a, str6);
                            }
                            try {
                                this.f66481a.mo35765a(Status.f30107a, mdpPurchaseOfferResponse);
                                return;
                            } catch (RemoteException e) {
                                bnsl bnsl = (bnsl) f66480g.mo68387b();
                                bnsl.mo68437a(e);
                                bnsl.mo68424a("Unable to complete api callback for success response:{%s}, exception: %s", bryx.m114908a(mdpPurchaseOfferResponse), bryx.m114908a(e.getMessage()));
                                return;
                            }
                        } else {
                            ((bnsl) f66480g.mo68388c()).mo68405a("MDP_SERVER_GTAF_EMPTY_RESPONSE. Failed purchase.");
                            mo6503a(new Status(27010, "MDP_SERVER_GTAF_EMPTY_RESPONSE. Failed purchase."));
                            return;
                        }
                    }
                    agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("UpdatePlan req:{%s}\n", da2.mo74062i());
                    agrx = new agrx(a7);
                    agqf a102 = agrx.mo36038a();
                    ClientContext clientContext2 = a7.f66339a;
                    btbj btbj2 = (btbj) da2.mo74062i();
                    if (agqf.f66274g != null) {
                    }
                    btbk = (btbk) a102.f66277a.mo25553a(agqf.f66274g, clientContext2, btbj2, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
                    agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("UpdatePlan rsp:{%s}\n", btbk);
                    if (btbk != null) {
                    }
                    agrx.close();
                    mdpPurchaseOfferResponse = null;
                    if (mdpPurchaseOfferResponse == null) {
                    }
                } catch (gid e2) {
                    bnsl bnsl2 = (bnsl) f66480g.mo68388c();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68420a("MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", bryx.m114908a(e2.getMessage()));
                    mo6503a(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."));
                    return;
                } catch (chuw e3) {
                    bnsl bnsl3 = (bnsl) f66480g.mo68388c();
                    bnsl3.mo68437a(e3);
                    bnsl3.mo68420a("StatusException while purchasing offer: %s", bryx.m114908a(agrs.m55019a(e3)));
                    mo6503a(agrs.m55019a(e3));
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
        f66480g.mo26019b(agyt.m55307c()).mo68420a("PurchaseOfferOperation Failure Status:{%s}", status);
        agqd agqd = this.f66486f;
        if (agqd != null) {
            str = agqd.f66263c;
        } else {
            str = "CLIENT_TestInvalid";
        }
        if (cfmq.m140235f()) {
            agrl a = m55099a();
            Bundle bundle = this.f66482b.f80202e;
            bygd bygd = bygd.MODULE_PURCHASE_RESPONSE_FAILURE;
            long j = (long) status.f30115i;
            MdpPurchaseOfferRequest mdpPurchaseOfferRequest = this.f66482b;
            if (mdpPurchaseOfferRequest != null) {
                str2 = mdpPurchaseOfferRequest.f80198a;
            } else {
                str2 = null;
            }
            if (mdpPurchaseOfferRequest != null) {
                num = mdpPurchaseOfferRequest.f80203f;
            } else {
                num = null;
            }
            if (mdpPurchaseOfferRequest != null) {
                l = mdpPurchaseOfferRequest.f80204g;
            } else {
                l = null;
            }
            a.mo35991a(bundle, bygd, j, str, str2, num, l);
        } else {
            agrl a2 = m55099a();
            bygd bygd2 = bygd.MODULE_PURCHASE_RESPONSE_FAILURE;
            long j2 = (long) status.f30115i;
            MdpPurchaseOfferRequest mdpPurchaseOfferRequest2 = this.f66482b;
            a2.mo36004a(bygd2, j2, str, mdpPurchaseOfferRequest2 != null ? mdpPurchaseOfferRequest2.f80198a : null, mdpPurchaseOfferRequest2 != null ? mdpPurchaseOfferRequest2.f80203f : null, mdpPurchaseOfferRequest2 != null ? mdpPurchaseOfferRequest2.f80204g : null);
        }
        try {
            this.f66481a.mo35765a(status, (MdpPurchaseOfferResponse) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66480g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api callback for failure:{%s} with exception: %s", bryx.m114908a(status), bryx.m114908a(e.getMessage()));
        }
    }
}
