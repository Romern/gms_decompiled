package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;

/* renamed from: asxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asxj implements asmi {

    /* renamed from: a */
    private final Status f89882a;

    /* renamed from: b */
    private final GetActiveCardsForAccountResponse f89883b;

    public asxj(Status status, GetActiveCardsForAccountResponse getActiveCardsForAccountResponse) {
        this.f89882a = status;
        this.f89883b = getActiveCardsForAccountResponse;
    }

    /* renamed from: b */
    public final GetActiveCardsForAccountResponse mo49240b() {
        return this.f89883b;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f89882a;
    }
}
