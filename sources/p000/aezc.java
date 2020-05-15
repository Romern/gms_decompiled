package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.lockbox.internal.LockboxSignedInStatus;

/* renamed from: aezc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezc extends dcj implements aeze {
    public aezc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.lockbox.internal.ILockboxService");
    }

    /* renamed from: a */
    public final LockboxSignedInStatus mo34673a() {
        Parcel a = mo8526a(8, mo8529bj());
        LockboxSignedInStatus lockboxSignedInStatus = (LockboxSignedInStatus) dcl.m8163a(a, LockboxSignedInStatus.CREATOR);
        a.recycle();
        return lockboxSignedInStatus;
    }

    /* renamed from: a */
    public final void mo34674a(String str, String str2) {
        Parcel bj = mo8529bj();
        bj.writeString(null);
        bj.writeString(null);
        mo8528b(7, bj);
    }
}
