package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.carsetup.BinderParcel;

/* renamed from: ouz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ouz extends dck implements ova {
    public ouz() {
        super("com.google.android.gms.carsetup.IZeroPartyChecker");
    }

    /* renamed from: a */
    public static void m29833a(Intent intent) {
        intent.putExtra("0p_checker", new BinderParcel(new ouz()));
    }

    /* renamed from: a */
    public final void mo22659a(ovd ovd) {
        try {
            ovd.mo22660a();
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ovd ovd;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.carsetup.IZeroPartyCheckerCallback");
            ovd = queryLocalInterface instanceof ovd ? (ovd) queryLocalInterface : new ovb(readStrongBinder);
        } else {
            ovd = null;
        }
        mo22659a(ovd);
        return true;
    }
}
