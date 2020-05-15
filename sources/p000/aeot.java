package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.personalized.UserPlacesResult;

/* renamed from: aeot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeot extends dcj implements aeov {
    public aeot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.personalized.IUserPlacesCallbacks");
    }

    /* renamed from: a */
    public final void mo34405a(UserPlacesResult userPlacesResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, userPlacesResult);
        mo8530c(2, bj);
    }
}
