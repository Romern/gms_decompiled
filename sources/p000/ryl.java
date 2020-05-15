package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.download.DownloadDetails;

/* renamed from: ryl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ryl extends dck implements rym {
    public ryl() {
        super("com.google.android.gms.common.download.internal.IDownloadService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ryp ryp = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                if (queryLocalInterface instanceof ryp) {
                    ryp = (ryp) queryLocalInterface;
                } else {
                    ryp = new ryn(readStrongBinder);
                }
            }
            mo25242a(ryp, parcel.readString());
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                ryp = queryLocalInterface2 instanceof ryp ? (ryp) queryLocalInterface2 : new ryn(readStrongBinder2);
            }
            mo25243b(ryp, parcel.readString());
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                if (queryLocalInterface3 instanceof ryp) {
                    ryp ryp2 = (ryp) queryLocalInterface3;
                } else {
                    new ryn(readStrongBinder3);
                }
            }
            parcel.readString();
        } else if (i == 4) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                if (queryLocalInterface4 instanceof ryp) {
                    ryp = (ryp) queryLocalInterface4;
                } else {
                    ryp = new ryn(readStrongBinder4);
                }
            }
            mo25241a(ryp, (DownloadDetails) dcl.m8163a(parcel, DownloadDetails.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
                if (queryLocalInterface5 instanceof ryp) {
                    ryp = (ryp) queryLocalInterface5;
                } else {
                    ryp = new ryn(readStrongBinder5);
                }
            }
            mo25244c(ryp, parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
