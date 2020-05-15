package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.util.List;

/* renamed from: omm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class omm extends dcj implements IInterface {
    public omm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IStartup");
    }

    /* renamed from: a */
    public final omi mo22293a(oml oml) {
        omi omi;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, oml);
        Parcel a = mo8526a(16, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPoint");
            omi = queryLocalInterface instanceof omi ? (omi) queryLocalInterface : new omg(readStrongBinder);
        } else {
            omi = null;
        }
        a.recycle();
        return omi;
    }

    /* renamed from: b */
    public final void mo22304b(long j) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo22294a(long j, int i) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        bj.writeInt(i);
        mo8528b(19, bj);
    }

    /* renamed from: a */
    public final void mo22295a(long j, int i, Bundle bundle, omo omo) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8164a(bj, omo);
        mo8528b(20, bj);
    }

    /* renamed from: a */
    public final void mo22296a(long j, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        dcl.m8165a(bj, bundle);
        mo8528b(23, bj);
    }

    /* renamed from: a */
    public final void mo22297a(long j, ParcelFileDescriptor parcelFileDescriptor, omo omo) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        dcl.m8165a(bj, parcelFileDescriptor);
        dcl.m8164a(bj, omo);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo22298a(long j, List list, List list2, ParcelFileDescriptor parcelFileDescriptor, omf omf) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        bj.writeList(list);
        bj.writeList(list2);
        dcl.m8165a(bj, parcelFileDescriptor);
        dcl.m8164a(bj, omf);
        mo8528b(17, bj);
    }

    /* renamed from: a */
    public final void mo22299a(long j, List list, List list2, omf omf) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        bj.writeList(list);
        bj.writeList(list2);
        dcl.m8164a(bj, omf);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo22300a(long j, omo omo) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        dcl.m8164a(bj, omo);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final boolean mo22301a(int i, int i2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeInt(i2);
        Parcel a = mo8526a(24, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final boolean mo22302a(int i, int i2, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeInt(i2);
        dcl.m8165a(bj, parcelFileDescriptor);
        bj.writeByteArray(bArr);
        Parcel a = mo8526a(25, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final boolean mo22303a(long j) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        Parcel a = mo8526a(1, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
