package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: idg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class idg extends dck implements idh {
    public idg() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ide ide = null;
        switch (i) {
            case 101:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface instanceof ide) {
                        ide = (ide) queryLocalInterface;
                    } else {
                        ide = new idc(readStrongBinder);
                    }
                }
                mo12937a(ide, (GoogleSignInOptions) dcl.m8163a(parcel, GoogleSignInOptions.CREATOR));
                break;
            case 102:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface2 instanceof ide) {
                        ide = (ide) queryLocalInterface2;
                    } else {
                        ide = new idc(readStrongBinder2);
                    }
                }
                mo12938b(ide, (GoogleSignInOptions) dcl.m8163a(parcel, GoogleSignInOptions.CREATOR));
                break;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
                    if (queryLocalInterface3 instanceof ide) {
                        ide = (ide) queryLocalInterface3;
                    } else {
                        ide = new idc(readStrongBinder3);
                    }
                }
                mo12939c(ide, (GoogleSignInOptions) dcl.m8163a(parcel, GoogleSignInOptions.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
