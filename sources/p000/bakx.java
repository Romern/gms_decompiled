package p000;

import java.io.IOException;

/* renamed from: bakx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bakx implements baoj {

    /* renamed from: a */
    private final bakr f101157a;

    /* renamed from: b */
    private final cayo f101158b;

    public bakx(bakr bakr, cayo cayo) {
        this.f101157a = bakr;
        this.f101158b = cayo;
    }

    /* renamed from: a */
    public final void mo32729a(baog baog) {
        if (bygy.m124802a(baog.mo55816c().f166412a) != bygy.REGISTRATION && bard.m87434a(baog.mo55817d())) {
            try {
                this.f101157a.mo55728a(baog.mo55815b());
            } catch (IOException e) {
                ((acdc) this.f101158b.mo16713a()).mo32707a("MDH Push policy changed failure", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo32730a(baog baog, baog baog2) {
        if (bygy.m124802a(baog2.mo55816c().f166412a) == bygy.REGISTRATION) {
            return;
        }
        if (baog != null || bard.m87434a(baog2.mo55817d())) {
            if (baog != null) {
                if (baog.mo55817d().f166655e == baog2.mo55817d().f166655e) {
                    return;
                }
            }
            try {
                this.f101157a.mo55728a(baog2.mo55815b());
            } catch (IOException e) {
                ((acdc) this.f101158b.mo16713a()).mo32707a("Push policy changed failure", e);
            }
        }
    }
}
