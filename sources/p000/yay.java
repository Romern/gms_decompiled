package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

/* renamed from: yay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yay extends dck implements yaz {
    public yay() {
        super("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        yax yax = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedCallbacks");
                if (queryLocalInterface instanceof yax) {
                    yax = (yax) queryLocalInterface;
                } else {
                    yax = new yax(readStrongBinder);
                }
            }
            mo30335a(yax, (BrowserRegisterRequestParams) dcl.m8163a(parcel, BrowserRegisterRequestParams.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedCallbacks");
                if (queryLocalInterface2 instanceof yax) {
                    yax = (yax) queryLocalInterface2;
                } else {
                    yax = new yax(readStrongBinder2);
                }
            }
            mo30336a(yax, (BrowserSignRequestParams) dcl.m8163a(parcel, BrowserSignRequestParams.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
