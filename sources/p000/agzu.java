package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;

/* renamed from: agzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agzu extends dcj implements agzw {
    public agzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionService");
    }

    /* renamed from: a */
    public final void mo36220a(agzt agzt, CheckAuthStatusRequest checkAuthStatusRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agzt);
        dcl.m8165a(bj, checkAuthStatusRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo36221a(agzt agzt, GetEsimConfigRequest getEsimConfigRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agzt);
        dcl.m8165a(bj, getEsimConfigRequest);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo36222a(agzt agzt, GetPhoneNumbersRequest getPhoneNumbersRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agzt);
        dcl.m8165a(bj, getPhoneNumbersRequest);
        mo8528b(3, bj);
    }
}
