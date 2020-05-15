package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.DeleteRequest;
import com.google.android.gms.auth.api.credentials.internal.SaveRequest;

/* renamed from: hin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hin extends dck implements hio {
    public hin() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        hii hii = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                if (queryLocalInterface instanceof hii) {
                    hii = (hii) queryLocalInterface;
                } else {
                    hii = new hii(readStrongBinder);
                }
            }
            mo12501a(hii, (CredentialRequest) dcl.m8163a(parcel, CredentialRequest.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                if (queryLocalInterface2 instanceof hii) {
                    hii = (hii) queryLocalInterface2;
                } else {
                    hii = new hii(readStrongBinder2);
                }
            }
            mo12503a(hii, (SaveRequest) dcl.m8163a(parcel, SaveRequest.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                if (queryLocalInterface3 instanceof hii) {
                    hii = (hii) queryLocalInterface3;
                } else {
                    hii = new hii(readStrongBinder3);
                }
            }
            mo12502a(hii, (DeleteRequest) dcl.m8163a(parcel, DeleteRequest.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                if (queryLocalInterface4 instanceof hii) {
                    hii = (hii) queryLocalInterface4;
                } else {
                    hii = new hii(readStrongBinder4);
                }
            }
            mo12500a(hii);
        }
        parcel2.writeNoException();
        return true;
    }
}
