package p000;

/* renamed from: atlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atlz {

    /* renamed from: a */
    public String f90463a;

    /* renamed from: b */
    public final rjx f90464b;

    /* renamed from: c */
    private adzt f90465c = null;

    public atlz(rjx rjx) {
        this.f90464b = rjx;
    }

    /* renamed from: a */
    public final void mo50035a() {
        sdo.m34967a("stopTemporaryOverrides");
        mo50036b().removeCallbacksAndMessages(null);
        this.f90464b.mo24738c(0);
        this.f90463a = null;
    }

    /* renamed from: b */
    public final adzt mo50036b() {
        if (this.f90465c == null) {
            this.f90465c = new adzt();
        }
        return this.f90465c;
    }
}
