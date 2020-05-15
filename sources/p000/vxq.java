package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: vxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxq extends dcj implements vxs {
    public vxq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardService");
    }

    /* renamed from: a */
    public final vxp mo28941a() {
        vxp vxp;
        Parcel a = mo8526a(2, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            vxp = queryLocalInterface instanceof vxp ? (vxp) queryLocalInterface : new vxn(readStrongBinder);
        } else {
            vxp = null;
        }
        a.recycle();
        return vxp;
    }
}
