package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: agto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agto extends aaab {

    /* renamed from: d */
    public static final srn f66495d = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public final SetConsentStatusRequest f66496a;

    /* renamed from: b */
    public Context f66497b;

    /* renamed from: c */
    public agqd f66498c;

    /* renamed from: e */
    private final agrf f66499e;

    /* renamed from: f */
    private agrl f66500f;

    /* renamed from: g */
    private bygb f66501g;

    /* renamed from: h */
    private final bqgj f66502h;

    /* renamed from: a */
    private final synchronized agrl m55102a() {
        if (this.f66500f == null) {
            this.f66500f = agrl.m54943a(this.f66497b);
        }
        return this.f66500f;
    }

    public agto(agrf agrf, SetConsentStatusRequest setConsentStatusRequest) {
        super(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, "SetConsentStatus");
        this.f66499e = agrf;
        if (cfmq.m140247r()) {
            if (setConsentStatusRequest != null && setConsentStatusRequest.f80289g == null) {
                agqr agqr = new agqr(setConsentStatusRequest);
                Long valueOf = Long.valueOf(agrl.m54947b());
                SetConsentStatusRequest setConsentStatusRequest2 = agqr.f66284a;
                setConsentStatusRequest2.f80289g = valueOf;
                setConsentStatusRequest = setConsentStatusRequest2;
            }
            if (setConsentStatusRequest != null && setConsentStatusRequest.f80288f == null) {
                agqr agqr2 = new agqr(setConsentStatusRequest);
                agqr2.mo35952a((Integer) 0);
                setConsentStatusRequest = agqr2.f66284a;
            }
        }
        this.f66496a = setConsentStatusRequest;
        this.f66502h = snp.m35704b(10);
    }

    /* renamed from: a */
    private final void m55103a(Context context, Long l, bygb bygb, Long l2) {
        this.f66502h.execute(new agtm(this, context, l, bygb, l2));
    }

    /* renamed from: a */
    private final void m55104a(Pair pair, boolean z) {
        this.f66502h.execute(new agtn(this, pair, z));
    }

    /* renamed from: a */
    private final void m55105a(bygb bygb) {
        String str;
        agqd agqd = this.f66498c;
        if (agqd != null) {
            str = agqd.f66263c;
        } else {
            str = "CLIENT_TestInvalid";
        }
        f66495d.mo26019b(agyt.m55307c()).mo68424a("SetConsent <%s> for %s.", this.f66496a.f80283a, this.f66498c.f66263c);
        try {
            if (cfmq.m140240k()) {
                agrl a = m55102a();
                SetConsentStatusRequest setConsentStatusRequest = this.f66496a;
                Integer num = setConsentStatusRequest.f80288f;
                Long l = setConsentStatusRequest.f80289g;
                boot a2 = a.mo35978a(16, "Local_Cache", str);
                bxvd bxvd = (bxvd) a2.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a2);
                bxvd da = bopj.f134131b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bopj) da.f164949b).f134133a = bygb.mo3214a();
                bopj bopj = (bopj) da.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boot boot = boot.f133997z;
                bopj.getClass();
                ((boot) bxvd.f164949b).f134021x = bopj;
                if (cfmq.m140238i()) {
                    if (setConsentStatusRequest != null) {
                        agrl.m54945a(bxvd, setConsentStatusRequest.f80290h);
                    }
                }
                String str2 = setConsentStatusRequest.f80283a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                str2.getClass();
                ((boot) bxvd.f164949b).f134000c = str2;
                long longValue = l.longValue();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ((boot) bxvd.f164949b).f134015r = longValue;
                a.mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_SET_CONSENT_STATUS_RESPONSE_SUCCESS, num);
            }
            this.f66499e.mo35767a(Status.f30107a);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66495d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Unable to complete API callback for success; error: %s", bryx.m114908a(e.getMessage()));
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        long j;
        String str;
        int i;
        int i2;
        Context context2 = context;
        if (cfmv.m140303b() > 0 && cfmv.m140326y() > 0) {
            bqhi.m112839a(cfmv.m140326y(), TimeUnit.MILLISECONDS);
        }
        this.f66497b = context2;
        agpk a = agpk.m54726a();
        if (a == null) {
            ((bnsl) f66495d.mo68388c()).mo68405a("MDP_NOT_ENABLED. Cache is missing/disabled.");
            mo6503a(new Status(27013, "MDP_NOT_ENABLED. Cache is missing/disabled."));
            return;
        }
        f66495d.mo26019b(agyt.m55307c()).mo68424a("Exec SetConsent. req:{%s} enabled:%b", this.f66496a, agqg.m54865t());
        if (agpk.m54727d() || agqg.m54865t().booleanValue()) {
            agqd b = agqe.m54828a().mo35932b(this.f66496a.f80283a, null);
            this.f66498c = b;
            if (b == null) {
                ((bnsl) f66495d.mo68388c()).mo68405a("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId");
                String valueOf = String.valueOf(this.f66496a.f80283a);
                mo6503a(new Status(27005, valueOf.length() == 0 ? new String("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ") : "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ".concat(valueOf)));
                return;
            }
            agrl a2 = m55102a();
            SetConsentStatusRequest setConsentStatusRequest = this.f66496a;
            boot a3 = a2.mo35978a(15, "GTAF_Server", this.f66498c.f66263c);
            bxvd bxvd = (bxvd) a3.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a3);
            if (cfmq.m140238i()) {
                agrl.m54945a(bxvd, setConsentStatusRequest.f80290h);
            }
            String str2 = setConsentStatusRequest.f80283a;
            boolean z = false;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            str2.getClass();
            ((boot) bxvd.f164949b).f134000c = str2;
            Long l = setConsentStatusRequest.f80289g;
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
            bxvd da = bopi.f134125e.mo74144da();
            int i3 = setConsentStatusRequest.f80287e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bopi) da.f164949b).f134130d = i3;
            bxvd da2 = bopl.f134141c.mo74144da();
            long mostSignificantBits = setConsentStatusRequest.f80284b.getUuid().getMostSignificantBits();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bopl) da2.f164949b).f134143a = mostSignificantBits;
            long leastSignificantBits = setConsentStatusRequest.f80284b.getUuid().getLeastSignificantBits();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bopl) da2.f164949b).f134144b = leastSignificantBits;
            bopl bopl = (bopl) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bopl.getClass();
            ((bopi) da.f164949b).f134127a = bopl;
            bygb a4 = bygb.m124774a(setConsentStatusRequest.f80285c.f80270a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bopi) da.f164949b).f134128b = a4.mo3214a();
            Long l2 = setConsentStatusRequest.f80286d;
            if (l2 != null) {
                bxyk a5 = bxzt.m124580a(l2.longValue());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a5.getClass();
                ((bopi) da.f164949b).f134129c = a5;
            }
            bopi bopi = (bopi) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bopi.getClass();
            ((boot) bxvd.f164949b).f134012o = bopi;
            a2.mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_SET_CONSENT_STATUS_REQUEST, setConsentStatusRequest.f80288f);
            String str3 = this.f66498c.f66264d;
            Long k = a.mo35851k(str3);
            if (k == null || k.longValue() <= 0) {
                ((bnsl) f66495d.mo68388c()).mo68405a("MDP_INVALID_ARGUMENT. Cannot find matching carrier.");
                mo6503a(new Status(27000, "MDP_INVALID_ARGUMENT. Cannot find matching carrier."));
            } else if (!agpk.m54727d()) {
                if (agqg.m54845L().booleanValue() || (i2 = this.f66496a.f80285c.f80270a) == 2 || i2 == 1 || i2 == 5) {
                    bygb bygb = bygb.UNRECOGNIZED;
                    if (a.mo35837b(k, str3) != null && (bygb = bygb.m124774a(a.mo35837b(k, str3).f165204f)) == null) {
                        bygb = bygb.UNRECOGNIZED;
                    }
                    bygb a6 = bygb.m124774a(this.f66496a.f80285c.f80270a);
                    if (bygb == bygb.CONSENTED && a6 == bygb.DECLINED) {
                        a6 = bygb.REVOKED;
                    } else if (bygb == bygb.REVOKED && a6 == bygb.DECLINED) {
                        a6 = bygb.REVOKED;
                    }
                    if (cfmq.m140240k()) {
                        this.f66501g = a6;
                    }
                    Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                    Long l3 = this.f66496a.f80286d;
                    if (l3 == null) {
                        l3 = valueOf2;
                    }
                    if (!cflx.m140025l() || (l3.longValue() <= valueOf2.longValue() && l3.longValue() >= valueOf2.longValue() - cflx.m140016c())) {
                        valueOf2 = l3;
                    }
                    bxvd da3 = bxzx.f165197j.mo74144da();
                    long longValue = k.longValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bxzx bxzx = (bxzx) da3.f164949b;
                    bxzx.f165199a = longValue;
                    str3.getClass();
                    bxzx.f165200b = str3;
                    String str4 = this.f66498c.f66263c;
                    str4.getClass();
                    bxzx.f165201c = str4;
                    SetConsentStatusRequest setConsentStatusRequest2 = this.f66496a;
                    String str5 = setConsentStatusRequest2.f80283a;
                    str5.getClass();
                    bxzx.f165202d = str5;
                    String uuid = setConsentStatusRequest2.f80284b.getUuid().toString();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bxzx bxzx2 = (bxzx) da3.f164949b;
                    uuid.getClass();
                    bxzx2.f165203e = uuid;
                    bxzx2.f165204f = a6.mo3214a();
                    long longValue2 = valueOf2.longValue();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bxzx bxzx3 = (bxzx) da3.f164949b;
                    bxzx3.f165205g = longValue2;
                    bxzx3.f165206h = this.f66496a.f80287e;
                    bxzx bxzx4 = (bxzx) da3.mo74062i();
                    if (!a.mo35831a(k, str3, bxzx4)) {
                        bnsl bnsl = (bnsl) f66495d.mo68387b();
                        bryx a7 = bryx.m114908a(k);
                        bryx bryx = new bryx(2, str3);
                        bygb a8 = bygb.m124774a(bxzx4.f165204f);
                        if (a8 == null) {
                            a8 = bygb.UNRECOGNIZED;
                        }
                        bnsl.mo68425a("Error in saving consent record <%s, %s>: %s", a7, bryx, bryx.m114908a(a8));
                        mo6503a(new Status(27016, "MDP_INTERNAL_ERROR. Cache update failed."));
                        return;
                    }
                    m55105a(a6);
                    bygb a9 = bygb.m124774a(bxzx4.f165204f);
                    if (a9 == null) {
                        a9 = bygb.UNRECOGNIZED;
                    }
                    if (a9 == bygb.DECLINED && !cfmg.m140138d()) {
                        mo36086a(bmvz.f131120a, a6);
                    } else if (cflr.m139934k() && cflr.m139932i() && cflr.m139931h() && cflr.m139933j()) {
                        agsl a10 = agsl.m55046a();
                        a10.f66368f.execute(new agsk(a10, this.f66496a.f80288f));
                    } else if (!agyq.m55276a(context)) {
                        ((bnsl) f66495d.mo68388c()).mo68405a("MDP_NO_NETWORK: Need a valid network connection.");
                        mo36086a(bmxv.m108566b(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection.")), a6);
                    } else {
                        m55103a(context2, k, a6, valueOf2);
                        bygb a11 = bygb.m124774a(bxzx4.f165204f);
                        if (a11 == null) {
                            a11 = bygb.UNRECOGNIZED;
                        }
                        if (a11 == bygb.CONSENTED && bygb != bygb.CONSENTED) {
                            z = true;
                        }
                        if (z || cfmg.m140138d()) {
                            m55104a(new Pair(k, this.f66498c.f66264d), z);
                        }
                    }
                } else {
                    ((bnsl) f66495d.mo68388c()).mo68405a("MDP_INVALID_ARGUMENT. Can only set CONSENTED, DECLINED or REVOKED unless testing.");
                    mo6503a(new Status(27000, "MDP_INVALID_ARGUMENT. Can only set CONSENTED, DECLINED or REVOKED unless testing."));
                }
            } else if (agqg.m54845L().booleanValue() || (i = this.f66496a.f80285c.f80270a) == 8 || i == 9) {
                agpk a12 = agpk.m54726a();
                bygb a13 = bygb.m124774a(this.f66496a.f80285c.f80270a);
                if (cfmq.m140240k()) {
                    this.f66501g = a13;
                }
                agqd agqd = this.f66498c;
                if (agqd != null) {
                    str = agqd.f66263c;
                } else {
                    str = "CLIENT_TestInvalid";
                }
                Long valueOf3 = Long.valueOf(System.currentTimeMillis());
                Long l4 = this.f66496a.f80286d;
                if (l4 == null) {
                    l4 = valueOf3;
                }
                if (l4.longValue() <= valueOf3.longValue() && l4.longValue() >= valueOf3.longValue() - cflx.m140016c()) {
                    valueOf3 = l4;
                }
                bxzx c = a12.mo35843c();
                bxvd bxvd2 = (bxvd) c.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) c);
                bygb a14 = bygb.m124774a(((bxzx) bxvd2.f164949b).f165204f);
                if (a14 == null) {
                    a14 = bygb.UNRECOGNIZED;
                }
                String str6 = "MDP_NO_NETWORK: Need a valid network connection.";
                long longValue3 = valueOf3.longValue();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bxzx bxzx5 = (bxzx) bxvd2.f164949b;
                bxzx bxzx6 = bxzx.f165197j;
                bxzx5.f165205g = longValue3;
                bxzx5.f165204f = a13.mo3214a();
                if (str != null) {
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    str.getClass();
                    ((bxzx) bxvd2.f164949b).f165201c = str;
                }
                bxzx bxzx7 = (bxzx) bxvd2.mo74062i();
                if (!a12.mo35827a(bxzx7)) {
                    bnsl bnsl2 = (bnsl) f66495d.mo68387b();
                    bryx a15 = bryx.m114908a(k);
                    bryx bryx2 = new bryx(2, str3);
                    bygb a16 = bygb.m124774a(bxzx7.f165204f);
                    if (a16 == null) {
                        a16 = bygb.UNRECOGNIZED;
                    }
                    bnsl2.mo68425a("Error in saving device consent record <%s, %s>: %s", a15, bryx2, bryx.m114908a(a16));
                    mo6503a(new Status(27016, "MDP_INTERNAL_ERROR. Cache update failed."));
                    return;
                }
                m55105a(a13);
                if (!agyq.m55276a(this.f66497b)) {
                    ((bnsl) f66495d.mo68388c()).mo68405a(str6);
                    mo36086a(bmxv.m108566b(new Status(27018, str6)), a13);
                    return;
                }
                m55103a(this.f66497b, k, a13, valueOf3);
                if (a14 != bygb.OPT_IN && a13 == bygb.OPT_IN) {
                    z = true;
                }
                if (z || cfmg.m140138d()) {
                    m55104a(new Pair(k, this.f66498c.f66264d), z);
                }
            } else {
                ((bnsl) f66495d.mo68388c()).mo68405a("MDP_INVALID_ARGUMENT. Can only set OPT_IN, OPT_OUT unless testing.");
                mo6503a(new Status(27000, "MDP_INVALID_ARGUMENT. Can only set OPT_IN, OPT_OUT unless testing."));
            }
        } else {
            ((bnsl) f66495d.mo68388c()).mo68405a("MDP_NOT_ENABLED. Feature is off.");
            mo6503a(new Status(27013, "MDP_NOT_ENABLED. Feature is off."));
        }
    }

    /* renamed from: a */
    public final void mo36086a(bmxv bmxv, bygb bygb) {
        long j;
        bmxv bmxv2 = bmvz.f131120a;
        if (cfmq.m140240k()) {
            bmxv2 = bmxv.m108566b(bygb);
        }
        agrl a = m55102a();
        SetConsentStatusRequest setConsentStatusRequest = this.f66496a;
        String str = setConsentStatusRequest.f80283a;
        String str2 = this.f66498c.f66263c;
        Integer num = setConsentStatusRequest.f80288f;
        Long l = setConsentStatusRequest.f80289g;
        boot a2 = a.mo35978a(16, "GTAF_Server", str2);
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a2);
        String a3 = stm.m36299a(str);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        a3.getClass();
        ((boot) bxvd.f164949b).f134000c = a3;
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
        if (bmxv.mo66813a()) {
            long j2 = (long) ((Status) bmxv.mo66814b()).f30115i;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((boot) bxvd.f164949b).f134003f = j2;
        }
        if (cfmq.m140240k() && bmxv2.mo66813a()) {
            bxvd da = bopj.f134131b.mo74144da();
            bygb bygb2 = (bygb) bmxv2.mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bopj) da.f164949b).f134133a = bygb2.mo3214a();
            bopj bopj = (bopj) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bopj.getClass();
            ((boot) bxvd.f164949b).f134021x = bopj;
        }
        a.mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_SET_CONSENT_STATUS_RESPONSE_RPC, num);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        String str;
        Integer num;
        Long l;
        String str2;
        Integer num2;
        Long l2;
        f66495d.mo26019b(agyt.m55307c()).mo68420a("Error status: {%s}", status);
        agqd agqd = this.f66498c;
        String str3 = agqd != null ? agqd.f66263c : "CLIENT_TestInvalid";
        if (cfmq.m140240k()) {
            agrl a = m55102a();
            SetConsentStatusRequest setConsentStatusRequest = this.f66496a;
            Bundle bundle = setConsentStatusRequest.f80290h;
            long j = (long) status.f30115i;
            bygb bygb = this.f66501g;
            if (setConsentStatusRequest != null) {
                str2 = setConsentStatusRequest.f80283a;
            } else {
                str2 = null;
            }
            if (setConsentStatusRequest != null) {
                num2 = setConsentStatusRequest.f80288f;
            } else {
                num2 = null;
            }
            if (setConsentStatusRequest != null) {
                l2 = setConsentStatusRequest.f80289g;
            } else {
                l2 = null;
            }
            boot a2 = a.mo35978a(16, "Error", str3);
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a2);
            if (cfmq.m140240k() && bygb != null) {
                bxvd da = bopj.f134131b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bopj) da.f164949b).f134133a = bygb.mo3214a();
                bopj bopj = (bopj) da.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boot boot = boot.f133997z;
                bopj.getClass();
                ((boot) bxvd.f164949b).f134021x = bopj;
            }
            a.mo36001a(bxvd, bundle, bygd.MODULE_SET_CONSENT_STATUS_RESPONSE_FAILURE, j, str2, num2, l2);
        } else if (cfmq.m140235f()) {
            agrl a3 = m55102a();
            Bundle bundle2 = this.f66496a.f80290h;
            bygd bygd = bygd.MODULE_SET_CONSENT_STATUS_RESPONSE_FAILURE;
            long j2 = (long) status.f30115i;
            SetConsentStatusRequest setConsentStatusRequest2 = this.f66496a;
            if (setConsentStatusRequest2 != null) {
                str = setConsentStatusRequest2.f80283a;
            } else {
                str = null;
            }
            if (setConsentStatusRequest2 != null) {
                num = setConsentStatusRequest2.f80288f;
            } else {
                num = null;
            }
            if (setConsentStatusRequest2 != null) {
                l = setConsentStatusRequest2.f80289g;
            } else {
                l = null;
            }
            a3.mo35991a(bundle2, bygd, j2, str3, str, num, l);
        } else {
            agrl a4 = m55102a();
            bygd bygd2 = bygd.MODULE_SET_CONSENT_STATUS_RESPONSE_FAILURE;
            long j3 = (long) status.f30115i;
            SetConsentStatusRequest setConsentStatusRequest3 = this.f66496a;
            a4.mo36004a(bygd2, j3, str3, setConsentStatusRequest3 != null ? setConsentStatusRequest3.f80283a : null, setConsentStatusRequest3 != null ? setConsentStatusRequest3.f80288f : null, setConsentStatusRequest3 != null ? setConsentStatusRequest3.f80289g : null);
        }
        try {
            this.f66499e.mo35767a(status);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66495d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete SetConsentStatusOperation because of error %s, failure status: {%s}", bryx.m114908a(e.getMessage()), bryx.m114908a(status));
        }
    }
}
