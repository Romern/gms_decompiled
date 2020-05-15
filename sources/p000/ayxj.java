package p000;

import java.util.Set;

/* renamed from: ayxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxj {

    /* renamed from: a */
    public final Set f98680a;

    public ayxj(Set set) {
        this.f98680a = set;
    }

    /* renamed from: a */
    public static final void m85033a(RuntimeException runtimeException) {
        bnsl bnsl = (bnsl) ayzz.f98820a.mo68387b();
        bnsl.mo68437a(runtimeException);
        bnsl.mo68432a("ayzz", "a", 26, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68448m();
    }

    /* renamed from: a */
    public final void mo54511a(Object obj) {
        if (!this.f98680a.isEmpty()) {
            for (ayxh ayxh : this.f98680a) {
                ayxh.mo54507a(obj);
            }
        }
    }

    /* renamed from: b */
    public final void mo54513b(Object obj) {
        if (!this.f98680a.isEmpty()) {
            for (ayxh ayxh : this.f98680a) {
                ayxh.mo54509b(obj);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo54512a() {
        return !this.f98680a.isEmpty();
    }
}
