package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.identity.accounts.api.AccountData;

/* renamed from: acyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class acyl extends dck implements acym {
    public acyl() {
        super("com.google.android.gms.identity.accounts.service.IAccountDataService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        acyk acyk = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.identity.accounts.service.IAccountDataCallbacks");
                if (queryLocalInterface instanceof acyk) {
                    acyk = (acyk) queryLocalInterface;
                } else {
                    acyk = new acyk(readStrongBinder);
                }
            }
            mo33239a(acyk, (AccountData) dcl.m8163a(parcel, AccountData.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.identity.accounts.service.IAccountDataCallbacks");
                if (queryLocalInterface2 instanceof acyk) {
                    acyk = (acyk) queryLocalInterface2;
                } else {
                    acyk = new acyk(readStrongBinder2);
                }
            }
            mo33240a(acyk, parcel.createByteArray());
        }
        parcel2.writeNoException();
        return true;
    }
}
