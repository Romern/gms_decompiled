package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bebc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebc extends dcj implements IInterface {
    public bebc(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.photos.restore.api.IPhotosRestore");
    }

    /* renamed from: a */
    public final boolean mo58521a(String str, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, pendingIntent);
        Parcel a = mo8526a(2, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
