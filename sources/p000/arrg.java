package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: arrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class arrg extends dck implements arrh {
    public arrg() {
        super("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
    }

    /* renamed from: a */
    public void mo48773a(Status status) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo48773a((Status) dcl.m8163a(parcel, Status.CREATOR));
        return true;
    }
}
