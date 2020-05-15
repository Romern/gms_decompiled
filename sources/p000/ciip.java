package p000;

/* renamed from: ciip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciip extends chqr {

    /* renamed from: a */
    private final ciil f190417a;

    /* renamed from: b */
    private Object f190418b;

    public ciip(ciil ciil) {
        this.f190417a = ciil;
    }

    /* renamed from: a */
    public final void mo25569a(chtr chtr) {
    }

    /* renamed from: a */
    public final void mo25570a(chuv chuv, chtr chtr) {
        if (chuv.mo85689a()) {
            if (this.f190418b == null) {
                this.f190417a.mo69136a((Throwable) chuv.f189228o.mo85687a("No value received for unary call").mo85688a(chtr));
            }
            this.f190417a.mo69138b(this.f190418b);
            return;
        }
        this.f190417a.mo69136a((Throwable) chuv.mo85688a(chtr));
    }

    /* renamed from: a */
    public final void mo25571a(Object obj) {
        if (this.f190418b == null) {
            this.f190418b = obj;
            return;
        }
        throw chuv.f189228o.mo85687a("More than one value received for unary call").mo85691b();
    }
}
