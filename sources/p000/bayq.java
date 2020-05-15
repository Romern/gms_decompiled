package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bayq */
final /* synthetic */ class bayq implements bqeh {

    /* renamed from: a */
    private final bbav f102115a;

    /* renamed from: b */
    private final bnic f102116b;

    public bayq(bbav bbav, bnic bnic) {
        this.f102115a = bbav;
        this.f102116b = bnic;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102115a;
        bnic bnic = this.f102116b;
        ArrayList arrayList = new ArrayList();
        for (bavr bavr : (List) obj) {
            if (!bavr.f101921d.isEmpty() && !bnic.contains(bavr.f101921d)) {
                arrayList.add(bqdx.m112674a(bbav.f102247d.mo56051a(bavr), new bazk(bbav, bavr), bbav.f102251h));
            }
        }
        return bqga.m112782b(arrayList).mo69216a(bazl.f102157a, bbav.f102251h);
    }
}
