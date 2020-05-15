package p000;

import android.os.IBinder;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: dtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dtk implements tmo {

    /* renamed from: a */
    private final String f13989a;

    public dtk(String str) {
        this.f13989a = str;
    }

    /* renamed from: a */
    public final void mo9545a(Status status) {
        Object[] objArr = {this.f13989a, status};
        if (!status.mo17710c()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dtk", "a", 989, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("FenceManager failed %s with %s", bryx.m114908a(this.f13989a), bryx.m114908a(Integer.valueOf(status.f30115i)));
        }
    }

    /* renamed from: a */
    public final void mo9546a(Status status, Snapshot snapshot) {
    }

    /* renamed from: a */
    public final void mo9547a(Status status, DataHolder dataHolder) {
    }

    /* renamed from: a */
    public final void mo9548a(Status status, FenceStateImpl fenceStateImpl) {
    }

    /* renamed from: a */
    public final void mo9549a(Status status, FenceStateMapImpl fenceStateMapImpl) {
    }

    /* renamed from: a */
    public final void mo9550a(Status status, WriteBatchImpl writeBatchImpl) {
    }

    public final IBinder asBinder() {
        return null;
    }

    /* renamed from: b */
    public final void mo9552b(Status status, DataHolder dataHolder) {
    }
}
