package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.notifications.ReadStateUpdate;

/* renamed from: akoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class akoq extends dck implements akor {
    public akoq() {
        super("com.google.android.gms.notifications.internal.IGunsService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        akoo akoo;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.notifications.internal.IGunsCallbacks");
            akoo = queryLocalInterface instanceof akoo ? (akoo) queryLocalInterface : new akom(readStrongBinder);
        } else {
            akoo = null;
        }
        mo39613a(akoo, parcel.readString(), parcel.readString(), (ReadStateUpdate) dcl.m8163a(parcel, ReadStateUpdate.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
