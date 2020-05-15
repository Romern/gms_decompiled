package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: grf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grf extends dcj implements grh {
    public grf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.internal.IBooleanResultCallback");
    }

    /* renamed from: a */
    public final void mo12132a(int i, boolean z) {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        dcl.m8166a(bj, z);
        mo8530c(2, bj);
    }
}
