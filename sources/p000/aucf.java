package p000;

/* renamed from: aucf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aucf {

    /* renamed from: a */
    public final auck f91388a = new auck();

    public aucf() {
    }

    /* renamed from: a */
    public final void mo50390a(Exception exc) {
        this.f91388a.mo50397a(exc);
    }

    /* renamed from: b */
    public final void mo50392b(Exception exc) {
        auck auck = this.f91388a;
        sdo.checkIfNull(exc, "Exception must not be null");
        synchronized (auck.f91393a) {
            if (!auck.f91395c) {
                auck.f91395c = true;
                auck.f91397e = exc;
                auck.f91394b.mo50388a(auck);
            }
        }
    }

    public aucf(aubd aubd) {
        aubd.f91347a.mo50373a((aubw) new aube(new auce(this)));
    }

    /* renamed from: a */
    public final void mo50391a(Object obj) {
        this.f91388a.mo50398a(obj);
    }

    /* renamed from: b */
    public final boolean mo50393b(Object obj) {
        return this.f91388a.mo50399b(obj);
    }
}
