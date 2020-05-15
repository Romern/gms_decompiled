package p000;

import android.os.Parcel;
import com.google.android.gms.car.CarSensorEvent;

/* renamed from: nsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nsq extends dck implements nsr {
    public nsq() {
        super("com.google.android.gms.car.ICarSensorEventListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo21436a((CarSensorEvent) dcl.m8163a(parcel, CarSensorEvent.CREATOR));
        return true;
    }
}
