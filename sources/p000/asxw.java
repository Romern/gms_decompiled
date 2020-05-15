package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;

/* renamed from: asxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asxw implements asmk {

    /* renamed from: a */
    private final RetrieveInAppPaymentCredentialResponse f89898a;

    /* renamed from: b */
    private final Status f89899b;

    public asxw(Status status, RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse) {
        this.f89899b = status;
        this.f89898a = retrieveInAppPaymentCredentialResponse;
    }

    /* renamed from: b */
    public final RetrieveInAppPaymentCredentialResponse mo49242b() {
        return this.f89898a;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f89899b;
    }
}
