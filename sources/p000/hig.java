package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: hig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hig extends dck implements hih {
    public hig() {
        super("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo12276a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        return true;
    }
}
