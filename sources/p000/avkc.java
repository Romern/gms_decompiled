package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avkc extends dck implements avkd {
    public avkc() {
        super("com.google.android.gms.update.ISystemUpdateApiService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        avkj avkj = null;
        rnt rnt = null;
        avkj avkj2 = null;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.update.ISystemUpdateStatusCallback");
                    if (queryLocalInterface instanceof avkj) {
                        avkj = (avkj) queryLocalInterface;
                    } else {
                        avkj = new avkh(readStrongBinder);
                    }
                }
                mo51316a(avkj);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.update.ISystemUpdateStatusCallback");
                    avkj2 = queryLocalInterface2 instanceof avkj ? (avkj) queryLocalInterface2 : new avkh(readStrongBinder2);
                }
                mo51321b(avkj2);
                parcel2.writeNoException();
                return true;
            case 4:
                SystemUpdateStatus a = mo51315a();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case 5:
                mo51318a((DownloadOptions) dcl.m8163a(parcel, DownloadOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                mo51319a((InstallationOptions) dcl.m8163a(parcel, InstallationOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                mo51324c();
                parcel2.writeNoException();
                return true;
            case 8:
                mo51322b((DownloadOptions) dcl.m8163a(parcel, DownloadOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                mo51325d();
                parcel2.writeNoException();
                return true;
            case 10:
                mo51317a((ActivityStatus) dcl.m8163a(parcel, ActivityStatus.CREATOR));
                parcel2.writeNoException();
                return true;
            case 11:
                mo51326e();
                parcel2.writeNoException();
                return true;
            case 12:
                mo51323b((InstallationOptions) dcl.m8163a(parcel, InstallationOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo51327f();
                parcel2.writeNoException();
                return true;
            case 14:
                boolean g = mo51328g();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, g);
                return true;
            case 15:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface3;
                    } else {
                        rnt = new rnr(readStrongBinder3);
                    }
                }
                mo51320a(rnt, (ConfigUpdateOptions) dcl.m8163a(parcel, ConfigUpdateOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                long h = mo51329h();
                parcel2.writeNoException();
                parcel2.writeLong(h);
                return true;
            default:
                return false;
        }
    }
}
