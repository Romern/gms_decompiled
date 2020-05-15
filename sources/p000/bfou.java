package p000;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: bfou */
final /* synthetic */ class bfou implements bmxz {

    /* renamed from: a */
    static final bmxz f114720a = new bfou();

    private bfou() {
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        LocationRequest locationRequest = ((LocationRequestInternal) obj).f79420b;
        return locationRequest.f79355g > 0.0f || (cewd.m138340c() && ((long) locationRequest.f79349a) >= cewd.m138339b());
    }
}
