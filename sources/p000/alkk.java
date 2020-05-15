package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.payse.internal.ExecuteSdkOperationRequest;
import com.google.android.gms.payse.internal.GetSeCardsRequest;

/* renamed from: alkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alkk extends dck implements alkl {
    public alkk() {
        super("com.google.android.gms.payse.internal.IPaySeService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        alko alko = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.payse.internal.IPaySeServiceCallbacks");
                if (queryLocalInterface instanceof alko) {
                    alko = (alko) queryLocalInterface;
                } else {
                    alko = new alkm(readStrongBinder);
                }
            }
            mo40466a(alko);
        } else if (i == 2) {
            GetSeCardsRequest getSeCardsRequest = (GetSeCardsRequest) dcl.m8163a(parcel, GetSeCardsRequest.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.payse.internal.IPaySeServiceCallbacks");
                if (queryLocalInterface2 instanceof alko) {
                    alko = (alko) queryLocalInterface2;
                } else {
                    alko = new alkm(readStrongBinder2);
                }
            }
            mo40468a(getSeCardsRequest, alko);
        } else if (i != 3) {
            return false;
        } else {
            ExecuteSdkOperationRequest executeSdkOperationRequest = (ExecuteSdkOperationRequest) dcl.m8163a(parcel, ExecuteSdkOperationRequest.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.payse.internal.IPaySeServiceCallbacks");
                if (queryLocalInterface3 instanceof alko) {
                    alko = (alko) queryLocalInterface3;
                } else {
                    alko = new alkm(readStrongBinder3);
                }
            }
            mo40467a(executeSdkOperationRequest, alko);
        }
        parcel2.writeNoException();
        return true;
    }
}
