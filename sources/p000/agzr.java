package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersResponse;

/* renamed from: agzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agzr extends dcj implements agzt {
    public agzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionCallbacks");
    }

    /* renamed from: a */
    public final void mo36217a(Status status, CheckAuthStatusResponse checkAuthStatusResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, checkAuthStatusResponse);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo36219a(Status status, GetEsimConfigResponse getEsimConfigResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getEsimConfigResponse);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo36218a(Status status, GetPhoneNumbersResponse getPhoneNumbersResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getPhoneNumbersResponse);
        mo8530c(3, bj);
    }
}
