package p000;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: aehs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehs extends dck implements aeht {

    /* renamed from: a */
    private final rod f63409a;

    public aehs() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public final synchronized void mo34159a() {
        this.f63409a.mo24967a();
    }

    /* renamed from: a */
    public final void mo34157a(LocationAvailability locationAvailability) {
        this.f63409a.mo24968a(new aekg(locationAvailability));
    }

    public aehs(rod rod) {
        super("com.google.android.gms.location.ILocationCallback");
        this.f63409a = rod;
    }

    /* renamed from: a */
    public final void mo34158a(LocationResult locationResult) {
        this.f63409a.mo24968a(new aekf(locationResult));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo34158a((LocationResult) dcl.m8163a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo34157a((LocationAvailability) dcl.m8163a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
