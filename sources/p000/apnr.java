package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;

/* renamed from: apnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class apnr extends dck implements apns {
    public apnr() {
        super("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        apnp apnp = null;
        switch (i) {
            case 2:
                GetStorageStatsCall$Request getStorageStatsCall$Request = (GetStorageStatsCall$Request) dcl.m8163a(parcel, GetStorageStatsCall$Request.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
                    if (queryLocalInterface instanceof apnp) {
                        apnp = (apnp) queryLocalInterface;
                    } else {
                        apnp = new apnn(readStrongBinder);
                    }
                }
                mo47449a(getStorageStatsCall$Request, apnp);
                break;
            case 3:
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
                    apnp = queryLocalInterface2 instanceof apnp ? (apnp) queryLocalInterface2 : new apnn(readStrongBinder2);
                }
                mo47444a(bundle, apnp);
                break;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
                    if (queryLocalInterface3 instanceof apnp) {
                        apnp = (apnp) queryLocalInterface3;
                    } else {
                        apnp = new apnn(readStrongBinder3);
                    }
                }
                mo47445a(apnp);
                break;
            case 5:
                GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request = (GetAppIndexingPackagesCall$Request) dcl.m8163a(parcel, GetAppIndexingPackagesCall$Request.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
                    if (queryLocalInterface4 instanceof apnp) {
                        apnp = (apnp) queryLocalInterface4;
                    } else {
                        apnp = new apnn(readStrongBinder4);
                    }
                }
                mo47448a(getAppIndexingPackagesCall$Request, apnp);
                break;
            case 6:
                GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request = (GetAppIndexingPackageDetailsCall$Request) dcl.m8163a(parcel, GetAppIndexingPackageDetailsCall$Request.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
                    if (queryLocalInterface5 instanceof apnp) {
                        apnp = (apnp) queryLocalInterface5;
                    } else {
                        apnp = new apnn(readStrongBinder5);
                    }
                }
                mo47447a(getAppIndexingPackageDetailsCall$Request, apnp);
                break;
            case 7:
                RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request = (RequestAppIndexingUpdateIndexCall$Request) dcl.m8163a(parcel, RequestAppIndexingUpdateIndexCall$Request.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
                    if (queryLocalInterface6 instanceof apnp) {
                        apnp = (apnp) queryLocalInterface6;
                    } else {
                        apnp = new apnn(readStrongBinder6);
                    }
                }
                mo47450a(requestAppIndexingUpdateIndexCall$Request, apnp);
                break;
            case 8:
                ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request = (ClearDebugUiCacheCall$Request) dcl.m8163a(parcel, ClearDebugUiCacheCall$Request.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks");
                    if (queryLocalInterface7 instanceof apnp) {
                        apnp = (apnp) queryLocalInterface7;
                    } else {
                        apnp = new apnn(readStrongBinder7);
                    }
                }
                mo47446a(clearDebugUiCacheCall$Request, apnp);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
