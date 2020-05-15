package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;

/* renamed from: apqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class apqp extends dck implements apqq {
    public apqp() {
        super("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        apqn apqn = null;
        if (i == 2) {
            GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request = (GetGlobalSearchSourcesCall$Request) dcl.m8163a(parcel, GetGlobalSearchSourcesCall$Request.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
                if (queryLocalInterface instanceof apqn) {
                    apqn = (apqn) queryLocalInterface;
                } else {
                    apqn = new apql(readStrongBinder);
                }
            }
            mo47518a(getGlobalSearchSourcesCall$Request, apqn);
        } else if (i == 3) {
            SetExperimentIdsCall$Request setExperimentIdsCall$Request = (SetExperimentIdsCall$Request) dcl.m8163a(parcel, SetExperimentIdsCall$Request.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
                apqn = queryLocalInterface2 instanceof apqn ? (apqn) queryLocalInterface2 : new apql(readStrongBinder2);
            }
            mo47521c(apqn);
        } else if (i == 4) {
            GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request = (GetCurrentExperimentIdsCall$Request) dcl.m8163a(parcel, GetCurrentExperimentIdsCall$Request.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
                if (queryLocalInterface3 instanceof apqn) {
                    apqn = (apqn) queryLocalInterface3;
                } else {
                    apqn = new apql(readStrongBinder3);
                }
            }
            mo47517a(apqn);
        } else if (i == 5) {
            GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request = (GetPendingExperimentIdsCall$Request) dcl.m8163a(parcel, GetPendingExperimentIdsCall$Request.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
                if (queryLocalInterface4 instanceof apqn) {
                    apqn = (apqn) queryLocalInterface4;
                } else {
                    apqn = new apql(readStrongBinder4);
                }
            }
            mo47520b(apqn);
        } else if (i != 8) {
            return false;
        } else {
            SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = (SetIncludeInGlobalSearchCall$Request) dcl.m8163a(parcel, SetIncludeInGlobalSearchCall$Request.CREATOR);
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
                if (queryLocalInterface5 instanceof apqn) {
                    apqn = (apqn) queryLocalInterface5;
                } else {
                    apqn = new apql(readStrongBinder5);
                }
            }
            mo47519a(setIncludeInGlobalSearchCall$Request, apqn);
        }
        parcel2.writeNoException();
        return true;
    }
}
