package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: iij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iij implements rkk {

    /* renamed from: a */
    private final Status f21053a;

    /* renamed from: b */
    private final ReflectedParcelable f21054b;

    public iij(Status status, SafeParcelable safeParcelable) {
        sdo.m34959a(status);
        this.f21053a = status;
        this.f21054b = (ReflectedParcelable) safeParcelable;
    }

    /* renamed from: b */
    public final Bundle mo13041b() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("status", this.f21053a);
        bundle.putParcelable("parcelable", this.f21054b);
        return bundle;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f21053a;
    }
}
