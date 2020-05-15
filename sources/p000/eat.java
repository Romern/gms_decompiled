package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: eat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eat extends drx {

    /* renamed from: c */
    final /* synthetic */ eau f14573c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eat(eau eau) {
        super("ProduceTimeIntervalsOperation");
        this.f14573c = eau;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        int i;
        List<bxlf> list;
        long j;
        bxkf bxkf;
        bxkf bxkf2;
        long a = dwq.m9665i().mo20505a();
        eau eau = this.f14573c;
        ect ect = eau.f14576k;
        bxkx a2 = dqt.m9099a(dqt.m9100a(a, ect.f14699a));
        ecs ecs = ect.f14700b;
        int i2 = a2.f163813b;
        int i3 = a2.f163814c;
        int i4 = a2.f163815d;
        int a3 = bxlj.m122835a(a2.f163816e);
        if (a3 == 0) {
            a3 = 1;
        }
        int i5 = -1;
        int i6 = a3 - 1;
        ArrayList arrayList = (ArrayList) ecs.f14697b.get(ecs.m10121a(i2, i3, i4), ecs.f14696a);
        if (arrayList.isEmpty()) {
            arrayList = (ArrayList) ecs.f14698c.get(i6, ecs.f14696a);
        }
        Collections.sort(arrayList);
        long b = dqt.m9103b(a, ect.f14699a);
        ecq ecq = ect.f14701c;
        List list2 = ecq.f14694b;
        ecp ecp = new ecp(b);
        if (list2 != null) {
            i = Collections.binarySearch(list2, ecp);
            if (i < 0) {
                i = (-i) - 2;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            ecp ecp2 = (ecp) ecq.f14694b.get(i);
            if (ecp2.f14690a <= b && b < ecp2.f14691b) {
                i5 = i;
            }
        }
        if (i5 >= 0) {
            list = ((ecp) ecq.f14694b.get(i5)).f14692c;
        } else {
            list = ecq.f14693a;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + list.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            bxll bxll = bxll.UNKNOWN_DAY_TYPE;
            bxlf bxlf = bxlf.UNKNOWN_DAY_PART;
            int ordinal = ((bxll) arrayList.get(i7)).ordinal();
            if (ordinal == 1) {
                bxkf2 = bxkf.WEEKDAY;
            } else if (ordinal == 2) {
                bxkf2 = bxkf.WEEKEND;
            } else if (ordinal != 3) {
                bxkf2 = bxkf.UNKNOWN;
            } else {
                bxkf2 = bxkf.HOLIDAY;
            }
            arrayList2.add(bxkf2);
        }
        for (bxlf bxlf2 : list) {
            bxll bxll2 = bxll.UNKNOWN_DAY_TYPE;
            bxlf bxlf3 = bxlf.UNKNOWN_DAY_PART;
            int ordinal2 = bxlf2.ordinal();
            if (ordinal2 == 1) {
                bxkf = bxkf.MORNING;
            } else if (ordinal2 == 2) {
                bxkf = bxkf.AFTERNOON;
            } else if (ordinal2 == 3) {
                bxkf = bxkf.EVENING;
            } else if (ordinal2 != 4) {
                bxkf = bxkf.UNKNOWN;
            } else {
                bxkf = bxkf.NIGHT;
            }
            arrayList2.add(bxkf);
        }
        Collections.sort(arrayList2);
        if (!eau.mo9861g()) {
            eau.mo9916a(arrayList2, a);
            j = eau.f14576k.mo9969a(a);
        } else if (eau.f14575j.equals(arrayList2)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("eau", "b", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[TimeIntervalsProducer] Got same value as before for attributes %s", arrayList2);
            j = eau.f14576k.mo9969a(a);
        } else {
            eau.mo9846a(-1 + a);
            eau.mo9916a(arrayList2, a);
            j = eau.f14576k.mo9969a(a);
        }
        mo9514a(j, dqy.m9123a("ProduceTimeIntervalsOperation"));
    }
}
