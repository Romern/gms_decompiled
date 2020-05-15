package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest;
import com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest;
import com.google.android.gms.drive.realtime.internal.ParcelableIndexReference;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

/* renamed from: vjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vjt extends dck implements vju {
    public vjt() {
        super("com.google.android.gms.drive.realtime.internal.IRealtimeService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vjp vjp;
        vjv vjv = null;
        vjw vjw = null;
        vjw vjw2 = null;
        vjw vjw3 = null;
        vjw vjw4 = null;
        vjv vjv2 = null;
        vji vji = null;
        vjp vjp2 = null;
        vjl vjl = null;
        vjp vjp3 = null;
        vjr vjr = null;
        vjw vjw5 = null;
        vjw vjw6 = null;
        vjp vjp4 = null;
        vjn vjn = null;
        vjw vjw7 = null;
        vjo vjo = null;
        vji vji2 = null;
        vjj vjj = null;
        vjk vjk = null;
        vjp vjp5 = null;
        vjr vjr2 = null;
        vjw vjw8 = null;
        vjq vjq = null;
        vjv vjv3 = null;
        vji vji3 = null;
        vji vji4 = null;
        vjp vjp6 = null;
        vjp vjp7 = null;
        vjm vjm = null;
        vjl vjl2 = null;
        vjw vjw9 = null;
        vjw vjw10 = null;
        vjm vjm2 = null;
        vjm vjm3 = null;
        vjp vjp8 = null;
        vjr vjr3 = null;
        vjl vjl3 = null;
        vjp vjp9 = null;
        vjp vjp10 = null;
        vjp vjp11 = null;
        vjv vjv4 = null;
        vjr vjr4 = null;
        vjp vjp12 = null;
        vjp vjp13 = null;
        vjr vjr5 = null;
        vjl vjl4 = null;
        vjw vjw11 = null;
        vji vji5 = null;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    if (queryLocalInterface instanceof vjv) {
                        vjv = (vjv) queryLocalInterface;
                    } else {
                        vjv = new vjv(readStrongBinder);
                    }
                }
                mo27196a(readString, vjv);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    vji5 = queryLocalInterface2 instanceof vji ? (vji) queryLocalInterface2 : new vji(readStrongBinder2);
                }
                mo27198a(vji5);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface3 instanceof vjw) {
                        vjw11 = (vjw) queryLocalInterface3;
                    } else {
                        vjw11 = new vjw(readStrongBinder3);
                    }
                }
                mo27205a(vjw11);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (queryLocalInterface4 instanceof vjl) {
                        vjl4 = (vjl) queryLocalInterface4;
                    } else {
                        vjl4 = new vjl(readStrongBinder4);
                    }
                }
                mo27189a(readString2, readString3, vjl4);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString4 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    if (queryLocalInterface5 instanceof vjr) {
                        vjr5 = (vjr) queryLocalInterface5;
                    } else {
                        vjr5 = new vjr(readStrongBinder5);
                    }
                }
                mo27195a(readString4, vjr5);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString5 = parcel.readString();
                DataHolder dataHolder = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface6 instanceof vjp) {
                        vjp13 = (vjp) queryLocalInterface6;
                    } else {
                        vjp13 = new vjp(readStrongBinder6);
                    }
                }
                mo27187a(readString5, dataHolder, vjp13);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString6 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface7 instanceof vjp) {
                        vjp12 = (vjp) queryLocalInterface7;
                    } else {
                        vjp12 = new vjp(readStrongBinder7);
                    }
                }
                mo27193a(readString6, vjp12);
                parcel2.writeNoException();
                return true;
            case 8:
                String readString7 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    if (queryLocalInterface8 instanceof vjr) {
                        vjr4 = (vjr) queryLocalInterface8;
                    } else {
                        vjr4 = new vjr(readStrongBinder8);
                    }
                }
                mo27209b(readString7, vjr4);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString8 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    if (queryLocalInterface9 instanceof vjv) {
                        vjv4 = (vjv) queryLocalInterface9;
                    } else {
                        vjv4 = new vjv(readStrongBinder9);
                    }
                }
                mo27210b(readString8, vjv4);
                parcel2.writeNoException();
                return true;
            case 10:
                String readString9 = parcel.readString();
                int readInt = parcel.readInt();
                String readString10 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface10 instanceof vjp) {
                        vjp11 = (vjp) queryLocalInterface10;
                    } else {
                        vjp11 = new vjp(readStrongBinder10);
                    }
                }
                mo27184a(readString9, readInt, readString10, vjp11);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString11 = parcel.readString();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface11 instanceof vjp) {
                        vjp10 = (vjp) queryLocalInterface11;
                    } else {
                        vjp10 = new vjp(readStrongBinder11);
                    }
                }
                mo27180a(readString11, readInt2, readInt3, vjp10);
                parcel2.writeNoException();
                return true;
            case 12:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface12 instanceof vjp) {
                        vjp9 = (vjp) queryLocalInterface12;
                    } else {
                        vjp9 = new vjp(readStrongBinder12);
                    }
                }
                mo27191a(readString12, readString13, vjp9);
                parcel2.writeNoException();
                return true;
            case 13:
                String readString14 = parcel.readString();
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (queryLocalInterface13 instanceof vjl) {
                        vjl3 = (vjl) queryLocalInterface13;
                    } else {
                        vjl3 = new vjl(readStrongBinder13);
                    }
                }
                mo27208b(readString14, vjl3);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString15 = parcel.readString();
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    if (queryLocalInterface14 instanceof vjr) {
                        vjr3 = (vjr) queryLocalInterface14;
                    } else {
                        vjr3 = new vjr(readStrongBinder14);
                    }
                }
                mo27216c(readString15, vjr3);
                parcel2.writeNoException();
                return true;
            case 15:
                String readString16 = parcel.readString();
                int readInt4 = parcel.readInt();
                DataHolder dataHolder2 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface15 instanceof vjp) {
                        vjp8 = (vjp) queryLocalInterface15;
                    } else {
                        vjp8 = new vjp(readStrongBinder15);
                    }
                }
                mo27182a(readString16, readInt4, dataHolder2, vjp8);
                parcel2.writeNoException();
                return true;
            case 16:
                String readString17 = parcel.readString();
                int readInt5 = parcel.readInt();
                DataHolder dataHolder3 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
                    if (queryLocalInterface16 instanceof vjm) {
                        vjm3 = (vjm) queryLocalInterface16;
                    } else {
                        vjm3 = new vjm(readStrongBinder16);
                    }
                }
                mo27181a(readString17, readInt5, dataHolder3, vjm3);
                parcel2.writeNoException();
                return true;
            case 17:
                String readString18 = parcel.readString();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
                    if (queryLocalInterface17 instanceof vjm) {
                        vjm2 = (vjm) queryLocalInterface17;
                    } else {
                        vjm2 = new vjm(readStrongBinder17);
                    }
                }
                mo27179a(readString18, readInt6, readInt7, vjm2);
                parcel2.writeNoException();
                return true;
            case 18:
                BeginCompoundOperationRequest beginCompoundOperationRequest = (BeginCompoundOperationRequest) dcl.m8163a(parcel, BeginCompoundOperationRequest.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface18 instanceof vjw) {
                        vjw10 = (vjw) queryLocalInterface18;
                    } else {
                        vjw10 = new vjw(readStrongBinder18);
                    }
                }
                mo27177a(beginCompoundOperationRequest, vjw10);
                parcel2.writeNoException();
                return true;
            case 19:
                EndCompoundOperationRequest endCompoundOperationRequest = (EndCompoundOperationRequest) dcl.m8163a(parcel, EndCompoundOperationRequest.CREATOR);
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface19 instanceof vjw) {
                        vjw9 = (vjw) queryLocalInterface19;
                    } else {
                        vjw9 = new vjw(readStrongBinder19);
                    }
                }
                mo27222d(vjw9);
                parcel2.writeNoException();
                return true;
            case 20:
                String readString19 = parcel.readString();
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (queryLocalInterface20 instanceof vjl) {
                        vjl2 = (vjl) queryLocalInterface20;
                    } else {
                        vjl2 = new vjl(readStrongBinder20);
                    }
                }
                mo27192a(readString19, vjl2);
                parcel2.writeNoException();
                return true;
            case 21:
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
                    if (queryLocalInterface21 instanceof vjm) {
                        vjm = (vjm) queryLocalInterface21;
                    } else {
                        vjm = new vjm(readStrongBinder21);
                    }
                }
                mo27190a(readString20, readString21, vjm);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface22 instanceof vjp) {
                        vjp7 = (vjp) queryLocalInterface22;
                    } else {
                        vjp7 = new vjp(readStrongBinder22);
                    }
                }
                mo27203a(vjp7);
                parcel2.writeNoException();
                return true;
            case 23:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface23 instanceof vjp) {
                        vjp6 = (vjp) queryLocalInterface23;
                    } else {
                        vjp6 = new vjp(readStrongBinder23);
                    }
                }
                mo27212b(vjp6);
                parcel2.writeNoException();
                return true;
            case 24:
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    if (queryLocalInterface24 instanceof vji) {
                        vji4 = (vji) queryLocalInterface24;
                    } else {
                        vji4 = new vji(readStrongBinder24);
                    }
                }
                mo27211b(vji4);
                parcel2.writeNoException();
                return true;
            case 25:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    if (queryLocalInterface25 instanceof vji) {
                        vji3 = (vji) queryLocalInterface25;
                    } else {
                        vji3 = new vji(readStrongBinder25);
                    }
                }
                mo27217c(vji3);
                parcel2.writeNoException();
                return true;
            case 26:
                ParcelableIndexReference parcelableIndexReference = (ParcelableIndexReference) dcl.m8163a(parcel, ParcelableIndexReference.CREATOR);
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    if (queryLocalInterface26 instanceof vjv) {
                        vjv3 = (vjv) queryLocalInterface26;
                    } else {
                        vjv3 = new vjv(readStrongBinder26);
                    }
                }
                mo27178a(parcelableIndexReference, vjv3);
                parcel2.writeNoException();
                return true;
            case 27:
                String readString22 = parcel.readString();
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (queryLocalInterface27 instanceof vjq) {
                        vjq = (vjq) queryLocalInterface27;
                    } else {
                        vjq = new vjq(readStrongBinder27);
                    }
                }
                mo27194a(readString22, vjq);
                parcel2.writeNoException();
                return true;
            case 28:
                String readString23 = parcel.readString();
                int readInt8 = parcel.readInt();
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface28 instanceof vjw) {
                        vjw8 = (vjw) queryLocalInterface28;
                    } else {
                        vjw8 = new vjw(readStrongBinder28);
                    }
                }
                mo27186a(readString23, readInt8, vjw8);
                parcel2.writeNoException();
                return true;
            case 29:
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    if (queryLocalInterface29 instanceof vjr) {
                        vjr2 = (vjr) queryLocalInterface29;
                    } else {
                        vjr2 = new vjr(readStrongBinder29);
                    }
                }
                mo27213b(vjr2);
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.readInt();
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface30 instanceof vjp) {
                        vjp5 = (vjp) queryLocalInterface30;
                    } else {
                        vjp5 = new vjp(readStrongBinder30);
                    }
                }
                mo27218c(vjp5);
                parcel2.writeNoException();
                return true;
            case 31:
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                    if (queryLocalInterface31 instanceof vjk) {
                        vjk = (vjk) queryLocalInterface31;
                    } else {
                        vjk = new vjk(readStrongBinder31);
                    }
                }
                mo27200a(vjk);
                parcel2.writeNoException();
                return true;
            case 32:
                IBinder readStrongBinder32 = parcel.readStrongBinder();
                if (readStrongBinder32 != null) {
                    IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if (queryLocalInterface32 instanceof vjj) {
                        vjj = (vjj) queryLocalInterface32;
                    } else {
                        vjj = new vjj(readStrongBinder32);
                    }
                }
                mo27199a(vjj);
                parcel2.writeNoException();
                return true;
            case 33:
                IBinder readStrongBinder33 = parcel.readStrongBinder();
                if (readStrongBinder33 != null) {
                    IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    if (queryLocalInterface33 instanceof vji) {
                        vji2 = (vji) queryLocalInterface33;
                    } else {
                        vji2 = new vji(readStrongBinder33);
                    }
                }
                mo27220d(vji2);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder34 = parcel.readStrongBinder();
                if (readStrongBinder34 != null) {
                    IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                    if (queryLocalInterface34 instanceof vjo) {
                        vjo = (vjo) queryLocalInterface34;
                    } else {
                        vjo = new vjo(readStrongBinder34);
                    }
                }
                mo27202a(vjo);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder35 = parcel.readStrongBinder();
                if (readStrongBinder35 != null) {
                    IInterface queryLocalInterface35 = readStrongBinder35.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface35 instanceof vjw) {
                        vjw7 = (vjw) queryLocalInterface35;
                    } else {
                        vjw7 = new vjw(readStrongBinder35);
                    }
                }
                mo27214b(vjw7);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder36 = parcel.readStrongBinder();
                if (readStrongBinder36 != null) {
                    IInterface queryLocalInterface36 = readStrongBinder36.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    if (queryLocalInterface36 instanceof vjn) {
                        vjn = (vjn) queryLocalInterface36;
                    } else {
                        vjn = new vjn(readStrongBinder36);
                    }
                }
                mo27201a(vjn);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_NOT_CLOSED:
                String readString24 = parcel.readString();
                int readInt9 = parcel.readInt();
                String readString25 = parcel.readString();
                int readInt10 = parcel.readInt();
                IBinder readStrongBinder37 = parcel.readStrongBinder();
                if (readStrongBinder37 != null) {
                    IInterface queryLocalInterface37 = readStrongBinder37.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface37 instanceof vjp) {
                        vjp = (vjp) queryLocalInterface37;
                        mo27183a(readString24, readInt9, readString25, readInt10, vjp);
                        parcel2.writeNoException();
                        return true;
                    }
                    vjp4 = new vjp(readStrongBinder37);
                }
                vjp = vjp4;
                mo27183a(readString24, readInt9, readString25, readInt10, vjp);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                String readString26 = parcel.readString();
                IBinder readStrongBinder38 = parcel.readStrongBinder();
                if (readStrongBinder38 != null) {
                    IInterface queryLocalInterface38 = readStrongBinder38.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface38 instanceof vjw) {
                        vjw6 = (vjw) queryLocalInterface38;
                    } else {
                        vjw6 = new vjw(readStrongBinder38);
                    }
                }
                mo27197a(readString26, vjw6);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                parcel.readString();
                IBinder readStrongBinder39 = parcel.readStrongBinder();
                if (readStrongBinder39 != null) {
                    IInterface queryLocalInterface39 = readStrongBinder39.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface39 instanceof vjw) {
                        vjw5 = (vjw) queryLocalInterface39;
                    } else {
                        vjw5 = new vjw(readStrongBinder39);
                    }
                }
                mo27224e(vjw5);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_PUSH_FAILED:
                IBinder readStrongBinder40 = parcel.readStrongBinder();
                if (readStrongBinder40 != null) {
                    IInterface queryLocalInterface40 = readStrongBinder40.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIntCallback");
                    if (queryLocalInterface40 instanceof vjr) {
                        vjr = (vjr) queryLocalInterface40;
                    } else {
                        vjr = new vjr(readStrongBinder40);
                    }
                }
                mo27204a(vjr);
                parcel2.writeNoException();
                return true;
            case 41:
                EndCompoundOperationRequest endCompoundOperationRequest2 = (EndCompoundOperationRequest) dcl.m8163a(parcel, EndCompoundOperationRequest.CREATOR);
                IBinder readStrongBinder41 = parcel.readStrongBinder();
                if (readStrongBinder41 != null) {
                    IInterface queryLocalInterface41 = readStrongBinder41.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface41 instanceof vjp) {
                        vjp3 = (vjp) queryLocalInterface41;
                    } else {
                        vjp3 = new vjp(readStrongBinder41);
                    }
                }
                mo27221d(vjp3);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                IBinder readStrongBinder42 = parcel.readStrongBinder();
                if (readStrongBinder42 != null) {
                    IInterface queryLocalInterface42 = readStrongBinder42.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (queryLocalInterface42 instanceof vjl) {
                        vjl = (vjl) queryLocalInterface42;
                    } else {
                        vjl = new vjl(readStrongBinder42);
                    }
                }
                mo27207b(readString27, readString28, vjl);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                String readString29 = parcel.readString();
                String readString30 = parcel.readString();
                DataHolder dataHolder4 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                IBinder readStrongBinder43 = parcel.readStrongBinder();
                if (readStrongBinder43 != null) {
                    IInterface queryLocalInterface43 = readStrongBinder43.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (queryLocalInterface43 instanceof vjp) {
                        vjp2 = (vjp) queryLocalInterface43;
                    } else {
                        vjp2 = new vjp(readStrongBinder43);
                    }
                }
                mo27188a(readString29, readString30, dataHolder4, vjp2);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_RESET_FAILED:
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                IBinder readStrongBinder44 = parcel.readStrongBinder();
                if (readStrongBinder44 != null) {
                    IInterface queryLocalInterface44 = readStrongBinder44.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
                    if (queryLocalInterface44 instanceof vji) {
                        vji = (vji) queryLocalInterface44;
                    } else {
                        vji = new vji(readStrongBinder44);
                    }
                }
                mo27223e(vji);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                String readString31 = parcel.readString();
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder45 = parcel.readStrongBinder();
                if (readStrongBinder45 != null) {
                    IInterface queryLocalInterface45 = readStrongBinder45.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IStringCallback");
                    if (queryLocalInterface45 instanceof vjv) {
                        vjv2 = (vjv) queryLocalInterface45;
                    } else {
                        vjv2 = new vjv(readStrongBinder45);
                    }
                }
                mo27185a(readString31, readInt11, vjv2);
                parcel2.writeNoException();
                return true;
            case 47:
                boolean a = dcl.m8167a(parcel);
                IBinder readStrongBinder46 = parcel.readStrongBinder();
                if (readStrongBinder46 != null) {
                    IInterface queryLocalInterface46 = readStrongBinder46.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface46 instanceof vjw) {
                        vjw4 = (vjw) queryLocalInterface46;
                    } else {
                        vjw4 = new vjw(readStrongBinder46);
                    }
                }
                mo27206a(a, vjw4);
                parcel2.writeNoException();
                return true;
            case 48:
                DriveId driveId = (DriveId) dcl.m8163a(parcel, DriveId.CREATOR);
                IBinder readStrongBinder47 = parcel.readStrongBinder();
                if (readStrongBinder47 != null) {
                    IInterface queryLocalInterface47 = readStrongBinder47.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface47 instanceof vjw) {
                        vjw3 = (vjw) queryLocalInterface47;
                    } else {
                        vjw3 = new vjw(readStrongBinder47);
                    }
                }
                mo27176a(driveId, vjw3);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                IBinder readStrongBinder48 = parcel.readStrongBinder();
                if (readStrongBinder48 != null) {
                    IInterface queryLocalInterface48 = readStrongBinder48.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface48 instanceof vjw) {
                        vjw2 = (vjw) queryLocalInterface48;
                    } else {
                        vjw2 = new vjw(readStrongBinder48);
                    }
                }
                mo27219c(vjw2);
                parcel2.writeNoException();
                return true;
            case 50:
                int readInt12 = parcel.readInt();
                IBinder readStrongBinder49 = parcel.readStrongBinder();
                if (readStrongBinder49 != null) {
                    IInterface queryLocalInterface49 = readStrongBinder49.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ISuccessCallback");
                    if (queryLocalInterface49 instanceof vjw) {
                        vjw = (vjw) queryLocalInterface49;
                    } else {
                        vjw = new vjw(readStrongBinder49);
                    }
                }
                mo27173a(readInt12, vjw);
                parcel2.writeNoException();
                return true;
            case 51:
                ParcelableEventList a2 = mo27171a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                return true;
            default:
                return false;
        }
    }
}
