package p000;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: aekd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekd extends dck implements aeke {

    /* renamed from: a */
    private rlf f63460a;

    public aekd() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* renamed from: a */
    public final void mo34245a(LocationSettingsResult locationSettingsResult) {
        this.f63460a.mo9482a(locationSettingsResult);
        this.f63460a = null;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo34245a((LocationSettingsResult) dcl.m8163a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }

    public aekd(rlf rlf) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
        boolean z;
        if (rlf != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "listener can't be null.");
        this.f63460a = rlf;
    }
}
