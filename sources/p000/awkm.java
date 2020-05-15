package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* renamed from: awkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awkm implements rkk {

    /* renamed from: a */
    public final GetClientTokenResponse f94593a;

    /* renamed from: b */
    private final Status f94594b;

    public awkm(Status status, GetClientTokenResponse getClientTokenResponse) {
        this.f94594b = status;
        this.f94593a = getClientTokenResponse;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f94594b;
    }
}
