package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: arum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arum implements rkk {

    /* renamed from: a */
    public final ExchangeAssertionsForUserCredentialsRequest f88322a;

    /* renamed from: b */
    private final Status f88323b;

    public arum(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        this.f88323b = status;
        this.f88322a = exchangeAssertionsForUserCredentialsRequest;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f88323b;
    }
}
