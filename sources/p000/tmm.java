package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: tmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tmm extends dcj implements tmo {
    public tmm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    /* renamed from: a */
    public final void mo9545a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(1, bj);
    }

    /* renamed from: b */
    public final void mo9552b(Status status, DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, dataHolder);
        dcl.m8165a(bj, (Parcelable) null);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo9546a(Status status, Snapshot snapshot) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, snapshot);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo9547a(Status status, DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, dataHolder);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo9548a(Status status, FenceStateImpl fenceStateImpl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, fenceStateImpl);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo9549a(Status status, FenceStateMapImpl fenceStateMapImpl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, fenceStateMapImpl);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo9550a(Status status, WriteBatchImpl writeBatchImpl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, writeBatchImpl);
        mo8528b(3, bj);
    }
}
