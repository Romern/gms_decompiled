package p000;

import android.location.Location;
import com.android.volley.Response;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: afzh */
public final /* synthetic */ class afzh implements aubq {

    /* renamed from: a */
    private final afzi f65002a;

    public afzh(afzi afzi) {
        this.f65002a = afzi;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        Location location;
        afzi afzi = this.f65002a;
        if (aucb.mo50384b()) {
            location = (Location) aucb.mo50386d();
        } else {
            location = null;
        }
        if (location != null) {
            if (cgki.m145896d()) {
                if (System.currentTimeMillis() - location.getTime() < 600000) {
                    afzi.f65006d = true;
                    agaa.m53787a().mo35128a(location);
                    afzi.mo35077a(cake.SUCCESS, location, (Response.Listener) null, afzi);
                }
                if (((double) location.getAccuracy()) < 25.0d && System.currentTimeMillis() - location.getTime() < 60000) {
                    int i = eoa.f15378a;
                    afzi.mo35074a();
                    return;
                }
            } else {
                afzi.f65006d = true;
                agaa.m53787a().mo35128a(location);
                afzi.mo35077a(cake.SUCCESS, location, (Response.Listener) null, afzi);
            }
        }
        if (cgki.m145896d() && !afzi.f65006d) {
            afzi.mo35077a(cake.SUCCESS, (Location) null, (Response.Listener) null, afzi);
        }
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo43553c(100);
        locationRequest.mo43549a(60000L);
        locationRequest.mo43554c(0L);
        locationRequest.mo43551b(10);
        LocationRequestInternal a = LocationRequestInternal.m66889a("adm_gcm_receiver_service", locationRequest);
        a.mo43611a();
        afzi.f65007e.mo24685a(a, afzi, afzi.f65005c.getLooper());
    }
}
