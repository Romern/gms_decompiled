package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: biax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biax implements Callable {

    /* renamed from: a */
    private final biam f120082a;

    /* renamed from: b */
    private final LatLngBounds f120083b;

    /* renamed from: c */
    private final int f120084c;

    /* renamed from: d */
    private final List f120085d;

    /* renamed from: e */
    private final PlacesParams f120086e;

    public biax(biam biam, PlacesParams placesParams, LatLngBounds latLngBounds, int i, List list) {
        this.f120082a = biam;
        this.f120086e = placesParams;
        this.f120083b = latLngBounds;
        this.f120084c = i;
        this.f120085d = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        HashMap hashMap;
        biam biam = this.f120082a;
        LatLngBounds latLngBounds = this.f120083b;
        int i = this.f120084c;
        List list = this.f120085d;
        PlacesParams placesParams = this.f120086e;
        bvlk bvlk = (bvlk) biam.mo64492a(new bibm(biam.f120057e, biam.f120053a, biam.f120054b, biam.f120055c, biam.f120056d, latLngBounds, i, list, "searchByChain", placesParams), placesParams);
        Context context = biam.f120053a;
        if (bvlk == null || (bvlk.f156554a & 2) == 0 || bvlk.f156556c.size() == 0) {
            hashMap = new HashMap();
        } else {
            bvow bvow = bvlk.f156555b;
            if (bvow == null) {
                bvow = bvow.f157230c;
            }
            bian.m101877a(context, bvow);
            hashMap = new HashMap(bvlk.f156556c.size() + 1);
            ArrayList arrayList = new ArrayList(bvlk.f156556c.size());
            bxwc bxwc = bvlk.f156556c;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(bian.m101864a((bvog) bxwc.get(i2)));
            }
            hashMap.put(bvlk.f156557d, arrayList);
            bxwc bxwc2 = bvlk.f156558e;
            int size2 = bxwc2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bvlj bvlj = (bvlj) bxwc2.get(i3);
                ArrayList arrayList2 = new ArrayList(bvlj.f156549a.size());
                bxwc bxwc3 = bvlj.f156549a;
                int size3 = bxwc3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    arrayList2.add(bian.m101864a((bvog) bxwc3.get(i4)));
                }
                hashMap.put(bvlj.f156550b, arrayList2);
            }
        }
        return new biba(hashMap);
    }
}
