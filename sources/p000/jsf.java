package p000;

import android.os.Parcel;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;

/* renamed from: jsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jsf extends dck implements jsg {
    public jsf() {
        super("com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo13960a((Status) dcl.m8163a(parcel, Status.CREATOR), (SyncedCryptauthDevice) dcl.m8163a(parcel, SyncedCryptauthDevice.CREATOR));
        return true;
    }
}
