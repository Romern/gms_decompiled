package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: qse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qse implements rkk {

    /* renamed from: a */
    public final Status f42023a;

    /* renamed from: b */
    public final SafeParcelable f42024b;

    public qse(Status status, SafeParcelable safeParcelable) {
        sdo.m34959a(status);
        this.f42023a = status;
        this.f42024b = safeParcelable;
    }

    /* renamed from: b */
    public final Bundle mo24247b() {
        Bundle bundle = new Bundle();
        adbw.m50145a(bundle, "status", this.f42023a);
        SafeParcelable safeParcelable = this.f42024b;
        if (safeParcelable != null) {
            adbw.m50145a(bundle, "parcelable", safeParcelable);
        }
        return bundle;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f42023a;
    }
}
