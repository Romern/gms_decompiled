package p000;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

/* renamed from: ptc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ptc implements rkk {

    /* renamed from: a */
    public final ApplicationMetadata f40176a;

    /* renamed from: b */
    public final String f40177b;

    /* renamed from: c */
    private final Status f40178c;

    public ptc(Status status, ApplicationMetadata applicationMetadata, String str) {
        this.f40178c = status;
        this.f40176a = applicationMetadata;
        this.f40177b = str;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f40178c;
    }
}
