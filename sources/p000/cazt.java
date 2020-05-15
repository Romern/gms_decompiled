package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cazt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cazt implements cazv {

    /* renamed from: a */
    public final cazs f176458a = new cazs();

    /* renamed from: b */
    private final AtomicBoolean f176459b = new AtomicBoolean();

    protected cazt() {
    }

    /* renamed from: a */
    public final cazn mo75202a(cazw cazw) {
        cazr cazr = new cazr(this);
        cazr.f176456a.mo741a(new cazq(cazr, cazw), bqfb.INSTANCE);
        return cazr;
    }

    /* renamed from: b */
    public final bqgg mo75201b() {
        if (this.f176459b.compareAndSet(false, true)) {
            this.f176458a.mo69137b(mo75209c());
        }
        return this.f176458a;
    }

    /* renamed from: bf */
    public final cazn mo75204bf() {
        return new cazr(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bqgg mo75209c();

    /* renamed from: a */
    public final void mo75203a(boolean z) {
        this.f176459b.set(true);
        this.f176458a.mo75208a(z);
    }
}
