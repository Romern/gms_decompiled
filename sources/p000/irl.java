package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: irl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irl extends dcj implements irn {
    public irl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IIncrementAndGetCounterCallback");
    }

    /* renamed from: a */
    public final void mo13299a(long j) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13300a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
