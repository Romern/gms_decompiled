package p000;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import java.io.IOException;
import java.util.List;

/* renamed from: odz */
final /* synthetic */ class odz implements aubw {

    /* renamed from: a */
    private final oec f37330a;

    /* renamed from: b */
    private final Geocoder f37331b;

    public odz(oec oec, Geocoder geocoder) {
        this.f37330a = oec;
        this.f37331b = geocoder;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        oec oec = this.f37330a;
        Geocoder geocoder = this.f37331b;
        Location location = (Location) obj;
        boolean z = false;
        if (location == null) {
            bnsi c = oec.f37335b.mo68388c();
            c.mo68432a("oec", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("No location returned. %s", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
        } else {
            try {
                List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                if (fromLocation != null) {
                    if (!fromLocation.isEmpty()) {
                        if (oec.f37336h.contains(fromLocation.get(0).getCountryCode())) {
                            z = true;
                        }
                    }
                }
                bnsi c2 = oec.f37335b.mo68388c();
                c2.mo68432a("oec", "a", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68420a("No country data returned. %s", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
            } catch (IOException e) {
                bnsi c3 = oec.f37335b.mo68388c();
                c3.mo68437a(e);
                c3.mo68432a("oec", "a", 335, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c3.mo68424a("%s%s", "Could not get location for the CarNavigationStatusService. ", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
            }
        }
        oec.f37337a = z;
    }
}
