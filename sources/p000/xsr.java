package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: xsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xsr extends dck implements xss {
    public xsr() {
        super("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnr rnr;
        xoe xoe;
        rnt rnt;
        rnt rnt2;
        xoc xoc = null;
        rnt rnt3 = null;
        xok xok = null;
        xok xok2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnr = queryLocalInterface instanceof rnt ? (rnt) queryLocalInterface : new rnr(readStrongBinder);
            } else {
                rnr = null;
            }
            int readInt = parcel.readInt();
            byte[] createByteArray = parcel.createByteArray();
            byte[] createByteArray2 = parcel.createByteArray();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
                if (queryLocalInterface2 instanceof xoe) {
                    xoe = (xoe) queryLocalInterface2;
                    mo30109a(rnr, readInt, createByteArray, createByteArray2, xoe);
                } else {
                    xoc = new xoc(readStrongBinder2);
                }
            }
            xoe = xoc;
            mo30109a(rnr, readInt, createByteArray, createByteArray2, xoe);
        } else if (i == 2) {
            String readString = parcel.readString();
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt = queryLocalInterface3 instanceof rnt ? (rnt) queryLocalInterface3 : new rnr(readStrongBinder3);
            } else {
                rnt = null;
            }
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) dcl.m8163a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.fido.fido2.api.IResponseHandler");
                if (queryLocalInterface4 instanceof xok) {
                    xok2 = (xok) queryLocalInterface4;
                } else {
                    xok2 = new xoi(readStrongBinder4);
                }
            }
            mo30108a(readString, rnt, publicKeyCredentialRequestOptions, xok2);
        } else if (i == 3) {
            String readString2 = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                rnt2 = queryLocalInterface5 instanceof rnt ? (rnt) queryLocalInterface5 : new rnr(readStrongBinder5);
            } else {
                rnt2 = null;
            }
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) dcl.m8163a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
            IBinder readStrongBinder6 = parcel.readStrongBinder();
            if (readStrongBinder6 != null) {
                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.fido.fido2.api.IResponseHandler");
                if (queryLocalInterface6 instanceof xok) {
                    xok = (xok) queryLocalInterface6;
                } else {
                    xok = new xoi(readStrongBinder6);
                }
            }
            mo30107a(readString2, rnt2, publicKeyCredentialCreationOptions, xok);
        } else if (i != 4) {
            return false;
        } else {
            String readString3 = parcel.readString();
            IBinder readStrongBinder7 = parcel.readStrongBinder();
            if (readStrongBinder7 != null) {
                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface7 instanceof rnt) {
                    rnt3 = (rnt) queryLocalInterface7;
                } else {
                    rnt3 = new rnr(readStrongBinder7);
                }
            }
            mo30106a(readString3, rnt3, (StateUpdate) dcl.m8163a(parcel, StateUpdate.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
