package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hvq extends dcj implements IInterface {
    public hvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    /* renamed from: a */
    public final void mo12778a(Status status, AuthorizationResult authorizationResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, authorizationResult);
        mo8530c(1, bj);
    }
}
