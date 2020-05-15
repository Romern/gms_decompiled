package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;

/* renamed from: arif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arif extends dcj implements arik {
    public arif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
    }

    /* renamed from: a */
    public final void mo48558a(int i, String str) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeString(str);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo48559a(PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, pendingIntent);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo48560a(AccountTransferResult[] accountTransferResultArr) {
        Parcel bj = mo8529bj();
        bj.writeTypedArray(accountTransferResultArr, 0);
        mo8528b(1, bj);
    }
}
