package p000;

import android.os.Binder;
import android.os.Parcel;
import android.os.Process;

/* renamed from: nww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nww extends Binder {

    /* renamed from: a */
    private final Binder f36845a;

    /* renamed from: b */
    private final int f36846b = Process.myUid();

    public nww(Binder binder) {
        this.f36845a = binder;
        String interfaceDescriptor = binder.getInterfaceDescriptor();
        attachInterface(binder.queryLocalInterface(interfaceDescriptor), interfaceDescriptor);
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (this.f36846b == Binder.getCallingUid()) {
            return this.f36845a.transact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        parcel2.writeException(new SecurityException("Bad uid"));
        return false;
    }
}
