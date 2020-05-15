package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.common.api.Status;

/* renamed from: iro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iro extends dcj implements irq {
    public iro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IKeyHandleResultCallback");
    }

    /* renamed from: a */
    public final void mo13301a(KeyHandleResult keyHandleResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, keyHandleResult);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13302a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
