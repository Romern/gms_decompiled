package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarUiInfo;

/* renamed from: nss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nss extends dcj implements IInterface {
    public nss(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarUiInfoChangedListener");
    }

    /* renamed from: a */
    public final void mo21545a(CarUiInfo carUiInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carUiInfo);
        mo8530c(1, bj);
    }
}
