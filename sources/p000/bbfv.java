package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bbfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfv {

    /* renamed from: a */
    private bngs f102570a;

    /* renamed from: b */
    private bngx f102571b;

    /* renamed from: a */
    public final bbfw mo56119a() {
        bngs bngs = this.f102570a;
        if (bngs != null) {
            this.f102571b = bngs.mo67664a();
        } else if (this.f102571b == null) {
            this.f102571b = bngx.m109376e();
        }
        return new bbfr(this.f102571b);
    }

    /* renamed from: a */
    public final void mo56120a(bbfz bbfz) {
        if (this.f102570a == null) {
            if (this.f102571b != null) {
                bngs j = bngx.m109377j();
                this.f102570a = j;
                j.mo67666b((Iterable) this.f102571b);
                this.f102571b = null;
            } else {
                this.f102570a = bngx.m109377j();
            }
        }
        this.f102570a.mo67668c(bbfz);
    }

    /* renamed from: a */
    public final void mo56121a(List list) {
        if (this.f102570a == null) {
            this.f102571b = bngx.m109368a((Collection) list);
            return;
        }
        throw new IllegalStateException("Cannot set values after calling valuesBuilder()");
    }
}
