package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mdns.MdnsSearchOptions;

/* renamed from: agby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class agby extends dck implements agbz {
    public agby() {
        super("com.google.android.gms.mdns.internal.IMdnsApiService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        agcc agcc = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
                if (queryLocalInterface instanceof agcc) {
                    agcc = (agcc) queryLocalInterface;
                } else {
                    agcc = new agca(readStrongBinder);
                }
            }
            mo35187a(agcc, (MdnsSearchOptions) dcl.m8163a(parcel, MdnsSearchOptions.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
                if (queryLocalInterface2 instanceof agcc) {
                    agcc = (agcc) queryLocalInterface2;
                } else {
                    agcc = new agca(readStrongBinder2);
                }
            }
            mo35186a(agcc);
        }
        parcel2.writeNoException();
        return true;
    }
}
