package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* renamed from: hxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hxs extends dck implements hxt {
    public hxs() {
        super("com.google.android.gms.auth.api.internal.IAuthService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        hxq hxq = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                if (queryLocalInterface instanceof hxq) {
                    hxq = (hxq) queryLocalInterface;
                } else {
                    hxq = new hxo(readStrongBinder);
                }
            }
            mo12792a(hxq, (ProxyRequest) dcl.m8163a(parcel, ProxyRequest.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                if (queryLocalInterface2 instanceof hxq) {
                    hxq = (hxq) queryLocalInterface2;
                } else {
                    hxq = new hxo(readStrongBinder2);
                }
            }
            mo12791a(hxq, (ProxyGrpcRequest) dcl.m8163a(parcel, ProxyGrpcRequest.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
                if (queryLocalInterface3 instanceof hxq) {
                    hxq = (hxq) queryLocalInterface3;
                } else {
                    hxq = new hxo(readStrongBinder3);
                }
            }
            mo12790a(hxq);
        }
        parcel2.writeNoException();
        return true;
    }
}
