package p000;

import android.os.Parcel;
import com.google.android.gms.location.places.personalized.UserPlacesResult;

/* renamed from: aeou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeou extends dck implements aeov {

    /* renamed from: a */
    private final aepa f63577a;

    public aeou() {
        super("com.google.android.gms.location.places.personalized.IUserPlacesCallbacks");
    }

    /* renamed from: a */
    public final void mo34405a(UserPlacesResult userPlacesResult) {
        this.f63577a.mo17716a((rkk) userPlacesResult);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo34405a((UserPlacesResult) dcl.m8163a(parcel, UserPlacesResult.CREATOR));
        return true;
    }

    public aeou(aepa aepa) {
        super("com.google.android.gms.location.places.personalized.IUserPlacesCallbacks");
        this.f63577a = aepa;
    }
}
