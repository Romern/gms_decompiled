package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: ariv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ariv extends dck implements ariw {
    public ariv() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        arit arit;
        arit arit2;
        arit arit3;
        arit arit4;
        arit arit5;
        arit arit6 = null;
        arij arij = null;
        artk artk = null;
        artk artk2 = null;
        artk artk3 = null;
        arit arit7 = null;
        arik arik = null;
        arit arit8 = null;
        arit arit9 = null;
        arit arit10 = null;
        arit arit11 = null;
        arit arit12 = null;
        arin arin = null;
        ariq ariq = null;
        arit arit13 = null;
        ariz ariz = null;
        if (i != 16) {
            switch (i) {
                case 1:
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        arit = queryLocalInterface instanceof arit ? (arit) queryLocalInterface : new arir(readStrongBinder);
                    } else {
                        arit = null;
                    }
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
                        if (queryLocalInterface2 instanceof ariz) {
                            ariz = (ariz) queryLocalInterface2;
                        } else {
                            ariz = new arix(readStrongBinder2);
                        }
                    }
                    mo48405a(arit, ariz);
                    return true;
                case 2:
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        arit13 = queryLocalInterface3 instanceof arit ? (arit) queryLocalInterface3 : new arir(readStrongBinder3);
                    }
                    mo48403a(arit13);
                    return true;
                case 3:
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        arit2 = queryLocalInterface4 instanceof arit ? (arit) queryLocalInterface4 : new arir(readStrongBinder4);
                    } else {
                        arit2 = null;
                    }
                    D2DDevice d2DDevice = (D2DDevice) dcl.m8163a(parcel, D2DDevice.CREATOR);
                    String readString = parcel.readString();
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
                        if (queryLocalInterface5 instanceof ariq) {
                            ariq = (ariq) queryLocalInterface5;
                        } else {
                            ariq = new ario(readStrongBinder5);
                        }
                    }
                    mo48410a(arit2, d2DDevice, readString, ariq);
                    return true;
                case 4:
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        arit3 = queryLocalInterface6 instanceof arit ? (arit) queryLocalInterface6 : new arir(readStrongBinder6);
                    } else {
                        arit3 = null;
                    }
                    D2DDevice d2DDevice2 = (D2DDevice) dcl.m8163a(parcel, D2DDevice.CREATOR);
                    BootstrapConfigurations bootstrapConfigurations = (BootstrapConfigurations) dcl.m8163a(parcel, BootstrapConfigurations.CREATOR);
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
                        if (queryLocalInterface7 instanceof arin) {
                            arin = (arin) queryLocalInterface7;
                        } else {
                            arin = new aril(readStrongBinder7);
                        }
                    }
                    mo48409a(arit3, d2DDevice2, bootstrapConfigurations, arin);
                    return true;
                case 5:
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        if (queryLocalInterface8 instanceof arit) {
                            arit12 = (arit) queryLocalInterface8;
                        } else {
                            arit12 = new arir(readStrongBinder8);
                        }
                    }
                    mo48411a(arit12, parcel.readString());
                    return true;
                case 6:
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        if (queryLocalInterface9 instanceof arit) {
                            arit11 = (arit) queryLocalInterface9;
                        } else {
                            arit11 = new arir(readStrongBinder9);
                        }
                    }
                    mo48416b(arit11);
                    return true;
                case 7:
                    IBinder readStrongBinder10 = parcel.readStrongBinder();
                    if (readStrongBinder10 != null) {
                        IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        if (queryLocalInterface10 instanceof arit) {
                            arit10 = (arit) queryLocalInterface10;
                        } else {
                            arit10 = new arir(readStrongBinder10);
                        }
                    }
                    mo48404a(arit10, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    IBinder readStrongBinder11 = parcel.readStrongBinder();
                    if (readStrongBinder11 != null) {
                        IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        if (queryLocalInterface11 instanceof arit) {
                            arit9 = (arit) queryLocalInterface11;
                        } else {
                            arit9 = new arir(readStrongBinder11);
                        }
                    }
                    mo48406a(arit9, (BootstrapConfigurations) dcl.m8163a(parcel, BootstrapConfigurations.CREATOR));
                    return true;
                case 9:
                    IBinder readStrongBinder12 = parcel.readStrongBinder();
                    if (readStrongBinder12 != null) {
                        IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        if (queryLocalInterface12 instanceof arit) {
                            arit8 = (arit) queryLocalInterface12;
                        } else {
                            arit8 = new arir(readStrongBinder12);
                        }
                    }
                    mo48420c(arit8);
                    return true;
                case 10:
                    IBinder readStrongBinder13 = parcel.readStrongBinder();
                    if (readStrongBinder13 != null) {
                        IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        arit4 = queryLocalInterface13 instanceof arit ? (arit) queryLocalInterface13 : new arir(readStrongBinder13);
                    } else {
                        arit4 = null;
                    }
                    BootstrapConfigurations bootstrapConfigurations2 = (BootstrapConfigurations) dcl.m8163a(parcel, BootstrapConfigurations.CREATOR);
                    ParcelFileDescriptor[] parcelFileDescriptorArr = (ParcelFileDescriptor[]) parcel.createTypedArray(ParcelFileDescriptor.CREATOR);
                    IBinder readStrongBinder14 = parcel.readStrongBinder();
                    if (readStrongBinder14 != null) {
                        IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
                        if (queryLocalInterface14 instanceof arik) {
                            arik = (arik) queryLocalInterface14;
                        } else {
                            arik = new arif(readStrongBinder14);
                        }
                    }
                    mo48408a(arit4, bootstrapConfigurations2, parcelFileDescriptorArr, arik);
                    return true;
                case 11:
                    IBinder readStrongBinder15 = parcel.readStrongBinder();
                    if (readStrongBinder15 != null) {
                        IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                        if (queryLocalInterface15 instanceof arit) {
                            arit7 = (arit) queryLocalInterface15;
                        } else {
                            arit7 = new arir(readStrongBinder15);
                        }
                    }
                    mo48421d(arit7);
                    return true;
                default:
                    switch (i) {
                        case 19:
                            IBinder readStrongBinder16 = parcel.readStrongBinder();
                            if (readStrongBinder16 != null) {
                                IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                                if (queryLocalInterface16 instanceof artk) {
                                    artk3 = (artk) queryLocalInterface16;
                                } else {
                                    artk3 = new arti(readStrongBinder16);
                                }
                            }
                            mo48412a(artk3);
                            return true;
                        case 20:
                            IBinder readStrongBinder17 = parcel.readStrongBinder();
                            if (readStrongBinder17 != null) {
                                IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                                if (queryLocalInterface17 instanceof artk) {
                                    artk2 = (artk) queryLocalInterface17;
                                } else {
                                    artk2 = new arti(readStrongBinder17);
                                }
                            }
                            mo48413a(artk2, (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
                            return true;
                        case 21:
                            IBinder readStrongBinder18 = parcel.readStrongBinder();
                            if (readStrongBinder18 != null) {
                                IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
                                if (queryLocalInterface18 instanceof artk) {
                                    artk = (artk) queryLocalInterface18;
                                } else {
                                    artk = new arti(readStrongBinder18);
                                }
                            }
                            mo48418b(artk, (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
                            return true;
                        case 22:
                            mo48414a((ConnectParams) dcl.m8163a(parcel, ConnectParams.CREATOR));
                            return true;
                        case 23:
                            IBinder readStrongBinder19 = parcel.readStrongBinder();
                            if (readStrongBinder19 != null) {
                                IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                                arit5 = queryLocalInterface19 instanceof arit ? (arit) queryLocalInterface19 : new arir(readStrongBinder19);
                            } else {
                                arit5 = null;
                            }
                            BootstrapConfigurations bootstrapConfigurations3 = (BootstrapConfigurations) dcl.m8163a(parcel, BootstrapConfigurations.CREATOR);
                            ParcelFileDescriptor[] parcelFileDescriptorArr2 = (ParcelFileDescriptor[]) parcel.createTypedArray(ParcelFileDescriptor.CREATOR);
                            IBinder readStrongBinder20 = parcel.readStrongBinder();
                            if (readStrongBinder20 != null) {
                                IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2");
                                if (queryLocalInterface20 instanceof arij) {
                                    arij = (arij) queryLocalInterface20;
                                } else {
                                    arij = new arih(readStrongBinder20);
                                }
                            }
                            mo48407a(arit5, bootstrapConfigurations3, parcelFileDescriptorArr2, arij);
                            return true;
                        default:
                            return false;
                    }
            }
        } else {
            IBinder readStrongBinder21 = parcel.readStrongBinder();
            if (readStrongBinder21 != null) {
                IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
                if (queryLocalInterface21 instanceof arit) {
                    arit6 = (arit) queryLocalInterface21;
                } else {
                    arit6 = new arir(readStrongBinder21);
                }
            }
            mo48417b(arit6, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
