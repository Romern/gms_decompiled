package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: aenj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aenj extends dcj implements aenl {
    public aenj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlacesService");
    }

    /* renamed from: a */
    public final void mo34360a(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, aenr aenr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34361a(UserDataType userDataType, PlacesParams placesParams, aenr aenr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34365a(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34366a(LatLng latLng, PlacesParams placesParams, aenr aenr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34372a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, aenr aenr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo34375b(PlacesParams placesParams, aenr aenr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aenr);
        mo8528b(26, bj);
    }

    /* renamed from: b */
    public final void mo34376b(PlacesParams placesParams, aeos aeos) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34362a(PlacesParams placesParams, aenr aenr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aenr);
        mo8528b(23, bj);
    }

    /* renamed from: a */
    public final void mo34363a(PlacesParams placesParams, aeos aeos) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aeos);
        mo8528b(24, bj);
    }

    /* renamed from: a */
    public final void mo34364a(PlacesParams placesParams, aeov aeov) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aeov);
        mo8528b(27, bj);
    }

    /* renamed from: a */
    public final void mo34367a(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, latLngBounds);
        bj.writeInt(i);
        bj.writeString(str);
        dcl.m8165a(bj, placeFilter);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aenr);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo34368a(String str, int i, int i2, int i3, PlacesParams placesParams, aeno aeno) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeInt(i2);
        bj.writeInt(i3);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aeno);
        mo8528b(20, bj);
    }

    /* renamed from: a */
    public final void mo34369a(String str, PlacesParams placesParams, aeno aeno) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aeno);
        mo8528b(19, bj);
    }

    /* renamed from: a */
    public final void mo34370a(String str, PlacesParams placesParams, aeos aeos) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(null);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aeos);
        mo8528b(21, bj);
    }

    /* renamed from: a */
    public final void mo34371a(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, aenr aenr) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, latLngBounds);
        bj.writeInt(1);
        dcl.m8165a(bj, autocompleteFilter);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aenr);
        mo8528b(28, bj);
    }

    /* renamed from: a */
    public final void mo34373a(String str, String str2, String str3, PlacesParams placesParams, aeos aeos) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aeos);
        mo8528b(16, bj);
    }

    /* renamed from: a */
    public final void mo34374a(List list, PlacesParams placesParams, aenr aenr) {
        Parcel bj = mo8529bj();
        bj.writeStringList(list);
        dcl.m8165a(bj, placesParams);
        dcl.m8164a(bj, aenr);
        mo8528b(17, bj);
    }
}
