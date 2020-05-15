package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: jsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jsk extends dcj implements jsm {
    public jsk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
    }

    /* renamed from: a */
    public final void mo13884a(String str, int i, int i2, int i3) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeInt(i2);
        bj.writeInt(i3);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13885a(String str, String str2, byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeByteArray(bArr);
        mo8530c(2, bj);
    }
}
