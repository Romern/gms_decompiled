package p000;

import android.os.Parcel;
import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: zcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zcu extends dck implements zcv {

    /* renamed from: a */
    private final rlf f54923a;

    public zcu() {
        super("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
    }

    /* renamed from: a */
    public final void mo30934a(BleDevicesResult bleDevicesResult) {
        this.f54923a.mo9482a(bleDevicesResult);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo30934a((BleDevicesResult) dcl.m8163a(parcel, BleDevicesResult.CREATOR));
        return true;
    }

    public zcu(rlf rlf) {
        super("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
        this.f54923a = rlf;
    }
}
