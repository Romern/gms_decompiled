package p000;

import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: bihh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bihi f120597a;

    public bihh(bihi bihi) {
        this.f120597a = bihi;
    }

    public final void run() {
        if (this.f120597a.f120599b.isAdded()) {
            biht biht = this.f120597a.f120599b;
            if (!biht.f120614b) {
                biht.f120614b = true;
                LocationManager locationManager = (LocationManager) biht.getActivity().getSystemService("location");
                if (locationManager == null) {
                    bihr bihr = this.f120597a.f120599b.f120632t;
                    if (bihr != null) {
                        bihr.mo64613b();
                    }
                } else {
                    Location lastKnownLocation = locationManager.getLastKnownLocation("passive");
                    if (lastKnownLocation != null) {
                        bihr bihr2 = this.f120597a.f120599b.f120632t;
                        if (bihr2 != null) {
                            bihr2.mo64612a(new LatLng(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude()));
                        }
                    } else {
                        bihr bihr3 = this.f120597a.f120599b.f120632t;
                        if (bihr3 != null) {
                            bihr3.mo64613b();
                        }
                    }
                }
                afcn afcn = this.f120597a.f120599b.f120618f;
                if (afcn != null) {
                    afcn.mo34753a((bihg) null);
                }
            }
        }
    }
}
