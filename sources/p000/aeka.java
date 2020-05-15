package p000;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: aeka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aeka extends dck implements aekb {
    public aeka() {
        super("com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aehw aehw = null;
        rnt rnt = null;
        aejy aejy = null;
        rnt rnt2 = null;
        rnt rnt3 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        rnt rnt6 = null;
        rnt rnt7 = null;
        aejv aejv = null;
        rnt rnt8 = null;
        rnt rnt9 = null;
        aeke aeke = null;
        aehw aehw2 = null;
        aehw aehw3 = null;
        aejy aejy2 = null;
        aejy aejy3 = null;
        aejy aejy4 = null;
        aejy aejy5 = null;
        aehw aehw4 = null;
        aejy aejy6 = null;
        if (i == 20) {
            LocationRequest locationRequest = (LocationRequest) dcl.m8163a(parcel, LocationRequest.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
                if (queryLocalInterface instanceof aehw) {
                    aehw = (aehw) queryLocalInterface;
                } else {
                    aehw = new aehu(readStrongBinder);
                }
            }
            mo34222a(locationRequest, aehw, parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 21) {
            parcel.readString();
            Location d = mo34242d();
            parcel2.writeNoException();
            dcl.m8169b(parcel2, d);
            return true;
        } else if (i == 26) {
            mo34217a((Location) dcl.m8163a(parcel, Location.CREATOR), parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i == 34) {
            LocationAvailability c = mo34239c(parcel.readString());
            parcel2.writeNoException();
            dcl.m8169b(parcel2, c);
            return true;
        } else if (i == 57) {
            GeofencingRequest geofencingRequest = (GeofencingRequest) dcl.m8163a(parcel, GeofencingRequest.CREATOR);
            PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                if (queryLocalInterface2 instanceof aejy) {
                    aejy6 = (aejy) queryLocalInterface2;
                } else {
                    aejy6 = new aejw(readStrongBinder2);
                }
            }
            mo34220a(geofencingRequest, pendingIntent, aejy6);
            parcel2.writeNoException();
            return true;
        } else if (i == 59) {
            mo34229a((LocationRequestUpdateData) dcl.m8163a(parcel, LocationRequestUpdateData.CREATOR));
            parcel2.writeNoException();
            return true;
        } else if (i == 52) {
            LocationRequestInternal locationRequestInternal = (LocationRequestInternal) dcl.m8163a(parcel, LocationRequestInternal.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.location.ILocationListener");
                if (queryLocalInterface3 instanceof aehw) {
                    aehw4 = (aehw) queryLocalInterface3;
                } else {
                    aehw4 = new aehu(readStrongBinder3);
                }
            }
            mo34227a(locationRequestInternal, aehw4);
            parcel2.writeNoException();
            return true;
        } else if (i != 53) {
            switch (i) {
                case 1:
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(ParcelableGeofence.CREATOR);
                    PendingIntent pendingIntent2 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                        if (queryLocalInterface4 instanceof aejy) {
                            aejy5 = (aejy) queryLocalInterface4;
                        } else {
                            aejy5 = new aejw(readStrongBinder4);
                        }
                    }
                    parcel.readString();
                    mo34230a(createTypedArrayList, pendingIntent2, aejy5);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    PendingIntent pendingIntent3 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                        aejy4 = queryLocalInterface5 instanceof aejy ? (aejy) queryLocalInterface5 : new aejw(readStrongBinder5);
                    }
                    mo34213a(pendingIntent3, aejy4, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    String[] createStringArray = parcel.createStringArray();
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                        if (queryLocalInterface6 instanceof aejy) {
                            aejy3 = (aejy) queryLocalInterface6;
                        } else {
                            aejy3 = new aejw(readStrongBinder6);
                        }
                    }
                    mo34233a(createStringArray, aejy3, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                        if (queryLocalInterface7 instanceof aejy) {
                            aejy2 = (aejy) queryLocalInterface7;
                        } else {
                            aejy2 = new aejw(readStrongBinder7);
                        }
                    }
                    parcel.readString();
                    mo34211a(aejy2);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    mo34208a(parcel.readLong(), dcl.m8167a(parcel), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    mo34212a((PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    Location a = mo34206a();
                    parcel2.writeNoException();
                    dcl.m8169b(parcel2, a);
                    return true;
                case 8:
                    LocationRequest locationRequest2 = (LocationRequest) dcl.m8163a(parcel, LocationRequest.CREATOR);
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.location.ILocationListener");
                        if (queryLocalInterface8 instanceof aehw) {
                            aehw3 = (aehw) queryLocalInterface8;
                        } else {
                            aehw3 = new aehu(readStrongBinder8);
                        }
                    }
                    mo34221a(locationRequest2, aehw3);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    mo34223a((LocationRequest) dcl.m8163a(parcel, LocationRequest.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.location.ILocationListener");
                        if (queryLocalInterface9 instanceof aehw) {
                            aehw2 = (aehw) queryLocalInterface9;
                        } else {
                            aehw2 = new aehu(readStrongBinder9);
                        }
                    }
                    mo34209a(aehw2);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    mo34236b((PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    mo34232a(dcl.m8167a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    mo34216a((Location) dcl.m8163a(parcel, Location.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i) {
                        case 63:
                            LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) dcl.m8163a(parcel, LocationSettingsRequest.CREATOR);
                            IBinder readStrongBinder10 = parcel.readStrongBinder();
                            if (readStrongBinder10 != null) {
                                IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                                if (queryLocalInterface10 instanceof aeke) {
                                    aeke = (aeke) queryLocalInterface10;
                                } else {
                                    aeke = new aekc(readStrongBinder10);
                                }
                            }
                            mo34224a(locationSettingsRequest, aeke, parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        case 64:
                            ActivityRecognitionResult a2 = mo34207a(parcel.readString());
                            parcel2.writeNoException();
                            dcl.m8169b(parcel2, a2);
                            return true;
                        case KeyInformation.AES128_DES56:
                            PendingIntent pendingIntent4 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                            IBinder readStrongBinder11 = parcel.readStrongBinder();
                            if (readStrongBinder11 != null) {
                                IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface11 instanceof rnt) {
                                    rnt9 = (rnt) queryLocalInterface11;
                                } else {
                                    rnt9 = new rnr(readStrongBinder11);
                                }
                            }
                            mo34237b(pendingIntent4, rnt9);
                            parcel2.writeNoException();
                            return true;
                        case 66:
                            PendingIntent pendingIntent5 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                            IBinder readStrongBinder12 = parcel.readStrongBinder();
                            if (readStrongBinder12 != null) {
                                IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface12 instanceof rnt) {
                                    rnt8 = (rnt) queryLocalInterface12;
                                } else {
                                    rnt8 = new rnr(readStrongBinder12);
                                }
                            }
                            mo34241c(pendingIntent5, rnt8);
                            parcel2.writeNoException();
                            return true;
                        case KeyInformation.AES128_DES112:
                            IBinder readStrongBinder13 = parcel.readStrongBinder();
                            if (readStrongBinder13 != null) {
                                IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                if (queryLocalInterface13 instanceof aejv) {
                                    aejv = (aejv) queryLocalInterface13;
                                } else {
                                    aejv = new aejt(readStrongBinder13);
                                }
                            }
                            mo34210a(aejv);
                            parcel2.writeNoException();
                            return true;
                        case 68:
                            PendingIntent pendingIntent6 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                            IBinder readStrongBinder14 = parcel.readStrongBinder();
                            if (readStrongBinder14 != null) {
                                IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface14 instanceof rnt) {
                                    rnt7 = (rnt) queryLocalInterface14;
                                } else {
                                    rnt7 = new rnr(readStrongBinder14);
                                }
                            }
                            mo34243d(pendingIntent6, rnt7);
                            parcel2.writeNoException();
                            return true;
                        case 69:
                            PendingIntent pendingIntent7 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                            IBinder readStrongBinder15 = parcel.readStrongBinder();
                            if (readStrongBinder15 != null) {
                                IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface15 instanceof rnt) {
                                    rnt6 = (rnt) queryLocalInterface15;
                                } else {
                                    rnt6 = new rnr(readStrongBinder15);
                                }
                            }
                            mo34244e(pendingIntent7, rnt6);
                            parcel2.writeNoException();
                            return true;
                        case 70:
                            ActivityRecognitionRequest activityRecognitionRequest = (ActivityRecognitionRequest) dcl.m8163a(parcel, ActivityRecognitionRequest.CREATOR);
                            PendingIntent pendingIntent8 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                            IBinder readStrongBinder16 = parcel.readStrongBinder();
                            if (readStrongBinder16 != null) {
                                IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface16 instanceof rnt) {
                                    rnt5 = (rnt) queryLocalInterface16;
                                } else {
                                    rnt5 = new rnr(readStrongBinder16);
                                }
                            }
                            mo34218a(activityRecognitionRequest, pendingIntent8, rnt5);
                            parcel2.writeNoException();
                            return true;
                        case 71:
                            IBinder readStrongBinder17 = parcel.readStrongBinder();
                            if (readStrongBinder17 != null) {
                                IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface17 instanceof rnt) {
                                    rnt4 = (rnt) queryLocalInterface17;
                                } else {
                                    rnt4 = new rnr(readStrongBinder17);
                                }
                            }
                            mo34231a(rnt4);
                            parcel2.writeNoException();
                            return true;
                        case 72:
                            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) dcl.m8163a(parcel, ActivityTransitionRequest.CREATOR);
                            PendingIntent pendingIntent9 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                            IBinder readStrongBinder18 = parcel.readStrongBinder();
                            if (readStrongBinder18 != null) {
                                IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface18 instanceof rnt) {
                                    rnt3 = (rnt) queryLocalInterface18;
                                } else {
                                    rnt3 = new rnr(readStrongBinder18);
                                }
                            }
                            mo34219a(activityTransitionRequest, pendingIntent9, rnt3);
                            parcel2.writeNoException();
                            return true;
                        case 73:
                            PendingIntent pendingIntent10 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                            IBinder readStrongBinder19 = parcel.readStrongBinder();
                            if (readStrongBinder19 != null) {
                                IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface19 instanceof rnt) {
                                    rnt2 = (rnt) queryLocalInterface19;
                                } else {
                                    rnt2 = new rnr(readStrongBinder19);
                                }
                            }
                            mo34215a(pendingIntent10, rnt2);
                            parcel2.writeNoException();
                            return true;
                        case 74:
                            RemoveGeofencingRequest removeGeofencingRequest = (RemoveGeofencingRequest) dcl.m8163a(parcel, RemoveGeofencingRequest.CREATOR);
                            IBinder readStrongBinder20 = parcel.readStrongBinder();
                            if (readStrongBinder20 != null) {
                                IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                                if (queryLocalInterface20 instanceof aejy) {
                                    aejy = (aejy) queryLocalInterface20;
                                } else {
                                    aejy = new aejw(readStrongBinder20);
                                }
                            }
                            mo34225a(removeGeofencingRequest, aejy);
                            parcel2.writeNoException();
                            return true;
                        case 75:
                            mo34226a((DeviceOrientationRequestUpdateData) dcl.m8163a(parcel, DeviceOrientationRequestUpdateData.CREATOR));
                            parcel2.writeNoException();
                            return true;
                        case 76:
                            mo34240c((PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                            parcel2.writeNoException();
                            return true;
                        case 77:
                            boolean a3 = mo34234a(parcel.readInt());
                            parcel2.writeNoException();
                            dcl.m8166a(parcel2, a3);
                            return true;
                        case 78:
                            int c2 = mo34238c();
                            parcel2.writeNoException();
                            parcel2.writeInt(c2);
                            return true;
                        case KeyInformation.AES128:
                            PendingIntent pendingIntent11 = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                            SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) dcl.m8163a(parcel, SleepSegmentRequest.CREATOR);
                            IBinder readStrongBinder21 = parcel.readStrongBinder();
                            if (readStrongBinder21 != null) {
                                IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                                if (queryLocalInterface21 instanceof rnt) {
                                    rnt = (rnt) queryLocalInterface21;
                                } else {
                                    rnt = new rnr(readStrongBinder21);
                                }
                            }
                            mo34214a(pendingIntent11, sleepSegmentRequest, rnt);
                            parcel2.writeNoException();
                            return true;
                        case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                            Location b = mo34235b(parcel.readString());
                            parcel2.writeNoException();
                            dcl.m8169b(parcel2, b);
                            return true;
                        default:
                            return false;
                    }
            }
        } else {
            mo34228a((LocationRequestInternal) dcl.m8163a(parcel, LocationRequestInternal.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }
}
