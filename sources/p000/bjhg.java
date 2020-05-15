package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bjhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjhg {

    /* renamed from: a */
    C1246ol f122721a;

    /* renamed from: b */
    private final bjgv f122722b;

    /* renamed from: c */
    private final bxuq f122723c;

    public bjhg(bjgv bjgv, bxuq bxuq) {
        this.f122722b = bjgv;
        this.f122723c = bxuq;
    }

    /* renamed from: a */
    static void m103485a(C1246ol olVar) {
        int c = olVar.mo15640c();
        for (int i = 0; i < c; i++) {
            C1246ol olVar2 = ((bjhg) olVar.mo15641c(i)).f122721a;
            if (olVar2 != null) {
                olVar2.mo15644d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo65151a(bxxc bxxc);

    /* renamed from: b */
    public final void mo65224b(int i) {
        if (mo65223a(i)) {
            bjgj bjgj = this.f122722b.f122695d;
            bwou bwou = (bwou) this.f122721a.mo15646f(i);
            if (bjhz.m103567a().mo65272h()) {
                bjgj.f122664g.push(bwou);
                if (bjgj.f122659b) {
                    return;
                }
                while (!bjgj.f122664g.isEmpty()) {
                    bjgj.f122659b = true;
                    bwou bwou2 = (bwou) bjgj.f122664g.pop();
                    ArrayList arrayList = bjgj.f122663f;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((bjgi) arrayList.get(i2)).mo65145b();
                    }
                    bjgj.mo65146a(bwou2);
                    bjgj.f122659b = false;
                    ArrayList arrayList2 = bjgj.f122663f;
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((bjgi) arrayList2.get(i3)).mo65144a();
                    }
                }
                return;
            }
            bjgj.mo65146a(bwou);
        }
    }

    /* renamed from: a */
    static void m103486a(C1246ol olVar, List list) {
        int c = olVar.mo15640c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bwou bwou = (bwou) list.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= c) {
                    break;
                }
                bjhg bjhg = (bjhg) olVar.mo15641c(i2);
                bxuq bxuq = bjhg.f122723c;
                Map map = bxvk.f164959aj;
                bxvj bxvj = (bxvj) bxuq;
                bwou.mo74135a(bxvj);
                if (!bwou.f164952m.mo73911a(bxvj.f164958d)) {
                    i2++;
                } else {
                    if (bjhg.f122721a == null) {
                        bjhg.f122721a = new C1246ol();
                    }
                    C1246ol olVar2 = bjhg.f122721a;
                    bxvj bxvj2 = (bxvj) bjhg.f122723c;
                    bwou.mo74135a(bxvj2);
                    Object b = bwou.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    olVar2.mo15637a(bjhg.mo65151a((bxxc) b), bwou);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo65222a() {
        return this.f122723c.mo73900a();
    }

    /* renamed from: a */
    public final boolean mo65223a(int i) {
        C1246ol olVar = this.f122721a;
        return olVar != null && olVar.mo15645e(i);
    }
}
