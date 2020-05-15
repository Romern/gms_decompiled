package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: aejw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aejw extends dcj implements aejy {
    public aejw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* renamed from: a */
    public final void mo34203a(int i, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, pendingIntent);
        mo8530c(3, bj);
    }

    /* renamed from: b */
    public final void mo34205b(int i, String[] strArr) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeStringArray(strArr);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo34204a(int i, String[] strArr) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeStringArray(strArr);
        mo8530c(1, bj);
    }
}
