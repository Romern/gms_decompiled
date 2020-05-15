package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hvu extends dcj implements hvw {
    public hvu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
    }

    /* renamed from: a */
    public final void mo12779a(Status status, CompleteSignInResult completeSignInResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, completeSignInResult);
        mo8530c(1, bj);
    }
}
