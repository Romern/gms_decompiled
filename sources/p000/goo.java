package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: goo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class goo extends dcj implements IInterface {
    public goo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IBundleCallback");
    }

    /* renamed from: a */
    public final void mo12112a(Status status, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bundle);
        mo8530c(2, bj);
    }
}
