package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class arjh extends dck implements arji {
    public arjh() {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        arjf arjf;
        arjf arjf2;
        arjf arjf3;
        arjf arjf4;
        arjc arjc = null;
        arij arij = null;
        arjf arjf5 = null;
        arjf arjf6 = null;
        artk artk = null;
        arjf arjf7 = null;
        artk artk2 = null;
        artk artk3 = null;
        artk artk4 = null;
        arjf arjf8 = null;
        arik arik = null;
        arjf arjf9 = null;
        arjf arjf10 = null;
        arjc arjc2 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    arjf = queryLocalInterface instanceof arjf ? (arjf) queryLocalInterface : new arjd(readStrongBinder);
                } else {
                    arjf = null;
                }
                BootstrapOptions bootstrapOptions = (BootstrapOptions) dcl.m8163a(parcel, BootstrapOptions.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
                    if (queryLocalInterface2 instanceof arjc) {
                        arjc = (arjc) queryLocalInterface2;
                    } else {
                        arjc = new arja(readStrongBinder2);
                    }
                }
                mo48495a(arjf, bootstrapOptions, arjc);
                return true;
            case 2:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    arjf2 = queryLocalInterface3 instanceof arjf ? (arjf) queryLocalInterface3 : new arjd(readStrongBinder3);
                } else {
                    arjf2 = null;
                }
                BootstrapOptions bootstrapOptions2 = (BootstrapOptions) dcl.m8163a(parcel, BootstrapOptions.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
                    if (queryLocalInterface4 instanceof arjc) {
                        arjc2 = (arjc) queryLocalInterface4;
                    } else {
                        arjc2 = new arja(readStrongBinder4);
                    }
                }
                mo48494a(arjf2, arjc2);
                return true;
            case 3:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    if (queryLocalInterface5 instanceof arjf) {
                        arjf10 = (arjf) queryLocalInterface5;
                    } else {
                        arjf10 = new arjd(readStrongBinder5);
                    }
                }
                mo48493a(arjf10);
                return true;
            case 4:
                String a = mo48492a((BootstrapOptions) dcl.m8163a(parcel, BootstrapOptions.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    if (queryLocalInterface6 instanceof arjf) {
                        arjf9 = (arjf) queryLocalInterface6;
                    } else {
                        arjf9 = new arjd(readStrongBinder6);
                    }
                }
                mo48501b(arjf9);
                return true;
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            default:
                return false;
            case 10:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    arjf3 = queryLocalInterface7 instanceof arjf ? (arjf) queryLocalInterface7 : new arjd(readStrongBinder7);
                } else {
                    arjf3 = null;
                }
                BootstrapOptions bootstrapOptions3 = (BootstrapOptions) dcl.m8163a(parcel, BootstrapOptions.CREATOR);
                ParcelFileDescriptor[] parcelFileDescriptorArr = (ParcelFileDescriptor[]) parcel.createTypedArray(ParcelFileDescriptor.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
                    if (queryLocalInterface8 instanceof arik) {
                        arik = (arik) queryLocalInterface8;
                    } else {
                        arik = new arif(readStrongBinder8);
                    }
                }
                mo48497a(arjf3, bootstrapOptions3, parcelFileDescriptorArr, arik);
                return true;
            case 11:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    if (queryLocalInterface9 instanceof arjf) {
                        arjf8 = (arjf) queryLocalInterface9;
                    } else {
                        arjf8 = new arjd(readStrongBinder9);
                    }
                }
                mo48506d(arjf8);
                return true;
            case 13:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface10 instanceof artk) {
                        artk4 = (artk) queryLocalInterface10;
                    } else {
                        artk4 = new arti(readStrongBinder10);
                    }
                }
                mo48498a(artk4);
                return true;
            case 14:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface11 instanceof artk) {
                        artk3 = (artk) queryLocalInterface11;
                    } else {
                        artk3 = new arti(readStrongBinder11);
                    }
                }
                mo48502b(artk3);
                return true;
            case 15:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface12 instanceof artk) {
                        artk2 = (artk) queryLocalInterface12;
                    } else {
                        artk2 = new arti(readStrongBinder12);
                    }
                }
                mo48499a(artk2, (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
                return true;
            case 16:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    if (queryLocalInterface13 instanceof arjf) {
                        arjf7 = (arjf) queryLocalInterface13;
                    } else {
                        arjf7 = new arjd(readStrongBinder13);
                    }
                }
                mo48507e(arjf7);
                return true;
            case 17:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                    if (queryLocalInterface14 instanceof artk) {
                        artk = (artk) queryLocalInterface14;
                    } else {
                        artk = new arti(readStrongBinder14);
                    }
                }
                mo48503b(artk, (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
                return true;
            case 18:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    if (queryLocalInterface15 instanceof arjf) {
                        arjf6 = (arjf) queryLocalInterface15;
                    } else {
                        arjf6 = new arjd(readStrongBinder15);
                    }
                }
                mo48508f(arjf6);
                return true;
            case 19:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    if (queryLocalInterface16 instanceof arjf) {
                        arjf5 = (arjf) queryLocalInterface16;
                    } else {
                        arjf5 = new arjd(readStrongBinder16);
                    }
                }
                mo48505c(arjf5);
                return true;
            case 20:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
                    arjf4 = queryLocalInterface17 instanceof arjf ? (arjf) queryLocalInterface17 : new arjd(readStrongBinder17);
                } else {
                    arjf4 = null;
                }
                BootstrapOptions bootstrapOptions4 = (BootstrapOptions) dcl.m8163a(parcel, BootstrapOptions.CREATOR);
                ParcelFileDescriptor[] parcelFileDescriptorArr2 = (ParcelFileDescriptor[]) parcel.createTypedArray(ParcelFileDescriptor.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2");
                    if (queryLocalInterface18 instanceof arij) {
                        arij = (arij) queryLocalInterface18;
                    } else {
                        arij = new arih(readStrongBinder18);
                    }
                }
                mo48496a(arjf4, bootstrapOptions4, parcelFileDescriptorArr2, arij);
                return true;
        }
    }
}
