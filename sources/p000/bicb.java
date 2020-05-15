package p000;

import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: bicb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicb implements Callable {

    /* renamed from: a */
    private final bibq f120183a;

    /* renamed from: b */
    private final LatLngBounds f120184b;

    /* renamed from: c */
    private final int f120185c;

    /* renamed from: d */
    private final PlacesParams f120186d;

    public bicb(bibq bibq, PlacesParams placesParams, LatLngBounds latLngBounds, int i) {
        this.f120183a = bibq;
        this.f120186d = placesParams;
        this.f120184b = latLngBounds;
        this.f120185c = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bibq bibq = this.f120183a;
        LatLngBounds latLngBounds = this.f120184b;
        int i = this.f120185c;
        bvtm bvtm = (bvtm) bibq.mo64508a(new bici(bibq.f120155b, latLngBounds, i), this.f120186d);
        if (bvtm == null || bvtm.f157584a.size() == 0) {
            return bngx.m109376e();
        }
        ArrayList arrayList = new ArrayList(bvtm.f157584a.size());
        for (int i2 = 0; i2 < bvtm.f157584a.size(); i2++) {
            arrayList.add(bibr.m101919a((bvul) bvtm.f157584a.get(i2)));
        }
        return bngx.m109368a((Collection) arrayList);
    }
}
