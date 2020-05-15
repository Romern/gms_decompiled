package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwm extends dcj implements hwo {
    public hwm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
    }

    /* renamed from: a */
    public final void mo12784a(Status status, MatchPasswordResult matchPasswordResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, matchPasswordResult);
        mo8530c(1, bj);
    }
}
