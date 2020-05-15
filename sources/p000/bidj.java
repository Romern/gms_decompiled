package p000;

import android.content.Context;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.places.service.GeoDataChimeraService;
import java.util.List;

/* renamed from: bidj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidj extends aenk implements aaai {

    /* renamed from: a */
    private final bidi f120306a;

    /* renamed from: b */
    private final aaag f120307b;

    /* renamed from: c */
    private final GeoDataChimeraService f120308c;

    /* renamed from: d */
    private final bidx f120309d;

    /* renamed from: e */
    private final bhpt f120310e;

    public bidj(GeoDataChimeraService geoDataChimeraService, aaag aaag, Context context, String str, bidx bidx, bqgj bqgj) {
        this.f120306a = new bidi(context, str);
        sdo.m34959a(aaag);
        this.f120307b = aaag;
        this.f120308c = geoDataChimeraService;
        this.f120309d = bidx;
        this.f120310e = new bhpt(context, new qws(context.getApplicationContext(), "LE", null), 1, bqgj);
    }

    /* renamed from: a */
    public final void mo34360a(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new bidy(addPlaceRequest, placesParams, aenr, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: b */
    public final void mo34375b(PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new bidz(placesParams, aenr, this.f120306a, this.f120309d, this.f120310e));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34361a(UserDataType userDataType, PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new bieh(userDataType, placesParams, aenr, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: b */
    public final void mo34376b(PlacesParams placesParams, aeos aeos) {
        this.f120307b.mo16658a(new biec(placesParams, aeos, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34362a(PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new biel(placesParams, aenr, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34363a(PlacesParams placesParams, aeos aeos) {
        this.f120307b.mo16658a(new biej(placesParams, aeos, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34364a(PlacesParams placesParams, aeov aeov) {
        this.f120307b.mo16658a(new biek(placesParams, aeov, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34365a(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new bieg(latLng, placeFilter, placesParams, aenr, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34366a(LatLng latLng, PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new biei(latLng, placesParams, aenr, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34367a(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new bieo(latLngBounds, i, str, placeFilter, placesParams, aenr, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34368a(String str, int i, int i2, int i3, PlacesParams placesParams, aeno aeno) {
        this.f120307b.mo16658a(new bied(str, i, i2, i3, placesParams, aeno, this.f120306a, this.f120309d, this.f120308c, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34369a(String str, PlacesParams placesParams, aeno aeno) {
        this.f120307b.mo16658a(new biee(str, placesParams, aeno, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34370a(String str, PlacesParams placesParams, aeos aeos) {
        this.f120307b.mo16658a(new biea(str, placesParams, aeos, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34371a(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new bieb(str, latLngBounds, i, autocompleteFilter, placesParams, aenr, this.f120306a, this.f120309d, this.f120308c, this.f120310e));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34372a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, aenr aenr) {
        mo34371a(str, latLngBounds, 1, autocompleteFilter, placesParams, aenr);
    }

    /* renamed from: a */
    public final void mo34373a(String str, String str2, String str3, PlacesParams placesParams, aeos aeos) {
        this.f120307b.mo16658a(new biep(str, str2, str3, placesParams, aeos, this.f120306a, this.f120309d, this.f120310e));
    }

    /* renamed from: a */
    public final void mo34374a(List list, PlacesParams placesParams, aenr aenr) {
        this.f120307b.mo16658a(new bief(list, placesParams, aenr, this.f120306a, this.f120309d, this.f120308c, this.f120310e));
    }
}
