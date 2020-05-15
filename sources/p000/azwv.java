package p000;

import android.view.Choreographer;

/* renamed from: azwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class azwv {

    /* renamed from: a */
    private Choreographer.FrameCallback f100137a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Choreographer.FrameCallback mo55343a() {
        if (this.f100137a == null) {
            this.f100137a = new azwu(this);
        }
        return this.f100137a;
    }

    /* renamed from: a */
    public abstract void mo55339a(long j);
}
