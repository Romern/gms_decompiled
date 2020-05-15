package p000;

import android.location.Location;
import com.google.android.gms.location.LocationResult;

/* renamed from: beyl */
final /* synthetic */ class beyl implements Runnable {

    /* renamed from: a */
    private final beym f113016a;

    /* renamed from: b */
    private final LocationResult f113017b;

    public beyl(beym beym, LocationResult locationResult) {
        this.f113016a = beym;
        this.f113017b = locationResult;
    }

    public final void run() {
        Location a;
        beym beym = this.f113016a;
        LocationResult locationResult = this.f113017b;
        if (beym.f113018a.f113047j && (a = locationResult.mo43561a()) != null) {
            beym.f113018a.f113053p = a;
        }
    }
}
