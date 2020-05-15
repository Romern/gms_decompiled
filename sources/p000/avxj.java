package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.EstimationOptions;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.gms.userlocation.internal.UserLocationParameters;

/* renamed from: avxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avxj extends dck implements avxk {
    public avxj() {
        super("com.google.android.gms.userlocation.internal.ISemanticLocationProviderClient");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt;
        rnr rnr;
        rnr rnr2;
        avxh avxh = null;
        avxg avxg = null;
        rnt rnt2 = null;
        rnr rnr3 = null;
        rnt rnt3 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        rnr rnr4 = null;
        rnt rnt6 = null;
        rnt rnt7 = null;
        avxh avxh2 = null;
        rnt rnt8 = null;
        rnt rnt9 = null;
        avxh avxh3 = null;
        switch (i) {
            case 1:
                UserLocationParameters userLocationParameters = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.userlocation.internal.ISemanticLocationProviderCallbacks");
                    if (queryLocalInterface instanceof avxh) {
                        avxh = (avxh) queryLocalInterface;
                    } else {
                        avxh = new avxh(readStrongBinder);
                    }
                }
                EstimationOptions estimationOptions = (EstimationOptions) dcl.m8163a(parcel, EstimationOptions.CREATOR);
                mo51696b(userLocationParameters, avxh);
                break;
            case 2:
                UserLocationParameters userLocationParameters2 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.userlocation.internal.ISemanticLocationProviderCallbacks");
                    avxh3 = queryLocalInterface2 instanceof avxh ? (avxh) queryLocalInterface2 : new avxh(readStrongBinder2);
                }
                mo51687a(userLocationParameters2, avxh3);
                break;
            case 3:
                UserLocationParameters userLocationParameters3 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt9 = (rnt) queryLocalInterface3;
                    } else {
                        rnt9 = new rnr(readStrongBinder3);
                    }
                }
                mo51692a(userLocationParameters3, rnt9, (SemanticLocationEventRequest) dcl.m8163a(parcel, SemanticLocationEventRequest.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                break;
            case 4:
                UserLocationParameters userLocationParameters4 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface4 instanceof rnt) {
                        rnt8 = (rnt) queryLocalInterface4;
                    } else {
                        rnt8 = new rnr(readStrongBinder4);
                    }
                }
                mo51695a(userLocationParameters4, rnt8, parcel.readString());
                break;
            case 5:
                UserLocationParameters userLocationParameters5 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt = queryLocalInterface5 instanceof rnt ? (rnt) queryLocalInterface5 : new rnr(readStrongBinder5);
                } else {
                    rnt = null;
                }
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.userlocation.internal.ISemanticLocationProviderCallbacks");
                    if (queryLocalInterface6 instanceof avxh) {
                        avxh2 = (avxh) queryLocalInterface6;
                    } else {
                        avxh2 = new avxh(readStrongBinder6);
                    }
                }
                mo51689a(userLocationParameters5, rnt, avxh2, (SemanticLocationUpdateRequest) dcl.m8163a(parcel, SemanticLocationUpdateRequest.CREATOR));
                break;
            case 6:
                UserLocationParameters userLocationParameters6 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface7 instanceof rnt) {
                        rnt7 = (rnt) queryLocalInterface7;
                    } else {
                        rnt7 = new rnr(readStrongBinder7);
                    }
                }
                mo51698b(userLocationParameters6, rnt7, parcel.readString());
                break;
            case 7:
                UserLocationParameters userLocationParameters7 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface8 instanceof rnt) {
                        rnt6 = (rnt) queryLocalInterface8;
                    } else {
                        rnt6 = new rnr(readStrongBinder8);
                    }
                }
                mo51691a(userLocationParameters7, rnt6, (CheckInReport) dcl.m8163a(parcel, CheckInReport.CREATOR));
                break;
            case 8:
                UserLocationParameters userLocationParameters8 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface9 instanceof rnt) {
                        rnr = (rnt) queryLocalInterface9;
                        mo51693a(userLocationParameters8, rnr, (SemanticLocationEventRequest) dcl.m8163a(parcel, SemanticLocationEventRequest.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                        break;
                    } else {
                        rnr4 = new rnr(readStrongBinder9);
                    }
                }
                rnr = rnr4;
                mo51693a(userLocationParameters8, rnr, (SemanticLocationEventRequest) dcl.m8163a(parcel, SemanticLocationEventRequest.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
            case 9:
                UserLocationParameters userLocationParameters9 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface10 instanceof rnt) {
                        rnt5 = (rnt) queryLocalInterface10;
                    } else {
                        rnt5 = new rnr(readStrongBinder10);
                    }
                }
                mo51688a(userLocationParameters9, rnt5, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                break;
            case 10:
                UserLocationParameters userLocationParameters10 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface11 instanceof rnt) {
                        rnt4 = (rnt) queryLocalInterface11;
                    } else {
                        rnt4 = new rnr(readStrongBinder11);
                    }
                }
                mo51690a(userLocationParameters10, rnt4, (PlacefencingRequest) dcl.m8163a(parcel, PlacefencingRequest.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                break;
            case 11:
                UserLocationParameters userLocationParameters11 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface12 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface12;
                    } else {
                        rnt3 = new rnr(readStrongBinder12);
                    }
                }
                mo51699c(userLocationParameters11, rnt3, parcel.readString());
                break;
            case 12:
                UserLocationParameters userLocationParameters12 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface13 instanceof rnt) {
                        rnr2 = (rnt) queryLocalInterface13;
                        mo51694a(userLocationParameters12, rnr2, (UserLocationNearbyAlertRequest) dcl.m8163a(parcel, UserLocationNearbyAlertRequest.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                        break;
                    } else {
                        rnr3 = new rnr(readStrongBinder13);
                    }
                }
                rnr2 = rnr3;
                mo51694a(userLocationParameters12, rnr2, (UserLocationNearbyAlertRequest) dcl.m8163a(parcel, UserLocationNearbyAlertRequest.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
            case 13:
                UserLocationParameters userLocationParameters13 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface14 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface14;
                    } else {
                        rnt2 = new rnr(readStrongBinder14);
                    }
                }
                mo51697b(userLocationParameters13, rnt2, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                break;
            case 14:
                UserLocationParameters userLocationParameters14 = (UserLocationParameters) dcl.m8163a(parcel, UserLocationParameters.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.userlocation.internal.IReportCheckInCallback");
                    if (queryLocalInterface15 instanceof avxg) {
                        avxg = (avxg) queryLocalInterface15;
                    } else {
                        avxg = new avxe(readStrongBinder15);
                    }
                }
                mo51686a(userLocationParameters14, avxg, (CheckInReport) dcl.m8163a(parcel, CheckInReport.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
