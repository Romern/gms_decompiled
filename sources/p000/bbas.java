package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bbas */
final /* synthetic */ class bbas implements bqeh {

    /* renamed from: a */
    private final bbav f102235a;

    /* renamed from: b */
    private final boolean f102236b;

    public bbas(bbav bbav, boolean z) {
        this.f102235a = bbav;
        this.f102236b = z;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102235a;
        boolean z = this.f102236b;
        ArrayList arrayList = new ArrayList();
        for (bavr bavr : (List) obj) {
            if (!bavr.f101922e) {
                arrayList.add(bqdx.m112674a(bbav.f102247d.mo56051a(bavr), new bbat(bbav, z, bavr), bbav.f102251h));
            }
        }
        return bqga.m112782b(arrayList).mo69216a(bayj.f102099a, bbav.f102251h);
    }
}
