package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CarrierInfo;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.OauthRedirect;
import com.google.android.gms.mobilesubscription.serviceconfig.ServiceType;
import java.util.concurrent.TimeUnit;

/* renamed from: ahac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahac extends aaab {

    /* renamed from: d */
    private static final srn f66927d = srn.m36126a("MobileSubscription", sgj.MOBILE_SUBSCRIPTION);

    /* renamed from: a */
    private final agzt f66928a;

    /* renamed from: b */
    private final CheckAuthStatusRequest f66929b;

    /* renamed from: c */
    private Context f66930c;

    public ahac(agzt agzt, CheckAuthStatusRequest checkAuthStatusRequest) {
        super(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, "CheckAuthStatus");
        this.f66928a = agzt;
        this.f66929b = checkAuthStatusRequest;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest, boolean]
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
    /* renamed from: a */
    public final void mo6502a(Context context) {
        agzy agzy;
        ((bnsl) f66927d.mo68390d()).mo68431a("Executing CheckAuthStatus. req:{%s} enabled:%b", (Object) this.f66929b, cfnj.m140612b());
        this.f66930c = context;
        if (!cfnj.m140612b()) {
            mo6503a(new Status(27013, "MDP_NOT_ENABLED. The particular function is not enabled on the device."));
            return;
        }
        CheckAuthStatusRequest checkAuthStatusRequest = this.f66929b;
        if (checkAuthStatusRequest != null && checkAuthStatusRequest.f80347b.f80384a == 6) {
            agzz agzz = new agzz(this.f66930c, "AIzaSyA_n-CBlmsO1fOxFUZqRnQ9SX4Bh1jCjWg");
            try {
                CheckAuthStatusRequest checkAuthStatusRequest2 = this.f66929b;
                bxvd da = btam.f148005f.mo74144da();
                String str = checkAuthStatusRequest2.f80346a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btam btam = (btam) da.f164949b;
                str.getClass();
                btam.f148007a = str;
                ServiceType serviceType = checkAuthStatusRequest2.f80347b;
                if (serviceType != null) {
                    btam.f148009c = serviceType.f80384a;
                }
                Long l = checkAuthStatusRequest2.f80348c;
                if (l != null) {
                    long longValue = l.longValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((btam) da.f164949b).f148008b = longValue;
                }
                bxvd da2 = bszk.f147840b.mo74144da();
                Context context2 = agzz.f66922b;
                String str2 = "";
                if (TextUtils.isEmpty(cfma.m140067e())) {
                    TelephonyManager telephonyManager = (TelephonyManager) C1133kh.m17838a(context2, TelephonyManager.class);
                    if (telephonyManager == null) {
                        eoa.m10828c("MobileDataPlan", "Failed to get Telephony Manager system service", new Object[0]);
                    } else {
                        String subscriberId = telephonyManager.getSubscriberId();
                        if (subscriberId == null) {
                            eoa.m10826b("MobileDataPlan", "No available imsi", new Object[0]);
                        } else {
                            str2 = subscriberId;
                        }
                    }
                } else {
                    str2 = cfma.m140067e();
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str2.getClass();
                ((bszk) da2.f164949b).f147842a = str2;
                bszk bszk = (bszk) da2.mo74062i();
                bxvd da3 = bszf.f147810c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bszf bszf = (bszf) da3.f164949b;
                bszk.getClass();
                bszf.f147813b = bszk;
                AuthType authType = checkAuthStatusRequest2.f80349d;
                if (authType != null) {
                    bszf.f147812a = authType.f80342a;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bszf bszf2 = (bszf) da3.mo74062i();
                bszf2.getClass();
                ((btam) da.f164949b).f148010d = bszf2;
                bszs a = ahaa.m55375a(checkAuthStatusRequest2.f80351f);
                if (a != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a.getClass();
                    ((btam) da.f164949b).f148011e = a;
                }
                new Object[1][0] = da.mo74062i();
                int i = eoa.f15378a;
                agzy = new agzy(agzz);
                agzq a2 = agzy.mo36223a();
                ClientContext clientContext = agzz.f66921a;
                btam btam2 = (btam) da.mo74062i();
                if (agzq.f66916c == null) {
                    agzq.f66916c = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileIdentityService/GetUserKey", ciie.m150370a(btam.f148005f), ciie.m150370a(btan.f148012d));
                }
                btan btan = (btan) a2.f66919a.mo25553a(agzq.f66916c, clientContext, btam2, (long) agzq.f66915b, TimeUnit.MILLISECONDS);
                new Object[1][0] = btan;
                agzy.close();
                bszs bszs = btan.f148016c;
                if (bszs == null) {
                    bszs = bszs.f147883b;
                }
                Bundle a3 = ahaa.m55374a(bszs);
                aham aham = new aham();
                String str3 = btan.f148014a;
                CheckAuthStatusResponse checkAuthStatusResponse = aham.f66942a;
                checkAuthStatusResponse.f80352a = str3;
                checkAuthStatusResponse.f80357f = a3;
                if (btan.f148015b != null) {
                    ahaw ahaw = new ahaw();
                    btau btau = btan.f148015b;
                    if (btau == null) {
                        btau = btau.f148048f;
                    }
                    ahaw.f66947a.f80379a = btau.f148050a;
                    btau btau2 = btan.f148015b;
                    if (btau2 == null) {
                        btau2 = btau.f148048f;
                    }
                    ahaw.f66947a.f80380b = btau2.f148051b;
                    btau btau3 = btan.f148015b;
                    if (btau3 == null) {
                        btau3 = btau.f148048f;
                    }
                    ahaw.f66947a.f80381c = btau3.f148052c;
                    btau btau4 = btan.f148015b;
                    if (btau4 == null) {
                        btau4 = btau.f148048f;
                    }
                    ahaw.f66947a.f80382d = btau4.f148053d;
                    btau btau5 = btan.f148015b;
                    if (btau5 == null) {
                        btau5 = btau.f148048f;
                    }
                    String str4 = btau5.f148054e;
                    OauthRedirect oauthRedirect = ahaw.f66947a;
                    oauthRedirect.f80383e = str4;
                    CarrierInfo carrierInfo = new ahai().f66940a;
                    carrierInfo.f80345c = oauthRedirect;
                    aham.f66942a.f80353b = carrierInfo;
                }
                CheckAuthStatusResponse checkAuthStatusResponse2 = aham.f66942a;
                ((bnsl) f66927d.mo68390d()).mo68405a("AuthStatus is retrieved");
                try {
                    this.f66928a.mo36217a(Status.f30107a, checkAuthStatusResponse2);
                    return;
                } catch (RemoteException e) {
                    return;
                }
            } catch (gid e2) {
                mo6503a(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."));
                return;
            } catch (chuw e3) {
                mo6503a(ahaa.m55377a(e3));
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            mo6503a(new Status(27000, "MDP_INVALID_ARGUMENT. Need an non-empty request with a valid service type."));
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((bnsl) f66927d.mo68390d()).mo68420a("Error status: {%s}", status);
        try {
            this.f66928a.mo36217a(status, (CheckAuthStatusResponse) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66927d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Unable to complete API callback for failure:{%s}", status);
        }
    }
}
