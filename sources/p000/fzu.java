package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fzu extends dck implements fzv {
    public fzu() {
        super("com.google.android.gms.apppreviewmessaging.internal.IAppPreviewMessagingService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        fzt fzt = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.apppreviewmessaging.internal.IAppPreviewMessagingCallback");
                if (queryLocalInterface instanceof fzt) {
                    fzt = (fzt) queryLocalInterface;
                } else {
                    fzt = new fzt(readStrongBinder);
                }
            }
            mo11568a(fzt, parcel.readString());
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.apppreviewmessaging.internal.IAppPreviewMessagingCallback");
                if (queryLocalInterface2 instanceof fzt) {
                    fzt = (fzt) queryLocalInterface2;
                } else {
                    fzt = new fzt(readStrongBinder2);
                }
            }
            mo11569b(fzt, parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
