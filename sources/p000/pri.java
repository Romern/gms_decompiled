package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.firstparty.CastReceiver;
import com.google.android.gms.cast.firstparty.WifiRequestInfo;

/* renamed from: pri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class pri extends dck implements prj {
    public pri() {
        super("com.google.android.gms.cast.firstparty.internal.ICastFirstPartyService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        prg prg = null;
        prf prf = null;
        prm prm = null;
        prp prp = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.firstparty.internal.ICastFirstPartyCallbacks");
                    if (queryLocalInterface instanceof prg) {
                        prg = (prg) queryLocalInterface;
                    } else {
                        prg = new prg(readStrongBinder);
                    }
                }
                mo23559a(prg, (WifiRequestInfo) dcl.m8163a(parcel, WifiRequestInfo.CREATOR), (CastReceiver) dcl.m8163a(parcel, CastReceiver.CREATOR));
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.firstparty.internal.ICastSettingsCallback");
                    if (queryLocalInterface2 instanceof prp) {
                        prp = (prp) queryLocalInterface2;
                    } else {
                        prp = new prn(readStrongBinder2);
                    }
                }
                mo23561a(prp);
                return true;
            case 3:
                mo23558a(parcel.readString(), dcl.m8167a(parcel));
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.cast.firstparty.internal.ICastRemoteControlNotificationEnabledStatusCallbacks");
                    if (queryLocalInterface3 instanceof prm) {
                        prm = (prm) queryLocalInterface3;
                    } else {
                        prm = new prk(readStrongBinder3);
                    }
                }
                mo23560a(prm);
                return true;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.cast.firstparty.internal.ICastDeviceConnectionStatusListener");
                    if (queryLocalInterface4 instanceof prf) {
                        prf = (prf) queryLocalInterface4;
                    } else {
                        prf = new prf(readStrongBinder4);
                    }
                }
                mo23557a(readString, prf);
                return true;
            case 6:
                mo23555a(parcel.readString());
                return true;
            case 7:
                mo23556a(parcel.readString(), parcel.readInt());
                return true;
            case 8:
                mo23562b(parcel.readString());
                return true;
            default:
                return false;
        }
    }
}
