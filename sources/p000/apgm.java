package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: apgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgm implements rkk {

    /* renamed from: a */
    public final HarmfulAppsInfo f84339a;

    /* renamed from: b */
    private final Status f84340b;

    public apgm(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        this.f84340b = status;
        this.f84339a = harmfulAppsInfo;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f84340b;
    }
}
