package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: fth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fth extends dck implements fti {
    public fth() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ftl ftl = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                if (queryLocalInterface instanceof ftl) {
                    ftl = (ftl) queryLocalInterface;
                } else {
                    ftl = new ftj(readStrongBinder);
                }
            }
            parcel.readString();
            mo11309a(ftl, (UsageInfo[]) parcel.createTypedArray(UsageInfo.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                ftl = queryLocalInterface2 instanceof ftl ? (ftl) queryLocalInterface2 : new ftj(readStrongBinder2);
            }
            mo11307a(ftl);
        } else if (i == 5) {
            GetRecentContextCall$Request getRecentContextCall$Request = (GetRecentContextCall$Request) dcl.m8163a(parcel, GetRecentContextCall$Request.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                if (queryLocalInterface3 instanceof ftl) {
                    ftl = (ftl) queryLocalInterface3;
                } else {
                    ftl = new ftj(readStrongBinder3);
                }
            }
            mo11306a(getRecentContextCall$Request, ftl);
        } else if (i == 6) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                if (queryLocalInterface4 instanceof ftl) {
                    ftl = (ftl) queryLocalInterface4;
                } else {
                    ftl = new ftj(readStrongBinder4);
                }
            }
            parcel.readString();
            mo11308a(ftl, parcel.readString());
        } else if (i != 7) {
            return false;
        } else {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                if (queryLocalInterface5 instanceof ftl) {
                    ftl = (ftl) queryLocalInterface5;
                } else {
                    ftl = new ftj(readStrongBinder5);
                }
            }
            mo11310a(ftl, (ActionImpl[]) parcel.createTypedArray(ActionImpl.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
