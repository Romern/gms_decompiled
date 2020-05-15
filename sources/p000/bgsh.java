package p000;

import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: bgsh */
final /* synthetic */ class bgsh implements aubw {

    /* renamed from: a */
    private final bgsj f117411a;

    public bgsh(bgsj bgsj) {
        this.f117411a = bgsj;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bgsj bgsj = this.f117411a;
        bgsj.mo63132a((Location) obj);
        if (bgsj.f117416c == null) {
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.mo43553c(100);
            locationRequest.mo43554c(0L);
            locationRequest.mo43552b(0L);
            locationRequest.mo43551b(1);
            locationRequest.mo43556d(0);
            locationRequest.mo43549a(cevi.m138295j());
            LocationRequestInternal a = LocationRequestInternal.m66889a("ealert", locationRequest);
            a.f79426h = "com.google.android.gms.location";
            a.mo43611a();
            bgsj.f117415b = bgsj.mo63131a("com.google.android.gms.location.quake.ealert.ACTION_ONESHOT");
            bgsj.f117418e.mo24726a(a, bgsj.f117415b);
        }
    }
}
