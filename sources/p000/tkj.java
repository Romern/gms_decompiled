package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: tkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tkj extends tkt {

    /* renamed from: a */
    public static final egj f46227a = new tkh();

    /* renamed from: b */
    private final lrj f46228b;

    /* renamed from: c */
    private final Handler f46229c;

    public tkj(lrj lrj, Looper looper) {
        sdo.m34959a(lrj);
        this.f46228b = lrj;
        sdo.m34959a(looper);
        this.f46229c = tmd.m37186a(looper);
    }

    /* renamed from: a */
    public final void mo9519a(FenceStateImpl fenceStateImpl) {
        this.f46229c.post(new tki(this.f46228b, fenceStateImpl));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo9520a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
        dst.m9254a("ContextFenceListenerWrapper", "Unexpected call to deprecated method onFenceTriggered() with %s.", fenceTriggerInfoImpl);
        this.f46229c.post(new tki(this.f46228b, new FenceStateImpl(FenceState.m7187a(fenceTriggerInfoImpl.f30659a), 0, fenceTriggerInfoImpl.f30660b, 0)));
    }
}
