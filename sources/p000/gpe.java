package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gpe extends dcj implements gpg {
    public gpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    /* renamed from: a */
    public final void mo12125a(Status status, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bundle);
        mo8530c(2, bj);
    }
}
