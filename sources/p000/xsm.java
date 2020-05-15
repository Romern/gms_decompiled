package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: xsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xsm extends dck implements xsn {
    public xsm() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        xsk xsk = null;
        xoh xoh = null;
        xoh xoh2 = null;
        xsk xsk2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                if (queryLocalInterface instanceof xsk) {
                    xsk = (xsk) queryLocalInterface;
                } else {
                    xsk = new xsi(readStrongBinder);
                }
            }
            mo30104a(xsk, (PublicKeyCredentialCreationOptions) dcl.m8163a(parcel, PublicKeyCredentialCreationOptions.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                if (queryLocalInterface2 instanceof xsk) {
                    xsk2 = (xsk) queryLocalInterface2;
                } else {
                    xsk2 = new xsi(readStrongBinder2);
                }
            }
            mo30105a(xsk2, (PublicKeyCredentialRequestOptions) dcl.m8163a(parcel, PublicKeyCredentialRequestOptions.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.fido.fido2.api.IBooleanCallback");
                if (queryLocalInterface3 instanceof xoh) {
                    xoh2 = (xoh) queryLocalInterface3;
                } else {
                    xoh2 = new xof(readStrongBinder3);
                }
            }
            mo30102a(xoh2);
        } else if (i != 4) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.fido.fido2.api.IBooleanCallback");
                if (queryLocalInterface4 instanceof xoh) {
                    xoh = (xoh) queryLocalInterface4;
                } else {
                    xoh = new xof(readStrongBinder4);
                }
            }
            mo30103a(xoh, parcel.readString(), parcel.createByteArray());
        }
        parcel2.writeNoException();
        return true;
    }
}
