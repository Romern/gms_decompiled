package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: auqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auqd extends dck implements auqe {
    public auqd() {
        super("com.google.android.gms.trustagent.internal.IBridgeCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo50793a((Status) dcl.m8163a(parcel, Status.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
