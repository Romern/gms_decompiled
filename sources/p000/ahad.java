package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;
import java.util.concurrent.TimeUnit;

/* renamed from: ahad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahad extends aaab {

    /* renamed from: d */
    private static final srn f66931d = srn.m36126a("MobileSubscription", sgj.MOBILE_SUBSCRIPTION);

    /* renamed from: a */
    private final agzt f66932a;

    /* renamed from: b */
    private final GetEsimConfigRequest f66933b;

    /* renamed from: c */
    private Context f66934c;

    public ahad(agzt agzt, GetEsimConfigRequest getEsimConfigRequest) {
        super(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, "GetEsimConfig");
        this.f66932a = agzt;
        this.f66933b = getEsimConfigRequest;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest, boolean]
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
        ((bnsl) f66931d.mo68390d()).mo68431a("Executing GetEsimConfig. req:{%s} enabled:%b", (Object) this.f66933b, cfnj.m140613c());
        this.f66934c = context;
        if (!cfnj.m140613c()) {
            mo6503a(new Status(27013, "MDP_NOT_ENABLED. The particular function is not enabled on the device."));
            return;
        }
        GetEsimConfigRequest getEsimConfigRequest = this.f66933b;
        if (getEsimConfigRequest == null || getEsimConfigRequest.f80359b == null) {
            mo6503a(new Status(27000, "MDP_INVALID_ARGUMENT. Need an non-empty request with a valid service type."));
            return;
        }
        agzz agzz = new agzz(this.f66934c, "AIzaSyA_n-CBlmsO1fOxFUZqRnQ9SX4Bh1jCjWg");
        try {
            GetEsimConfigRequest getEsimConfigRequest2 = this.f66933b;
            bxvd da = btah.f147974e.mo74144da();
            String str = getEsimConfigRequest2.f80358a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((btah) da.f164949b).f147976a = str;
            btbo a = ahaa.m55376a(getEsimConfigRequest2.f80359b);
            if (a != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((btah) da.f164949b).f147977b = a;
            }
            bszs a2 = ahaa.m55375a(getEsimConfigRequest2.f80365h);
            if (a2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a2.getClass();
                ((btah) da.f164949b).f147979d = a2;
            }
            bxvd da2 = bszp.f147875f.mo74144da();
            String str2 = getEsimConfigRequest2.f80360c;
            if (str2 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str2.getClass();
                ((bszp) da2.f164949b).f147877a = str2;
            }
            String str3 = getEsimConfigRequest2.f80361d;
            if (str3 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str3.getClass();
                ((bszp) da2.f164949b).f147878b = str3;
            }
            String str4 = getEsimConfigRequest2.f80362e;
            if (str4 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str4.getClass();
                ((bszp) da2.f164949b).f147879c = str4;
            }
            String str5 = getEsimConfigRequest2.f80363f;
            if (str5 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str5.getClass();
                ((bszp) da2.f164949b).f147880d = str5;
            }
            String[] strArr = getEsimConfigRequest2.f80364g;
            if (strArr != null) {
                for (String str6 : strArr) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bszp bszp = (bszp) da2.f164949b;
                    str6.getClass();
                    if (!bszp.f147881e.mo73666a()) {
                        bszp.f147881e = bxvk.m124021a(bszp.f147881e);
                    }
                    bszp.f147881e.add(str6);
                }
            }
            bszp bszp2 = (bszp) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bszp2.getClass();
            ((btah) da.f164949b).f147978c = bszp2;
            new Object[1][0] = da.mo74062i();
            int i = eoa.f15378a;
            agzy = new agzy(agzz);
            agzq a3 = agzy.mo36223a();
            ClientContext clientContext = agzz.f66921a;
            btah btah = (btah) da.mo74062i();
            if (agzq.f66918e == null) {
                agzq.f66918e = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileIdentityService/GetEsimConfig", ciie.m150370a(btah.f147974e), ciie.m150370a(btai.f147980d));
            }
            btai btai = (btai) a3.f66919a.mo25553a(agzq.f66918e, clientContext, btah, (long) agzq.f66915b, TimeUnit.MILLISECONDS);
            new Object[1][0] = btai;
            agzy.close();
            bszs bszs = btai.f147984c;
            if (bszs == null) {
                bszs = bszs.f147883b;
            }
            Bundle a4 = ahaa.m55374a(bszs);
            ahaq ahaq = new ahaq();
            String str7 = btai.f147982a;
            GetEsimConfigResponse getEsimConfigResponse = ahaq.f66944a;
            getEsimConfigResponse.f80366a = str7;
            getEsimConfigResponse.f80372g = a4;
            bszo bszo = btai.f147983b;
            if (bszo != null) {
                getEsimConfigResponse.f80370e = bszo.f147873c;
                getEsimConfigResponse.f80371f = bszo.f147874d;
                ahaq.f66944a.f80368c = Long.valueOf((long) bszo.f147871a);
                bszo bszo2 = btai.f147983b;
                if (bszo2 == null) {
                    bszo2 = bszo.f147869e;
                }
                ahaq.f66944a.f80369d = Long.valueOf((long) bszo2.f147872b);
            }
            GetEsimConfigResponse getEsimConfigResponse2 = ahaq.f66944a;
            ((bnsl) f66931d.mo68390d()).mo68405a("EsimConfig is retrieved");
            try {
                this.f66932a.mo36219a(Status.f30107a, getEsimConfigResponse2);
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
        throw th;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((bnsl) f66931d.mo68390d()).mo68420a("Error status: {%s}", status);
        try {
            this.f66932a.mo36219a(status, (GetEsimConfigResponse) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66931d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Unable to complete API callback for failure:{%s}", status);
        }
    }
}
