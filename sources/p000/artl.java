package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: artl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class artl extends dck implements artm {
    public artl() {
        super("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        artk artk = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface instanceof artk) {
                        artk = (artk) queryLocalInterface;
                    } else {
                        artk = new arti(readStrongBinder);
                    }
                }
                mo48806a(artk);
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    artk = queryLocalInterface2 instanceof artk ? (artk) queryLocalInterface2 : new arti(readStrongBinder2);
                }
                mo48808b(artk);
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface3 instanceof artk) {
                        artk = (artk) queryLocalInterface3;
                    } else {
                        artk = new arti(readStrongBinder3);
                    }
                }
                mo48807a(artk, (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
                return true;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface4 instanceof artk) {
                        artk = (artk) queryLocalInterface4;
                    } else {
                        artk = new arti(readStrongBinder4);
                    }
                }
                mo48809b(artk, (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
                return true;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface5 instanceof artk) {
                        artk = (artk) queryLocalInterface5;
                    } else {
                        artk = new arti(readStrongBinder5);
                    }
                }
                mo48810c(artk, (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
                return true;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface6 instanceof artk) {
                        artk = (artk) queryLocalInterface6;
                    } else {
                        artk = new arti(readStrongBinder6);
                    }
                }
                mo48811d(artk, (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
