package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: omg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class omg extends dcj implements omi {
    public omg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IProxySensorsEndPoint");
    }

    /* renamed from: a */
    public final void mo22287a(oml oml) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, oml);
        mo8528b(6, bj);
    }

    /* renamed from: b */
    public final void mo22290b(oml oml) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, oml);
        mo8528b(7, bj);
    }

    /* renamed from: bk */
    public final boolean mo22291bk() {
        Parcel a = mo8526a(3, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: bl */
    public final int[] mo22292bl() {
        Parcel a = mo8526a(2, mo8529bj());
        int[] createIntArray = a.createIntArray();
        a.recycle();
        return createIntArray;
    }

    /* renamed from: a */
    public final boolean mo22288a(int i, long j) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeLong(j);
        Parcel a = mo8526a(4, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final byte[] mo22289a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        Parcel a = mo8526a(5, bj);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }
}
