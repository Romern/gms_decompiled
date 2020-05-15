package p000;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

/* renamed from: axrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axrx extends dck implements axry {
    public axrx() {
        super("com.google.android.gms.wearable.internal.IWearableService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        axrs axrs;
        axrs axrs2;
        axrq axrq;
        axrs axrs3 = null;
        axrs axrs4 = null;
        axrs axrs5 = null;
        axrs axrs6 = null;
        axrs axrs7 = null;
        axrs axrs8 = null;
        axrs axrs9 = null;
        axrs axrs10 = null;
        axrs axrs11 = null;
        axrs axrs12 = null;
        axrs axrs13 = null;
        axrs axrs14 = null;
        axrs axrs15 = null;
        axrq axrq2 = null;
        axrs axrs16 = null;
        axrs axrs17 = null;
        axrp axrp = null;
        axrp axrp2 = null;
        axrs axrs18 = null;
        axrs axrs19 = null;
        axrs axrs20 = null;
        axrs axrs21 = null;
        axrs axrs22 = null;
        axrs axrs23 = null;
        axrs axrs24 = null;
        axrs axrs25 = null;
        axrs axrs26 = null;
        axrs axrs27 = null;
        axrs axrs28 = null;
        axrs axrs29 = null;
        axrs axrs30 = null;
        axrs axrs31 = null;
        axrs axrs32 = null;
        axrs axrs33 = null;
        axrs axrs34 = null;
        axrs axrs35 = null;
        axrs axrs36 = null;
        axrs axrs37 = null;
        axrs axrs38 = null;
        axrs axrs39 = null;
        axrs axrs40 = null;
        axrs axrs41 = null;
        axrs axrs42 = null;
        axrs axrs43 = null;
        axrs axrs44 = null;
        axrs axrs45 = null;
        axrs axrs46 = null;
        axrs axrs47 = null;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface instanceof axrs) {
                        axrs3 = (axrs) queryLocalInterface;
                    } else {
                        axrs3 = new axrq(readStrongBinder);
                    }
                }
                mo53486b(axrs3, (ConnectionConfiguration) dcl.m8163a(parcel, ConnectionConfiguration.CREATOR));
                break;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    axrs47 = queryLocalInterface2 instanceof axrs ? (axrs) queryLocalInterface2 : new axrq(readStrongBinder2);
                }
                mo53507n(axrs47);
                break;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface3 instanceof axrs) {
                        axrs46 = (axrs) queryLocalInterface3;
                    } else {
                        axrs46 = new axrq(readStrongBinder3);
                    }
                }
                mo53508o(axrs46);
                break;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface4 instanceof axrs) {
                        axrs45 = (axrs) queryLocalInterface4;
                    } else {
                        axrs45 = new axrq(readStrongBinder4);
                    }
                }
                mo53509p(axrs45);
                break;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface5 instanceof axrs) {
                        axrs44 = (axrs) queryLocalInterface5;
                    } else {
                        axrs44 = new axrq(readStrongBinder5);
                    }
                }
                mo53470a(axrs44, (PutDataRequest) dcl.m8163a(parcel, PutDataRequest.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface6 instanceof axrs) {
                        axrs43 = (axrs) queryLocalInterface6;
                    } else {
                        axrs43 = new axrq(readStrongBinder6);
                    }
                }
                mo53465a(axrs43, (Uri) dcl.m8163a(parcel, Uri.CREATOR));
                break;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface7 instanceof axrs) {
                        axrs42 = (axrs) queryLocalInterface7;
                    } else {
                        axrs42 = new axrq(readStrongBinder7);
                    }
                }
                mo53481b(axrs42);
                break;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface8 instanceof axrs) {
                        axrs41 = (axrs) queryLocalInterface8;
                    } else {
                        axrs41 = new axrq(readStrongBinder8);
                    }
                }
                mo53483b(axrs41, (Uri) dcl.m8163a(parcel, Uri.CREATOR));
                break;
            case 10:
            case 36:
            case FelicaException.TYPE_RESET_FAILED:
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
            default:
                return false;
            case 11:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface9 instanceof axrs) {
                        axrs40 = (axrs) queryLocalInterface9;
                    } else {
                        axrs40 = new axrq(readStrongBinder9);
                    }
                }
                mo53492c(axrs40, (Uri) dcl.m8163a(parcel, Uri.CREATOR));
                break;
            case 12:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface10 instanceof axrs) {
                        axrs39 = (axrs) queryLocalInterface10;
                    } else {
                        axrs39 = new axrq(readStrongBinder10);
                    }
                }
                mo53479a(axrs39, parcel.readString(), parcel.readString(), parcel.createByteArray());
                break;
            case 13:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface11 instanceof axrs) {
                        axrs38 = (axrs) queryLocalInterface11;
                    } else {
                        axrs38 = new axrq(readStrongBinder11);
                    }
                }
                mo53468a(axrs38, (Asset) dcl.m8163a(parcel, Asset.CREATOR));
                break;
            case 14:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface12 instanceof axrs) {
                        axrs37 = (axrs) queryLocalInterface12;
                    } else {
                        axrs37 = new axrq(readStrongBinder12);
                    }
                }
                mo53490c(axrs37);
                break;
            case 15:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface13 instanceof axrs) {
                        axrs36 = (axrs) queryLocalInterface13;
                    } else {
                        axrs36 = new axrq(readStrongBinder13);
                    }
                }
                mo53494d(axrs36);
                break;
            case 16:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface14 instanceof axrs) {
                        axrs35 = (axrs) queryLocalInterface14;
                    } else {
                        axrs35 = new axrq(readStrongBinder14);
                    }
                }
                mo53471a(axrs35, (AddListenerRequest) dcl.m8163a(parcel, AddListenerRequest.CREATOR));
                break;
            case 17:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface15 instanceof axrs) {
                        axrs34 = (axrs) queryLocalInterface15;
                    } else {
                        axrs34 = new axrq(readStrongBinder15);
                    }
                }
                mo53473a(axrs34, (RemoveListenerRequest) dcl.m8163a(parcel, RemoveListenerRequest.CREATOR));
                break;
            case 18:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface16 instanceof axrs) {
                        axrs33 = (axrs) queryLocalInterface16;
                    } else {
                        axrs33 = new axrq(readStrongBinder16);
                    }
                }
                mo53496e(axrs33);
                break;
            case 19:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface17 instanceof axrs) {
                        axrs32 = (axrs) queryLocalInterface17;
                    } else {
                        axrs32 = new axrq(readStrongBinder17);
                    }
                }
                mo53498f(axrs32);
                break;
            case 20:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface18 instanceof axrs) {
                        axrs31 = (axrs) queryLocalInterface18;
                    } else {
                        axrs31 = new axrq(readStrongBinder18);
                    }
                }
                mo53469a(axrs31, (ConnectionConfiguration) dcl.m8163a(parcel, ConnectionConfiguration.CREATOR));
                break;
            case 21:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface19 instanceof axrs) {
                        axrs30 = (axrs) queryLocalInterface19;
                    } else {
                        axrs30 = new axrq(readStrongBinder19);
                    }
                }
                mo53474a(axrs30, parcel.readString());
                break;
            case 22:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface20 instanceof axrs) {
                        axrs29 = (axrs) queryLocalInterface20;
                    } else {
                        axrs29 = new axrq(readStrongBinder20);
                    }
                }
                mo53462a(axrs29);
                break;
            case 23:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface21 instanceof axrs) {
                        axrs28 = (axrs) queryLocalInterface21;
                    } else {
                        axrs28 = new axrq(readStrongBinder21);
                    }
                }
                mo53487b(axrs28, parcel.readString());
                break;
            case 24:
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface22 instanceof axrs) {
                        axrs27 = (axrs) queryLocalInterface22;
                    } else {
                        axrs27 = new axrq(readStrongBinder22);
                    }
                }
                mo53493c(axrs27, parcel.readString());
                break;
            case 25:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface23 instanceof axrs) {
                        axrs26 = (axrs) queryLocalInterface23;
                    } else {
                        axrs26 = new axrq(readStrongBinder23);
                    }
                }
                mo53500g(axrs26);
                break;
            case 26:
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface24 instanceof axrs) {
                        axrs25 = (axrs) queryLocalInterface24;
                    } else {
                        axrs25 = new axrq(readStrongBinder24);
                    }
                }
                mo53501h(axrs25);
                break;
            case 27:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface25 instanceof axrs) {
                        axrs24 = (axrs) queryLocalInterface25;
                    } else {
                        axrs24 = new axrq(readStrongBinder25);
                    }
                }
                mo53472a(axrs24, (AncsNotificationParcelable) dcl.m8163a(parcel, AncsNotificationParcelable.CREATOR));
                break;
            case 28:
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface26 instanceof axrs) {
                        axrs23 = (axrs) queryLocalInterface26;
                    } else {
                        axrs23 = new axrq(readStrongBinder26);
                    }
                }
                mo53482b(axrs23, parcel.readInt());
                break;
            case 29:
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface27 instanceof axrs) {
                        axrs22 = (axrs) queryLocalInterface27;
                    } else {
                        axrs22 = new axrq(readStrongBinder27);
                    }
                }
                mo53491c(axrs22, parcel.readInt());
                break;
            case 30:
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface28 instanceof axrs) {
                        axrs21 = (axrs) queryLocalInterface28;
                    } else {
                        axrs21 = new axrq(readStrongBinder28);
                    }
                }
                mo53502i(axrs21);
                break;
            case 31:
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface29 instanceof axrs) {
                        axrs20 = (axrs) queryLocalInterface29;
                    } else {
                        axrs20 = new axrq(readStrongBinder29);
                    }
                }
                mo53478a(axrs20, parcel.readString(), parcel.readString());
                break;
            case 32:
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface30 instanceof axrs) {
                        axrs19 = (axrs) queryLocalInterface30;
                    } else {
                        axrs19 = new axrq(readStrongBinder30);
                    }
                }
                mo53499f(axrs19, parcel.readString());
                break;
            case 33:
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface31 instanceof axrs) {
                        axrs18 = (axrs) queryLocalInterface31;
                    } else {
                        axrs18 = new axrq(readStrongBinder31);
                    }
                }
                mo53488b(axrs18, parcel.readString(), parcel.readInt());
                break;
            case 34:
                IBinder readStrongBinder32 = parcel.readStrongBinder();
                if (readStrongBinder32 != null) {
                    IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    axrs = queryLocalInterface32 instanceof axrs ? (axrs) queryLocalInterface32 : new axrq(readStrongBinder32);
                } else {
                    axrs = null;
                }
                IBinder readStrongBinder33 = parcel.readStrongBinder();
                if (readStrongBinder33 != null) {
                    IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    if (queryLocalInterface33 instanceof axrp) {
                        axrp2 = (axrp) queryLocalInterface33;
                    } else {
                        axrp2 = new axrp(readStrongBinder33);
                    }
                }
                mo53467a(axrs, axrp2, parcel.readString());
                break;
            case 35:
                IBinder readStrongBinder34 = parcel.readStrongBinder();
                if (readStrongBinder34 != null) {
                    IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    axrs2 = queryLocalInterface34 instanceof axrs ? (axrs) queryLocalInterface34 : new axrq(readStrongBinder34);
                } else {
                    axrs2 = null;
                }
                IBinder readStrongBinder35 = parcel.readStrongBinder();
                if (readStrongBinder35 != null) {
                    IInterface queryLocalInterface35 = readStrongBinder35.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    if (queryLocalInterface35 instanceof axrp) {
                        axrp = (axrp) queryLocalInterface35;
                    } else {
                        axrp = new axrp(readStrongBinder35);
                    }
                }
                mo53485b(axrs2, axrp, parcel.readString());
                break;
            case FelicaException.TYPE_NOT_CLOSED:
                IBinder readStrongBinder36 = parcel.readStrongBinder();
                if (readStrongBinder36 != null) {
                    IInterface queryLocalInterface36 = readStrongBinder36.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface36 instanceof axrs) {
                        axrs17 = (axrs) queryLocalInterface36;
                    } else {
                        axrs17 = new axrq(readStrongBinder36);
                    }
                }
                mo53503j(axrs17);
                break;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                IBinder readStrongBinder37 = parcel.readStrongBinder();
                if (readStrongBinder37 != null) {
                    IInterface queryLocalInterface37 = readStrongBinder37.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface37 instanceof axrs) {
                        axrs16 = (axrs) queryLocalInterface37;
                    } else {
                        axrs16 = new axrq(readStrongBinder37);
                    }
                }
                mo53476a(axrs16, parcel.readString(), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
                break;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                IBinder readStrongBinder38 = parcel.readStrongBinder();
                if (readStrongBinder38 != null) {
                    IInterface queryLocalInterface38 = readStrongBinder38.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface38 instanceof axrs) {
                        axrq = (axrs) queryLocalInterface38;
                        mo53477a(axrq, parcel.readString(), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR), parcel.readLong(), parcel.readLong());
                        break;
                    } else {
                        axrq2 = new axrq(readStrongBinder38);
                    }
                }
                axrq = axrq2;
                mo53477a(axrq, parcel.readString(), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR), parcel.readLong(), parcel.readLong());
            case FelicaException.TYPE_PUSH_FAILED:
                IBinder readStrongBinder39 = parcel.readStrongBinder();
                if (readStrongBinder39 != null) {
                    IInterface queryLocalInterface39 = readStrongBinder39.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface39 instanceof axrs) {
                        axrs15 = (axrs) queryLocalInterface39;
                    } else {
                        axrs15 = new axrq(readStrongBinder39);
                    }
                }
                mo53466a(axrs15, (Uri) dcl.m8163a(parcel, Uri.CREATOR), parcel.readInt());
                break;
            case 41:
                IBinder readStrongBinder40 = parcel.readStrongBinder();
                if (readStrongBinder40 != null) {
                    IInterface queryLocalInterface40 = readStrongBinder40.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface40 instanceof axrs) {
                        axrs14 = (axrs) queryLocalInterface40;
                    } else {
                        axrs14 = new axrq(readStrongBinder40);
                    }
                }
                mo53484b(axrs14, (Uri) dcl.m8163a(parcel, Uri.CREATOR), parcel.readInt());
                break;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                IBinder readStrongBinder41 = parcel.readStrongBinder();
                if (readStrongBinder41 != null) {
                    IInterface queryLocalInterface41 = readStrongBinder41.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface41 instanceof axrs) {
                        axrs13 = (axrs) queryLocalInterface41;
                    } else {
                        axrs13 = new axrq(readStrongBinder41);
                    }
                }
                mo53475a(axrs13, parcel.readString(), parcel.readInt());
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                IBinder readStrongBinder42 = parcel.readStrongBinder();
                if (readStrongBinder42 != null) {
                    IInterface queryLocalInterface42 = readStrongBinder42.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface42 instanceof axrs) {
                        axrs12 = (axrs) queryLocalInterface42;
                    } else {
                        axrs12 = new axrq(readStrongBinder42);
                    }
                }
                mo53464a(axrs12, parcel.readInt());
                break;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                IBinder readStrongBinder43 = parcel.readStrongBinder();
                if (readStrongBinder43 != null) {
                    IInterface queryLocalInterface43 = readStrongBinder43.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface43 instanceof axrs) {
                        axrs11 = (axrs) queryLocalInterface43;
                    } else {
                        axrs11 = new axrq(readStrongBinder43);
                    }
                }
                mo53495d(axrs11, parcel.readString());
                break;
            case 47:
                IBinder readStrongBinder44 = parcel.readStrongBinder();
                if (readStrongBinder44 != null) {
                    IInterface queryLocalInterface44 = readStrongBinder44.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface44 instanceof axrs) {
                        axrs10 = (axrs) queryLocalInterface44;
                    } else {
                        axrs10 = new axrq(readStrongBinder44);
                    }
                }
                mo53497e(axrs10, parcel.readString());
                break;
            case 48:
                IBinder readStrongBinder45 = parcel.readStrongBinder();
                if (readStrongBinder45 != null) {
                    IInterface queryLocalInterface45 = readStrongBinder45.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface45 instanceof axrs) {
                        axrs9 = (axrs) queryLocalInterface45;
                    } else {
                        axrs9 = new axrq(readStrongBinder45);
                    }
                }
                mo53480a(axrs9, dcl.m8167a(parcel));
                break;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                IBinder readStrongBinder46 = parcel.readStrongBinder();
                if (readStrongBinder46 != null) {
                    IInterface queryLocalInterface46 = readStrongBinder46.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface46 instanceof axrs) {
                        axrs8 = (axrs) queryLocalInterface46;
                    } else {
                        axrs8 = new axrq(readStrongBinder46);
                    }
                }
                mo53504k(axrs8);
                break;
            case 50:
                IBinder readStrongBinder47 = parcel.readStrongBinder();
                if (readStrongBinder47 != null) {
                    IInterface queryLocalInterface47 = readStrongBinder47.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface47 instanceof axrs) {
                        axrs7 = (axrs) queryLocalInterface47;
                    } else {
                        axrs7 = new axrq(readStrongBinder47);
                    }
                }
                mo53489b(axrs7, dcl.m8167a(parcel));
                break;
            case 51:
                IBinder readStrongBinder48 = parcel.readStrongBinder();
                if (readStrongBinder48 != null) {
                    IInterface queryLocalInterface48 = readStrongBinder48.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface48 instanceof axrs) {
                        axrs6 = (axrs) queryLocalInterface48;
                    } else {
                        axrs6 = new axrq(readStrongBinder48);
                    }
                }
                mo53505l(axrs6);
                break;
            case 52:
                IBinder readStrongBinder49 = parcel.readStrongBinder();
                if (readStrongBinder49 != null) {
                    IInterface queryLocalInterface49 = readStrongBinder49.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface49 instanceof axrs) {
                        axrs5 = (axrs) queryLocalInterface49;
                    } else {
                        axrs5 = new axrq(readStrongBinder49);
                    }
                }
                mo53506m(axrs5);
                break;
            case 53:
                IBinder readStrongBinder50 = parcel.readStrongBinder();
                if (readStrongBinder50 != null) {
                    IInterface queryLocalInterface50 = readStrongBinder50.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if (queryLocalInterface50 instanceof axrs) {
                        axrs4 = (axrs) queryLocalInterface50;
                    } else {
                        axrs4 = new axrq(readStrongBinder50);
                    }
                }
                mo53463a(axrs4, parcel.readByte());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
