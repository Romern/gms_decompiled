package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: nst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nst extends dck implements nsu {
    public nst() {
        super("com.google.android.gms.car.ICarVendorExtension");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nsv nsv = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    if (queryLocalInterface instanceof nsv) {
                        nsv = (nsv) queryLocalInterface;
                    } else {
                        nsv = new nsv(readStrongBinder);
                    }
                }
                boolean b = mo21412b(nsv);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    nsv = queryLocalInterface2 instanceof nsv ? (nsv) queryLocalInterface2 : new nsv(readStrongBinder2);
                }
                mo21413c(nsv);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    if (queryLocalInterface3 instanceof nsv) {
                        nsv = (nsv) queryLocalInterface3;
                    } else {
                        nsv = new nsv(readStrongBinder3);
                    }
                }
                String a = mo21405a(nsv);
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    if (queryLocalInterface4 instanceof nsv) {
                        nsv = (nsv) queryLocalInterface4;
                    } else {
                        nsv = new nsv(readStrongBinder4);
                    }
                }
                byte[] d = mo21416d(nsv);
                parcel2.writeNoException();
                parcel2.writeByteArray(d);
                return true;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    if (queryLocalInterface5 instanceof nsv) {
                        nsv = (nsv) queryLocalInterface5;
                    } else {
                        nsv = new nsv(readStrongBinder5);
                    }
                }
                ParcelFileDescriptor e = mo21417e(nsv);
                parcel2.writeNoException();
                dcl.m8169b(parcel2, e);
                return true;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    if (queryLocalInterface6 instanceof nsv) {
                        nsv = (nsv) queryLocalInterface6;
                    } else {
                        nsv = new nsv(readStrongBinder6);
                    }
                }
                mo21407a(nsv, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    if (queryLocalInterface7 instanceof nsv) {
                        nsv = (nsv) queryLocalInterface7;
                    } else {
                        nsv = new nsv(readStrongBinder7);
                    }
                }
                mo21411b(nsv, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    if (queryLocalInterface8 instanceof nsv) {
                        nsv = (nsv) queryLocalInterface8;
                    } else {
                        nsv = new nsv(readStrongBinder8);
                    }
                }
                ParcelFileDescriptor f = mo21418f(nsv);
                parcel2.writeNoException();
                dcl.m8169b(parcel2, f);
                return true;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    if (queryLocalInterface9 instanceof nsv) {
                        nsv = (nsv) queryLocalInterface9;
                    } else {
                        nsv = new nsv(readStrongBinder9);
                    }
                }
                mo21414c(nsv, parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
