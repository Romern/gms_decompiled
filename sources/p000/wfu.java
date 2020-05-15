package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;

/* renamed from: wfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class wfu extends dck implements wfv {
    public wfu() {
        super("com.google.android.gms.facs.cache.internal.IFacsCacheService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        wfs wfs = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
                if (queryLocalInterface instanceof wfs) {
                    wfs = (wfs) queryLocalInterface;
                } else {
                    wfs = new wfq(readStrongBinder);
                }
            }
            mo29090a(wfs, (FacsCacheCallOptions) dcl.m8163a(parcel, FacsCacheCallOptions.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
                wfs = queryLocalInterface2 instanceof wfs ? (wfs) queryLocalInterface2 : new wfq(readStrongBinder2);
            }
            mo29092a(wfs, parcel.createByteArray(), (FacsCacheCallOptions) dcl.m8163a(parcel, FacsCacheCallOptions.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
                if (queryLocalInterface3 instanceof wfs) {
                    wfs = (wfs) queryLocalInterface3;
                } else {
                    wfs = new wfq(readStrongBinder3);
                }
            }
            mo29093b(wfs, (FacsCacheCallOptions) dcl.m8163a(parcel, FacsCacheCallOptions.CREATOR));
        } else if (i == 4) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
                if (queryLocalInterface4 instanceof wfs) {
                    wfs = (wfs) queryLocalInterface4;
                } else {
                    wfs = new wfq(readStrongBinder4);
                }
            }
            mo29089a(wfs);
        } else if (i != 5) {
            return false;
        } else {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
                if (queryLocalInterface5 instanceof wfs) {
                    wfs = (wfs) queryLocalInterface5;
                } else {
                    wfs = new wfq(readStrongBinder5);
                }
            }
            mo29091a(wfs, parcel.createByteArray());
        }
        parcel2.writeNoException();
        return true;
    }
}
