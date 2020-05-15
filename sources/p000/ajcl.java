package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ajcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajcl extends dcj implements IInterface {
    public ajcl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.IStatusCallback");
    }

    /* renamed from: a */
    public final void mo38490a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8530c(1, bj);
    }
}
