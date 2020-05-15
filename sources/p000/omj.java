package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: omj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class omj extends dcj implements oml {
    public omj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
    }

    /* renamed from: a */
    public final void mo21166a() {
        mo8528b(2, mo8529bj());
    }

    /* renamed from: b */
    public final void mo21168b() {
        mo8528b(3, mo8529bj());
    }

    /* renamed from: a */
    public final void mo21167a(int i, byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeByteArray(bArr);
        mo8528b(1, bj);
    }
}
