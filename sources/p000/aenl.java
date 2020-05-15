package p000;

import android.os.IInterface;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: aenl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aenl extends IInterface {
    /* renamed from: a */
    void mo34360a(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34361a(UserDataType userDataType, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34362a(PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34363a(PlacesParams placesParams, aeos aeos);

    /* renamed from: a */
    void mo34364a(PlacesParams placesParams, aeov aeov);

    /* renamed from: a */
    void mo34365a(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34366a(LatLng latLng, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34367a(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34368a(String str, int i, int i2, int i3, PlacesParams placesParams, aeno aeno);

    /* renamed from: a */
    void mo34369a(String str, PlacesParams placesParams, aeno aeno);

    /* renamed from: a */
    void mo34370a(String str, PlacesParams placesParams, aeos aeos);

    /* renamed from: a */
    void mo34371a(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34372a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, aenr aenr);

    /* renamed from: a */
    void mo34373a(String str, String str2, String str3, PlacesParams placesParams, aeos aeos);

    /* renamed from: a */
    void mo34374a(List list, PlacesParams placesParams, aenr aenr);

    /* renamed from: b */
    void mo34375b(PlacesParams placesParams, aenr aenr);

    /* renamed from: b */
    void mo34376b(PlacesParams placesParams, aeos aeos);
}
