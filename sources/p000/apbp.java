package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: apbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class apbp extends dck implements apbq {
    public apbp() {
        super("com.google.android.gms.romanesco.internal.IRomanescoService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        apbn apbn;
        apbn apbn2;
        apbn apbn3;
        apbn apbn4 = null;
        if (i == 1101) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                if (queryLocalInterface instanceof apbn) {
                    apbn4 = (apbn) queryLocalInterface;
                } else {
                    apbn4 = new apbl(readStrongBinder);
                }
            }
            mo47084a(apbn4, parcel.readString(), parcel.readString(), parcel.createStringArray());
        } else if (i == 1102) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                if (queryLocalInterface2 instanceof apbn) {
                    apbn = (apbn) queryLocalInterface2;
                    mo47083a(apbn, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                } else {
                    apbn4 = new apbl(readStrongBinder2);
                }
            }
            apbn = apbn4;
            mo47083a(apbn, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
        } else if (i == 1201) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                if (queryLocalInterface3 instanceof apbn) {
                    apbn4 = (apbn) queryLocalInterface3;
                } else {
                    apbn4 = new apbl(readStrongBinder3);
                }
            }
            mo47081a(apbn4, parcel.readString(), parcel.readString());
        } else if (i == 1401) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                if (queryLocalInterface4 instanceof apbn) {
                    apbn2 = (apbn) queryLocalInterface4;
                    mo47082a(apbn2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                } else {
                    apbn4 = new apbl(readStrongBinder4);
                }
            }
            apbn2 = apbn4;
            mo47082a(apbn2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
        } else if (i == 2701) {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                if (queryLocalInterface5 instanceof apbn) {
                    apbn4 = (apbn) queryLocalInterface5;
                } else {
                    apbn4 = new apbl(readStrongBinder5);
                }
            }
            mo47080a(apbn4, parcel.readString(), parcel.readLong());
        } else if (i == 2902) {
            IBinder readStrongBinder6 = parcel.readStrongBinder();
            if (readStrongBinder6 != null) {
                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                if (queryLocalInterface6 instanceof apbn) {
                    apbn4 = (apbn) queryLocalInterface6;
                } else {
                    apbn4 = new apbl(readStrongBinder6);
                }
            }
            mo47079a(apbn4, parcel.readString());
        } else if (i == 2801) {
            IBinder readStrongBinder7 = parcel.readStrongBinder();
            if (readStrongBinder7 != null) {
                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                if (queryLocalInterface7 instanceof apbn) {
                    apbn3 = (apbn) queryLocalInterface7;
                    mo47085b(apbn3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                } else {
                    apbn4 = new apbl(readStrongBinder7);
                }
            }
            apbn3 = apbn4;
            mo47085b(apbn3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
        } else if (i != 2802) {
            return false;
        } else {
            IBinder readStrongBinder8 = parcel.readStrongBinder();
            if (readStrongBinder8 != null) {
                IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                if (queryLocalInterface8 instanceof apbn) {
                    apbn4 = (apbn) queryLocalInterface8;
                } else {
                    apbn4 = new apbl(readStrongBinder8);
                }
            }
            mo47086b(apbn4, parcel.readString(), parcel.readString(), parcel.createStringArray());
        }
        parcel2.writeNoException();
        return true;
    }
}
