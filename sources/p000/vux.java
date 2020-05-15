package p000;

import android.os.Binder;
import android.os.Parcel;
import android.os.Process;

/* renamed from: vux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vux extends Binder {

    /* renamed from: a */
    private final Binder f50011a;

    /* renamed from: b */
    private final int f50012b = Process.myUid();

    public vux(Binder binder) {
        this.f50011a = binder;
        String interfaceDescriptor = binder.getInterfaceDescriptor();
        attachInterface(binder.queryLocalInterface(interfaceDescriptor), interfaceDescriptor);
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (this.f50012b == Binder.getCallingUid()) {
            return this.f50011a.transact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        parcel2.writeException(new SecurityException("Bad uid"));
        return false;
    }
}
