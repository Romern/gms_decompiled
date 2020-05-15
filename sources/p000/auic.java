package p000;

import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: auic */
final /* synthetic */ class auic implements aubw {

    /* renamed from: a */
    private final auie f91867a;

    public auic(auie auie) {
        this.f91867a = auie;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        auie auie = this.f91867a;
        Location location = (Location) obj;
        if (location == null || auho.m77068a(location) > cgyq.m147651i()) {
            C1223np npVar = auho.f91828a;
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.mo43553c((int) cgyq.f188062a.mo6606a().mo84780x());
            locationRequest.mo43549a(TimeUnit.SECONDS.toMillis(5));
            locationRequest.mo43551b(1);
            auie.f91872d.mo24724a(locationRequest, auie.f91869a);
        }
    }
}
