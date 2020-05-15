package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.ReplaySignal;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: aenh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aenh extends dck implements aeni {
    public aenh() {
        super("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aenr aenr = null;
        rnt rnt = null;
        rnt rnt2 = null;
        aenr aenr2 = null;
        aenr aenr3 = null;
        aenr aenr4 = null;
        aenr aenr5 = null;
        aenr aenr6 = null;
        aenr aenr7 = null;
        aenr aenr8 = null;
        aenr aenr9 = null;
        switch (i) {
            case 2:
                PlaceRequest placeRequest = (PlaceRequest) dcl.m8163a(parcel, PlaceRequest.CREATOR);
                PlacesParams placesParams = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface instanceof aenr) {
                        aenr = (aenr) queryLocalInterface;
                    } else {
                        aenr = new aenp(readStrongBinder);
                    }
                }
                mo34352a(placeRequest, placesParams, pendingIntent, aenr);
                break;
            case 3:
                PlacesParams placesParams2 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent2 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    aenr9 = queryLocalInterface2 instanceof aenr ? (aenr) queryLocalInterface2 : new aenp(readStrongBinder2);
                }
                mo34356a(placesParams2, pendingIntent2, aenr9);
                break;
            case 4:
                NearbyAlertRequest nearbyAlertRequest = (NearbyAlertRequest) dcl.m8163a(parcel, NearbyAlertRequest.CREATOR);
                PlacesParams placesParams3 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent3 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface3 instanceof aenr) {
                        aenr8 = (aenr) queryLocalInterface3;
                    } else {
                        aenr8 = new aenp(readStrongBinder3);
                    }
                }
                mo34349a(nearbyAlertRequest, placesParams3, pendingIntent3, aenr8);
                break;
            case 5:
                PlacesParams placesParams4 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent4 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface4 instanceof aenr) {
                        aenr7 = (aenr) queryLocalInterface4;
                    } else {
                        aenr7 = new aenp(readStrongBinder4);
                    }
                }
                mo34359b(placesParams4, pendingIntent4, aenr7);
                break;
            case 6:
                PlaceFilter placeFilter = (PlaceFilter) dcl.m8163a(parcel, PlaceFilter.CREATOR);
                PlacesParams placesParams5 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface5 instanceof aenr) {
                        aenr6 = (aenr) queryLocalInterface5;
                    } else {
                        aenr6 = new aenp(readStrongBinder5);
                    }
                }
                mo34350a(placeFilter, placesParams5, aenr6);
                break;
            case 7:
                PlaceReport placeReport = (PlaceReport) dcl.m8163a(parcel, PlaceReport.CREATOR);
                PlacesParams placesParams6 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface6 instanceof aenr) {
                        aenr5 = (aenr) queryLocalInterface6;
                    } else {
                        aenr5 = new aenp(readStrongBinder6);
                    }
                }
                mo34351a(placeReport, placesParams6, aenr5);
                break;
            case 8:
                PlacesClientIdentifier placesClientIdentifier = (PlacesClientIdentifier) dcl.m8163a(parcel, PlacesClientIdentifier.CREATOR);
                PlacesParams placesParams7 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface7 instanceof aenr) {
                        aenr4 = (aenr) queryLocalInterface7;
                    } else {
                        aenr4 = new aenp(readStrongBinder7);
                    }
                }
                mo34353a(placesClientIdentifier, placesParams7, aenr4);
                break;
            case 9:
                PlacefencingRequest placefencingRequest = (PlacefencingRequest) dcl.m8163a(parcel, PlacefencingRequest.CREATOR);
                PlacesParams placesParams8 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                PendingIntent pendingIntent5 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface8 instanceof aenr) {
                        aenr3 = (aenr) queryLocalInterface8;
                    } else {
                        aenr3 = new aenp(readStrongBinder8);
                    }
                }
                mo34355a(placefencingRequest, placesParams8, pendingIntent5, aenr3);
                break;
            case 10:
                PlacesParams placesParams9 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if (queryLocalInterface9 instanceof aenr) {
                        aenr2 = (aenr) queryLocalInterface9;
                    } else {
                        aenr2 = new aenp(readStrongBinder9);
                    }
                }
                mo34357a(placesParams9, readString, aenr2);
                break;
            case 11:
                PlacesClientIdentifier placesClientIdentifier2 = (PlacesClientIdentifier) dcl.m8163a(parcel, PlacesClientIdentifier.CREATOR);
                PlacesParams placesParams10 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface10 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface10;
                    } else {
                        rnt2 = new rnr(readStrongBinder10);
                    }
                }
                mo34354a(placesClientIdentifier2, placesParams10, rnt2);
                break;
            case 12:
                PlacesParams placesParams11 = (PlacesParams) dcl.m8163a(parcel, PlacesParams.CREATOR);
                parcel.createTypedArrayList(ReplaySignal.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface11 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface11;
                    } else {
                        rnt = new rnr(readStrongBinder11);
                    }
                }
                mo34358a(rnt);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
