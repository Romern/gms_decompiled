package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: eau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eau extends dyd {

    /* renamed from: b */
    public static final dxr f14574b = new dxr(new eas(), "TimeIntervalsProducer", new int[]{36}, new int[]{10007});

    /* renamed from: j */
    public List f14575j;

    /* renamed from: k */
    public ect f14576k;

    /* renamed from: l */
    private bxkg f14577l;

    /* renamed from: m */
    private final eat f14578m = new eat(this);

    public eau(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14574b, str, dqb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo9917b(long j) {
        int i;
        List<bxlf> list;
        bxkf bxkf;
        bxkf bxkf2;
        ect ect = this.f14576k;
        bxkx a = dqt.m9099a(dqt.m9100a(j, ect.f14699a));
        ecs ecs = ect.f14700b;
        int i2 = a.f163813b;
        int i3 = a.f163814c;
        int i4 = a.f163815d;
        int a2 = bxlj.m122835a(a.f163816e);
        if (a2 == 0) {
            a2 = 1;
        }
        int i5 = -1;
        int i6 = a2 - 1;
        ArrayList arrayList = (ArrayList) ecs.f14697b.get(ecs.m10121a(i2, i3, i4), ecs.f14696a);
        if (arrayList.isEmpty()) {
            arrayList = (ArrayList) ecs.f14698c.get(i6, ecs.f14696a);
        }
        Collections.sort(arrayList);
        long b = dqt.m9103b(j, ect.f14699a);
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
        if (!mo9861g()) {
            mo9916a(arrayList2, j);
            return this.f14576k.mo9969a(j);
        } else if (this.f14575j.equals(arrayList2)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("eau", "b", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[TimeIntervalsProducer] Got same value as before for attributes %s", arrayList2);
            return this.f14576k.mo9969a(j);
        } else {
            mo9846a(-1 + j);
            mo9916a(arrayList2, j);
            return this.f14576k.mo9969a(j);
        }
    }

    /* renamed from: a */
    public final void mo9916a(List list, long j) {
        bxvd da = bxkg.f163724c.mo74144da();
        if (!list.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxkg bxkg = (bxkg) da.f164949b;
            if (!bxkg.f163727a.mo73666a()) {
                bxkg.f163727a = GeneratedMessageLite.m124019a(bxkg.f163727a);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bxkg.f163727a.mo74153d(((bxkf) list.get(i)).f163722i);
            }
            this.f14575j = list;
        }
        bxkg bxkg2 = (bxkg) da.mo74062i();
        this.f14577l = bxkg2;
        new Object[1][0] = bxkg2;
        tip tip = new tip(10, 36, 2);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxkg.f163725d, this.f14577l);
        mo9857d(tip.mo26570a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        dwq.m9667k().mo9433a(this.f14578m);
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* renamed from: b */
    public final void mo9500b(ContextData contextData) {
        if (contextData == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("eau", "b", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[TimeIntervalsProducer] onReceive: null ContextData received.");
        } else if (contextData.mo18018g() != 10007) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("eau", "b", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[TimeIntervalsProducer] onReceive: received ContextData not LOCALE_BASED_TIME_MODEL");
        } else {
            bxln bxln = (bxln) contextData.mo18009a(bxln.f163864f);
            if (bxln == null) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                bnsl3.mo68432a("eau", "b", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("[TimeIntervalsProducer] onReceive: could not read LocaleBasedTimeModel from ContextData");
                return;
            }
            new Object[1][0] = bxln;
            ect ect = this.f14576k;
            if (ect == null) {
                this.f14576k = new ect(bxln);
            } else {
                ect.mo9970a(bxln);
            }
            dwq.m9667k().mo9433a(this.f14578m);
            this.f14578m.mo9516a(dqy.m9123a("ProduceTimeIntervalsOperation"));
        }
    }
}
