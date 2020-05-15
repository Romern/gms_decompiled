package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: biaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biaz implements Callable {

    /* renamed from: a */
    private final biam f120091a;

    /* renamed from: b */
    private final LatLngBounds f120092b;

    /* renamed from: c */
    private final int f120093c;

    /* renamed from: d */
    private final String f120094d;

    /* renamed from: e */
    private final UserLocationNearbyAlertFilter f120095e;

    /* renamed from: f */
    private final PlacesParams f120096f;

    public biaz(biam biam, PlacesParams placesParams, LatLngBounds latLngBounds, int i, String str, UserLocationNearbyAlertFilter userLocationNearbyAlertFilter) {
        this.f120091a = biam;
        this.f120096f = placesParams;
        this.f120092b = latLngBounds;
        this.f120093c = i;
        this.f120094d = str;
        this.f120095e = userLocationNearbyAlertFilter;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        List list;
        biam biam = this.f120091a;
        LatLngBounds latLngBounds = this.f120092b;
        int i = this.f120093c;
        String str = this.f120094d;
        List list2 = this.f120095e.f109589b;
        PlacesParams placesParams = this.f120096f;
        bvpa bvpa = (bvpa) biam.mo64492a(new bibo(biam.f120057e, biam.f120053a, biam.f120055c, biam.f120056d, latLngBounds, i, str, list2, false, "search", placesParams), placesParams);
        Context context = biam.f120053a;
        if (bvpa == null || bvpa.f157255b.size() == 0) {
            return new ArrayList();
        }
        bvow bvow = bvpa.f157254a;
        if (bvow == null) {
            bvow = bvow.f157230c;
        }
        bian.m101877a(context, bvow);
        ArrayList arrayList = new ArrayList(bvpa.f157255b.size());
        for (int i2 = 0; i2 < bvpa.f157255b.size(); i2++) {
            bvmv bvmv = (bvmv) bvpa.f157255b.get(i2);
            bhzs bhzs = null;
            if (bvmv != null) {
                int i3 = bvmv.f156800a;
                if ((i3 & 1) != 0) {
                    if ((i3 & 32) != 0) {
                        bvmx bvmx = bvmv.f156808i;
                        if (bvmx == null) {
                            bvmx = bvmx.f156821d;
                        }
                        if ((bvmx.f156823a & 1) != 0) {
                            String str2 = bvmv.f156801b;
                            int size = bvmv.f156802c.size();
                            List arrayList2 = new ArrayList(size);
                            if (size != 0) {
                                bxwc bxwc = bvmv.f156802c;
                                int size2 = bxwc.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    arrayList2.add(Integer.valueOf(bhqm.m101333a((String) bxwc.get(i4))));
                                }
                                list = arrayList2;
                            } else {
                                if (Log.isLoggable("Places", 5)) {
                                    bioi.m102662c("Places", "place is missing type. Defaulting to 'other'");
                                }
                                list = Collections.singletonList(0);
                            }
                            bvmx bvmx2 = bvmv.f156808i;
                            if (bvmx2 == null) {
                                bvmx2 = bvmx.f156821d;
                            }
                            bzrv bzrv = bvmx2.f156824b;
                            if (bzrv == null) {
                                bzrv = bzrv.f171206c;
                            }
                            LatLng a = bian.m101873a(bzrv);
                            bhzs = new bhzs(str2, a.f79894a, a.f79895b, 80.0f, list);
                        } else if (Log.isLoggable("Places", 6)) {
                            bioi.m102658a("Places", "received place lacks latlng");
                        }
                    } else if (Log.isLoggable("Places", 6)) {
                        bioi.m102658a("Places", "received place lacks geometry");
                    }
                } else if (Log.isLoggable("Places", 6)) {
                    bioi.m102658a("Places", "received place lacks id");
                }
            } else if (Log.isLoggable("Places", 6)) {
                bioi.m102658a("Places", "received null place");
            }
            arrayList.add(bhzs);
        }
        return arrayList;
    }
}
