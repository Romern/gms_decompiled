package p000;

import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: bihf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihf implements afcs {

    /* renamed from: a */
    final /* synthetic */ aelh f120594a;

    /* renamed from: b */
    final /* synthetic */ biht f120595b;

    public bihf(biht biht, aelh aelh) {
        this.f120595b = biht;
        this.f120594a = aelh;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        this.f120595b.mo64624g();
        biht biht = this.f120595b;
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.mo43878a(this.f120594a.mo8010d());
        markerOptions.f79902d = this.f120595b.f120615c;
        biht.f120623k = afcn.mo34747a(markerOptions);
        biht biht2 = this.f120595b;
        if (biht2.f120628p != null) {
            GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
            LatLng d = this.f120594a.mo8010d();
            biht biht3 = this.f120595b;
            groundOverlayOptions.mo43864a(d, (float) biht3.f120630r, (float) biht3.f120631s);
            groundOverlayOptions.mo43862a(0.4f);
            groundOverlayOptions.mo43863a(this.f120595b.f120628p);
            biht2.f120624l = afcn.mo34746a(groundOverlayOptions);
        }
    }
}
