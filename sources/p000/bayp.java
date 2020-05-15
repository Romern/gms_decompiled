package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bayp */
final /* synthetic */ class bayp implements bqeh {

    /* renamed from: a */
    private final bbav f102114a;

    public bayp(bbav bbav) {
        this.f102114a = bbav;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102114a;
        ArrayList arrayList = new ArrayList();
        for (bavr bavr : (List) obj) {
            if (!bbav.mo56049a(bavr.f101920c)) {
                arrayList.add(bqdx.m112674a(bbav.f102247d.mo56051a(bavr), new bazn(bbav, bavr), bbav.f102251h));
            }
        }
        return bqga.m112782b(arrayList).mo69216a(bazo.f102162a, bbav.f102251h);
    }
}
