package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: arup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arup implements rkk {

    /* renamed from: a */
    public final ExchangeAssertionsForUserCredentialsRequest f88328a;

    /* renamed from: b */
    private final Status f88329b;

    public arup(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        this.f88329b = status;
        this.f88328a = exchangeAssertionsForUserCredentialsRequest;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f88329b;
    }
}
