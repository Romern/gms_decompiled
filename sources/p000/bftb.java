package p000;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: bftb */
final /* synthetic */ class bftb implements bmxz {

    /* renamed from: a */
    static final bmxz f115183a = new bftb();

    private bftb() {
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        LocationRequest locationRequest;
        int i;
        return !cesn.m138189d() || (i = (locationRequest = ((LocationRequestInternal) obj).f79420b).f79349a) == 100 || (i == 102 && locationRequest.f79350b < 60000);
    }
}
