package p000;

import java.util.List;

/* renamed from: bv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0064bv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1405ui f5771a;

    /* renamed from: b */
    final /* synthetic */ C0065bw f5772b;

    public C0064bv(C0065bw bwVar, C1405ui uiVar) {
        this.f5772b = bwVar;
        this.f5771a = uiVar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ct.a(java.util.List, cq):void
     arg types: [ct, cq]
     candidates:
      ct.a(int, int):void
      ct.a(ct, cq):void
      ct.a(java.util.List, cq):void */
    public final void run() {
        C0065bw bwVar = this.f5772b;
        C0066bx bxVar = bwVar.f5842e;
        if (bxVar.f5938h == bwVar.f5840c) {
            C0915ct ctVar = bwVar.f5841d;
            C0915ct ctVar2 = bwVar.f5839b;
            C1405ui uiVar = this.f5771a;
            int i = bwVar.f5838a.f11999m;
            C0915ct ctVar3 = bxVar.f5937g;
            if (ctVar3 == null || bxVar.f5936f != null) {
                throw new IllegalStateException("must be in snapshot state to apply diff");
            }
            bxVar.f5936f = ctVar;
            bxVar.f5937g = null;
            C1411uo uoVar = bxVar.f5931a;
            C0918cw cwVar = ctVar3.f11998l;
            C0918cw cwVar2 = ctVar.f11998l;
            int b = cwVar.mo8349b();
            int b2 = cwVar2.mo8349b();
            int a = cwVar.mo8348a();
            int a2 = cwVar2.mo8348a();
            if (b == 0 && b2 == 0 && a == 0 && a2 == 0) {
                uiVar.mo16085a(uoVar);
            } else {
                if (b > b2) {
                    int i2 = b - b2;
                    uoVar.mo8386b(cwVar.size() - i2, i2);
                } else if (b < b2) {
                    uoVar.mo8384a(cwVar.size(), b2 - b);
                }
                if (a > a2) {
                    uoVar.mo8386b(0, a - a2);
                } else if (a < a2) {
                    uoVar.mo8384a(0, a2 - a);
                }
                if (a2 != 0) {
                    uiVar.mo16085a(new C0920cy(a2, uoVar));
                } else {
                    uiVar.mo16085a(uoVar);
                }
            }
            ctVar.mo8242a((List) ctVar2, bxVar.f5939i);
            if (!bxVar.f5936f.isEmpty()) {
                int a3 = C0921cz.m7967a(uiVar, ctVar3.f11998l, ctVar2.f11998l, i);
                C0915ct ctVar4 = bxVar.f5936f;
                ctVar4.mo8243b(Math.max(0, Math.min(ctVar4.size() - 1, a3)));
            }
            C0915ct ctVar5 = bxVar.f5936f;
            bxVar.mo3567b();
        }
    }
}
