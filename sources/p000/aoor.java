package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.service.PseudonymousIdChimeraService;

/* renamed from: aoor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoor extends aooj implements aaai {

    /* renamed from: a */
    private final PseudonymousIdChimeraService f78613a;

    /* renamed from: b */
    private final aaag f78614b;

    public aoor(PseudonymousIdChimeraService pseudonymousIdChimeraService, aaag aaag) {
        this.f78613a = pseudonymousIdChimeraService;
        this.f78614b = aaag;
    }

    /* renamed from: a */
    public final void mo43125a(aooh aooh) {
        synchronized ("PseudonymousIdService") {
            if (aooq.f78612b != null) {
                aooh.mo43124a(Status.f30107a, aooq.f78612b);
            } else {
                this.f78614b.mo16659a(this.f78613a, new aooo(aooh));
            }
        }
    }

    /* renamed from: b */
    public final void mo43127b(aooh aooh) {
        this.f78614b.mo16659a(this.f78613a, new aoon(aooh));
    }

    /* renamed from: a */
    public final void mo43126a(aooh aooh, PseudonymousIdToken pseudonymousIdToken) {
        this.f78614b.mo16659a(this.f78613a, new aoop(aooh, pseudonymousIdToken));
    }
}
