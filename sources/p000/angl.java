package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.phenotype.RegistrationInfo;

/* renamed from: angl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class angl extends dck implements angm {
    public angl() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        angj angj;
        angj angj2;
        angj angj3;
        angj angj4;
        angj angj5;
        angj angj6;
        angj angj7 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface instanceof angj) {
                        angj = (angj) queryLocalInterface;
                        mo41800a(angj, parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.createByteArray());
                        break;
                    } else {
                        angj7 = new angh(readStrongBinder);
                    }
                }
                angj = angj7;
                mo41800a(angj, parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.createByteArray());
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface2 instanceof angj) {
                        angj2 = (angj) queryLocalInterface2;
                        mo41802a(angj2, parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.createIntArray(), parcel.createByteArray());
                        break;
                    } else {
                        angj7 = new angh(readStrongBinder2);
                    }
                }
                angj2 = angj7;
                mo41802a(angj2, parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.createIntArray(), parcel.createByteArray());
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface3 instanceof angj) {
                        angj7 = (angj) queryLocalInterface3;
                    } else {
                        angj7 = new angh(readStrongBinder3);
                    }
                }
                mo41799a(angj7, parcel.readString());
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface4 instanceof angj) {
                        angj7 = (angj) queryLocalInterface4;
                    } else {
                        angj7 = new angh(readStrongBinder4);
                    }
                }
                mo41804a(angj7, parcel.readString(), parcel.readString());
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface5 instanceof angj) {
                        angj7 = (angj) queryLocalInterface5;
                    } else {
                        angj7 = new angh(readStrongBinder5);
                    }
                }
                mo41814b(angj7, parcel.readString());
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface6 instanceof angj) {
                        angj7 = (angj) queryLocalInterface6;
                    } else {
                        angj7 = new angh(readStrongBinder6);
                    }
                }
                mo41815b(angj7, parcel.readString(), parcel.readString());
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface7 instanceof angj) {
                        angj7 = (angj) queryLocalInterface7;
                    } else {
                        angj7 = new angh(readStrongBinder7);
                    }
                }
                mo41798a(angj7);
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface8 instanceof angj) {
                        angj7 = (angj) queryLocalInterface8;
                    } else {
                        angj7 = new angh(readStrongBinder8);
                    }
                }
                mo41811a(angj7, parcel.createByteArray());
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface9 instanceof angj) {
                        angj7 = (angj) queryLocalInterface9;
                    } else {
                        angj7 = new angh(readStrongBinder9);
                    }
                }
                mo41805a(angj7, parcel.readString(), parcel.readString(), parcel.readInt());
                break;
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface10 instanceof angj) {
                        angj7 = (angj) queryLocalInterface10;
                    } else {
                        angj7 = new angh(readStrongBinder10);
                    }
                }
                mo41818c(angj7, parcel.readString());
                break;
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface11 instanceof angj) {
                        angj7 = (angj) queryLocalInterface11;
                    } else {
                        angj7 = new angh(readStrongBinder11);
                    }
                }
                mo41806a(angj7, parcel.readString(), parcel.readString(), parcel.readString());
                break;
            case 12:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface12 instanceof angj) {
                        angj7 = (angj) queryLocalInterface12;
                    } else {
                        angj7 = new angh(readStrongBinder12);
                    }
                }
                mo41803a(angj7, parcel.readString(), parcel.readLong());
                break;
            case 13:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface13 instanceof angj) {
                        angj3 = (angj) queryLocalInterface13;
                        mo41801a(angj3, parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.createByteArray(), parcel.readString(), parcel.readString());
                        break;
                    } else {
                        angj7 = new angh(readStrongBinder13);
                    }
                }
                angj3 = angj7;
                mo41801a(angj3, parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.createByteArray(), parcel.readString(), parcel.readString());
            case 14:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface14 instanceof angj) {
                        angj4 = (angj) queryLocalInterface14;
                        mo41807a(angj4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
                        break;
                    } else {
                        angj7 = new angh(readStrongBinder14);
                    }
                }
                angj4 = angj7;
                mo41807a(angj4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
            case 15:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface15 instanceof angj) {
                        angj7 = (angj) queryLocalInterface15;
                    } else {
                        angj7 = new angh(readStrongBinder15);
                    }
                }
                mo41816b(angj7, parcel.readString(), parcel.readString(), parcel.readString());
                break;
            case 16:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface16 instanceof angj) {
                        angj7 = (angj) queryLocalInterface16;
                    } else {
                        angj7 = new angh(readStrongBinder16);
                    }
                }
                mo41819c(angj7, parcel.readString(), parcel.readString(), parcel.readString());
                break;
            case 17:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface17 instanceof angj) {
                        angj5 = (angj) queryLocalInterface17;
                        mo41808a(angj5, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        break;
                    } else {
                        angj7 = new angh(readStrongBinder17);
                    }
                }
                angj5 = angj7;
                mo41808a(angj5, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface18 instanceof angj) {
                        angj7 = (angj) queryLocalInterface18;
                    } else {
                        angj7 = new angh(readStrongBinder18);
                    }
                }
                mo41809a(angj7, parcel.readString(), parcel.readString(), (Flag[]) parcel.createTypedArray(Flag.CREATOR));
                break;
            case 19:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface19 instanceof angj) {
                        angj7 = (angj) queryLocalInterface19;
                    } else {
                        angj7 = new angh(readStrongBinder19);
                    }
                }
                mo41812a(angj7, (RegistrationInfo[]) parcel.createTypedArray(RegistrationInfo.CREATOR));
                break;
            case 20:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface20 instanceof angj) {
                        angj7 = (angj) queryLocalInterface20;
                    } else {
                        angj7 = new angh(readStrongBinder20);
                    }
                }
                mo41810a(angj7, parcel.readString(), parcel.createByteArray());
                break;
            case 21:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface21 instanceof angj) {
                        angj angj8 = (angj) queryLocalInterface21;
                    } else {
                        new angh(readStrongBinder21);
                    }
                }
                parcel.readString();
                parcel.readString();
                GenericDimension[] genericDimensionArr = (GenericDimension[]) parcel.createTypedArray(GenericDimension.CREATOR);
                break;
            case 22:
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface22 instanceof angj) {
                        angj7 = (angj) queryLocalInterface22;
                    } else {
                        angj7 = new angh(readStrongBinder22);
                    }
                }
                mo41813b(angj7);
                break;
            case 23:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if (queryLocalInterface23 instanceof angj) {
                        angj6 = (angj) queryLocalInterface23;
                        mo41817b(angj6, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        break;
                    } else {
                        angj7 = new angh(readStrongBinder23);
                    }
                }
                angj6 = angj7;
                mo41817b(angj6, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
