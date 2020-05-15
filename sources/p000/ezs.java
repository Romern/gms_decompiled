package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: ezs */
final /* synthetic */ class ezs implements C0038ax {

    /* renamed from: a */
    private final faa f16121a;

    public ezs(faa faa) {
        this.f16121a = faa;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        faa faa = this.f16121a;
        fem fem = (fem) obj;
        fby a = faa.mo10627a();
        if ((epr.m10936h(fem.f16392a.mo10395b()) != null) == (faa.mo10627a() instanceof exf) && a.mo10558a(fem.f16392a)) {
            a.mo10557a(fem);
            return;
        }
        bsul b = fem.f16392a.mo10395b();
        if (((ssk.m36235a(faa.getContext()) || (b.f147144a & 2) == 0) && fem.f16392a.mo10396c()) || !evt.m11201a(b) || faa.f16138c) {
            bsxn bsxn = fem.f16392a.f15491a.f147583d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            boolean a2 = sdg.m34949a(bsxn, faa.mo10627a().mo10584aU());
            fby a3 = faa.m11353a(fem);
            fbs fbs = fbs.INSTANT;
            if (!a2) {
                fbt.m11411a(a3, fem.f16393b);
                if (!fem.f16395d) {
                    fbs = !fem.f16394c ? fbs.PUSH : fbs.POP;
                } else {
                    fbs = !fem.f16394c ? fbs.OPEN : fbs.CLOSE;
                }
            }
            a3.mo10660b((long) faa.getResources().getInteger(C0126R.integer.as_screen_transition_duration));
            fbt.m11410a(faa, a3, "inner", fbs);
            return;
        }
        bsxn aU = faa.mo10627a().mo10584aU();
        bsxn bsxn2 = fem.f16392a.f15491a.f147583d;
        if (bsxn2 == null) {
            bsxn2 = bsxn.f147586d;
        }
        faa.f16136a.mo10760a(aU, bsxn2);
        new evt(b, faa, faa.f16136a.mo10763c(), faa.f16136a.mo10764d(), new ezy(faa, aU, bsxn2), new ezz(faa)).mo10533a();
        if (!cbro.m128202f()) {
            faa.f16138c = true;
        }
    }
}
