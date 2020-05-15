package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;

/* renamed from: aeoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeoq extends dcj implements aeos {
    public aeoq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
    }

    /* renamed from: a */
    public final void mo34402a(AliasedPlacesResult aliasedPlacesResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, aliasedPlacesResult);
        mo8530c(2, bj);
    }

    /* renamed from: b */
    public final void mo34403b(AliasedPlacesResult aliasedPlacesResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, aliasedPlacesResult);
        mo8530c(3, bj);
    }

    /* renamed from: c */
    public final void mo34404c(AliasedPlacesResult aliasedPlacesResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, aliasedPlacesResult);
        mo8530c(4, bj);
    }
}
