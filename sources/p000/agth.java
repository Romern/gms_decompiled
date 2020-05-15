package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: agth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agth extends aaab {

    /* renamed from: a */
    public static final Long f66446a = -1L;

    /* renamed from: g */
    public static final srn f66447g = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    public final MdpCarrierPlanIdRequest f66448b;

    /* renamed from: c */
    public volatile Context f66449c;

    /* renamed from: d */
    public btap f66450d;

    /* renamed from: e */
    public String f66451e;

    /* renamed from: f */
    public String f66452f;

    /* renamed from: h */
    private final agrf f66453h;

    /* renamed from: i */
    private final Object f66454i = new Object();

    /* renamed from: j */
    private final Object f66455j = new Object();

    /* renamed from: k */
    private agrl f66456k;

    /* renamed from: l */
    private agqd f66457l;

    /* renamed from: o */
    private boolean f66458o;

    /* renamed from: p */
    private final bqgj f66459p;

    /* renamed from: a */
    private final agrl m55073a() {
        agrl agrl;
        synchronized (this.f66454i) {
            if (this.f66456k == null) {
                this.f66456k = agrl.m54943a(this.f66449c);
            }
            agrl = this.f66456k;
        }
        return agrl;
    }

    /* renamed from: b */
    private final boolean m55077b() {
        boolean z;
        synchronized (this.f66455j) {
            z = this.f66458o;
        }
        return z;
    }

    public agth(agrf agrf, MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest) {
        super(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, "GetCarrierPlanId");
        this.f66453h = agrf;
        if (cfmq.m140247r()) {
            if (mdpCarrierPlanIdRequest != null && mdpCarrierPlanIdRequest.f80150d == null) {
                agoj agoj = new agoj(mdpCarrierPlanIdRequest);
                Long valueOf = Long.valueOf(agrl.m54947b());
                MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest2 = agoj.f66175a;
                mdpCarrierPlanIdRequest2.f80150d = valueOf;
                mdpCarrierPlanIdRequest = mdpCarrierPlanIdRequest2;
            }
            if (mdpCarrierPlanIdRequest != null && mdpCarrierPlanIdRequest.f80149c == null) {
                agoj agoj2 = new agoj(mdpCarrierPlanIdRequest);
                agoj2.mo35774a((Integer) 0);
                mdpCarrierPlanIdRequest = agoj2.f66175a;
            }
        }
        this.f66448b = mdpCarrierPlanIdRequest;
        this.f66459p = snp.m35704b(10);
    }

    /* renamed from: a */
    private final MdpCarrierPlanIdResponse m55074a(MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse, String str) {
        agol agol = new agol(mdpCarrierPlanIdResponse);
        agol.f66176a = agqe.m54828a().mo35931a(str, this.f66448b.f80147a);
        return agol.mo35778a();
    }

    /* renamed from: a */
    private final void m55075a(MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse, boolean z, boolean z2) {
        f66447g.mo26019b(agyt.m55307c()).mo68428a("ClientCpid <%d, %s> is updated for %s. FromCache:%b, CacheUpdated:%b, isCpidManagementEnabled: %b", Long.valueOf(mdpCarrierPlanIdResponse.f80155e), mdpCarrierPlanIdResponse.f80151a, this.f66457l.f66263c, Boolean.valueOf(z), Boolean.valueOf(z2), agqg.m54857l());
        if (cfmq.m140235f()) {
            m55073a().mo36008a(this.f66448b, mdpCarrierPlanIdResponse, z, this.f66457l.f66263c);
        } else {
            m55073a().mo36008a((MdpCarrierPlanIdRequest) null, mdpCarrierPlanIdResponse, z, this.f66457l.f66263c);
        }
        if (cflx.f184311a.mo6606a().mo81438p()) {
            if (!this.f66448b.mo44020b().isEmpty()) {
                this.f66448b.mo44020b();
                mdpCarrierPlanIdResponse = m55074a(mdpCarrierPlanIdResponse, this.f66448b.mo44020b());
            } else if (!cflx.m140024k().isEmpty()) {
                cflx.m140024k();
                mdpCarrierPlanIdResponse = m55074a(mdpCarrierPlanIdResponse, cflx.m140024k());
            }
        }
        if (agqg.m54842I().booleanValue()) {
            if (m55077b()) {
                ((bnsl) f66447g.mo68388c()).mo68420a("The operation has completed before. Drop the success callback for %s.", this.f66457l.f66263c);
                return;
            }
            m55076a(true);
        }
        try {
            this.f66453h.mo35762a(Status.f30107a, mdpCarrierPlanIdResponse);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66447g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api success callback for %s with exception: %s", this.f66457l.f66263c, bryx.m114908a(e.getMessage()));
        }
    }

    /* renamed from: a */
    private final void m55076a(boolean z) {
        synchronized (this.f66455j) {
            this.f66458o = z;
        }
    }

    /* renamed from: a */
    public final MdpCarrierPlanIdResponse mo36080a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new MdpCarrierPlanIdResponse(jSONObject.getString("cpid"), jSONObject.getLong("ttlSeconds"));
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        long j;
        Status status;
        int i;
        int i2;
        Long b;
        btap a;
        Long f;
        if (cfmv.m140303b() > 0 && cfmv.m140322u() > 0) {
            bqhi.m112839a(cfmv.m140322u(), TimeUnit.MILLISECONDS);
        }
        f66447g.mo26019b(agyt.m55307c()).mo68420a("Exec GetCpid. req:{%s}", this.f66448b);
        this.f66449c = context;
        this.f66452f = agyq.m55288i(context);
        if (agqg.m54842I().booleanValue()) {
            m55076a(false);
        }
        if (cflx.m140023j()) {
            f66447g.mo26019b(agyt.m55307c()).mo68405a("MDP_MODULE_DISABLED. Likely because the carrier is not supported.");
            mo6503a(new Status(27101, "MDP_MODULE_DISABLED. Likely because the carrier is not supported."));
            return;
        }
        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = this.f66448b;
        if (mdpCarrierPlanIdRequest != null && !mdpCarrierPlanIdRequest.f80147a.isEmpty()) {
            this.f66457l = agqe.m54828a().mo35930a(this.f66448b.f80147a);
            agqg.m54857l();
            agrl a2 = m55073a();
            MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest2 = this.f66448b;
            agqd agqd = this.f66457l;
            String str2 = "CLIENT_TestInvalid";
            if (agqd != null) {
                str = agqd.f66263c;
            } else {
                str = str2;
            }
            boot a3 = a2.mo35978a(2, "GTAF_Server", str);
            bxvd bxvd = (bxvd) a3.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a3);
            Long l = mdpCarrierPlanIdRequest2.f80150d;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            ((boot) bxvd.f164949b).f134015r = j;
            if (cfmq.m140238i()) {
                agrl.m54945a(bxvd, mdpCarrierPlanIdRequest2.f80148b);
            }
            a2.mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_CPID_REQUEST, mdpCarrierPlanIdRequest2.f80149c);
            if (this.f66457l == null) {
                ((bnsl) f66447g.mo68388c()).mo68405a("MDP_INVALID_API_KEY. Need an authorized API key.");
                mo6503a(new Status(27004, "MDP_INVALID_API_KEY. Need an authorized API key."));
            } else if (cfmv.f184430a.mo6606a().mo81585j() && agyq.m55287h(context) == null) {
                mo6503a(new Status(27054, "MDP_MCC_MNC_UNSUPPORTED. No supported MCC/MNC by GTAF in the device SIMs."));
            } else if (!cfmv.f184430a.mo6606a().mo81584i() || agqe.m54830a(this.f66457l, agyq.m55285f(context))) {
                String str3 = null;
                if (agqg.m54857l().booleanValue() && !this.f66457l.f66261a.equals("AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4") && !this.f66448b.mo44019a() && (!cfmd.m140082b() || !this.f66457l.f66261a.equals("AIzaSyCTa7aViyHnB3GLIqhL5hQFZGb675SoCIA"))) {
                    agpk a4 = agpk.m54726a();
                    if (!(TextUtils.isEmpty(this.f66452f) || (a = a4.mo35825a((b = a4.mo35839b(this.f66452f)))) == null || (f = a4.mo35846f(this.f66452f)) == null)) {
                        long longValue = f.longValue() - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                        if (!cfmd.m140086f() || longValue >= 0) {
                            String e = a4.mo35845e(this.f66452f);
                            if (!TextUtils.isEmpty(e)) {
                                MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest3 = this.f66448b;
                                Bundle bundle = mdpCarrierPlanIdRequest3.f80148b;
                                String string = (bundle == null || bundle.size() <= 0) ? null : mdpCarrierPlanIdRequest3.f80148b.getString("cpid_to_be_invalidated");
                                if (!cfmd.f184339a.mo6606a().mo81462n() || TextUtils.isEmpty(e) || !e.equals(string)) {
                                    agol agol = new agol(agqe.m54828a().mo35931a(e, this.f66448b.f80147a), longValue);
                                    agol.f66177b = a.f148031c;
                                    agol.f66178c = a.f148032d;
                                    agol.f66179d = b.longValue();
                                    agol.f66180e = e;
                                    agol.f66181f = 1;
                                    bszh bszh = a.f148033e;
                                    if (bszh == null) {
                                        bszh = bszh.f147822d;
                                    }
                                    agol.f66182g = agsc.m55041a(bszh);
                                    MdpCarrierPlanIdResponse a5 = agol.mo35778a();
                                    if (cfmq.m140247r()) {
                                        agol agol2 = new agol(a5);
                                        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest4 = this.f66448b;
                                        agol2.f66183h = mdpCarrierPlanIdRequest4.f80149c;
                                        agol2.f66184i = mdpCarrierPlanIdRequest4.f80150d;
                                        a5 = agol2.mo35778a();
                                    }
                                    m55075a(a5, true, false);
                                    return;
                                }
                                m55073a().mo36003a(bygd.CACHING_INVALIDATE_CPID_REQUEST, 19, "Local_Cache", this.f66457l.f66263c);
                                if (!agpk.m54726a().mo35835a(this.f66452f, b, null, 0)) {
                                    ((bnsl) f66447g.mo68388c()).mo68405a("Invalidate carrier cpid: cache update failed!");
                                }
                            }
                        }
                    }
                    f66447g.mo26019b(agyt.m55307c()).mo68405a("No cached CPID found");
                }
                f66447g.mo26019b(agyt.m55307c()).mo68405a("Getting cpid from server");
                if (agqg.m54870y().booleanValue()) {
                    if (!agyq.m55276a(this.f66449c)) {
                        ((bnsl) f66447g.mo68388c()).mo68405a("MDP_NO_NETWORK: Need a valid network connection.");
                        mo6503a(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."));
                        return;
                    } else if (!cfmq.m140243n() && !agyq.m55280b(this.f66449c)) {
                        int i3 = Build.VERSION.SDK_INT;
                    }
                }
                agry a6 = agrz.m55030a(this.f66449c, cfmv.m140318q(), this.f66448b.f80147a, agqg.m54846a().intValue());
                try {
                    MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest5 = this.f66448b;
                    this.f66450d = a6.mo36041a(mdpCarrierPlanIdRequest5.f80149c, mdpCarrierPlanIdRequest5.f80150d, this.f66457l.f66263c);
                    status = null;
                } catch (gid e2) {
                    bnsl bnsl = (bnsl) f66447g.mo68388c();
                    bnsl.mo68437a(e2);
                    bnsl.mo68420a("MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure with message: %s", bryx.m114908a(e2.getMessage()));
                    status = new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure.");
                } catch (chuw e3) {
                    chuv chuv = e3.f189236a;
                    if (chuv != null && chuv.f189233s == chus.NOT_FOUND) {
                        String valueOf = String.valueOf(chuv);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                        sb.append("MDP_UNSUPPORTED_CARRIER. ");
                        sb.append(valueOf);
                        status = new Status(27001, sb.toString());
                    } else {
                        bnsl a7 = f66447g.mo26019b(agyt.m55307c());
                        a7.mo68437a(e3);
                        a7.mo68420a("StatusException while getting CarrierPlanId with message: %s", bryx.m114908a(e3.getMessage()));
                        status = agrs.m55019a(e3);
                    }
                }
                if (cfmd.m140083c()) {
                    String f2 = agyq.m55285f(this.f66449c);
                    if (!TextUtils.isEmpty(f2)) {
                        agpk.m54726a().mo35836a(this.f66452f, f2.substring(0, 3), f2.substring(3));
                    }
                }
                if (status != null) {
                    if (!cfmd.f184339a.mo6606a().mo81470v() || (i2 = status.f30115i) == 27001 || i2 == 27009 || i2 == 27038 || i2 == 27017 || i2 == 27012) {
                        if (cfmq.m140244o()) {
                            agrl a8 = agrl.m54942a();
                            int i4 = status.f30115i;
                            String str4 = this.f66457l.f66263c;
                            MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest6 = this.f66448b;
                            a8.mo35986a(i4, str4, mdpCarrierPlanIdRequest6.f80149c, mdpCarrierPlanIdRequest6.f80150d);
                        }
                        mo6503a(status);
                        return;
                    }
                    btap c = agpk.m54726a().mo35841c(this.f66452f);
                    if (c == null || c.f148029a.size() <= 0) {
                        f66447g.mo26019b(agyt.m55307c()).mo68405a("Cache either did not have an entry or had zero endpoint URLs.");
                        mo6503a(status);
                        return;
                    }
                    this.f66450d = c;
                } else if (cfmq.m140244o()) {
                    m55073a().mo35997a(this.f66450d, this.f66457l.f66263c);
                }
                btap btap = this.f66450d;
                if (btap == null || btap.f148029a.size() == 0) {
                    ((bnsl) f66447g.mo68388c()).mo68405a("MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT. Carrier endpoints are empty.");
                    mo6503a(new Status(27006, "MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT. Carrier endpoints are empty."));
                    return;
                }
                if (cfmd.m140088h()) {
                    boolean a9 = agpk.m54726a().mo35832a(this.f66452f, this.f66450d);
                    if (cfmq.m140237h()) {
                        agrl a10 = agrl.m54942a();
                        bxvd da = booc.f133888c.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((booc) da.f164949b).f133890a = boob.m111380a(10);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((booc) da.f164949b).f133891b = a9;
                        booc booc = (booc) da.mo74062i();
                        agqd agqd2 = this.f66457l;
                        if (agqd2 != null) {
                            str2 = agqd2.f66263c;
                        }
                        Integer num = this.f66448b.f80149c;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        a10.mo35992a(booc, str2, Integer.valueOf(i));
                    }
                }
                String str5 = (String) this.f66450d.f148029a.get(0);
                Locale b2 = agqg.m54858m() ? agyt.m55304b(this.f66449c) : null;
                if (cfmq.m140243n() && !agyq.m55280b(this.f66449c)) {
                    int i5 = Build.VERSION.SDK_INT;
                }
                Context context2 = this.f66449c;
                agyq.f66880a.mo26019b(agyt.m55307c()).mo68426a("ConnectedOnWifi ? %s cellularAvailable ? %s hasSim? %s isTesting? %s", Boolean.valueOf(agyq.m55281c(context2)), Boolean.valueOf(agyq.m55284e(context2)), Boolean.valueOf(agyq.m55290k(context2)), agqg.m54845L());
                if (agqg.m54870y().booleanValue() && !agyq.m55291l(context2)) {
                    int i6 = Build.VERSION.SDK_INT;
                    if (agyq.m55281c(context2)) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) this.f66449c.getSystemService("connectivity");
                        NetworkRequest.Builder builder = new NetworkRequest.Builder();
                        builder.addTransportType(0).addCapability(12);
                        try {
                            connectivityManager.requestNetwork(builder.build(), new agtc(this, str5, b2, connectivityManager), (int) TimeUnit.SECONDS.toMillis((long) agqg.m54843J().intValue()));
                            if (agqg.m54842I().booleanValue()) {
                                int i7 = Build.VERSION.SDK_INT;
                                return;
                            }
                            return;
                        } catch (SecurityException e4) {
                            bnsl bnsl2 = (bnsl) f66447g.mo68388c();
                            bnsl2.mo68437a(e4);
                            bnsl2.mo68405a("Permission denied while querying CPID endpoint");
                            mo6503a(new Status(27047, "MDP_NOT_ON_CELLULAR_PERMISSION_DENIED: Permission denied when attempting to query CPID endpoint"));
                            return;
                        }
                    }
                }
                RequestQueue newRequestQueue = Volley.newRequestQueue(this.f66449c.getApplicationContext());
                if (b2 != null) {
                    str3 = agyt.m55302a(b2);
                }
                newRequestQueue.add(new agtg(str5, str3, new agtd(this), new agte(this, str5)));
            } else {
                mo6503a(new Status(27055, "MDP_MCC_MNC_UNSUPPORTED_BY_CLIENT. MCC/MNC of active SIM is not supported by client"));
            }
        } else {
            ((bnsl) f66447g.mo68387b()).mo68405a("Invalid arguments. Need a non-empty API key.");
            new agzb(context).mo36211a("Empty API key at getCarrierPlanIdOperation", new IllegalArgumentException());
            mo6503a(new Status(27004, "MDP_INVALID_API_KEY. Need a non-empty API key."));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        String str;
        Integer num;
        Long l;
        agqd agqd = this.f66457l;
        if (agqd != null) {
            str = agqd.f66263c;
        } else {
            str = "CLIENT_TestInvalid";
        }
        f66447g.mo26019b(agyt.m55307c()).mo68424a("GetCpid failed for %s. Error status:{%s}", str, status);
        if (agqg.m54842I().booleanValue()) {
            if (m55077b()) {
                ((bnsl) f66447g.mo68388c()).mo68424a("The operation has completed before. Drop the failure callback for %s: {%s}", this.f66457l.f66263c, status);
                return;
            }
            m55076a(true);
        }
        if (cfmq.m140235f()) {
            agrl a = m55073a();
            Bundle bundle = this.f66448b.f80148b;
            bygd bygd = bygd.MODULE_CPID_RESPONSE_FAILURE;
            long j = (long) status.f30115i;
            String str2 = this.f66451e;
            MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = this.f66448b;
            if (mdpCarrierPlanIdRequest != null) {
                num = mdpCarrierPlanIdRequest.f80149c;
            } else {
                num = null;
            }
            if (mdpCarrierPlanIdRequest != null) {
                l = mdpCarrierPlanIdRequest.f80150d;
            } else {
                l = null;
            }
            a.mo35991a(bundle, bygd, j, str, str2, num, l);
        } else {
            agrl a2 = m55073a();
            bygd bygd2 = bygd.MODULE_CPID_RESPONSE_FAILURE;
            long j2 = (long) status.f30115i;
            String str3 = this.f66451e;
            MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest2 = this.f66448b;
            a2.mo36004a(bygd2, j2, str, str3, mdpCarrierPlanIdRequest2 != null ? mdpCarrierPlanIdRequest2.f80149c : null, mdpCarrierPlanIdRequest2 != null ? mdpCarrierPlanIdRequest2.f80150d : null);
        }
        try {
            this.f66453h.mo35762a(status, (MdpCarrierPlanIdResponse) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66447g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api failure callback for %s with exception %s", this.f66457l.f66263c, bryx.m114908a(e.getMessage()));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.Integer, int]
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
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final void mo36081a(MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse2;
        boolean z;
        String str;
        int i;
        bxvd bxvd;
        Integer num;
        this.f66451e = mdpCarrierPlanIdResponse.f80151a;
        if (!cfmq.m140247r()) {
            agol agol = new agol(agqe.m54828a().mo35931a(this.f66451e, this.f66448b.f80147a), mdpCarrierPlanIdResponse.f80152b);
            btap btap = this.f66450d;
            agol.f66177b = btap.f148031c;
            agol.f66178c = btap.f148032d;
            agol.f66179d = btap.f148030b;
            agol.f66180e = this.f66451e;
            agol.f66181f = 2;
            bszh bszh = btap.f148033e;
            if (bszh == null) {
                bszh = bszh.f147822d;
            }
            agol.f66182g = agsc.m55041a(bszh);
            mdpCarrierPlanIdResponse2 = agol.mo35778a();
        } else {
            Integer num2 = this.f66448b.f80149c;
            if (!(num2 == null || this.f66450d.f148035g == num2.intValue())) {
                ((bnsl) f66447g.mo68388c()).mo68422a("gRPC response object's EventFlowId did not match the one sent to GTAF: original=%s, received=%s", (Object) this.f66448b.f80149c, this.f66450d.f148035g);
            }
            Long l = this.f66448b.f80150d;
            if (!(l == null || this.f66450d.f148034f == l.longValue())) {
                ((bnsl) f66447g.mo68388c()).mo68423a("gRPC response object's UniqueRequestId did not match the one sent to GTAF: original=%s, received=%s", this.f66448b.f80150d, this.f66450d.f148034f);
            }
            agol agol2 = new agol(agqe.m54828a().mo35931a(this.f66451e, this.f66448b.f80147a), mdpCarrierPlanIdResponse.f80152b);
            btap btap2 = this.f66450d;
            agol2.f66177b = btap2.f148031c;
            agol2.f66178c = btap2.f148032d;
            agol2.f66179d = btap2.f148030b;
            agol2.f66180e = this.f66451e;
            agol2.f66181f = 2;
            bszh bszh2 = btap2.f148033e;
            if (bszh2 == null) {
                bszh2 = bszh.f147822d;
            }
            agol2.f66182g = agsc.m55041a(bszh2);
            MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = this.f66448b;
            agol2.f66183h = mdpCarrierPlanIdRequest.f80149c;
            agol2.f66184i = mdpCarrierPlanIdRequest.f80150d;
            mdpCarrierPlanIdResponse2 = agol2.mo35778a();
        }
        if (mdpCarrierPlanIdResponse2.f80151a == null) {
            ((bnsl) f66447g.mo68388c()).mo68424a("Cannot find a matching client when CPID returns. Req:{%s} Rsp:{%s}", this.f66448b, mdpCarrierPlanIdResponse2);
            String valueOf = String.valueOf(this.f66448b);
            String valueOf2 = String.valueOf(mdpCarrierPlanIdResponse2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
            sb.append("MDP_INVALID_CARRIER_PLAN_ID. Cannot find a matching client. Req:");
            sb.append(valueOf);
            sb.append(" Rsp:");
            sb.append(valueOf2);
            mo6503a(new Status(27005, sb.toString()));
            return;
        }
        if (!agqg.m54857l().booleanValue() || this.f66448b.mo44019a() || (cfmd.m140082b() && this.f66457l.f66261a.equals("AIzaSyCTa7aViyHnB3GLIqhL5hQFZGb675SoCIA"))) {
            z = false;
        } else {
            if (cfmd.m140088h()) {
                agpk a = agpk.m54726a();
                z = a.f66242a.mo35859a(this.f66452f, Long.valueOf(mdpCarrierPlanIdResponse2.f80155e), mdpCarrierPlanIdResponse2.f80156f, mdpCarrierPlanIdResponse2.f80152b);
            } else {
                agpk a2 = agpk.m54726a();
                btap btap3 = this.f66450d;
                Context context = this.f66449c;
                TelephonyManager telephonyManager = (TelephonyManager) C1133kh.m17838a(context, TelephonyManager.class);
                agpw a3 = a2.f66242a.mo35854a(agyq.m55288i(context));
                if (!cfmd.f184339a.mo6606a().mo81466r() || a3 == null || a3.mo35917h() == null) {
                    bxvd = bxzz.f165211e.mo74144da();
                } else {
                    bxzz h = a3.mo35917h();
                    bxvd = (bxvd) h.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) h);
                }
                agpv agpv = new agpv();
                agpv.mo35904a(Long.valueOf(mdpCarrierPlanIdResponse2.f80155e));
                agpv.mo35905a(mdpCarrierPlanIdResponse2.f80156f);
                agpv.mo35907b((Long) Long.MAX_VALUE);
                agpv.mo35908b(agyq.m55288i(context));
                if (telephonyManager != null) {
                    num = Integer.valueOf(telephonyManager.getSimState());
                } else {
                    num = null;
                }
                agpv.mo35903a(num);
                long seconds = mdpCarrierPlanIdResponse2.f80152b + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bxzz bxzz = bxzz.f165211e;
                ((bxzz) bxvd.f164949b).f165216d = seconds;
                agpv.mo35902a((bxzz) bxvd.mo74062i());
                boolean a4 = a2.f66242a.mo35857a(agpv.mo35900a());
                agpr agpr = new agpr();
                agpr.mo35887a(Long.valueOf(mdpCarrierPlanIdResponse2.f80155e));
                agpr.f66252a.put("expiration_time", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + mdpCarrierPlanIdResponse2.f80152b));
                agpr.mo35885a(btap3);
                if (!a2.f66242a.mo35855a(agpr.mo35883a())) {
                    agpk.f66241d.mo26019b(agyt.m55307c()).mo68415a("Failed to update carrier table with carrier ID %d", mdpCarrierPlanIdResponse2.f80155e);
                }
                z = a4;
            }
            if (cfmq.m140237h()) {
                agrl a5 = agrl.m54942a();
                bxvd da = booc.f133888c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((booc) da.f164949b).f133890a = boob.m111380a(6);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((booc) da.f164949b).f133891b = z;
                booc booc = (booc) da.mo74062i();
                agqd agqd = this.f66457l;
                if (agqd != null) {
                    str = agqd.f66263c;
                } else {
                    str = "CLIENT_TestInvalid";
                }
                Integer num3 = this.f66448b.f80149c;
                if (num3 != null) {
                    i = num3.intValue();
                } else {
                    i = 0;
                }
                a5.mo35992a(booc, str, Integer.valueOf(i));
            }
        }
        m55075a(mdpCarrierPlanIdResponse2, false, z);
        this.f66459p.execute(new agtf(this));
    }
}
