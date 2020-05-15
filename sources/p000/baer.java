package p000;

import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: baer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baer extends cazu {

    /* renamed from: b */
    private final cazn f100562b;

    /* renamed from: c */
    private final cazn f100563c;

    public baer(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(baer.class), cijl);
        this.f100562b = cbac.m127643a(cazn);
        this.f100563c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100562b.mo75201b(), cbac.m127642a(this.f100563c.mo75201b()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Void voidR = (Void) list.get(0);
        try {
            ((cazm) list.get(1)).mo75194a();
            throw new IllegalStateException("Token revocation should always throw!");
        } catch (ExecutionException e) {
            if (e.getCause() instanceof babw) {
                throw new babw(e);
            }
            throw e;
        }
    }
}
