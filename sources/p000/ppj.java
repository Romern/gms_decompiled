package p000;

/* renamed from: ppj */
final /* synthetic */ class ppj implements aubw {
    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bxwc bxwc = ((bsin) obj).f144737a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bsia bsia = (bsia) bxwc.get(i);
            int i2 = bsia.f144651a;
            if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                String str = bsia.f144652b;
                bshy bshy = bsia.f144653c;
                if (bshy == null) {
                    bshy = bshy.f144640c;
                }
                boolean z = bshy.f144642a;
                bshy bshy2 = bsia.f144653c;
                if (bshy2 == null) {
                    bshy2 = bshy.f144640c;
                }
                bshz bshz = bshy2.f144643b;
                if (bshz == null) {
                    bshz = bshz.f144645b;
                }
                int i3 = bshz.f144647a;
                ppc ppc = (ppc) ppz.f40045d.mo23549d().get(str);
                if (ppc != null) {
                    ppc ppc2 = new ppc(ppc);
                    ppc2.f40013i = i3;
                    ppc2.f40014j = z;
                    if (!ppc2.equals(ppc)) {
                        ppz.f40045d.mo23543a(ppc2);
                    }
                }
            }
        }
    }
}
