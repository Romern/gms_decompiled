package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: aehr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehr extends dcj implements aeht {
    public aehr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public final void mo34157a(LocationAvailability locationAvailability) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, locationAvailability);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo34158a(LocationResult locationResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, locationResult);
        mo8530c(1, bj);
    }
}
