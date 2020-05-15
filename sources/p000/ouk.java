package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;

/* renamed from: ouk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ouk extends dck implements oul {

    /* renamed from: a */
    private IBinder f38461a;

    /* renamed from: b */
    private final boolean f38462b;

    public ouk() {
        super("com.google.android.gms.carsetup.ILocalBinderTransport");
    }

    /* renamed from: a */
    public final IBinder mo22655a() {
        if (Binder.getCallingPid() == Process.myPid()) {
            IBinder iBinder = this.f38461a;
            if (this.f38462b) {
                this.f38461a = null;
            }
            return iBinder;
        }
        throw new RuntimeException("Non-local call");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        IBinder a = mo22655a();
        parcel2.writeNoException();
        parcel2.writeStrongBinder(a);
        return true;
    }

    public ouk(IBinder iBinder) {
        super("com.google.android.gms.carsetup.ILocalBinderTransport");
        this.f38461a = iBinder;
        this.f38462b = true;
    }
}
