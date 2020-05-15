package p000;

import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* renamed from: aeju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aeju extends dck implements aejv {
    public aeju() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo34143a((FusedLocationProviderResult) dcl.m8163a(parcel, FusedLocationProviderResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo34142a();
        }
        return true;
    }
}
