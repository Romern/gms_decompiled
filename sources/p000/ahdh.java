package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: ahdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahdh extends dcj implements ahdj {
    public ahdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
    }

    /* renamed from: a */
    public final void mo36343a() {
        mo8530c(2, mo8529bj());
    }

    /* renamed from: b */
    public final void mo36347b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(6, bj);
    }

    /* renamed from: c */
    public final void mo36348c() {
        mo8530c(5, mo8529bj());
    }

    /* renamed from: a */
    public final void mo36344a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo36345a(Device device, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, device);
        bj.writeByteArray(null);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo36346a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(4, bj);
    }
}
