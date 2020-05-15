package p000;

/* renamed from: fer */
public final /* synthetic */ class fer implements C1234o {

    /* renamed from: a */
    public static final C1234o f16415a = new fer();

    private fer() {
    }

    /* renamed from: a */
    public final Object mo10678a(Object obj) {
        bsxk bsxk = ((epq) obj).f15491a;
        if (bsxk.f147581b != 5) {
            return bngx.m109376e();
        }
        bngs j = bngx.m109377j();
        bxwc bxwc = ((bsyo) bsxk.f147582c).f147692a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bsyp bsyp = (bsyp) bxwc.get(i);
            if (!cbro.m128208l()) {
                String str = bsyp.f147697c;
                bsxn bsxn = bsyp.f147696b;
                if (bsxn == null) {
                    bsxn = bsxn.f147586d;
                }
                j.mo67668c(fes.m11567a(str, null, bsxn));
            } else {
                String str2 = bsyp.f147697c;
                bswh bswh = bsyp.f147698d;
                if (bswh == null) {
                    bswh = bswh.f147430g;
                }
                bswg a = bswg.m116252a(bswh.f147433b);
                bsxn bsxn2 = bsyp.f147696b;
                if (bsxn2 == null) {
                    bsxn2 = bsxn.f147586d;
                }
                j.mo67668c(fes.m11567a(str2, a, bsxn2));
            }
        }
        return j.mo67664a();
    }
}
