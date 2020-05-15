package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: beaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beaz extends dcj implements IInterface {
    public beaz(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.photos.backup.api.IPhotosBackup");
    }

    /* renamed from: a */
    public final void mo58517a() {
        mo8528b(3, mo8529bj());
    }

    /* renamed from: a */
    public final boolean mo58518a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(2, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
