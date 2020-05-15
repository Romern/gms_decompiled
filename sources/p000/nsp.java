package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.car.CarSensorEvent;

/* renamed from: nsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nsp extends dcj implements nsr {
    public nsp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarSensorEventListener");
    }

    /* renamed from: a */
    public final void mo21436a(CarSensorEvent carSensorEvent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carSensorEvent);
        mo8530c(1, bj);
    }
}
