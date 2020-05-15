package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;

/* renamed from: bjuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjuu implements asmi {

    /* renamed from: a */
    private final Status f123370a;

    /* renamed from: b */
    private final GetActiveCardsForAccountResponse f123371b;

    public bjuu(Status status, GetActiveCardsForAccountResponse getActiveCardsForAccountResponse) {
        this.f123370a = status;
        this.f123371b = getActiveCardsForAccountResponse;
    }

    /* renamed from: b */
    public final GetActiveCardsForAccountResponse mo49240b() {
        return this.f123371b;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f123370a;
    }
}
