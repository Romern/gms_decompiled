package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: xmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xmu extends dck implements xmv {
    public xmu() {
        super("com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        xmy xmy = null;
        xmz xmz = null;
        rnt rnt = null;
        xnc xnc = null;
        rnt rnt2 = null;
        xmy xmy2 = null;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
                    if (queryLocalInterface instanceof xmy) {
                        xmy = (xmy) queryLocalInterface;
                    } else {
                        xmy = new xmw(readStrongBinder);
                    }
                }
                mo29640a(xmy, parcel.readString(), parcel.readInt());
                break;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
                    xmy2 = queryLocalInterface2 instanceof xmy ? (xmy) queryLocalInterface2 : new xmw(readStrongBinder2);
                }
                mo29641a(xmy2, parcel.readString(), parcel.createByteArray());
                break;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface3;
                    } else {
                        rnt2 = new rnr(readStrongBinder3);
                    }
                }
                mo29639a(rnt2, parcel.readString(), parcel.createByteArray());
                break;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
                    if (queryLocalInterface4 instanceof xnc) {
                        xnc = (xnc) queryLocalInterface4;
                    } else {
                        xnc = new xna(readStrongBinder4);
                    }
                }
                mo29643a(xnc, parcel.readString());
                break;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface5 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface5;
                    } else {
                        rnt = new rnr(readStrongBinder5);
                    }
                }
                mo29638a(rnt, parcel.readString(), parcel.readLong());
                break;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks");
                    if (queryLocalInterface6 instanceof xmz) {
                        xmz = (xmz) queryLocalInterface6;
                    } else {
                        xmz = new xmz(readStrongBinder6);
                    }
                }
                mo29642a(xmz, parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
