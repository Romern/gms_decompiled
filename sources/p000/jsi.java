package p000;

import android.os.Parcel;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;

/* renamed from: jsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jsi extends dck implements jsj {
    public jsi() {
        super("com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo13961a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(SyncedCryptauthDevice.CREATOR));
        return true;
    }
}
