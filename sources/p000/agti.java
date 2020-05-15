package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: agti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agti extends aaab {

    /* renamed from: f */
    private static final srn f66460f = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    private final agrf f66461a;

    /* renamed from: b */
    private final GetConsentInformationRequest f66462b;

    /* renamed from: c */
    private agrl f66463c;

    /* renamed from: d */
    private Context f66464d;

    /* renamed from: e */
    private agqd f66465e;

    /* renamed from: a */
    private final synchronized agrl m55082a() {
        if (this.f66463c == null) {
            this.f66463c = agrl.m54943a(this.f66464d);
        }
        return this.f66463c;
    }

    public agti(agrf agrf, GetConsentInformationRequest getConsentInformationRequest) {
        super(MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, "GetConsentInformation");
        this.f66461a = agrf;
        if (cfmq.m140247r()) {
            if (getConsentInformationRequest != null && getConsentInformationRequest.f80274d == null) {
                agql agql = new agql(getConsentInformationRequest);
                Long valueOf = Long.valueOf(agrl.m54947b());
                GetConsentInformationRequest getConsentInformationRequest2 = agql.f66281a;
                getConsentInformationRequest2.f80274d = valueOf;
                getConsentInformationRequest = getConsentInformationRequest2;
            }
            if (getConsentInformationRequest != null && getConsentInformationRequest.f80273c == null) {
                agql agql2 = new agql(getConsentInformationRequest);
                agql2.mo35938a(0);
                getConsentInformationRequest = agql2.f66281a;
            }
        }
        this.f66462b = getConsentInformationRequest;
    }

    /* renamed from: a */
    private final void m55083a(Status status, Long l, String str, bxzx bxzx) {
        bygb bygb;
        bxzw f;
        if (cfmd.m140084d() || cflr.m139930g()) {
            agpk a = agpk.m54726a();
            ConsentAgreementText b = a.mo35838b(l);
            if (b != null) {
                bygb a2 = bygb.m124774a(bxzx.f165204f);
                if (a2 == null) {
                    a2 = bygb.UNRECOGNIZED;
                }
                boolean z = false;
                if (bygb == bygb.NOT_ASKED) {
                    agpl agpl = a.f66242a;
                    agps a3 = agpl.mo35852a(l);
                    if (a3 == null || agpl.mo35862c(l) == null || (f = a3.mo35892f()) == null) {
                        bygb = null;
                    } else {
                        bygb a4 = bygb.m124774a(f.f165195b);
                        if (a4 == null) {
                            a4 = bygb.UNRECOGNIZED;
                        }
                        bygb = a4;
                    }
                    if (bygb != null) {
                        bxvd bxvd = (bxvd) bxzx.mo74142c(5);
                        bxvd.mo73625a((bxvk) bxzx);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bxzx bxzx2 = bxzx.f165197j;
                        ((bxzx) bxvd.f164949b).f165204f = bygb.mo3214a();
                        m55084a(str, l, (bxzx) bxvd.mo74062i());
                    } else {
                        mo6503a(status);
                        return;
                    }
                }
                agqn agqn = new agqn();
                agqn.mo35941a(b);
                agqn.mo35944a(Long.valueOf(bxzx.f165205g));
                agqj agqj = new agqj();
                agqj.mo35935a(bygb.mo3214a());
                agqn.mo35942a(agqj.f66280a);
                agqn.mo35945b(this.f66462b.f80273c);
                agqn.mo35946b(this.f66462b.f80274d);
                agqn.mo35943a((Integer) 2);
                GetConsentInformationResponse getConsentInformationResponse = agqn.f66282a;
                if (!(bygb == bygb.DECLINED || bygb == bygb.REVOKED)) {
                    z = true;
                }
                mo36083a(getConsentInformationResponse, z, status);
                return;
            }
            mo6503a(status);
            return;
        }
        mo6503a(status);
    }

    /* renamed from: a */
    private final void m55084a(String str, Long l, bxzx bxzx) {
        String str2;
        boolean a = agpk.m54726a().mo35831a(l, str, bxzx);
        if (cfmq.m140237h()) {
            agrl a2 = agrl.m54942a();
            bxvd da = booc.f133888c.mo74144da();
            int i = 0;
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
            booc booc = (booc) da.mo74062i();
            agqd agqd = this.f66465e;
            if (agqd != null) {
                str2 = agqd.f66263c;
            } else {
                str2 = "CLIENT_TestInvalid";
            }
            Integer num = this.f66462b.f80273c;
            if (num != null) {
                i = num.intValue();
            }
            a2.mo35992a(booc, str2, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private final void m55085a(String str, Long l, bxzx bxzx, chuw chuw) {
        bnsl bnsl = (bnsl) f66460f.mo68388c();
        bnsl.mo68437a(chuw);
        bnsl.mo68420a("StatusException while getting consent information: %s", bryx.m114908a(chuw.getMessage()));
        m55083a(agrs.m55019a(chuw), l, str, bxzx);
    }

    /* renamed from: a */
    private final void m55086a(String str, Long l, bxzx bxzx, gid gid) {
        bnsl bnsl = (bnsl) f66460f.mo68388c();
        bnsl.mo68437a(gid);
        bnsl.mo68420a("MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", bryx.m114908a(gid.getMessage()));
        m55083a(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."), l, str, bxzx);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02bb, code lost:
        if (p000.cflr.m139930g() != false) goto L_0x02bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0396  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        long j;
        boolean z;
        bxvd bxvd;
        String str;
        GetConsentInformationResponse getConsentInformationResponse;
        Context context2 = context;
        if (cfmv.m140303b() > 0 && cfmv.m140321t() > 0) {
            bqhi.m112839a(cfmv.m140321t(), TimeUnit.MILLISECONDS);
        }
        f66460f.mo26019b(agyt.m55307c()).mo68424a("Exec GetConsent. req:{%s} enabled:%b", this.f66462b, agqg.m54865t());
        this.f66464d = context2;
        if (agqg.m54865t().booleanValue() || agpk.m54727d()) {
            agqd b = agqe.m54828a().mo35932b(this.f66462b.f80271a, null);
            this.f66465e = b;
            if (b == null) {
                ((bnsl) f66460f.mo68388c()).mo68405a("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId");
                String valueOf = String.valueOf(this.f66462b.f80271a);
                mo6503a(new Status(27005, valueOf.length() == 0 ? new String("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ") : "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: ".concat(valueOf)));
                return;
            }
            agrl a = m55082a();
            GetConsentInformationRequest getConsentInformationRequest = this.f66462b;
            boot a2 = a.mo35978a(13, "GTAF_Server", this.f66465e.f66263c);
            bxvd bxvd2 = (bxvd) a2.mo74142c(5);
            bxvd2.mo73625a((bxvk) a2);
            if (cfmq.m140238i()) {
                agrl.m54945a(bxvd2, getConsentInformationRequest.f80275e);
            }
            String str2 = getConsentInformationRequest.f80271a;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            boot boot = boot.f133997z;
            str2.getClass();
            ((boot) bxvd2.f164949b).f134000c = str2;
            Long l = getConsentInformationRequest.f80274d;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            ((boot) bxvd2.f164949b).f134015r = j;
            a.mo35995a((boot) bxvd2.mo74062i(), bygd.MODULE_GET_CONSENT_INFORMATION_REQUEST, getConsentInformationRequest.f80273c);
            agpk a3 = agpk.m54726a();
            if (a3 == null) {
                ((bnsl) f66460f.mo68388c()).mo68405a("MDP_NOT_ENABLED. Cache is missing/disabled.");
                mo6503a(new Status(27013, "MDP_NOT_ENABLED. Cache is missing/disabled."));
            } else if (!cfmj.m140161j() || a3.mo35843c() == null) {
                String str3 = this.f66465e.f66264d;
                Long k = a3.mo35851k(str3);
                if (k == null || k.longValue() <= 0) {
                    ((bnsl) f66460f.mo68388c()).mo68405a("MDP_INVALID_ARGUMENT. Cannot find matching carrier.");
                    mo6503a(new Status(27000, "MDP_INVALID_ARGUMENT. Cannot find matching carrier."));
                    return;
                }
                bxzx b2 = a3.mo35837b(k, str3);
                if (b2 != null) {
                    bxvd = (bxvd) b2.mo74142c(5);
                    bxvd.mo73625a((bxvk) b2);
                    z = false;
                } else {
                    bxvd da = bxzx.f165197j.mo74144da();
                    long longValue = k.longValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxzx bxzx = (bxzx) da.f164949b;
                    bxzx.f165199a = longValue;
                    str3.getClass();
                    bxzx.f165200b = str3;
                    String str4 = this.f66465e.f66263c;
                    str4.getClass();
                    bxzx.f165201c = str4;
                    String str5 = this.f66462b.f80271a;
                    str5.getClass();
                    bxzx.f165202d = str5;
                    "".getClass();
                    bxzx.f165203e = "";
                    bygb bygb = bygb.NOT_ASKED;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bxzx) da.f164949b).f165204f = bygb.mo3214a();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxzx bxzx2 = (bxzx) da.f164949b;
                    bxzx2.f165205g = currentTimeMillis;
                    bxzx2.f165206h = -1;
                    a3.mo35831a(k, str3, (bxzx) da.mo74062i());
                    f66460f.mo26019b(agyt.m55307c()).mo68424a("Creating new consent cache <%d, %s>", k, str3);
                    bxvd = da;
                    z = true;
                }
                bygb a4 = bygb.m124774a(((bxzx) bxvd.f164949b).f165204f);
                if (a4 == null) {
                    a4 = bygb.UNRECOGNIZED;
                }
                if (a4 == bygb.CONSENTED || a4 == bygb.NOT_REQUIRED || !this.f66462b.f80272b) {
                    agqj agqj = new agqj();
                    agqj.mo35935a(a4.mo3214a());
                    ConsentStatus consentStatus = agqj.f66280a;
                    agqn agqn = new agqn();
                    agqn.mo35942a(consentStatus);
                    if (cfmq.m140247r()) {
                        agqn.mo35945b(this.f66462b.f80273c);
                        agqn.mo35946b(this.f66462b.f80274d);
                    }
                    if (cflx.m140025l()) {
                        agqn.mo35944a(Long.valueOf(((bxzx) bxvd.f164949b).f165205g));
                    }
                    if (cfmd.m140084d()) {
                        agqn.mo35943a((Integer) 1);
                    }
                    GetConsentInformationResponse getConsentInformationResponse2 = agqn.f66282a;
                    f66460f.mo26019b(agyt.m55307c()).mo68425a("Consent status returned from cache <%d, %s>: %s", k, str3, a4);
                    mo36082a(getConsentInformationResponse2, z);
                } else if (!cfma.m140066d() || agyq.m55276a(context)) {
                    agry a5 = agrz.m55030a(context2, cfmv.m140318q(), this.f66465e.f66261a, agqg.m54846a().intValue());
                    try {
                        if (cfmg.m140140f() > 0) {
                            if (this.f66465e.f66263c.equals("CLIENT_MdpUx")) {
                                if (cfmd.m140084d()) {
                                }
                                if (agpk.m54726a().mo35838b(k) != null) {
                                    int i = this.f66465e.f66265e;
                                    GetConsentInformationRequest getConsentInformationRequest2 = this.f66462b;
                                    getConsentInformationResponse = (GetConsentInformationResponse) aucu.m76783a(aucu.m76780a(auci.f91390a, new agrw(a5, k, i, getConsentInformationRequest2.f80273c, getConsentInformationRequest2.f80274d)), cfmg.m140140f(), TimeUnit.MILLISECONDS);
                                    if (a4 == bygb.DECLINED || a4 == bygb.REVOKED) {
                                        agqj agqj2 = new agqj();
                                        agqj2.mo35935a(a4.mo3214a());
                                        ConsentStatus consentStatus2 = agqj2.f66280a;
                                        agqn agqn2 = new agqn();
                                        agqn2.mo35942a(consentStatus2);
                                        agqn2.mo35941a(getConsentInformationResponse.f80277b);
                                        if (cflx.m140025l()) {
                                            agqn2.mo35944a(Long.valueOf(((bxzx) bxvd.f164949b).f165205g));
                                        }
                                        if (cfmd.m140084d()) {
                                            agqn2.mo35943a((Integer) 3);
                                        }
                                        mo36082a(agqn2.f66282a, false);
                                    }
                                    bygb a6 = bygb.m124774a(getConsentInformationResponse.f80276a.f80270a);
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    ((bxzx) bxvd.f164949b).f165204f = a6.mo3214a();
                                    m55084a(str3, k, (bxzx) bxvd.mo74062i());
                                    if (cflx.m140025l()) {
                                        agqn agqn3 = new agqn(getConsentInformationResponse);
                                        agqn3.mo35944a(Long.valueOf(((bxzx) bxvd.f164949b).f165205g));
                                        getConsentInformationResponse = agqn3.f66282a;
                                    }
                                    if (cfmd.m140084d()) {
                                        agqn agqn4 = new agqn(getConsentInformationResponse);
                                        agqn4.mo35943a((Integer) 3);
                                        getConsentInformationResponse = agqn4.f66282a;
                                    }
                                    mo36082a(getConsentInformationResponse, true);
                                    return;
                                }
                            }
                        }
                        int i2 = this.f66465e.f66265e;
                        GetConsentInformationRequest getConsentInformationRequest3 = this.f66462b;
                        getConsentInformationResponse = a5.mo36042a(k, i2, getConsentInformationRequest3.f80273c, getConsentInformationRequest3.f80274d);
                        if (a4 == bygb.DECLINED) {
                            bygb a62 = bygb.m124774a(getConsentInformationResponse.f80276a.f80270a);
                            if (bxvd.f164950c) {
                            }
                            ((bxzx) bxvd.f164949b).f165204f = a62.mo3214a();
                            m55084a(str3, k, (bxzx) bxvd.mo74062i());
                            if (cflx.m140025l()) {
                            }
                            if (cfmd.m140084d()) {
                            }
                            mo36082a(getConsentInformationResponse, true);
                            return;
                        }
                        agqj agqj22 = new agqj();
                        agqj22.mo35935a(a4.mo3214a());
                        ConsentStatus consentStatus22 = agqj22.f66280a;
                        agqn agqn22 = new agqn();
                        agqn22.mo35942a(consentStatus22);
                        agqn22.mo35941a(getConsentInformationResponse.f80277b);
                        if (cflx.m140025l()) {
                        }
                        if (cfmd.m140084d()) {
                        }
                        mo36082a(agqn22.f66282a, false);
                    } catch (gid e) {
                        m55086a(str3, k, (bxzx) bxvd.mo74062i(), e);
                    } catch (chuw e2) {
                        m55085a(str3, k, (bxzx) bxvd.mo74062i(), e2);
                    } catch (InterruptedException e3) {
                        bnsl bnsl = (bnsl) f66460f.mo68388c();
                        bnsl.mo68437a(e3);
                        bnsl.mo68420a("INTERRUPTED. Asynchronous GetConsent was interrupted: %s", bryx.m114908a(e3.getMessage()));
                        m55083a(new Status(14, "INTERRUPTED. Asynchronous GetConsent was interrupted."), k, str3, (bxzx) bxvd.mo74062i());
                    } catch (ExecutionException e4) {
                        if (e4.getCause() instanceof chuw) {
                            m55085a(str3, k, (bxzx) bxvd.mo74062i(), (chuw) e4.getCause());
                        } else if (e4.getCause() instanceof gid) {
                            m55086a(str3, k, (bxzx) bxvd.mo74062i(), (gid) e4.getCause());
                        } else {
                            Throwable cause = e4.getCause();
                            bnsl bnsl2 = (bnsl) f66460f.mo68388c();
                            bnsl2.mo68437a(cause);
                            if (cause != null) {
                                str = cause.getMessage();
                            } else {
                                str = null;
                            }
                            bnsl2.mo68420a("MDP_SERVER_GTAF_FAILURE_ASYNC. Asynchronous GetConsent failed: %s", bryx.m114908a(str));
                            m55083a(new Status(27052, "MDP_SERVER_GTAF_FAILURE_ASYNC: Asynchronous GetConsent RPC call failed."), k, str3, (bxzx) bxvd.mo74062i());
                        }
                    } catch (TimeoutException e5) {
                        bnsl bnsl3 = (bnsl) f66460f.mo68388c();
                        bnsl3.mo68437a(e5);
                        bnsl3.mo68420a("TIMEOUT. Asynchronous GetConsent timed out: %s", bryx.m114908a(e5.getMessage()));
                        m55083a(new Status(15, "TIMEOUT. Asynchronous GetConsent timed out."), k, str3, (bxzx) bxvd.mo74062i());
                    }
                } else {
                    ((bnsl) f66460f.mo68388c()).mo68405a("MDP_NO_NETWORK: Need a valid network connection.");
                    m55083a(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."), k, str3, (bxzx) bxvd.mo74062i());
                }
            } else {
                bxzx c = a3.mo35843c();
                bygb bygb2 = bygb.CONSENT_UNSPECIFIED;
                agqj agqj3 = new agqj();
                bygb a7 = bygb.m124774a(c.f165204f);
                if (a7 == null) {
                    a7 = bygb.UNRECOGNIZED;
                }
                agqj3.mo35935a(a7.mo3214a());
                ConsentStatus consentStatus3 = agqj3.f66280a;
                agqn agqn5 = new agqn();
                agqn5.mo35942a(consentStatus3);
                agqn5.mo35945b(this.f66462b.f80273c);
                agqn5.mo35946b(this.f66462b.f80274d);
                agqn5.mo35944a(Long.valueOf(c.f165205g));
                agqn5.mo35943a((Integer) 1);
                GetConsentInformationResponse getConsentInformationResponse3 = agqn5.f66282a;
                bnsl a8 = f66460f.mo26019b(agyt.m55307c());
                bygb a9 = bygb.m124774a(c.f165204f);
                if (a9 == null) {
                    a9 = bygb.UNRECOGNIZED;
                }
                a8.mo68420a("Per-device consent status returned from cache: %s", a9);
                mo36082a(getConsentInformationResponse3, false);
            }
        } else {
            ((bnsl) f66460f.mo68388c()).mo68405a("MDP_NOT_ENABLED. Feature is off.");
            mo6503a(new Status(27013, "MDP_NOT_ENABLED. Feature is off."));
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        String str;
        String str2;
        Integer num;
        Long l;
        f66460f.mo26019b(agyt.m55307c()).mo68420a("Error status: {%s}", status);
        agqd agqd = this.f66465e;
        if (agqd != null) {
            str = agqd.f66263c;
        } else {
            str = "CLIENT_TestInvalid";
        }
        if (cfmq.m140235f()) {
            agrl a = m55082a();
            Bundle bundle = this.f66462b.f80275e;
            bygd bygd = bygd.MODULE_GET_CONSENT_INFORMATION_RESPONSE_FAILURE;
            long j = (long) status.f30115i;
            GetConsentInformationRequest getConsentInformationRequest = this.f66462b;
            if (getConsentInformationRequest != null) {
                str2 = getConsentInformationRequest.f80271a;
            } else {
                str2 = null;
            }
            if (getConsentInformationRequest != null) {
                num = getConsentInformationRequest.f80273c;
            } else {
                num = null;
            }
            if (getConsentInformationRequest != null) {
                l = getConsentInformationRequest.f80274d;
            } else {
                l = null;
            }
            a.mo35991a(bundle, bygd, j, str, str2, num, l);
        } else {
            agrl a2 = m55082a();
            bygd bygd2 = bygd.MODULE_GET_CONSENT_INFORMATION_RESPONSE_FAILURE;
            long j2 = (long) status.f30115i;
            GetConsentInformationRequest getConsentInformationRequest2 = this.f66462b;
            a2.mo36004a(bygd2, j2, str, getConsentInformationRequest2 != null ? getConsentInformationRequest2.f80271a : null, getConsentInformationRequest2 != null ? getConsentInformationRequest2.f80273c : null, getConsentInformationRequest2 != null ? getConsentInformationRequest2.f80274d : null);
        }
        try {
            this.f66461a.mo35766a(status, (GetConsentInformationResponse) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66460f.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete API callback for failure: %s, status: {%s}", bryx.m114908a(e.getMessage()), bryx.m114908a(status));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36082a(GetConsentInformationResponse getConsentInformationResponse, boolean z) {
        mo36083a(getConsentInformationResponse, z, Status.f30107a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36083a(GetConsentInformationResponse getConsentInformationResponse, boolean z, Status status) {
        f66460f.mo26019b(agyt.m55307c()).mo68426a("GetConsent <%s> for %s. Response:{%s}\nNewCache:%b", this.f66462b.f80271a, this.f66465e.f66263c, getConsentInformationResponse, Boolean.valueOf(z));
        if (cfmq.m140235f()) {
            agrl a = m55082a();
            GetConsentInformationRequest getConsentInformationRequest = this.f66462b;
            a.mo36012a(getConsentInformationRequest, getConsentInformationResponse, getConsentInformationRequest.f80271a, this.f66465e.f66263c, !cfmd.m140084d() ? bmvz.f131120a : bmxv.m108566b(status));
        } else {
            m55082a().mo36012a((GetConsentInformationRequest) null, getConsentInformationResponse, this.f66462b.f80271a, this.f66465e.f66263c, !cfmd.m140084d() ? bmvz.f131120a : bmxv.m108566b(status));
        }
        try {
            this.f66461a.mo35766a(Status.f30107a, getConsentInformationResponse);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66460f.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("Unable to complete api callback for success response:{%s}, error message: %s", getConsentInformationResponse, bryx.m114908a(e.getMessage()));
        }
    }
}
