package p000;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: tvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class tvw extends dck implements tvx {
    public tvw() {
        super("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
    }

    /* renamed from: a */
    public void mo26830a(int i) {
    }

    /* renamed from: a */
    public final void mo26831a(DataHolder dataHolder) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1001) {
            DataHolder dataHolder = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
        } else if (i != 1002) {
            return false;
        } else {
            mo26830a(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
