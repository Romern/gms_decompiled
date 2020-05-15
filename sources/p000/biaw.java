package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: biaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biaw implements Callable {

    /* renamed from: a */
    private final biam f120078a;

    /* renamed from: b */
    private final LatLngBounds f120079b;

    /* renamed from: c */
    private final int f120080c;

    /* renamed from: d */
    private final PlacesParams f120081d;

    public biaw(biam biam, PlacesParams placesParams, LatLngBounds latLngBounds, int i) {
        this.f120078a = biam;
        this.f120081d = placesParams;
        this.f120079b = latLngBounds;
        this.f120080c = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        biam biam = this.f120078a;
        LatLngBounds latLngBounds = this.f120079b;
        int i = this.f120080c;
        PlacesParams placesParams = this.f120081d;
        bvlh bvlh = (bvlh) biam.mo64492a(new bibl(biam.f120057e, biam.f120053a, biam.f120055c, biam.f120056d, latLngBounds, i, "searchByBeacon", placesParams), placesParams);
        Context context = biam.f120053a;
        if (bvlh == null || bvlh.f156538b.size() == 0) {
            return new ArrayList();
        }
        bvow bvow = bvlh.f156537a;
        if (bvow == null) {
            bvow = bvow.f157230c;
        }
        bian.m101877a(context, bvow);
        ArrayList arrayList = new ArrayList(bvlh.f156538b.size());
        for (int i2 = 0; i2 < bvlh.f156538b.size(); i2++) {
            arrayList.add(bian.m101864a((bvog) bvlh.f156538b.get(i2)));
        }
        return arrayList;
    }
}
