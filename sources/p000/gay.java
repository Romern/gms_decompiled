package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gay extends dck implements gaz {
    public gay() {
        super("com.google.android.gms.appusage.internal.IAppUsageService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        gax gax;
        gax gax2;
        gax gax3 = null;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.appusage.internal.IAppUsageCallbacks");
                if (queryLocalInterface instanceof gax) {
                    gax = (gax) queryLocalInterface;
                    mo11607a(gax, parcel.readLong(), parcel.readLong(), parcel.createStringArrayList());
                } else {
                    gax3 = new gax(readStrongBinder);
                }
            }
            gax = gax3;
            mo11607a(gax, parcel.readLong(), parcel.readLong(), parcel.createStringArrayList());
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.appusage.internal.IAppUsageCallbacks");
                if (queryLocalInterface2 instanceof gax) {
                    gax2 = (gax) queryLocalInterface2;
                    mo11608b(gax2, parcel.readLong(), parcel.readLong(), parcel.createStringArrayList());
                } else {
                    gax3 = new gax(readStrongBinder2);
                }
            }
            gax2 = gax3;
            mo11608b(gax2, parcel.readLong(), parcel.readLong(), parcel.createStringArrayList());
        }
        parcel2.writeNoException();
        return true;
    }
}
