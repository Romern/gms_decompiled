package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForInAppPaymentRequest;

/* renamed from: atjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjf extends atki {
    public atjf(IsDeviceUnlockedForInAppPaymentRequest isDeviceUnlockedForInAppPaymentRequest, String str, aswm aswm) {
        super("IsDeviceUnlockedForInAppPayment", isDeviceUnlockedForInAppPaymentRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        int i = aszv.f89931a;
        IsDeviceUnlockedForInAppPaymentRequest isDeviceUnlockedForInAppPaymentRequest = (IsDeviceUnlockedForInAppPaymentRequest) this.f90410b;
        this.f90414d.mo49624c(Status.f30107a, aszv.m75265a(context, isDeviceUnlockedForInAppPaymentRequest.f108546b, isDeviceUnlockedForInAppPaymentRequest.f108545a));
    }
}
