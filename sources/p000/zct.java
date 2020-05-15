package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: zct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zct extends dcj implements zcv {
    public zct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
    }

    /* renamed from: a */
    public final void mo30934a(BleDevicesResult bleDevicesResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bleDevicesResult);
        mo8530c(1, bj);
    }
}
