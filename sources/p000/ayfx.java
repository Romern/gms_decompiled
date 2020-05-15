package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: ayfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfx {

    /* renamed from: a */
    static final List f97506a = Arrays.asList("com.google.android.location.fused.wearable.LOCATION_CAPABILITY", "mdm/ringable", "com.google.android.location.fused.wearable.LOCATION_REQUESTOR_CAPABILITY");

    /* renamed from: b */
    static final List f97507b = Arrays.asList("com/google/android/location/fused/wearable/LOCATIONS", "com/google/android/location/fused/wearable/LOCATION_REQUESTS_REFRESH", "com.google.android.gms.mdm.RING_STARTED", "com.google.android.gms.mdm.RING_CANCELED", "com/google/android/location/fused/wearable/LOCATION_REQUESTS", "com.google.android.gms.mdm.ACTION_RING", "com.google.android.gms.mdm.ACTION_CANCEL_RING");

    /* renamed from: c */
    private final axue f97508c;

    /* renamed from: d */
    private final axue f97509d;

    public ayfx(axue axue, axue axue2) {
        this.f97508c = axue;
        this.f97509d = axue2;
    }

    /* renamed from: a */
    public final axue mo53995a(axue axue, String str) {
        if (this.f97508c == null) {
            return axue;
        }
        if (!this.f97509d.equals(axue) || !f97507b.contains(str)) {
            return (!this.f97508c.equals(axue) || !f97507b.contains(str)) ? axue : this.f97509d;
        }
        return this.f97508c;
    }

    /* renamed from: b */
    public final axue mo53996b(axue axue, String str) {
        if (this.f97508c == null) {
            return axue;
        }
        if (!this.f97509d.equals(axue) || !f97506a.contains(str)) {
            return (!this.f97508c.equals(axue) || !f97506a.contains(str)) ? axue : this.f97509d;
        }
        return this.f97508c;
    }
}
