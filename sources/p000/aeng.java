package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: aeng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeng extends dcj implements aeni {
    public aeng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    }

    /* renamed from: a */
    public final void mo34349a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, nearbyAlertRequest);
        dcl.m8165a(bj, placesParams);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, aenr);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo34351a(PlaceReport placeReport, PlacesParams placesParams, aenr aenr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34353a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, aenr aenr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34355a(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34357a(PlacesParams placesParams, String str, aenr aenr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34358a(rnt rnt) {
        throw null;
    }

    /* renamed from: b */
    public final void mo34359b(PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placesParams);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, aenr);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo34350a(PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placeFilter);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aenr);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo34352a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placeRequest);
        dcl.m8165a(bj, placesParams);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, aenr);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo34354a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placesClientIdentifier);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, rnt);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo34356a(PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placesParams);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, aenr);
        mo8528b(3, bj);
    }
}
