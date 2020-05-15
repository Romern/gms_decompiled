package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

/* renamed from: xse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xse extends dck implements xsf {
    public xse() {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        xsc xsc = null;
        xoh xoh = null;
        xsc xsc2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
                if (queryLocalInterface instanceof xsc) {
                    xsc = (xsc) queryLocalInterface;
                } else {
                    xsc = new xsa(readStrongBinder);
                }
            }
            mo30099a(xsc, (BrowserPublicKeyCredentialCreationOptions) dcl.m8163a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
                if (queryLocalInterface2 instanceof xsc) {
                    xsc2 = (xsc) queryLocalInterface2;
                } else {
                    xsc2 = new xsa(readStrongBinder2);
                }
            }
            mo30100a(xsc2, (BrowserPublicKeyCredentialRequestOptions) dcl.m8163a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.fido.fido2.api.IBooleanCallback");
                if (queryLocalInterface3 instanceof xoh) {
                    xoh = (xoh) queryLocalInterface3;
                } else {
                    xoh = new xof(readStrongBinder3);
                }
            }
            mo30098a(xoh);
        }
        parcel2.writeNoException();
        return true;
    }
}
