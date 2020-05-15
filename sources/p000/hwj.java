package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.ListSignInCredentialsResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwj extends dcj implements hwl {
    public hwj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
    }

    /* renamed from: a */
    public final void mo12783a(Status status, ListSignInCredentialsResult listSignInCredentialsResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, listSignInCredentialsResult);
        mo8530c(1, bj);
    }
}
