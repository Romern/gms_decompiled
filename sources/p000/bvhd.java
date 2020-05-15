package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;

/* renamed from: bvhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bvhd extends dck implements bvhe {
    public bvhd() {
        super("com.google.location.nearby.messages.debug.internal.IDebugPokeService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        bvhc bvhc;
        if (i != 2) {
            return false;
        }
        DebugPokeRequest debugPokeRequest = (DebugPokeRequest) dcl.m8163a(parcel, DebugPokeRequest.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.location.nearby.messages.debug.internal.IDebugPokeResponseCallback");
            bvhc = queryLocalInterface instanceof bvhc ? (bvhc) queryLocalInterface : new bvhc(readStrongBinder);
        } else {
            bvhc = null;
        }
        mo38428a(debugPokeRequest, bvhc);
        parcel2.writeNoException();
        return true;
    }
}
