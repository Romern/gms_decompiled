package p000;

import android.os.Parcel;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;

/* renamed from: aeor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeor extends dck implements aeos {

    /* renamed from: a */
    private final aeoo f63576a;

    public aeor() {
        super("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
    }

    /* renamed from: a */
    public final void mo34402a(AliasedPlacesResult aliasedPlacesResult) {
        this.f63576a.mo17716a((rkk) aliasedPlacesResult);
    }

    /* renamed from: b */
    public final void mo34403b(AliasedPlacesResult aliasedPlacesResult) {
        this.f63576a.mo17716a((rkk) aliasedPlacesResult);
    }

    /* renamed from: c */
    public final void mo34404c(AliasedPlacesResult aliasedPlacesResult) {
        this.f63576a.mo17716a((rkk) aliasedPlacesResult);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo34402a((AliasedPlacesResult) dcl.m8163a(parcel, AliasedPlacesResult.CREATOR));
            return true;
        } else if (i == 3) {
            mo34403b((AliasedPlacesResult) dcl.m8163a(parcel, AliasedPlacesResult.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            mo34404c((AliasedPlacesResult) dcl.m8163a(parcel, AliasedPlacesResult.CREATOR));
            return true;
        }
    }

    public aeor(aeoo aeoo) {
        super("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
        this.f63576a = aeoo;
    }
}
