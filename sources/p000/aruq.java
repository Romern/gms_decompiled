package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: aruq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aruq implements rkk {

    /* renamed from: a */
    public final ExchangeAssertionsForUserCredentialsRequest f88330a;

    /* renamed from: b */
    private final Status f88331b;

    public aruq(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        this.f88331b = status;
        this.f88330a = exchangeAssertionsForUserCredentialsRequest;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f88331b;
    }
}
