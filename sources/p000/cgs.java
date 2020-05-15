package p000;

import java.util.Queue;

/* renamed from: cgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class cgs {

    /* renamed from: a */
    private final Queue f6825a = crd.m7392a(20);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final che mo3875a() {
        che che = (che) this.f6825a.poll();
        return che == null ? mo3877b() : che;
    }

    /* renamed from: b */
    public abstract che mo3877b();

    /* renamed from: a */
    public final void mo3876a(che che) {
        if (this.f6825a.size() < 20) {
            this.f6825a.offer(che);
        }
    }
}
