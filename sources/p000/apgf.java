package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;

/* renamed from: apgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgf implements rkk {

    /* renamed from: a */
    public final AttestationData f84329a;

    /* renamed from: b */
    private final Status f84330b;

    public apgf(Status status, AttestationData attestationData) {
        this.f84330b = status;
        this.f84329a = attestationData;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f84330b;
    }
}
