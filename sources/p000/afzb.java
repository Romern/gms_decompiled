package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: afzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afzb extends dck implements afzc {
    public afzb() {
        super("com.google.android.gms.mdm.internal.INetworkQualityService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            abmf abmf = null;
            abmg abmg = null;
            if (i == 2) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
                    if (queryLocalInterface instanceof abmf) {
                        abmf = (abmf) queryLocalInterface;
                    } else {
                        abmf = new abmf(readStrongBinder);
                    }
                }
                mo32215a(abmf);
            } else if (i != 3) {
                return false;
            } else {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
                    if (queryLocalInterface2 instanceof abmg) {
                        abmg = (abmg) queryLocalInterface2;
                    } else {
                        abmg = new abmg(readStrongBinder2);
                    }
                }
                mo32216a(abmg);
            }
        } else {
            mo32217a(parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
