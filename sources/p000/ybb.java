package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* renamed from: ybb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ybb extends dck implements ybc {
    public ybb() {
        super("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        yba yba = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks");
                if (queryLocalInterface instanceof yba) {
                    yba = (yba) queryLocalInterface;
                } else {
                    yba = new yba(readStrongBinder);
                }
            }
            mo30338a(yba, (RegisterRequestParams) dcl.m8163a(parcel, RegisterRequestParams.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks");
                if (queryLocalInterface2 instanceof yba) {
                    yba = (yba) queryLocalInterface2;
                } else {
                    yba = new yba(readStrongBinder2);
                }
            }
            mo30339a(yba, (SignRequestParams) dcl.m8163a(parcel, SignRequestParams.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
