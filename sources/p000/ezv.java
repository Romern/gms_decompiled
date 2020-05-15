package p000;

import android.content.Intent;
import java.util.ArrayList;

/* renamed from: ezv */
final /* synthetic */ class ezv implements C0038ax {

    /* renamed from: a */
    private final faa f16124a;

    public ezv(faa faa) {
        this.f16124a = faa;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        int i;
        bsxn bsxn;
        bsxn bsxn2;
        faa faa = this.f16124a;
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            faa.f16138c = false;
            faa.f16136a.mo10761b();
            bsxn aU = faa.mo10627a().mo10584aU();
            feo feo = faa.f16136a.f16407c;
            feg feg = feg.BACK;
            int ordinal = ((feg) bmxv.mo66814b()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    bsxn g = epr.m10935g(feo.f16401a.mo10686d(((fel) feo.f16404d.mo2448b()).f16388a).mo10395b());
                    if (g != null) {
                        int size = feo.f16403c.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                if (!g.equals(((fen) feo.f16403c.get(size)).f16397b)) {
                                    i = size;
                                    break;
                                }
                                size--;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                    } else {
                        i = feo.mo10753a();
                    }
                } else if (ordinal == 2) {
                    bsxn h = epr.m10936h(feo.f16401a.mo10686d(((fel) feo.f16404d.mo2448b()).f16388a).mo10395b());
                    if (h != null) {
                        int size2 = feo.f16403c.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                if (!h.equals(((fen) feo.f16403c.get(size2)).f16398c)) {
                                    i = size2;
                                    break;
                                }
                                size2--;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                    } else {
                        i = feo.mo10753a();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                i = feo.mo10753a();
            }
            if (i != -1) {
                fen fen = (fen) feo.f16403c.get(i);
                ArrayList arrayList = feo.f16403c;
                arrayList.subList(i, arrayList.size()).clear();
                feo.f16404d.mo2450b(new fel(fen.f16396a, fen.f16400e, true, feo.mo10755a(fen, ((fel) feo.f16404d.mo2448b()).f16388a)));
                feo.mo10757c();
                bsxn = fen.f16396a;
            } else {
                bsxn = null;
            }
            fep fep = faa.f16136a;
            if (bsxn == null) {
                bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
                if (bsxl.f164950c) {
                    bsxl.mo74035c();
                    bsxl.f164950c = false;
                }
                bsxn bsxn3 = (bsxn) bsxl.f164949b;
                bsxn3.f147588a = 1 | bsxn3.f147588a;
                bsxn3.f147589b = 0;
                bsxn2 = (bsxn) bsxl.mo74062i();
            } else {
                bsxn2 = bsxn;
            }
            fep.f16408d.mo10743a(aU, bsxn2, 7);
            if (bsxn == null) {
                if (cbro.m128204h()) {
                    faa.getActivity().setResult(-1, new Intent().putExtra("authAccount", faa.f16136a.mo10763c().f16458a));
                }
                faa.getActivity().finish();
                return;
            }
            faa.f16136a.mo10762b(aU, bsxn);
            faa.f16136a.mo10759a(bsxn);
        }
    }
}
