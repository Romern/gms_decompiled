package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwc extends dcj implements hwe {
    public hwc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
    }

    /* renamed from: a */
    public final void mo12782a(Status status, GetDefaultAccountResult getDefaultAccountResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getDefaultAccountResult);
        mo8530c(1, bj);
    }
}
