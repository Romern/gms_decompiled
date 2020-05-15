package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: akvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akvg extends akup {

    /* renamed from: a */
    private final AtomicBoolean f72957a = new AtomicBoolean();

    public akvg() {
        mo39894b();
    }

    /* renamed from: a */
    public final Object mo39747a(Object obj) {
        if (mo39837d(obj)) {
            return obj;
        }
        mo39836c(obj);
        return null;
    }

    /* renamed from: b */
    public final void mo39894b() {
        this.f72957a.set(false);
    }

    /* renamed from: c */
    public final void mo39836c(Object obj) {
        if (obj instanceof akus) {
            ((akus) obj).mo39881b();
        }
    }

    /* renamed from: d */
    public final void mo39873d() {
        mo39894b();
    }

    /* renamed from: d */
    public final boolean mo39837d(Object obj) {
        return this.f72957a.get();
    }

    /* renamed from: a */
    public final void mo39893a() {
        this.f72957a.set(true);
    }
}
