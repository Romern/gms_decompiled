package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.appstate.service.AppStateAndroidChimeraService;
import com.google.android.gms.appstate.service.AppStateIntentChimeraService;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: gaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gaa extends dck implements IInterface {

    /* renamed from: a */
    public final String f17772a;

    /* renamed from: b */
    private final Context f17773b;

    /* renamed from: c */
    private final ClientContext f17774c;

    public gaa() {
        super("com.google.android.gms.appstate.internal.IAppStateService");
    }

    /* renamed from: a */
    private static boolean m12843a(int i) {
        return i >= 0 && i < 4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        boolean z2;
        Integer valueOf = Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
        fzz fzz = null;
        switch (i) {
            case 5001:
                parcel2.writeNoException();
                parcel2.writeInt(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
                break;
            case 5002:
                parcel2.writeNoException();
                parcel2.writeInt(4);
                break;
            case 5003:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (queryLocalInterface instanceof fzz) {
                        fzz = (fzz) queryLocalInterface;
                    } else {
                        fzz = new fzz(readStrongBinder);
                    }
                }
                int readInt = parcel.readInt();
                byte[] createByteArray = parcel.createByteArray();
                sdo.m34972a(m12843a(readInt), "State key is out of bounds: %d is not between 0 and %d", Integer.valueOf(readInt), 4);
                if (createByteArray != null) {
                    int length = createByteArray.length;
                    if (length <= 262144) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sdo.m34972a(z, "App state data is too large (%d bytes). The maximum is %d", Integer.valueOf(length), valueOf);
                }
                if (!cbwf.m128761b()) {
                    AppStateIntentChimeraService.m6237a(this.f17773b, AppStateIntentChimeraService.f9813a, new gar(this.f17774c, fzz, readInt, createByteArray));
                } else if (fzz != null) {
                    try {
                        fzz.mo11572a(readInt, DataHolder.m22539b(3));
                    } catch (RemoteException e) {
                    }
                }
                parcel2.writeNoException();
                break;
            case 5004:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (queryLocalInterface2 instanceof fzz) {
                        fzz = (fzz) queryLocalInterface2;
                    } else {
                        fzz = new fzz(readStrongBinder2);
                    }
                }
                int readInt2 = parcel.readInt();
                sdo.m34966a(fzz, "Must provide a valid callback object");
                sdo.m34972a(m12843a(readInt2), "State key is out of bounds: %d is not between 0 and %d", Integer.valueOf(readInt2), 4);
                if (cbwf.m128761b()) {
                    try {
                        fzz.mo11572a(readInt2, DataHolder.m22539b(3));
                    } catch (RemoteException e2) {
                    }
                } else {
                    AppStateIntentChimeraService.m6237a(this.f17773b, AppStateIntentChimeraService.f9813a, new gap(this.f17774c, fzz, readInt2));
                }
                parcel2.writeNoException();
                break;
            case 5005:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (queryLocalInterface3 instanceof fzz) {
                        fzz = (fzz) queryLocalInterface3;
                    } else {
                        fzz = new fzz(readStrongBinder3);
                    }
                }
                sdo.m34966a(fzz, "Must provide a valid callback object");
                if (cbwf.m128761b()) {
                    try {
                        fzz.mo11573a(DataHolder.m22539b(3));
                    } catch (RemoteException e3) {
                    }
                } else {
                    AppStateIntentChimeraService.m6237a(this.f17773b, AppStateIntentChimeraService.f9813a, new gao(this.f17774c, fzz));
                }
                parcel2.writeNoException();
                break;
            case 5006:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (queryLocalInterface4 instanceof fzz) {
                        fzz = (fzz) queryLocalInterface4;
                    } else {
                        fzz = new fzz(readStrongBinder4);
                    }
                }
                int readInt3 = parcel.readInt();
                String readString = parcel.readString();
                byte[] createByteArray2 = parcel.createByteArray();
                sdo.m34966a(fzz, "Must provide a valid callback object");
                sdo.m34972a(m12843a(readInt3), "State key is out of bounds: %d is not between 0 and %d", Integer.valueOf(readInt3), 4);
                sdo.m34966a((Object) readString, (Object) "Must provide a non-null resolved version");
                if (createByteArray2 != null) {
                    int length2 = createByteArray2.length;
                    if (length2 <= 262144) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sdo.m34972a(z2, "App state data is too large (%d bytes). The maximum is %d", Integer.valueOf(length2), valueOf);
                }
                if (cbwf.m128761b()) {
                    try {
                        fzz.mo11572a(readInt3, DataHolder.m22539b(3));
                    } catch (RemoteException e4) {
                    }
                } else {
                    AppStateIntentChimeraService.m6237a(this.f17773b, AppStateIntentChimeraService.f9813a, new gaq(this.f17774c, fzz, readInt3, createByteArray2));
                }
                parcel2.writeNoException();
                break;
            case 5007:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (queryLocalInterface5 instanceof fzz) {
                        fzz = (fzz) queryLocalInterface5;
                    } else {
                        fzz = new fzz(readStrongBinder5);
                    }
                }
                int readInt4 = parcel.readInt();
                sdo.m34966a(fzz, "Must provide a valid callback object");
                sdo.m34972a(m12843a(readInt4), "State key is out of bounds: %d is not between 0 and %d", Integer.valueOf(readInt4), 4);
                if (cbwf.m128761b()) {
                    try {
                        fzz.mo11574b(readInt4);
                    } catch (RemoteException e5) {
                    }
                } else {
                    AppStateIntentChimeraService.m6237a(this.f17773b, AppStateIntentChimeraService.f9813a, new gan(fzz, readInt4));
                }
                parcel2.writeNoException();
                break;
            case 5008:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (queryLocalInterface6 instanceof fzz) {
                        fzz = (fzz) queryLocalInterface6;
                    } else {
                        fzz = new fzz(readStrongBinder6);
                    }
                }
                soz.m35799c(this.f17773b, this.f17774c.f30215e);
                synchronized (AppStateAndroidChimeraService.f9812b) {
                    AppStateAndroidChimeraService.f9811a.clear();
                }
                if (fzz != null) {
                    try {
                        fzz.mo8528b(5004, fzz.mo8529bj());
                    } catch (RemoteException e6) {
                    }
                }
                parcel2.writeNoException();
                break;
            case 5009:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (queryLocalInterface7 instanceof fzz) {
                        fzz = (fzz) queryLocalInterface7;
                    } else {
                        fzz = new fzz(readStrongBinder7);
                    }
                }
                if (Process.myUid() == Binder.getCallingUid()) {
                    sdo.m34966a(fzz, "Must provide a valid callback object");
                    if (cbwf.m128761b()) {
                        try {
                            fzz.mo11571a(0);
                        } catch (RemoteException e7) {
                        }
                    } else {
                        AppStateIntentChimeraService.m6237a(this.f17773b, AppStateIntentChimeraService.f9813a, new gat(this.f17774c, fzz));
                    }
                    parcel2.writeNoException();
                    break;
                } else {
                    throw new SecurityException();
                }
            default:
                return false;
        }
        return true;
    }

    public gaa(Context context, ClientContext clientContext, String str) {
        super("com.google.android.gms.appstate.internal.IAppStateService");
        this.f17773b = context;
        this.f17774c = clientContext;
        this.f17772a = str;
    }
}
