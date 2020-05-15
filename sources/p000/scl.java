package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: scl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class scl implements scn {

    /* renamed from: a */
    private final IBinder f44047a;

    public scl(IBinder iBinder) {
        this.f44047a = iBinder;
    }

    /* renamed from: a */
    public final void mo25273a(sck sck, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(sck.asBinder());
            obtain.writeInt(1);
            sbh.m34831a(getServiceRequest, obtain, 0);
            this.f44047a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f44047a;
    }
}
