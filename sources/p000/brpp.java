package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: brpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpp extends dcj implements IInterface {
    public brpp(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    /* renamed from: a */
    public final void mo69773a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }
}
