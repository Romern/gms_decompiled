package p000;

import android.view.Choreographer;

/* renamed from: ajn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajn {

    /* renamed from: a */
    final ajl f651a;

    /* renamed from: b */
    private final Choreographer f652b = Choreographer.getInstance();

    /* renamed from: c */
    private final Choreographer.FrameCallback f653c = new ajo(this);

    /* renamed from: a */
    public final void mo832a() {
        this.f652b.postFrameCallback(this.f653c);
    }

    public ajn(ajl ajl) {
        this.f651a = ajl;
    }
}
