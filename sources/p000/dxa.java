package p000;

import com.google.android.gms.awareness.fence.FenceState;
import java.util.PriorityQueue;

/* renamed from: dxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxa implements lrj {

    /* renamed from: a */
    public final PriorityQueue f14335a = new PriorityQueue(1, new dww());

    /* renamed from: b */
    public boolean f14336b = false;

    /* renamed from: c */
    public boolean f14337c = false;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9825a() {
        this.f14336b = false;
        lrk lrk = new lrk();
        lrk.mo15394a(this);
        lrh.m19577a(dwq.m9662f(), lri.m19583b("ServerTaskRetryManager", null)).mo24681a(lrk.mo15389a()).mo50371a(new dqi("[ServerTaskRetryManager] unregister fence", new Object[0]));
    }

    /* renamed from: a */
    public final void mo9826a(FenceState fenceState) {
        if (fenceState.mo8005a() == 2 && !this.f14335a.isEmpty()) {
            new Object[1][0] = fenceState.mo8006b();
            dwq.m9667k().mo9435a(new dwx(this, dwq.m9665i().mo20506b()), dqy.m9123a("ServerTaskRetryManager_retry"));
        }
    }
}
