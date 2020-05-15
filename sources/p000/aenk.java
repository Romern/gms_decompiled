package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

/* renamed from: aenk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aenk extends dck implements aenl {
    public aenk() {
        super("com.google.android.gms.location.places.internal.IGooglePlacesService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aenr aenr;
        aenp aenp;
        aeoq aeoq;
        aenm aenm;
        aenp aenp2;
        aenp aenp3 = null;
        aenp aenp4 = null;
        aeov aeov = null;
        aenr aenr2 = null;
        aeos aeos = null;
        aeos aeos2 = null;
        aenr aenr3 = null;
        aenr aenr4 = null;
        aeos aeos3 = null;
        aenm aenm2 = null;
        aeno aeno = null;
        aenr aenr5 = null;
        aeoq aeoq2 = null;
        aenr aenr6 = null;
        aenp aenp5 = null;
        aenr aenr7 = null;
        aenr aenr8 = null;
        switch (i) {
            case 2:
                LatLngBounds latLngBounds = (LatLngBounds) dcl.m8163a(parcel, LatLngBounds.CREATOR);
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                PlaceFilter placeFilter = (PlaceFilter) dcl.m8163a(parcel, PlaceFilter.CREATOR);
                PlacesParams placesParams = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface instanceof aenr) {
                        aenr = (aenr) queryLocalInterface;
                        mo34367a(latLngBounds, readInt, readString, placeFilter, placesParams, aenr);
                        break;
                    } else {
                        aenp3 = new aenp(readStrongBinder);
                    }
                }
                aenr = aenp3;
                mo34367a(latLngBounds, readInt, readString, placeFilter, placesParams, aenr);
            case 3:
            default:
                return false;
            case 4:
                LatLng latLng = (LatLng) dcl.m8163a(parcel, LatLng.CREATOR);
                PlaceFilter placeFilter2 = (PlaceFilter) dcl.m8163a(parcel, PlaceFilter.CREATOR);
                PlacesParams placesParams2 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    aenr8 = queryLocalInterface2 instanceof aenr ? (aenr) queryLocalInterface2 : new aenp(readStrongBinder2);
                }
                mo34365a(latLng, placeFilter2, placesParams2, aenr8);
                break;
            case 5:
                PlaceFilter placeFilter3 = (PlaceFilter) dcl.m8163a(parcel, PlaceFilter.CREATOR);
                PlacesParams placesParams3 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (!(queryLocalInterface3 instanceof aenr)) {
                        new aenp(readStrongBinder3);
                        break;
                    } else {
                        aenr aenr9 = (aenr) queryLocalInterface3;
                        break;
                    }
                }
                break;
            case 6:
                parcel.readString();
                PlacesParams placesParams4 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (!(queryLocalInterface4 instanceof aenr)) {
                        new aenp(readStrongBinder4);
                        break;
                    } else {
                        aenr aenr10 = (aenr) queryLocalInterface4;
                        break;
                    }
                }
                break;
            case 7:
                parcel.createStringArrayList();
                PlacesParams placesParams5 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (!(queryLocalInterface5 instanceof aenr)) {
                        new aenp(readStrongBinder5);
                        break;
                    } else {
                        aenr aenr11 = (aenr) queryLocalInterface5;
                        break;
                    }
                }
                break;
            case 8:
                UserDataType userDataType = (UserDataType) dcl.m8163a(parcel, UserDataType.CREATOR);
                LatLngBounds latLngBounds2 = (LatLngBounds) dcl.m8163a(parcel, LatLngBounds.CREATOR);
                parcel.createStringArrayList();
                PlacesParams placesParams6 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface6 instanceof aenr) {
                        aenr7 = (aenr) queryLocalInterface6;
                    } else {
                        aenr7 = new aenp(readStrongBinder6);
                    }
                }
                mo34361a(userDataType, placesParams6, aenr7);
                break;
            case 9:
                PlaceRequest placeRequest = (PlaceRequest) dcl.m8163a(parcel, PlaceRequest.CREATOR);
                PlacesParams placesParams7 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                break;
            case 10:
                PlacesParams placesParams8 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent2 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                break;
            case 11:
                NearbyAlertRequest nearbyAlertRequest = (NearbyAlertRequest) dcl.m8163a(parcel, NearbyAlertRequest.CREATOR);
                PlacesParams placesParams9 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent3 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                break;
            case 12:
                PlacesParams placesParams10 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent4 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                break;
            case 13:
                String readString2 = parcel.readString();
                LatLngBounds latLngBounds3 = (LatLngBounds) dcl.m8163a(parcel, LatLngBounds.CREATOR);
                AutocompleteFilter autocompleteFilter = (AutocompleteFilter) dcl.m8163a(parcel, AutocompleteFilter.CREATOR);
                PlacesParams placesParams11 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface7 instanceof aenr) {
                        aenp = (aenr) queryLocalInterface7;
                        mo34372a(readString2, latLngBounds3, autocompleteFilter, placesParams11, aenp);
                        break;
                    } else {
                        aenp5 = new aenp(readStrongBinder7);
                    }
                }
                aenp = aenp5;
                mo34372a(readString2, latLngBounds3, autocompleteFilter, placesParams11, aenp);
            case 14:
                AddPlaceRequest addPlaceRequest = (AddPlaceRequest) dcl.m8163a(parcel, AddPlaceRequest.CREATOR);
                PlacesParams placesParams12 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface8 instanceof aenr) {
                        aenr6 = (aenr) queryLocalInterface8;
                    } else {
                        aenr6 = new aenp(readStrongBinder8);
                    }
                }
                mo34360a(addPlaceRequest, placesParams12, aenr6);
                break;
            case 15:
                PlaceReport placeReport = (PlaceReport) dcl.m8163a(parcel, PlaceReport.CREATOR);
                PlacesParams placesParams13 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                break;
            case 16:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                PlacesParams placesParams14 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (queryLocalInterface9 instanceof aeos) {
                        aeoq = (aeos) queryLocalInterface9;
                        mo34373a(readString3, readString4, readString5, placesParams14, aeoq);
                        break;
                    } else {
                        aeoq2 = new aeoq(readStrongBinder9);
                    }
                }
                aeoq = aeoq2;
                mo34373a(readString3, readString4, readString5, placesParams14, aeoq);
            case 17:
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                PlacesParams placesParams15 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface10 instanceof aenr) {
                        aenr5 = (aenr) queryLocalInterface10;
                    } else {
                        aenr5 = new aenp(readStrongBinder10);
                    }
                }
                mo34374a(createStringArrayList, placesParams15, aenr5);
                break;
            case 18:
                parcel.readString();
                parcel.readInt();
                PlacesParams placesParams16 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (!(queryLocalInterface11 instanceof aenr)) {
                        new aenp(readStrongBinder11);
                        break;
                    } else {
                        aenr aenr12 = (aenr) queryLocalInterface11;
                        break;
                    }
                }
                break;
            case 19:
                String readString6 = parcel.readString();
                PlacesParams placesParams17 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (queryLocalInterface12 instanceof aeno) {
                        aeno = (aeno) queryLocalInterface12;
                    } else {
                        aeno = new aenm(readStrongBinder12);
                    }
                }
                mo34369a(readString6, placesParams17, aeno);
                break;
            case 20:
                String readString7 = parcel.readString();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                PlacesParams placesParams18 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if (queryLocalInterface13 instanceof aeno) {
                        aenm = (aeno) queryLocalInterface13;
                        mo34368a(readString7, readInt2, readInt3, readInt4, placesParams18, aenm);
                        break;
                    } else {
                        aenm2 = new aenm(readStrongBinder13);
                    }
                }
                aenm = aenm2;
                mo34368a(readString7, readInt2, readInt3, readInt4, placesParams18, aenm);
            case 21:
                String readString8 = parcel.readString();
                parcel.readString();
                PlacesParams placesParams19 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (queryLocalInterface14 instanceof aeos) {
                        aeos3 = (aeos) queryLocalInterface14;
                    } else {
                        aeos3 = new aeoq(readStrongBinder14);
                    }
                }
                mo34370a(readString8, placesParams19, aeos3);
                break;
            case 22:
                LatLng latLng2 = (LatLng) dcl.m8163a(parcel, LatLng.CREATOR);
                PlacesParams placesParams20 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface15 instanceof aenr) {
                        aenr4 = (aenr) queryLocalInterface15;
                    } else {
                        aenr4 = new aenp(readStrongBinder15);
                    }
                }
                mo34366a(latLng2, placesParams20, aenr4);
                break;
            case 23:
                PlacesParams placesParams21 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface16 instanceof aenr) {
                        aenr3 = (aenr) queryLocalInterface16;
                    } else {
                        aenr3 = new aenp(readStrongBinder16);
                    }
                }
                mo34362a(placesParams21, aenr3);
                break;
            case 24:
                PlacesParams placesParams22 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (queryLocalInterface17 instanceof aeos) {
                        aeos2 = (aeos) queryLocalInterface17;
                    } else {
                        aeos2 = new aeoq(readStrongBinder17);
                    }
                }
                mo34363a(placesParams22, aeos2);
                break;
            case 25:
                PlacesParams placesParams23 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (queryLocalInterface18 instanceof aeos) {
                        aeos = (aeos) queryLocalInterface18;
                    } else {
                        aeos = new aeoq(readStrongBinder18);
                    }
                }
                mo34376b(placesParams23, aeos);
                break;
            case 26:
                PlacesParams placesParams24 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface19 instanceof aenr) {
                        aenr2 = (aenr) queryLocalInterface19;
                    } else {
                        aenr2 = new aenp(readStrongBinder19);
                    }
                }
                mo34375b(placesParams24, aenr2);
                break;
            case 27:
                PlacesParams placesParams25 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.location.places.personalized.IUserPlacesCallbacks");
                    if (queryLocalInterface20 instanceof aeov) {
                        aeov = (aeov) queryLocalInterface20;
                    } else {
                        aeov = new aeot(readStrongBinder20);
                    }
                }
                mo34364a(placesParams25, aeov);
                break;
            case 28:
                String readString9 = parcel.readString();
                LatLngBounds latLngBounds4 = (LatLngBounds) dcl.m8163a(parcel, LatLngBounds.CREATOR);
                int readInt5 = parcel.readInt();
                AutocompleteFilter autocompleteFilter2 = (AutocompleteFilter) dcl.m8163a(parcel, AutocompleteFilter.CREATOR);
                PlacesParams placesParams26 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface21 instanceof aenr) {
                        aenp2 = (aenr) queryLocalInterface21;
                        mo34371a(readString9, latLngBounds4, readInt5, autocompleteFilter2, placesParams26, aenp2);
                        break;
                    } else {
                        aenp4 = new aenp(readStrongBinder21);
                    }
                }
                aenp2 = aenp4;
                mo34371a(readString9, latLngBounds4, readInt5, autocompleteFilter2, placesParams26, aenp2);
        }
        parcel2.writeNoException();
        return true;
    }
}
