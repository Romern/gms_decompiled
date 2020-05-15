package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: afpm */
final /* synthetic */ class afpm implements bqeh {

    /* renamed from: a */
    private final afpq f64509a;

    /* renamed from: b */
    private final List f64510b;

    /* renamed from: c */
    private final bxvd f64511c;

    /* renamed from: d */
    private final bxvd f64512d;

    public afpm(afpq afpq, bxvd bxvd, bxvd bxvd2, List list) {
        this.f64509a = afpq;
        this.f64511c = bxvd;
        this.f64512d = bxvd2;
        this.f64510b = list;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        int a;
        int a2;
        afpq afpq = this.f64509a;
        bxvd bxvd = this.f64511c;
        bxvd bxvd2 = this.f64512d;
        List list = this.f64510b;
        bavd bavd = (bavd) obj;
        if (bavd == null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        int i = bavd.f101875e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpwz bpwz = (bpwz) bxvd.f164949b;
        bpwz bpwz2 = bpwz.f139594g;
        bpwz.f139596a |= 2;
        bpwz.f139598c = i;
        int a3 = bavb.m87594a(bavd.f101876f);
        if ((a3 != 0 && a3 == 3) || (!((a = bavb.m87594a(bavd.f101876f)) == 0 || a == 1) ? (a2 = bavb.m87594a(bavd.f101876f)) == 0 || a2 != 2 || !afpq.f64463f.equals(afot.ZERO_PARTY) : !afpq.f64463f.equals(afot.FIRST_PARTY) && !afpq.f64463f.equals(afot.ZERO_PARTY))) {
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = bavd.f101880j;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                bauy bauy = (bauy) bxwc.get(i2);
                arrayList.add(bqdx.m112674a(afpq.f64459b.mo56064a(bauy, bavd), new afpn(afpq, list, bauy, bxvd2), bqfb.INSTANCE));
            }
            return bqga.m112785c(arrayList).mo69216a(new afpo(bavd), bqfb.INSTANCE);
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpxn bpxn = (bpxn) bxvd2.f164949b;
        bpxn bpxn2 = bpxn.f139738g;
        bpxn.f139743d = bpzz.m112457a(6);
        bpxn.f139740a |= 8;
        throw new aaaj(10, "GetFileGroupOp : Group not accessible");
    }
}
