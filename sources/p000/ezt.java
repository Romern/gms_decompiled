package p000;

/* renamed from: ezt */
final /* synthetic */ class ezt implements C0038ax {

    /* renamed from: a */
    private final faa f16122a;

    public ezt(faa faa) {
        this.f16122a = faa;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        boolean z;
        boolean z2;
        faa faa = this.f16122a;
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            boolean z3 = false;
            faa.f16138c = false;
            epq epq = ((fef) bmxv.mo66814b()).f16371a;
            bsul b = epq.mo10395b();
            if (!ssk.m36235a(faa.getContext())) {
                z = (b.f147144a & 2) != 0;
            } else {
                z = false;
            }
            if (epq.f15491a.f147581b == 1000) {
                return;
            }
            if (!evt.m11201a(b) || z || !epq.mo10396c() || epq.f15493c) {
                bsxn aU = faa.mo10627a().mo10584aU();
                bsxn bsxn = ((fef) bmxv.mo66814b()).f16371a.f15491a.f147583d;
                if (bsxn == null) {
                    bsxn = bsxn.f147586d;
                }
                faa.f16136a.mo10761b();
                if (evt.m11201a(b)) {
                    new evt(b, faa, faa.f16136a.mo10763c(), faa.f16136a.mo10764d(), new ezw(faa, aU, bsxn), new ezx(faa)).mo10533a();
                    return;
                }
                faa.f16136a.mo10762b(aU, bsxn);
                fep fep = faa.f16136a;
                fek c = faa.mo10627a().mo10624c();
                int i = ((fef) bmxv.mo66814b()).f16372b;
                feo feo = fep.f16407c;
                fen a = feo.mo10754a(aU, c);
                feo.f16403c.add(a);
                feg feg = feg.BACK;
                int i2 = i - 1;
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 4) {
                        z2 = new fcq().mo10724a(feo.f16403c, feo.mo10754a(bsxn, (fek) null));
                        if (!z2 && feo.mo10755a(a, bsxn)) {
                            z3 = true;
                        }
                        feo.f16404d.mo2450b(new fel(bsxn, null, z2, z3));
                        feo.mo10757c();
                    } else if (i2 != 5) {
                        z2 = false;
                        z3 = true;
                        feo.f16404d.mo2450b(new fel(bsxn, null, z2, z3));
                        feo.mo10757c();
                    }
                }
                z2 = new fff().mo10724a(feo.f16403c, feo.mo10754a(bsxn, (fek) null));
                z3 = true;
                feo.f16404d.mo2450b(new fel(bsxn, null, z2, z3));
                feo.mo10757c();
            }
        }
    }
}
