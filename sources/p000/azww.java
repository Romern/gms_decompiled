package p000;

import android.view.Choreographer;

/* renamed from: azww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azww extends azwx {

    /* renamed from: a */
    private final Choreographer f100138a = Choreographer.getInstance();

    /* renamed from: a */
    public final void mo55344a(azwv azwv) {
        this.f100138a.postFrameCallback(azwv.mo55343a());
    }

    /* renamed from: b */
    public final void mo55345b(azwv azwv) {
        this.f100138a.removeFrameCallback(azwv.mo55343a());
    }
}
