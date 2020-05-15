package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aupz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aupz extends dcj implements auqb {
    public aupz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.trustagent.internal.IBridgeApi");
    }

    /* renamed from: a */
    public final sce mo50656a(auqe auqe, int i, Bundle bundle) {
        sce sce;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, auqe);
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            sce = queryLocalInterface instanceof sce ? (sce) queryLocalInterface : new scc(readStrongBinder);
        } else {
            sce = null;
        }
        a.recycle();
        return sce;
    }
}
