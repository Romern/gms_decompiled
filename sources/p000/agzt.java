package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersResponse;

/* renamed from: agzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface agzt extends IInterface {
    /* renamed from: a */
    void mo36217a(Status status, CheckAuthStatusResponse checkAuthStatusResponse);

    /* renamed from: a */
    void mo36219a(Status status, GetEsimConfigResponse getEsimConfigResponse);

    /* renamed from: a */
    void mo36218a(Status status, GetPhoneNumbersResponse getPhoneNumbersResponse);
}
