package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: nqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nqz extends dck implements nra {
    public nqz() {
        super("com.google.android.gms.car.ICarAudioRecord");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nrb nrb = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    if (queryLocalInterface instanceof nrb) {
                        nrb = (nrb) queryLocalInterface;
                    } else {
                        nrb = new nrb(readStrongBinder);
                    }
                }
                mo20901a(nrb);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    nrb = queryLocalInterface2 instanceof nrb ? (nrb) queryLocalInterface2 : new nrb(readStrongBinder2);
                }
                mo20904b(nrb);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    if (queryLocalInterface3 instanceof nrb) {
                        nrb = (nrb) queryLocalInterface3;
                    } else {
                        nrb = new nrb(readStrongBinder3);
                    }
                }
                mo20909e(nrb);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    if (queryLocalInterface4 instanceof nrb) {
                        nrb = (nrb) queryLocalInterface4;
                    } else {
                        nrb = new nrb(readStrongBinder4);
                    }
                }
                ParcelFileDescriptor c = mo20907c(nrb);
                parcel2.writeNoException();
                dcl.m8169b(parcel2, c);
                return true;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    if (queryLocalInterface5 instanceof nrb) {
                        nrb = (nrb) queryLocalInterface5;
                    } else {
                        nrb = new nrb(readStrongBinder5);
                    }
                }
                mo20908d(nrb);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    if (queryLocalInterface6 instanceof nrb) {
                        nrb = (nrb) queryLocalInterface6;
                    } else {
                        nrb = new nrb(readStrongBinder6);
                    }
                }
                mo20902a(nrb, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    if (queryLocalInterface7 instanceof nrb) {
                        nrb = (nrb) queryLocalInterface7;
                    } else {
                        nrb = new nrb(readStrongBinder7);
                    }
                }
                boolean b = mo20905b(nrb, parcel.readInt());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                return true;
            default:
                return false;
        }
    }
}
