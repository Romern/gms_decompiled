package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Request;

/* renamed from: aprn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aprn extends dck implements apro {
    public aprn() {
        super("com.google.android.gms.search.nativeapi.internal.INativeApiService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aprl aprl;
        if (i != 2) {
            return false;
        }
        GetNativeApiInfoCall$Request getNativeApiInfoCall$Request = (GetNativeApiInfoCall$Request) dcl.m8163a(parcel, GetNativeApiInfoCall$Request.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks");
            aprl = queryLocalInterface instanceof aprl ? (aprl) queryLocalInterface : new aprl(readStrongBinder);
        } else {
            aprl = null;
        }
        mo47551a(aprl);
        parcel2.writeNoException();
        return true;
    }
}
