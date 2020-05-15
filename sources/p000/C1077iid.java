package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: iid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1077iid extends dcj implements IInterface {
    public C1077iid(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.authzen.internal.IBooleanCallback");
    }

    /* renamed from: a */
    public final void mo13039a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8530c(1, bj);
    }
}
