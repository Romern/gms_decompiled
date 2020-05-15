package p000;

import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: aenc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aenc {
    /* renamed from: a */
    public static final rke m52182a(rkb rkb) {
        return rkb.mo24787a((rle) new aemz(aema.f63501a, rkb));
    }

    /* renamed from: a */
    public static final rke m52183a(rkb rkb, LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter) {
        boolean z;
        sdo.m34966a(latLngBounds, "bounds == null");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "maxResults <= 0");
        return rkb.mo24787a((rle) new aemy(aema.f63501a, rkb, latLngBounds, str, i, placeFilter));
    }

    /* renamed from: a */
    public static final rke m52184a(rkb rkb, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        return rkb.mo24787a((rle) new aemb(aema.f63501a, rkb, str, latLngBounds, autocompleteFilter));
    }

    /* renamed from: a */
    public static final rke m52185a(rkb rkb, String... strArr) {
        boolean z;
        boolean z2;
        if (strArr != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "placeIds == null");
        int length = strArr.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "placeIds is empty");
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            sdo.m34975b(str != null, "placeId == null");
            sdo.m34975b(!str.isEmpty(), "placeId is empty");
        }
        return rkb.mo24787a((rle) new aemx(aema.f63501a, rkb, strArr));
    }
}
