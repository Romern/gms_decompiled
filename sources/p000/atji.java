package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.PromptDeviceUnlockForPaymentRequest;

/* renamed from: atji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atji extends atki {
    public atji(PromptDeviceUnlockForPaymentRequest promptDeviceUnlockForPaymentRequest, String str, aswm aswm) {
        super("PromptDeviceUnlockForPayment", promptDeviceUnlockForPaymentRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        this.f90414d.mo49607a(new Status(6, null, spn.m35844a(context, atah.m75275a(context), (int) JGCastService.FLAG_PRIVATE_DISPLAY)), Bundle.EMPTY);
    }
}
