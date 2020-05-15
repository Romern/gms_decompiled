package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: baym */
final /* synthetic */ class baym implements bqeh {

    /* renamed from: a */
    private final bbav f102110a;

    public baym(bbav bbav) {
        this.f102110a = bbav;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102110a;
        ArrayList arrayList = new ArrayList();
        for (bavr bavr : (List) obj) {
            if (!bavr.f101922e) {
                arrayList.add(bqdx.m112674a(bbav.f102247d.mo56051a(bavr), new bayn(bbav, bavr), bbav.f102251h));
            }
        }
        return bqga.m112782b(arrayList).mo69216a(bayo.f102113a, bbav.f102251h);
    }
}
