package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: iru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iru extends dcj implements irw {
    public iru(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
    }

    /* renamed from: a */
    public final void mo13305a(KeyRegistrationResult keyRegistrationResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, keyRegistrationResult);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13306a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
