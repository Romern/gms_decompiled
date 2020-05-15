package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: augw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class augw extends dck implements augx {
    public augw() {
        super("com.google.android.gms.thunderbird.internal.IThunderbirdService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            rnt = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(readStrongBinder);
        } else {
            rnt = null;
        }
        mo50520a(rnt, parcel.createByteArray());
        parcel2.writeNoException();
        return true;
    }
}
