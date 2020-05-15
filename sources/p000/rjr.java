package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: rjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rjr implements rkk {

    /* renamed from: a */
    public final Status f43154a;

    /* renamed from: b */
    public final boolean f43155b;

    public rjr(Status status, boolean z) {
        sdo.checkIfNull(status, "Status must not be null");
        this.f43154a = status;
        this.f43155b = z;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f43154a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rjr) {
            rjr rjr = (rjr) obj;
            return this.f43154a.equals(rjr.f43154a) && this.f43155b == rjr.f43155b;
        }
    }

    public final int hashCode() {
        return ((this.f43154a.hashCode() + 527) * 31) + (this.f43155b ? 1 : 0);
    }
}
