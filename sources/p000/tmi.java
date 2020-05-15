package p000;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: tmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tmi extends tmn {

    /* renamed from: a */
    private rlf f46269a;

    /* renamed from: b */
    private rlf f46270b;

    /* renamed from: c */
    private rlf f46271c;

    /* renamed from: d */
    private rlf f46272d;

    /* renamed from: e */
    private final tmc f46273e;

    protected tmi() {
        this.f46273e = null;
    }

    /* renamed from: a */
    public static tmi m37202a(rlf rlf) {
        return new tmi(null, null, null, rlf, null);
    }

    /* renamed from: b */
    private final void m37204b(Status status) {
        tlu tlu;
        tmc tmc = this.f46273e;
        if (tmc != null && status.mo17710c() && (tlu = tmc.f46255a) != null) {
            synchronized (tlu.f46249d) {
                tlu.f46247b = null;
                tlu.f46248c = null;
            }
        }
    }

    public tmi(rlf rlf, rlf rlf2, rlf rlf3, rlf rlf4, tmc tmc) {
        this.f46269a = rlf;
        this.f46270b = rlf2;
        this.f46271c = rlf3;
        this.f46272d = rlf4;
        this.f46273e = tmc;
    }

    /* renamed from: a */
    public static tmi m37203a(rlf rlf, tmc tmc) {
        return new tmi(rlf, null, null, null, tmc);
    }

    /* renamed from: a */
    public final void mo9545a(Status status) {
        rlf rlf = this.f46269a;
        if (rlf == null) {
            dst.m9253a("ContextManagerPendingResult", "Unexpected callback to onStatusResult.");
            return;
        }
        rlf.mo9482a((Object) status);
        this.f46269a = null;
        m37204b(status);
    }

    /* renamed from: b */
    public final void mo9552b(Status status, DataHolder dataHolder) {
        rlf rlf = this.f46270b;
        if (rlf != null) {
            rlf.mo9482a(new tmf(dataHolder, status));
            this.f46270b = null;
            m37204b(status);
            return;
        }
        dst.m9253a("ContextManagerPendingResult", "Unexpected callback to onReadResult.");
    }

    /* renamed from: a */
    public final void mo9546a(Status status, Snapshot snapshot) {
        rlf rlf = this.f46272d;
        if (rlf != null) {
            rlf.mo9482a(new tmh(status, snapshot));
            this.f46272d = null;
            m37204b(status);
            return;
        }
        dst.m9253a("ContextManagerPendingResult", "Unexpected callback to onSnapshotResult");
    }

    /* renamed from: a */
    public final void mo9547a(Status status, DataHolder dataHolder) {
        rlf rlf = this.f46271c;
        if (rlf != null) {
            rlf.mo9482a(new tmg(dataHolder, status));
            this.f46271c = null;
            m37204b(status);
            return;
        }
        dst.m9253a("ContextManagerPendingResult", "Unexpected callback to onStateResult");
    }

    /* renamed from: a */
    public final void mo9548a(Status status, FenceStateImpl fenceStateImpl) {
        dst.m9253a("ContextManagerPendingResult", "Unexpected callback to onFenceEvaluateResult");
    }

    /* renamed from: a */
    public final void mo9549a(Status status, FenceStateMapImpl fenceStateMapImpl) {
        dst.m9253a("ContextManagerPendingResult", "Unexpected callback to onFenceQueryResult");
    }

    /* renamed from: a */
    public final void mo9550a(Status status, WriteBatchImpl writeBatchImpl) {
        dst.m9253a("ContextManagerPendingResult", "Unexpected callback to onWriteBatchResult");
    }
}
