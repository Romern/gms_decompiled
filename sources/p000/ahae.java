package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersResponse;
import java.util.concurrent.TimeUnit;

/* renamed from: ahae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahae extends aaab {

    /* renamed from: d */
    private static final srn f66935d = srn.m36126a("MobileSubscription", sgj.MOBILE_SUBSCRIPTION);

    /* renamed from: a */
    private final agzt f66936a;

    /* renamed from: b */
    private final GetPhoneNumbersRequest f66937b;

    /* renamed from: c */
    private Context f66938c;

    public ahae(agzt agzt, GetPhoneNumbersRequest getPhoneNumbersRequest) {
        super(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, "GetPhoneNumbers");
        this.f66936a = agzt;
        this.f66937b = getPhoneNumbersRequest;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest, boolean]
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
        ((bnsl) f66935d.mo68390d()).mo68431a("Executing GetPhoneNumbers. req:{%s} enabled:%b", (Object) this.f66937b, cfnj.m140614d());
        this.f66938c = context;
        if (!cfnj.m140614d()) {
            mo6503a(new Status(27013, "MDP_NOT_ENABLED. The particular function is not enabled on the device."));
            return;
        }
        GetPhoneNumbersRequest getPhoneNumbersRequest = this.f66937b;
        if (getPhoneNumbersRequest == null || getPhoneNumbersRequest.f80374b == null) {
            mo6503a(new Status(27000, "MDP_INVALID_ARGUMENT. Need an non-empty request with a valid service type."));
            return;
        }
        agzz agzz = new agzz(this.f66938c, "AIzaSyA_n-CBlmsO1fOxFUZqRnQ9SX4Bh1jCjWg");
        try {
            GetPhoneNumbersRequest getPhoneNumbersRequest2 = this.f66937b;
            bxvd da = btaj.f147985d.mo74144da();
            String str = getPhoneNumbersRequest2.f80373a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((btaj) da.f164949b).f147987a = str;
            btbo a = ahaa.m55376a(getPhoneNumbersRequest2.f80374b);
            if (a != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((btaj) da.f164949b).f147988b = a;
            }
            bszs a2 = ahaa.m55375a(getPhoneNumbersRequest2.f80375c);
            if (a2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a2.getClass();
                ((btaj) da.f164949b).f147989c = a2;
            }
            new Object[1][0] = da.mo74062i();
            int i = eoa.f15378a;
            agzy = new agzy(agzz);
            agzq a3 = agzy.mo36223a();
            ClientContext clientContext = agzz.f66921a;
            btaj btaj = (btaj) da.mo74062i();
            if (agzq.f66917d == null) {
                agzq.f66917d = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileIdentityService/GetPhoneNumbers", ciie.m150370a(btaj.f147985d), ciie.m150370a(btak.f147990d));
            }
            btak btak = (btak) a3.f66919a.mo25553a(agzq.f66917d, clientContext, btaj, (long) agzq.f66915b, TimeUnit.MILLISECONDS);
            new Object[1][0] = btak;
            agzy.close();
            bszs bszs = btak.f147994c;
            if (bszs == null) {
                bszs = bszs.f147883b;
            }
            Bundle a4 = ahaa.m55374a(bszs);
            ahau ahau = new ahau();
            String str2 = btak.f147992a;
            GetPhoneNumbersResponse getPhoneNumbersResponse = ahau.f66946a;
            getPhoneNumbersResponse.f80376a = str2;
            getPhoneNumbersResponse.f80378c = a4;
            if (btak.f147993b.size() > 0) {
                String[] strArr = new String[btak.f147993b.size()];
                for (int i2 = 0; i2 < btak.f147993b.size(); i2++) {
                    strArr[i2] = (String) btak.f147993b.get(i2);
                }
                ahau.f66946a.f80377b = strArr;
            }
            GetPhoneNumbersResponse getPhoneNumbersResponse2 = ahau.f66946a;
            ((bnsl) f66935d.mo68390d()).mo68405a("PhoneNumbers is retrieved");
            try {
                this.f66936a.mo36218a(Status.f30107a, getPhoneNumbersResponse2);
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
        ((bnsl) f66935d.mo68390d()).mo68420a("Error status: {%s}", status);
        try {
            this.f66936a.mo36218a(status, (GetPhoneNumbersResponse) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f66935d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Unable to complete API callback for failure:{%s}", status);
        }
    }
}
