package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: aups */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aups implements rkk {

    /* renamed from: a */
    public final Status f92288a;

    /* renamed from: b */
    public final boolean f92289b;

    /* renamed from: c */
    public final boolean f92290c;

    /* renamed from: d */
    public final long f92291d;

    public aups(Status status, boolean z, boolean z2, long j) {
        this.f92288a = status;
        this.f92289b = z;
        this.f92290c = z2;
        this.f92291d = j;
    }

    /* renamed from: a */
    public static aups m77583a(Bundle bundle) {
        Status status;
        bundle.setClassLoader(aups.class.getClassLoader());
        Status status2 = (Status) bundle.getParcelable("status");
        if (status2 == null) {
            status = Status.f30109c;
        } else {
            status = status2;
        }
        return new aups(status, bundle.getBoolean("configured", false), bundle.getBoolean("in_trusted_state", false), bundle.getLong("time_since_manual_unlock", -1));
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f92288a;
    }
}
