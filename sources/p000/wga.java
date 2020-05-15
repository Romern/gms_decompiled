package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;

/* renamed from: wga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class wga extends dck implements wgb {
    public wga() {
        super("com.google.android.gms.facs.cache.internal.IFacsInternalSyncService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        wfy wfy = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsInternalSyncCallbacks");
                if (queryLocalInterface instanceof wfy) {
                    wfy = (wfy) queryLocalInterface;
                } else {
                    wfy = new wfw(readStrongBinder);
                }
            }
            mo29094a(wfy, (FacsInternalSyncCallOptions) dcl.m8163a(parcel, FacsInternalSyncCallOptions.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsInternalSyncCallbacks");
                if (queryLocalInterface2 instanceof wfy) {
                    wfy = (wfy) queryLocalInterface2;
                } else {
                    wfy = new wfw(readStrongBinder2);
                }
            }
            mo29095a(wfy, parcel.createByteArray(), (FacsInternalSyncCallOptions) dcl.m8163a(parcel, FacsInternalSyncCallOptions.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
