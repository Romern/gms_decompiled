package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.Surface;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.CrashInfoParcel;
import com.google.android.gms.car.ExceptionParcel;
import com.google.android.gms.car.TouchEventCompleteData;

/* renamed from: nsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nsf extends dck implements nsg {
    public nsf() {
        super("com.google.android.gms.car.ICarProjectionCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        obu obu;
        switch (i) {
            case 1:
                mo21515a();
                parcel2.writeNoException();
                return true;
            case 2:
                mo21524b();
                parcel2.writeNoException();
                return true;
            case 3:
                mo21527c();
                parcel2.writeNoException();
                return true;
            case 4:
                mo21529d();
                parcel2.writeNoException();
                return true;
            case 5:
                mo21530e();
                parcel2.writeNoException();
                return true;
            case 6:
                mo21531f();
                parcel2.writeNoException();
                return true;
            case 7:
                mo21532g();
                parcel2.writeNoException();
                return true;
            case 8:
                mo21533h();
                parcel2.writeNoException();
                return true;
            case 9:
                mo21523a(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 10:
                mo21534i();
                parcel2.writeNoException();
                return true;
            case 11:
                mo21520a((ExceptionParcel) dcl.m8163a(parcel, ExceptionParcel.CREATOR));
                parcel2.writeNoException();
                return true;
            case 12:
                mo21518a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo21535j();
                parcel2.writeNoException();
                return true;
            case 14:
                mo21536k();
                parcel2.writeNoException();
                return true;
            case 15:
                mo21537l();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.input.IProxyInputConnection");
                    obu = queryLocalInterface instanceof obu ? (obu) queryLocalInterface : new obu(readStrongBinder);
                } else {
                    obu = null;
                }
                mo21522a(obu, (EditorInfo) dcl.m8163a(parcel, EditorInfo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                mo21538m();
                parcel2.writeNoException();
                return true;
            case 18:
                mo21526b(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 19:
            case 22:
            default:
                return false;
            case 20:
                mo21539n();
                parcel2.writeNoException();
                return true;
            case 21:
                mo21517a((Intent) dcl.m8163a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 23:
                mo21516a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 24:
                int o = mo21540o();
                parcel2.writeNoException();
                parcel2.writeInt(o);
                return true;
            case 25:
                int p = mo21541p();
                parcel2.writeNoException();
                parcel2.writeInt(p);
                return true;
            case 26:
                mo21519a((CrashInfoParcel) dcl.m8163a(parcel, CrashInfoParcel.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                mo21542q();
                parcel2.writeNoException();
                return true;
            case 28:
                mo21528c(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 29:
                mo21525b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 30:
                Surface surface = (Surface) dcl.m8163a(parcel, Surface.CREATOR);
                mo21544s();
                parcel2.writeNoException();
                return true;
            case 31:
                mo21543r();
                parcel2.writeNoException();
                return true;
            case 32:
                mo21521a((TouchEventCompleteData) dcl.m8163a(parcel, TouchEventCompleteData.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
