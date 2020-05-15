package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: enb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class enb extends dck implements enc {
    public enb() {
        super("com.google.android.finsky.zapp.protocol.IDynamicModuleDownloader");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle a = mo10302a(parcel.createTypedArrayList(Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case 2:
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                Bundle c = mo10308c();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, c);
                return true;
            case 3:
                Bundle a2 = mo10301a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                return true;
            case 4:
                Bundle c2 = mo10309c((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, c2);
                return true;
            case 5:
                Bundle a3 = mo10300a(parcel.readLong());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a3);
                return true;
            case 6:
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                Bundle d = mo10310d();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, d);
                return true;
            case 7:
                Bundle b = mo10305b((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b);
                return true;
            case 8:
                Bundle a4 = mo10303a(parcel.createTypedArrayList(Bundle.CREATOR), dcl.m8167a(parcel));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a4);
                return true;
            case 9:
                Bundle b2 = mo10306b(parcel.createTypedArrayList(Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b2);
                return true;
            default:
                return false;
        }
    }
}
