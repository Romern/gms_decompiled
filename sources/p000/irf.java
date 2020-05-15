package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: irf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irf extends dcj implements irh {
    public irf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IHkdfResultCallback");
    }

    /* renamed from: a */
    public final void mo13295a(KeyDerivationResult keyDerivationResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, keyDerivationResult);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13296a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
