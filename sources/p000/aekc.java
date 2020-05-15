package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: aekc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekc extends dcj implements aeke {
    public aekc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* renamed from: a */
    public final void mo34245a(LocationSettingsResult locationSettingsResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, locationSettingsResult);
        mo8530c(1, bj);
    }
}
