package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyInvalidationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: irr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irr extends dcj implements irt {
    public irr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IKeyInvalidationResultCallback");
    }

    /* renamed from: a */
    public final void mo13303a(KeyInvalidationResult keyInvalidationResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, keyInvalidationResult);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13304a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
