package p000;

import android.os.IInterface;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: tmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface tmo extends IInterface {
    /* renamed from: a */
    void mo9545a(Status status);

    /* renamed from: a */
    void mo9546a(Status status, Snapshot snapshot);

    /* renamed from: a */
    void mo9547a(Status status, DataHolder dataHolder);

    /* renamed from: a */
    void mo9548a(Status status, FenceStateImpl fenceStateImpl);

    /* renamed from: a */
    void mo9549a(Status status, FenceStateMapImpl fenceStateMapImpl);

    /* renamed from: a */
    void mo9550a(Status status, WriteBatchImpl writeBatchImpl);

    /* renamed from: b */
    void mo9552b(Status status, DataHolder dataHolder);
}
