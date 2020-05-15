package p000;

/* renamed from: smz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class smz implements snb {

    /* renamed from: a */
    final Runnable f44787a;

    /* renamed from: b */
    final Object f44788b;

    public smz(Runnable runnable, Object obj) {
        this.f44787a = runnable;
        this.f44788b = obj;
    }

    /* renamed from: a */
    public final Object mo25764a() {
        return this.f44788b;
    }

    /* renamed from: b */
    public final Runnable mo25765b() {
        return this.f44787a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof smz) {
            return this.f44787a.equals(((smz) obj).f44787a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44787a.hashCode();
    }

    public final void run() {
        this.f44787a.run();
    }
}
