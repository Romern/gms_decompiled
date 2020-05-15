package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bayz */
final /* synthetic */ class bayz implements bqeh {

    /* renamed from: a */
    private final bbav f102138a;

    public bayz(bbav bbav) {
        this.f102138a = bbav;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102138a;
        ArrayList arrayList = new ArrayList();
        for (bavr bavr : (List) obj) {
            arrayList.add(bqdx.m112674a(bbav.f102247d.mo56051a(bavr), new bazc(bbav, bavr), bbav.f102251h));
        }
        return bqga.m112782b(arrayList).mo69216a(bazd.f102144a, bbav.f102251h);
    }
}
