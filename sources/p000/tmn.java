package p000;

import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: tmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tmn extends dck implements tmo {
    public tmn() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo9545a((Status) dcl.m8163a(parcel, Status.CREATOR));
                break;
            case 2:
                DataHolder dataHolder = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                mo9552b((Status) dcl.m8163a(parcel, Status.CREATOR), (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
                break;
            case 3:
                mo9550a((Status) dcl.m8163a(parcel, Status.CREATOR), (WriteBatchImpl) dcl.m8163a(parcel, WriteBatchImpl.CREATOR));
                break;
            case 4:
            default:
                return false;
            case 5:
                mo9547a((Status) dcl.m8163a(parcel, Status.CREATOR), (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
                break;
            case 6:
                mo9546a((Status) dcl.m8163a(parcel, Status.CREATOR), (Snapshot) dcl.m8163a(parcel, Snapshot.CREATOR));
                break;
            case 7:
                mo9549a((Status) dcl.m8163a(parcel, Status.CREATOR), (FenceStateMapImpl) dcl.m8163a(parcel, FenceStateMapImpl.CREATOR));
                break;
            case 8:
                mo9548a((Status) dcl.m8163a(parcel, Status.CREATOR), (FenceStateImpl) dcl.m8163a(parcel, FenceStateImpl.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
