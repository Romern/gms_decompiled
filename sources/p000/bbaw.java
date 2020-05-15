package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bbaw */
final /* synthetic */ class bbaw implements bqeh {

    /* renamed from: a */
    private final bbaz f102253a;

    public bbaw(bbaz bbaz) {
        this.f102253a = bbaz;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbaz bbaz = this.f102253a;
        List<bavr> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (bavr bavr : list) {
            arrayList.add(bbaz.mo56051a(bavr));
        }
        return bqga.m112782b(arrayList).mo69214a(new bbax(list, arrayList), bbaz.f102258c);
    }
}
