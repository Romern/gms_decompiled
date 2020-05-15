package p000;

import java.util.ArrayList;

/* renamed from: ayvl */
final /* synthetic */ class ayvl implements bqeg {

    /* renamed from: a */
    private final ayvo f98566a;

    /* renamed from: b */
    private final ayvw f98567b;

    public ayvl(ayvo ayvo, ayvw ayvw) {
        this.f98566a = ayvo;
        this.f98567b = ayvw;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        ayvo ayvo = this.f98566a;
        ayvw ayvw = this.f98567b;
        ArrayList arrayList = new ArrayList(ayvo.f98571b.size());
        for (ayvq ayvq : ayvo.f98571b) {
            arrayList.add(ayvq.mo54453a(ayvw));
        }
        bqgg a = bqga.m112785c(arrayList).mo69216a(new ayvm(arrayList), ayvo.f98570a);
        return ayvo.f98572c.mo66813a() ? bqdx.m112674a(((ayvp) ayvo.f98572c.mo66814b()).mo54454a(), new ayvn(a), ayvo.f98570a) : a;
    }
}
