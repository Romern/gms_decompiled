package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;

/* renamed from: bjuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjuv implements asmk {

    /* renamed from: a */
    private final Status f123372a;

    /* renamed from: b */
    private final RetrieveInAppPaymentCredentialResponse f123373b;

    public bjuv(Status status, RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse) {
        this.f123372a = status;
        this.f123373b = retrieveInAppPaymentCredentialResponse;
    }

    /* renamed from: b */
    public final RetrieveInAppPaymentCredentialResponse mo49242b() {
        return this.f123373b;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f123372a;
    }
}
