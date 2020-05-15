package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForPaymentRequest;

/* renamed from: atjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjg extends atki {
    public atjg(IsDeviceUnlockedForPaymentRequest isDeviceUnlockedForPaymentRequest, String str, aswm aswm) {
        super("IsDeviceUnlockedForPayment", isDeviceUnlockedForPaymentRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        this.f90414d.mo49620a(Status.f30107a, new atah(context).mo49730a(600));
    }
}
