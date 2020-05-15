package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.BackupOptInSettings;

/* renamed from: moj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class moj extends dck implements mok {
    public moj() {
        super("com.google.android.gms.backup.internal.IG1BackupService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        mof mof = null;
        lua lua = null;
        rnt rnt = null;
        switch (i) {
            case 1:
                mo20192a(dcl.m8167a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 2:
                dcl.m8167a(parcel);
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean a = mo20193a();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 4:
                boolean b = mo20195b();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                return true;
            case 5:
                boolean c = mo20196c();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, c);
                return true;
            case 6:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.backup.internal.IBackUpNowCallbacks");
                    if (queryLocalInterface instanceof mof) {
                        mof = (mof) queryLocalInterface;
                    } else {
                        mof = new mod(readStrongBinder);
                    }
                }
                mo20189a(mof);
                parcel2.writeNoException();
                return true;
            case 7:
                boolean d = mo20197d();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, d);
                return true;
            case 8:
                mo20191a(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 9:
                mo20194b(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 10:
                boolean e = mo20198e();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, e);
                return true;
            case 11:
                boolean f = mo20199f();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, f);
                return true;
            case 12:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface2 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface2;
                    } else {
                        rnt = new rnr(readStrongBinder2);
                    }
                }
                mo20190a(rnt, dcl.m8167a(parcel), parcel.readString(), (BackupOptInSettings) dcl.m8163a(parcel, BackupOptInSettings.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                String readString = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.backup.IBackUpMmsClientCallbacks");
                    if (queryLocalInterface3 instanceof lua) {
                        lua = (lua) queryLocalInterface3;
                    } else {
                        lua = new lua(readStrongBinder3);
                    }
                }
                mo20188a(readString, lua);
                parcel2.writeNoException();
                return true;
            case 14:
                mo20187a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                int g = mo20200g();
                parcel2.writeNoException();
                parcel2.writeInt(g);
                return true;
            case 16:
                long h = mo20201h();
                parcel2.writeNoException();
                parcel2.writeLong(h);
                return true;
            default:
                return false;
        }
    }
}
