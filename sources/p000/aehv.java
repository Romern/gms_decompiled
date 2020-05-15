package p000;

import android.location.Location;
import android.os.Parcel;

/* renamed from: aehv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehv extends dck implements aehw {

    /* renamed from: a */
    private final rod f63410a;

    public aehv() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public final synchronized void mo34161a() {
        this.f63410a.mo24967a();
    }

    /* renamed from: a */
    public final synchronized void mo34160a(Location location) {
        this.f63410a.mo24968a(new aekh(location));
    }

    public aehv(rod rod) {
        super("com.google.android.gms.location.ILocationListener");
        this.f63410a = rod;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo34160a((Location) dcl.m8163a(parcel, Location.CREATOR));
        return true;
    }
}
