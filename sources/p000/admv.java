package p000;

import java.util.List;

/* renamed from: admv */
final /* synthetic */ class admv implements aubw {

    /* renamed from: a */
    private final List f62185a;

    /* renamed from: b */
    private final bxvd f62186b;

    public admv(bxvd bxvd, List list) {
        this.f62186b = bxvd;
        this.f62185a = list;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bxvd bxvd = this.f62186b;
        List list = this.f62185a;
        Void voidR = (Void) obj;
        int i = admy.f62190a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boly boly = boly.f133593k;
        ((boly) bxvd.f164949b).f133602h = bolw.m111323a(3);
        int size = list.size();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((boly) bxvd.f164949b).f133601g = size;
        new Object[1][0] = Integer.valueOf(list.size());
    }
}
