package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;

/* renamed from: avdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avdn extends dck implements avdo {
    public avdn() {
        super("com.google.android.gms.udc.internal.IUdcService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        avdl avdl = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface instanceof avdl) {
                        avdl = (avdl) queryLocalInterface;
                    } else {
                        avdl = new avdj(readStrongBinder);
                    }
                }
                mo51169a(avdl, parcel.createByteArray());
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    avdl = queryLocalInterface2 instanceof avdl ? (avdl) queryLocalInterface2 : new avdj(readStrongBinder2);
                }
                mo51171b(avdl, parcel.createByteArray());
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface3 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface3;
                    } else {
                        avdl = new avdj(readStrongBinder3);
                    }
                }
                mo51173c(avdl, parcel.createByteArray());
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface4 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface4;
                    } else {
                        avdl = new avdj(readStrongBinder4);
                    }
                }
                mo51174d(avdl, parcel.createByteArray());
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface5 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface5;
                    } else {
                        avdl = new avdj(readStrongBinder5);
                    }
                }
                mo51175e(avdl, parcel.createByteArray());
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface6 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface6;
                    } else {
                        avdl = new avdj(readStrongBinder6);
                    }
                }
                mo51165a(avdl);
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface7 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface7;
                    } else {
                        avdl = new avdj(readStrongBinder7);
                    }
                }
                mo51176f(avdl, parcel.createByteArray());
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface8 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface8;
                    } else {
                        avdl = new avdj(readStrongBinder8);
                    }
                }
                mo51166a(avdl, (UdcCacheRequest) dcl.m8163a(parcel, UdcCacheRequest.CREATOR));
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface9 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface9;
                    } else {
                        avdl = new avdj(readStrongBinder9);
                    }
                }
                mo51167a(avdl, (UdcSettingsListActivityRequest) dcl.m8163a(parcel, UdcSettingsListActivityRequest.CREATOR));
                break;
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface10 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface10;
                    } else {
                        avdl = new avdj(readStrongBinder10);
                    }
                }
                mo51168a(avdl, (UdcWriteLocalSettingsRequest) dcl.m8163a(parcel, UdcWriteLocalSettingsRequest.CREATOR));
                break;
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface11 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface11;
                    } else {
                        avdl = new avdj(readStrongBinder11);
                    }
                }
                mo51170b(avdl);
                break;
            case 12:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    if (queryLocalInterface12 instanceof avdl) {
                        avdl = (avdl) queryLocalInterface12;
                    } else {
                        avdl = new avdj(readStrongBinder12);
                    }
                }
                mo51172c(avdl);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
