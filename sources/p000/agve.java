package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: agve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agve {

    /* renamed from: a */
    public static final srn f66617a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    static MdpDataPlanStatusResponse m55159a(String str) {
        MdpDataPlanStatusResponse h;
        if (!cfmd.m140089i() || (h = agpk.m54726a().mo35848h(str)) == null || h.mo44037a() == null) {
            return null;
        }
        bxun a = bxzt.m124579a(h.mo44037a(), bxzt.m124580a(System.currentTimeMillis()));
        bxzr.m124577b(a);
        long j = a.f164863a;
        if (j == 0 ? a.f164864b >= 0 : j >= 0) {
            if (bxzr.m124574a(a) <= cfmd.f184339a.mo6606a().mo81452d()) {
                return h;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m55166b(agtw agtw) {
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = agtw.f66540l;
        if (mdpCarrierPlanIdResponse != null && !TextUtils.isEmpty(mdpCarrierPlanIdResponse.f80151a)) {
            String str = mdpCarrierPlanIdResponse.f80151a;
            agoy agoy = new agoy();
            if (!TextUtils.isEmpty(cfmv.m140304c())) {
                str = cfmv.m140304c();
                if (agoy.f66217b == null) {
                    agoy.f66217b = new Bundle();
                }
                agoy.f66217b.putString("for_test", "ui_test");
            }
            if (cfmq.m140246q()) {
                agoy.f66218c = agvh.m55172b();
            }
            agoy.f66216a = str;
            aucb a = agtw.mo36103g().mo35771a(agoy.mo35811a());
            a.mo50373a(new agvc(agtw));
            a.mo50372a(new agur(agtw));
            if (cflu.m139984b()) {
                m55163a(a, "getUpsellOffer", new agus(agtw));
                return;
            }
            return;
        }
        ((bnsl) f66617a.mo68388c()).mo68405a("GetUpsellOffer Failed due to empty carrier plan id");
    }

    /* renamed from: a */
    public static void m55160a(agtw agtw) {
        agph g = agtw.mo36103g();
        agoj agoj = new agoj();
        agoj.mo35775a("AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI");
        if (cfmq.m140246q()) {
            agoj.mo35774a(agvh.m55172b());
        }
        aucb a = g.mo35768a(agoj.f66175a);
        a.mo50373a(new aguu(agtw));
        a.mo50372a(new aguv(agtw));
        if (cflu.m139984b()) {
            m55162a(a, "getCarrierPlanId", agtw);
        }
    }

    /* renamed from: b */
    public static void m55167b(String str, agtw agtw) {
        agop agop = new agop();
        if (!TextUtils.isEmpty(cfmv.m140304c())) {
            str = cfmv.m140304c();
            MdpDataPlanStatusRequest mdpDataPlanStatusRequest = agop.f66187a;
            if (mdpDataPlanStatusRequest.f80183b == null) {
                mdpDataPlanStatusRequest.f80183b = new Bundle();
            }
            agop.f66187a.f80183b.putString("for_test", "ui_test");
        }
        if (cfmq.m140246q()) {
            agop.mo35797a(agvh.m55172b());
        }
        MdpDataPlanStatusRequest mdpDataPlanStatusRequest2 = agop.f66187a;
        mdpDataPlanStatusRequest2.f80182a = str;
        if (mdpDataPlanStatusRequest2.f80183b == null) {
            mdpDataPlanStatusRequest2.f80183b = new Bundle();
        }
        agop.f66187a.f80183b.putString("bypass_local_cache", "true");
        agop.f66187a.f80183b.putString("bypass_gtaf_cache", "true");
        agop.f66187a.f80183b.putString("bypass_dpa_cache", "true");
        aucb a = agtw.mo36103g().mo35769a(agop.f66187a);
        a.mo50373a(new agva(agtw));
        a.mo50372a(new agvb(agtw));
        if (cflu.m139984b()) {
            m55162a(a, "getDataPlanStatus", agtw);
        }
    }

    /* renamed from: a */
    public static void m55161a(agtw agtw, boolean z) {
        if (agtw != null) {
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = agtw.f66540l;
            if (mdpCarrierPlanIdResponse != null) {
                String str = mdpCarrierPlanIdResponse.f80151a;
                agqr agqr = new agqr();
                agqr.f66284a.f80283a = str;
                agqr.f66284a.f80284b = new ParcelUuid(UUID.randomUUID());
                agqr.f66284a.f80286d = Long.valueOf(System.currentTimeMillis());
                if (z) {
                    if (agpk.m54727d()) {
                        agqj agqj = new agqj();
                        agqj.mo35935a(8);
                        agqr.mo35951a(agqj.f66280a);
                    } else if (agtw.mo36105i() == null) {
                        ((bnsl) f66617a.mo68388c()).mo68405a("Cannot set consent status without text version");
                        agtw.mo36095a(new NullPointerException());
                        return;
                    } else {
                        agqj agqj2 = new agqj();
                        agqj2.mo35935a(1);
                        agqr.mo35951a(agqj2.f66280a);
                        agqr.f66284a.f80287e = agtw.mo36105i().f80268g;
                    }
                } else if (agpk.m54727d()) {
                    agqj agqj3 = new agqj();
                    agqj3.mo35935a(9);
                    agqr.mo35951a(agqj3.f66280a);
                } else {
                    agqj agqj4 = new agqj();
                    agqj4.mo35935a(2);
                    agqr.mo35951a(agqj4.f66280a);
                }
                if (cfmq.m140246q()) {
                    agqr.mo35952a(agvh.m55172b());
                }
                aucb a = agtw.mo36103g().mo35773a(agqr.f66284a);
                a.mo50373a(new aguy(z, str, agtw));
                a.mo50372a(new aguz(z, agtw));
                if (cflu.m139984b()) {
                    m55162a(a, "setConsentStatus", agtw);
                    return;
                }
                return;
            }
            ((bnsl) f66617a.mo68388c()).mo68405a("Response error on consent information received");
            agtw.mo36095a(new NullPointerException());
            return;
        }
        ((bnsl) f66617a.mo68388c()).mo68405a("State is invalid on consent information received");
        new NullPointerException();
        throw null;
    }

    /* renamed from: a */
    private static void m55162a(aucb aucb, String str, agtw agtw) {
        m55163a(aucb, str, new agut(agtw));
    }

    /* renamed from: a */
    private static void m55163a(aucb aucb, String str, agvd agvd) {
        snp.m35704b(9).execute(new aguq(aucb, str, agvd, new adzt()));
    }

    /* renamed from: a */
    static final /* synthetic */ void m55164a(aucb aucb, String str, agvd agvd, Handler handler) {
        try {
            aucu.m76783a(aucb, cflu.m139986d(), TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) f66617a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("%s task has ExecutionException:\n", str);
            agvd.mo36126a(e);
            handler.post(agvd);
        } catch (InterruptedException e2) {
            bnsl bnsl2 = (bnsl) f66617a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68420a("%s task has been interrupted:\n", str);
            agvd.mo36126a(e2);
            handler.post(agvd);
        } catch (TimeoutException e3) {
            bnsl bnsl3 = (bnsl) f66617a.mo68388c();
            bnsl3.mo68437a(e3);
            bnsl3.mo68420a("%s task timeout:\n", str);
            agvd.mo36126a(e3);
            handler.post(agvd);
        }
    }

    /* renamed from: a */
    public static void m55165a(String str, agtw agtw) {
        agph g = agtw.mo36103g();
        GetConsentInformationRequest getConsentInformationRequest = new agql().f66281a;
        getConsentInformationRequest.f80271a = str;
        getConsentInformationRequest.f80272b = true;
        if (cfmq.m140246q()) {
            agql agql = new agql(getConsentInformationRequest);
            agql.mo35938a(agvh.m55172b());
            getConsentInformationRequest = agql.f66281a;
        }
        aucb a = g.mo35772a(getConsentInformationRequest);
        a.mo50373a(new aguw(agtw));
        a.mo50372a(new agux(agtw));
        if (cflu.m139984b()) {
            m55162a(a, "getConsentInformation", agtw);
        }
    }
}
