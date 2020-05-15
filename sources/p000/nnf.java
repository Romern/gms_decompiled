package p000;

import java.util.Map;

/* renamed from: nnf */
final /* synthetic */ class nnf implements ojn {

    /* renamed from: a */
    private final noj f36085a;

    public nnf(noj noj) {
        this.f36085a = noj;
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        noj noj = this.f36085a;
        biwd biwd = bivb.f121932j;
        if (biwd == null) {
            biwd = biwd.f122072e;
        }
        if ((biwd.f122074a & 1) == 0) {
            return null;
        }
        biwd biwd2 = bivb.f121932j;
        if (biwd2 == null) {
            biwd2 = biwd.f122072e;
        }
        byte[] k = biwd2.f122077d.mo73780k();
        biwd biwd3 = bivb.f121932j;
        if (biwd3 == null) {
            biwd3 = biwd.f122072e;
        }
        String str = biwd3.f122075b;
        biwd biwd4 = bivb.f121932j;
        if (biwd4 == null) {
            biwd4 = biwd.f122072e;
        }
        npj npj = new npj(str, k, (String[]) biwd4.f122076c.toArray(new String[0]), noj.f36181a, bivb.f121924b);
        synchronized (noj.f36239z) {
            Map map = noj.f36239z;
            biwd biwd5 = bivb.f121932j;
            if (biwd5 == null) {
                biwd5 = biwd.f122072e;
            }
            map.put(biwd5.f122075b, npj);
        }
        return npj;
    }
}
