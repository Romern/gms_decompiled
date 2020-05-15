package p000;

import android.app.PendingIntent;
import android.os.Parcel;

/* renamed from: aejx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aejx extends dck implements aejy {
    public aejx() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo34204a(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            mo34205b(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            mo34203a(parcel.readInt(), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
