package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.herrevad.NetworkQualityReport;

/* renamed from: abmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abmj extends dck implements abmk {
    public abmj() {
        super("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        abmh abmh;
        if (i == 1) {
            mo32214a((NetworkQualityReport) dcl.m8163a(parcel, NetworkQualityReport.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityCallbacks");
                abmh = queryLocalInterface instanceof abmh ? (abmh) queryLocalInterface : new abmh(readStrongBinder);
            } else {
                abmh = null;
            }
            mo32213a(abmh);
        }
        return true;
    }
}
