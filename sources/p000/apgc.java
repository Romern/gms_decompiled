package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: apgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class apgc extends dck implements apgd {
    public apgc() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        apga apga;
        apga apga2 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface instanceof apga) {
                        apga2 = (apga) queryLocalInterface;
                    } else {
                        apga2 = new apfy(readStrongBinder);
                    }
                }
                mo47184a(apga2, parcel.createByteArray());
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    apga2 = queryLocalInterface2 instanceof apga ? (apga) queryLocalInterface2 : new apfy(readStrongBinder2);
                }
                mo47177a(apga2);
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface3 instanceof apga) {
                        apga = (apga) queryLocalInterface3;
                        mo47183a(apga, parcel.readString(), parcel.createIntArray(), parcel.readInt(), parcel.readString());
                        break;
                    } else {
                        apga2 = new apfy(readStrongBinder3);
                    }
                }
                apga = apga2;
                mo47183a(apga, parcel.readString(), parcel.createIntArray(), parcel.readInt(), parcel.readString());
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface4 instanceof apga) {
                        apga2 = (apga) queryLocalInterface4;
                    } else {
                        apga2 = new apfy(readStrongBinder4);
                    }
                }
                mo47189e(apga2);
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface5 instanceof apga) {
                        apga2 = (apga) queryLocalInterface5;
                    } else {
                        apga2 = new apfy(readStrongBinder5);
                    }
                }
                mo47190f(apga2);
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface6 instanceof apga) {
                        apga2 = (apga) queryLocalInterface6;
                    } else {
                        apga2 = new apfy(readStrongBinder6);
                    }
                }
                mo47180a(apga2, parcel.readString());
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface7 instanceof apga) {
                        apga2 = (apga) queryLocalInterface7;
                    } else {
                        apga2 = new apfy(readStrongBinder7);
                    }
                }
                mo47185a(apga2, parcel.createByteArray(), parcel.readString());
                break;
            case 8:
            case 15:
            case 16:
            case 17:
            default:
                return false;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface8 instanceof apga) {
                        apga2 = (apga) queryLocalInterface8;
                    } else {
                        apga2 = new apfy(readStrongBinder8);
                    }
                }
                mo47187c(apga2);
                break;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface9 instanceof apga) {
                        apga2 = (apga) queryLocalInterface9;
                    } else {
                        apga2 = new apfy(readStrongBinder9);
                    }
                }
                mo47181a(apga2, parcel.readString(), parcel.readInt(), parcel.createByteArray());
                break;
            case 11:
                mo47176a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            case 12:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface10 instanceof apga) {
                        apga2 = (apga) queryLocalInterface10;
                    } else {
                        apga2 = new apfy(readStrongBinder10);
                    }
                }
                mo47186b(apga2);
                break;
            case 13:
                mo47175a();
                break;
            case 14:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface11 instanceof apga) {
                        apga2 = (apga) queryLocalInterface11;
                    } else {
                        apga2 = new apfy(readStrongBinder11);
                    }
                }
                mo47188d(apga2);
                break;
            case 18:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface12 instanceof apga) {
                        apga2 = (apga) queryLocalInterface12;
                    } else {
                        apga2 = new apfy(readStrongBinder12);
                    }
                }
                mo47179a(apga2, parcel.readInt(), parcel.readString());
                break;
            case 19:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface13 instanceof apga) {
                        apga2 = (apga) queryLocalInterface13;
                    } else {
                        apga2 = new apfy(readStrongBinder13);
                    }
                }
                mo47178a(apga2, parcel.readInt());
                break;
            case 20:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if (queryLocalInterface14 instanceof apga) {
                        apga2 = (apga) queryLocalInterface14;
                    } else {
                        apga2 = new apfy(readStrongBinder14);
                    }
                }
                mo47182a(apga2, parcel.readString(), parcel.createByteArray());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
