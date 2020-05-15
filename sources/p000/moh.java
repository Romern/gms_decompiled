package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.BackUpNowConfig;

/* renamed from: moh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class moh extends dck implements moi {
    public moh() {
        super("com.google.android.gms.backup.internal.IBackUpNowService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        lud lud = null;
        mof mof = null;
        if (i == 1) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.backup.IBackUpNowClientCallbacks");
                if (queryLocalInterface instanceof lud) {
                    lud = (lud) queryLocalInterface;
                } else {
                    lud = new lub(readStrongBinder);
                }
            }
            mo20216a(readString, lud);
            parcel2.writeNoException();
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.backup.internal.IBackUpNowCallbacks");
                if (queryLocalInterface2 instanceof mof) {
                    mof = (mof) queryLocalInterface2;
                } else {
                    mof = new mod(readStrongBinder2);
                }
            }
            mo20217a(mof, (BackUpNowConfig) dcl.m8163a(parcel, BackUpNowConfig.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            boolean a = mo20218a();
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a);
        } else if (i != 4) {
            return false;
        } else {
            mo20215a(parcel.readString());
            parcel2.writeNoException();
        }
        return true;
    }
}
