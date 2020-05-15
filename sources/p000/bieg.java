package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collections;
import java.util.concurrent.TimeoutException;

/* renamed from: bieg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bieg extends bien {

    /* renamed from: b */
    private final LatLng f120378b;

    /* renamed from: c */
    private final PlaceFilter f120379c;

    /* renamed from: d */
    private final aenr f120380d;

    public bieg(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "GetPlaceByLatLng", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(latLng);
        sdo.m34959a(placeFilter);
        sdo.m34959a(aenr);
        this.f120378b = latLng;
        this.f120379c = placeFilter;
        this.f120380d = aenr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        return bhqq.m101353a(this.f120379c, this.f120388a);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        try {
            bioc.m102646a(0, mo64567f().mo64494a(this.f120378b, (int) cgfl.f186724a.mo6606a().mo83601h(), false, this.f120388a, this.f120379c), 108, this.f120380d);
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bioc.m102646a(status.f30115i, Collections.emptyList(), 108, this.f120380d);
    }
}
