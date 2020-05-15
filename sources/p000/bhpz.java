package p000;

import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bhpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpz {
    /* renamed from: a */
    public static PlaceEntity m101304a(String str, double d, double d2, List list) {
        Locale locale = Locale.getDefault();
        LatLng latLng = new LatLng(d, d2);
        LatLngBounds latLngBounds = new LatLngBounds(latLng, latLng);
        aeob aeob = new aeob();
        aeob.f63547a = str;
        aeob.f63549c = latLng;
        aeob.f63551e = latLngBounds;
        aeob.f63548b = str;
        aeob.f63557k = new ArrayList(list);
        PlaceEntity a = aeob.mo34381a();
        a.f79552r = locale;
        return a;
    }
}
