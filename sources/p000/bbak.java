package p000;

import java.util.ArrayList;

/* renamed from: bbak */
final /* synthetic */ class bbak implements bqeh {

    /* renamed from: a */
    private final bbav f102219a;

    /* renamed from: b */
    private final bavd f102220b;

    public bbak(bbav bbav, bavd bavd) {
        this.f102219a = bbav;
        this.f102220b = bavd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102219a;
        bavd bavd = this.f102220b;
        bnic bnic = (bnic) obj;
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = bavd.f101880j;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bauy bauy = (bauy) bxwc.get(i);
            int a = bavb.m87594a(bavd.f101876f);
            if (a == 0) {
                a = 1;
            }
            bavt a2 = bbdd.m87829a(bauy, a);
            if (!bnic.contains(a2)) {
                arrayList.add(bbav.f102248e.mo56076c(a2));
            }
        }
        return bqga.m112782b(arrayList).mo69216a(bbam.f102223a, bbav.f102251h);
    }
}
