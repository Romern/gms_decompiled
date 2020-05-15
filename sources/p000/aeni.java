package p000;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: aeni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aeni extends IInterface {
    /* renamed from: a */
    void mo34349a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr);

    /* renamed from: a */
    void mo34350a(PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34351a(PlaceReport placeReport, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34352a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr);

    /* renamed from: a */
    void mo34353a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34354a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, rnt rnt);

    /* renamed from: a */
    void mo34355a(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr);

    /* renamed from: a */
    void mo34356a(PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr);

    /* renamed from: a */
    void mo34357a(PlacesParams placesParams, String str, aenr aenr);

    /* renamed from: a */
    void mo34358a(rnt rnt);

    /* renamed from: b */
    void mo34359b(PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr);
}
