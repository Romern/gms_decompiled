package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: mou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mou extends dcj implements IInterface {
    public mou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.internal.IRestoreNowCallbacks");
    }

    /* renamed from: a */
    public final void mo20221a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(1, bj);
    }
}
