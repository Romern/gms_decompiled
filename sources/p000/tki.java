package p000;

import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;

/* renamed from: tki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tki implements Runnable {

    /* renamed from: a */
    private final lrj f46225a;

    /* renamed from: b */
    private final FenceStateImpl f46226b;

    public tki(lrj lrj, FenceStateImpl fenceStateImpl) {
        sdo.m34959a(lrj);
        this.f46225a = lrj;
        sdo.m34959a(fenceStateImpl);
        this.f46226b = fenceStateImpl;
    }

    public final void run() {
        this.f46225a.mo9826a(this.f46226b);
    }
}
