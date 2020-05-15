package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.RestoreData;
import com.google.android.gms.common.api.Status;

/* renamed from: mot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mot extends dcj implements IInterface {
    public mot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.internal.IRestoreDataCallback");
    }

    /* renamed from: a */
    public final void mo20220a(Status status, RestoreData restoreData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, restoreData);
        mo8530c(1, bj);
    }
}
