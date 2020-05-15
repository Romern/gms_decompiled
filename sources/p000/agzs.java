package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersResponse;

/* renamed from: agzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agzs extends dck implements agzt {
    public agzs() {
        super("com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionCallbacks");
    }

    /* renamed from: a */
    public void mo36217a(Status status, CheckAuthStatusResponse checkAuthStatusResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo36219a(Status status, GetEsimConfigResponse getEsimConfigResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo36218a(Status status, GetPhoneNumbersResponse getPhoneNumbersResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo36217a((Status) dcl.m8163a(parcel, Status.CREATOR), (CheckAuthStatusResponse) dcl.m8163a(parcel, CheckAuthStatusResponse.CREATOR));
            return true;
        } else if (i == 3) {
            mo36218a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetPhoneNumbersResponse) dcl.m8163a(parcel, GetPhoneNumbersResponse.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            mo36219a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetEsimConfigResponse) dcl.m8163a(parcel, GetEsimConfigResponse.CREATOR));
            return true;
        }
    }
}
