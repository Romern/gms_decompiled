package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import java.util.concurrent.TimeUnit;

/* renamed from: agtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtk extends aaab {

    /* renamed from: g */
    private static final srn f66473g = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    private final agrf f66474a;

    /* renamed from: b */
    private final MdpUpsellOfferRequest f66475b;

    /* renamed from: c */
    private final Object f66476c = new Object();

    /* renamed from: d */
    private volatile Context f66477d;

    /* renamed from: e */
    private agrl f66478e;

    /* renamed from: f */
    private agqd f66479f;

    /* renamed from: a */
    private final agrl m55095a() {
        agrl agrl;
        synchronized (this.f66476c) {
            if (this.f66478e == null) {
                this.f66478e = agrl.m54943a(this.f66477d);
            }
            agrl = this.f66478e;
        }
        return agrl;
    }

    public agtk(agrf agrf, MdpUpsellOfferRequest mdpUpsellOfferRequest) {
        super(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, "GetUpsellOffer");
        this.f66474a = agrf;
        if (cfmq.m140247r()) {
            if (mdpUpsellOfferRequest != null && mdpUpsellOfferRequest.f80221d == null) {
                agoy agoy = new agoy(mdpUpsellOfferRequest);
                agoy.f66219d = Long.valueOf(agrl.m54947b());
                mdpUpsellOfferRequest = agoy.mo35811a();
            }
            if (mdpUpsellOfferRequest != null && mdpUpsellOfferRequest.f80220c == null) {
                agoy agoy2 = new agoy(mdpUpsellOfferRequest);
                agoy2.f66218c = 0;
                mdpUpsellOfferRequest = agoy2.mo35811a();
            }
        }
        this.f66475b = mdpUpsellOfferRequest;
    }

    /* renamed from: a */
    private final void m55096a(MdpUpsellOfferResponse mdpUpsellOfferResponse, boolean z, boolean z2) {
        String str;
        String str2;
        agqd agqd = this.f66479f;
        if (agqd != null) {
            str = agqd.f66263c;
        } else {
            str = "CLIENT_TestInvalid";
        }
        MdpUpsellOfferRequest mdpUpsellOfferRequest = this.f66475b;
        if (mdpUpsellOfferRequest != null) {
            str2 = mdpUpsellOfferRequest.f80218a;
        } else {
            str2 = "";
        }
        f66473g.mo26019b(agyt.m55307c()).mo68427a("UpsellOffer <%s> for %s. FromCache:%b, Response:{%s}\nCachePutSuccess:%b", str2, str, Boolean.valueOf(z), mdpUpsellOfferResponse, Boolean.valueOf(z2));
        try {
            if (cfmq.m140235f()) {
                m55095a().mo36011a(this.f66475b, mdpUpsellOfferResponse, str2, z, str);
            } else {
                m55095a().mo36011a((MdpUpsellOfferRequest) null, mdpUpsellOfferResponse, str2, z, str);
            }
            this.f66474a.mo35764a(Status.f30107a, mdpUpsellOfferResponse);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66473g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api callback for success response:{%s} with error: %s", bryx.m114908a(mdpUpsellOfferResponse), bryx.m114908a(e.getMessage()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0144, code lost:
        if (r9 == p000.bygb.NOT_REQUIRED) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x035f A[Catch:{ all -> 0x04b3, all -> 0x04b9, gid -> 0x04c8, chuw -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0360 A[Catch:{ all -> 0x04b3, all -> 0x04b9, gid -> 0x04c8, chuw -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03b9 A[Catch:{ all -> 0x04b3, all -> 0x04b9, gid -> 0x04c8, chuw -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03ba A[Catch:{ all -> 0x04b3, all -> 0x04b9, gid -> 0x04c8, chuw -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0405  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        agrx agrx;
        Throwable th;
        MdpUpsellOfferResponse a;
        boolean z;
        int i;
        MdpUpsellOfferRequest mdpUpsellOfferRequest;
        Bundle bundle;
        byte[] asByteArray;
        String string;
        bxzx bxzx;
        Object obj;
        long j;
        Context context2 = context;
        if (cfmv.m140303b() > 0 && cfmv.m140323v() > 0) {
            bqhi.m112839a(cfmv.m140323v(), TimeUnit.MILLISECONDS);
        }
        f66473g.mo26019b(agyt.m55307c()).mo68420a("Exec GetOffer. req:{%s}", this.f66475b);
        this.f66477d = context2;
        if (cflx.m140023j()) {
            mo6503a(new Status(27101, "MDP_MODULE_DISABLED. Likely because the carrier is not supported."));
            return;
        }
        MdpUpsellOfferRequest mdpUpsellOfferRequest2 = this.f66475b;
        if (mdpUpsellOfferRequest2 == null || (str = mdpUpsellOfferRequest2.f80218a) == null || str.isEmpty()) {
            ((bnsl) f66473g.mo68387b()).mo68405a("Invalid arguments. Need an non-empty Carrier Plan Id.");
            new agzb(context2).mo36211a("Empty Carrier Plan Id at getUpsellOfferOperation", new IllegalArgumentException());
            mo6503a(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. Need an non-empty Carrier Plan Id."));
            return;
        }
        agqe a2 = agqe.m54828a();
        MdpUpsellOfferRequest mdpUpsellOfferRequest3 = this.f66475b;
        String str5 = mdpUpsellOfferRequest3.f80218a;
        Bundle bundle2 = mdpUpsellOfferRequest3.f80219b;
        MdpUpsellOfferResponse mdpUpsellOfferResponse = null;
        if (bundle2 != null) {
            str2 = bundle2.getString("for_test");
        } else {
            str2 = null;
        }
        agqd b = a2.mo35932b(str5, str2);
        this.f66479f = b;
        String str6 = "CLIENT_TestInvalid";
        if (b != null) {
            str3 = b.f66263c;
        } else {
            str3 = str6;
        }
        cfma.m140064b();
        agrl a3 = m55095a();
        MdpUpsellOfferRequest mdpUpsellOfferRequest4 = this.f66475b;
        if (mdpUpsellOfferRequest4 != null) {
            boot a4 = a3.mo35978a(6, "GTAF_Server", str3);
            bxvd bxvd = (bxvd) a4.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a4);
            if (cfmq.m140238i()) {
                agrl.m54945a(bxvd, mdpUpsellOfferRequest4.f80219b);
            }
            String str7 = mdpUpsellOfferRequest4.f80218a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            str7.getClass();
            ((boot) bxvd.f164949b).f134000c = str7;
            Long l = mdpUpsellOfferRequest4.f80221d;
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
            a3.mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_US_OFFER_REQUEST, mdpUpsellOfferRequest4.f80220c);
        }
        agqd agqd = this.f66479f;
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
                bygb a5 = bygb.m124774a(bxzx.f165204f);
                if (a5 == null) {
                    a5 = bygb.UNRECOGNIZED;
                }
                if (a5 != bygb.CONSENTED) {
                    bygb a6 = bygb.m124774a(bxzx.f165204f);
                    if (a6 == null) {
                        a6 = bygb.UNRECOGNIZED;
                    }
                }
            }
            bnsl a7 = f66473g.mo26019b(agyt.m55307c());
            if (bxzx != null) {
                obj = bygb.m124774a(bxzx.f165204f);
                if (obj == null) {
                    obj = bygb.UNRECOGNIZED;
                }
            } else {
                obj = "no record";
            }
            a7.mo68420a("User has not consented yet. Status: %s", obj);
            mo6503a(new Status(27023, "MDP_REQUIRE_CONSENT. User has not consented yet."));
            return;
        }
        if (cfma.m140065c() && ((bundle = (mdpUpsellOfferRequest = this.f66475b).f80219b) == null || bundle.size() <= 0 || (string = mdpUpsellOfferRequest.f80219b.getString("bypass_local_cache")) == null || !string.equalsIgnoreCase("true"))) {
            try {
                agpk a8 = agpk.m54726a();
                agpy b2 = a8.f66242a.mo35861b(a8.mo35851k(str4), str4);
                if (!(b2 == null || (asByteArray = b2.mo35879a().getAsByteArray("upsell_offer")) == null)) {
                    mdpUpsellOfferResponse = (MdpUpsellOfferResponse) bjdl.m103244a(asByteArray, MdpUpsellOfferResponse.CREATOR);
                }
            } catch (SQLiteException e) {
                new agzb(context2).mo36211a("Unexpected exception in reading cache in GetUpsellOfferOperation", e);
            }
            if (mdpUpsellOfferResponse != null) {
                if (cfmq.m140247r()) {
                    agpa agpa = new agpa(mdpUpsellOfferResponse);
                    MdpUpsellOfferRequest mdpUpsellOfferRequest5 = this.f66475b;
                    agpa.f66227g = mdpUpsellOfferRequest5.f80220c;
                    agpa.f66228h = mdpUpsellOfferRequest5.f80221d;
                    mdpUpsellOfferResponse = agpa.mo35814a();
                }
                m55096a(mdpUpsellOfferResponse, true, false);
                return;
            }
        }
        if (this.f66479f == null) {
            String valueOf = String.valueOf(this.f66475b.f80218a);
            mo6503a(new Status(27005, valueOf.length() == 0 ? new String("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ") : "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ".concat(valueOf)));
            return;
        } else if (cfma.m140066d() && !agyq.m55276a(context)) {
            mo6503a(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."));
            return;
        } else {
            agqd agqd2 = this.f66479f;
            String str8 = agqd2.f66261a;
            String str9 = agqd2.f66264d;
            agry a9 = agrz.m55030a(context2, cfmv.m140318q(), str8, agqg.m54846a().intValue());
            try {
                MdpUpsellOfferRequest mdpUpsellOfferRequest6 = this.f66475b;
                bxvd da = btal.f147995i.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str9.getClass();
                ((btal) da.f164949b).f147997a = str9;
                String c = agyt.m55306c(a9.f66343e);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                c.getClass();
                ((btal) da.f164949b).f148001e = c;
                agqg.m54847b();
                if (agqg.m54847b().longValue() > 0) {
                    long longValue = agqg.m54847b().longValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((btal) da.f164949b).f148000d = longValue;
                }
                String f = agyq.m55285f(a9.f66343e);
                if (agyq.m55275a() && f != null) {
                    String substring = f.substring(0, 3);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    substring.getClass();
                    ((btal) da.f164949b).f147998b = substring;
                    String substring2 = f.substring(3);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    substring2.getClass();
                    ((btal) da.f164949b).f147999c = substring2;
                }
                if (mdpUpsellOfferRequest6 == null) {
                    mdpUpsellOfferRequest6 = new agoy().mo35811a();
                }
                Bundle bundle3 = mdpUpsellOfferRequest6.f80219b;
                if (agqg.m54839F().booleanValue()) {
                    if (bundle3 != null) {
                        if (bundle3.size() > 0) {
                            bszu bszu = (bszu) bszw.f147894b.mo74144da();
                            for (String str10 : bundle3.keySet()) {
                                Object obj2 = bundle3.get(str10);
                                if (!(obj2 instanceof String)) {
                                    obj2.getClass().getName();
                                    bszu.mo70729a(str10, "INVALID_NON_STRING");
                                } else {
                                    bszu.mo70729a(str10, (String) obj2);
                                }
                            }
                            String encodeToString = Base64.encodeToString(((bszw) bszu.mo74062i()).serializeToBytes(), 10);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            encodeToString.getClass();
                            ((btal) da.f164949b).f148002f = encodeToString;
                        }
                    }
                    if (!cfmq.m140247r()) {
                        Integer num = mdpUpsellOfferRequest6.f80220c;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((btal) da.f164949b).f148004h = intValue;
                        }
                        Long l2 = mdpUpsellOfferRequest6.f80221d;
                        if (l2 != null) {
                            long longValue2 = l2.longValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((btal) da.f164949b).f148003g = longValue2;
                        }
                    }
                    agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("GetOffer req:{%s}\n", da.mo74062i());
                    agrx = new agrx(a9);
                    agqf a10 = agrx.mo36038a();
                    ClientContext clientContext = a9.f66339a;
                    btal btal = (btal) da.mo74062i();
                    if (agqf.f66271d != null) {
                        agqf.f66271d = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileDataPlanService/GetUpsellOffer", ciie.m150370a(btal.f147995i), ciie.m150370a(btbm.f148158h));
                    }
                    btbm btbm = (btbm) a10.f66277a.mo25553a(agqf.f66271d, clientContext, btal, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
                    agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("GetOffer rsp:{%s}\n", btbm);
                    a = agsc.m55040a(btbm);
                    agrx.close();
                    if (a != null) {
                        mo6503a(new Status(27010, "MDP_SERVER_GTAF_EMPTY_RESPONSE. Empty upsellOffer."));
                        return;
                    }
                    if (cfma.m140065c()) {
                        try {
                            agpk a11 = agpk.m54726a();
                            agpx agpx = new agpx();
                            agpx.mo35922a(str9);
                            agpx.mo35921a(a11.mo35851k(str9));
                            agpx.f66258a.put("upsell_offer", bjdl.m103245a(a));
                            z = a11.f66242a.mo35858a(agpx.mo35920a());
                        } catch (SQLiteException e2) {
                            bnsl bnsl = (bnsl) f66473g.mo68387b();
                            bnsl.mo68437a(e2);
                            bnsl.mo68420a("Unexpected exception in writing SimDB cache in getUpsellOfferOperation: %s", bryx.m114908a(e2.getMessage()));
                            new agzb(context2).mo36211a("Unexpected exception in writing SimDB cache in getUpsellOfferOperation", e2);
                            z = false;
                        }
                        if (cfmq.m140237h()) {
                            agrl a12 = agrl.m54942a();
                            bxvd da2 = booc.f133888c.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((booc) da2.f164949b).f133890a = boob.m111380a(9);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((booc) da2.f164949b).f133891b = z;
                            booc booc = (booc) da2.mo74062i();
                            agqd agqd3 = this.f66479f;
                            if (agqd3 != null) {
                                str6 = agqd3.f66263c;
                            }
                            Integer num2 = this.f66475b.f80220c;
                            if (num2 != null) {
                                i = num2.intValue();
                            } else {
                                i = 0;
                            }
                            a12.mo35992a(booc, str6, Integer.valueOf(i));
                        }
                    } else {
                        z = false;
                    }
                    m55096a(a, false, z);
                    return;
                }
                if (!cfmq.m140247r()) {
                }
                agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("GetOffer req:{%s}\n", da.mo74062i());
                agrx = new agrx(a9);
                agqf a102 = agrx.mo36038a();
                ClientContext clientContext2 = a9.f66339a;
                btal btal2 = (btal) da.mo74062i();
                if (agqf.f66271d != null) {
                }
                btbm btbm2 = (btbm) a102.f66277a.mo25553a(agqf.f66271d, clientContext2, btal2, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
                agry.f66337f.mo26019b(agyt.m55307c()).mo68420a("GetOffer rsp:{%s}\n", btbm2);
                a = agsc.m55040a(btbm2);
                agrx.close();
                if (a != null) {
                }
            } catch (gid e3) {
                mo6503a(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."));
                return;
            } catch (chuw e4) {
                mo6503a(agrs.m55019a(e4));
                return;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
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
        f66473g.mo26019b(agyt.m55307c()).mo68420a("Error status:{%s}", status);
        agqd agqd = this.f66479f;
        if (agqd != null) {
            str = agqd.f66263c;
        } else {
            str = "CLIENT_TestInvalid";
        }
        if (cfmq.m140235f()) {
            agrl a = m55095a();
            Bundle bundle = this.f66475b.f80219b;
            bygd bygd = bygd.MODULE_US_OFFER_RESPONSE_FAILURE;
            long j = (long) status.f30115i;
            MdpUpsellOfferRequest mdpUpsellOfferRequest = this.f66475b;
            if (mdpUpsellOfferRequest != null) {
                str2 = mdpUpsellOfferRequest.f80218a;
            } else {
                str2 = null;
            }
            if (mdpUpsellOfferRequest != null) {
                num = mdpUpsellOfferRequest.f80220c;
            } else {
                num = null;
            }
            if (mdpUpsellOfferRequest != null) {
                l = mdpUpsellOfferRequest.f80221d;
            } else {
                l = null;
            }
            a.mo35991a(bundle, bygd, j, str, str2, num, l);
        } else {
            agrl a2 = m55095a();
            bygd bygd2 = bygd.MODULE_US_OFFER_RESPONSE_FAILURE;
            long j2 = (long) status.f30115i;
            MdpUpsellOfferRequest mdpUpsellOfferRequest2 = this.f66475b;
            a2.mo36004a(bygd2, j2, str, mdpUpsellOfferRequest2 != null ? mdpUpsellOfferRequest2.f80218a : null, mdpUpsellOfferRequest2 != null ? mdpUpsellOfferRequest2.f80220c : null, mdpUpsellOfferRequest2 != null ? mdpUpsellOfferRequest2.f80221d : null);
        }
        try {
            this.f66474a.mo35764a(status, (MdpUpsellOfferResponse) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66473g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api callback for failure:{%s} with error: %s", bryx.m114908a(status), bryx.m114908a(e.getMessage()));
        }
    }
}
