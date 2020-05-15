package p000;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: dyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dyk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dyo f14404a;

    public dyk(dyo dyo) {
        this.f14404a = dyo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
        if (r1.f14414F >= 0.25f) goto L_0x0163;
     */
    public final void run() {
        int i;
        dyo dyo = this.f14404a;
        long j = dyo.f14415G;
        long a = dwq.m9665i().mo20505a();
        Object[] objArr = {Boolean.valueOf(dyo.f14437z), Integer.valueOf(dyo.f14409A), Long.valueOf(dyo.f14412D), Long.valueOf(dyo.f14413E)};
        Object[] objArr2 = {Long.valueOf(a), Long.valueOf(dyo.f14411C), Float.valueOf(dyo.f14414F)};
        int i2 = 50;
        if (dyo.mo9876b(1) && ((i = dyo.f14409A) == 2 || i == 4 || i == 3)) {
            i2 = 100;
        } else {
            if (dyo.f14437z) {
                if (dyo.mo9876b(4) && (a - dyo.f14412D <= cdgp.m133200i() || dyo.f14412D == -1)) {
                    new Object[1][0] = Long.valueOf(cdgp.m133200i());
                    i2 = 10;
                } else if (!dyo.mo9876b(8) || dwq.m9665i().mo20506b() - dyo.f14413E > cdgp.m133202k()) {
                    if (dyo.mo9876b(2)) {
                        if (dyo.f14411C - a > cdgp.m133198g() || dyo.f14411C - a <= 0) {
                            long j2 = dyo.f14410B;
                            if (j2 != 0 && j2 - a >= (-cdgp.m133199h())) {
                                new Object[1][0] = Long.valueOf(cdgp.m133199h());
                            }
                        } else {
                            new Object[1][0] = Long.valueOf(cdgp.m133198g());
                            i2 = 90;
                        }
                    }
                    if (dyo.mo9876b(16)) {
                    }
                } else {
                    new Object[1][0] = Long.valueOf(cdgp.m133202k());
                    i2 = 10;
                }
            } else if (dyo.mo9876b(4) && (a - dyo.f14412D <= cdgp.m133201j() || dyo.f14412D == -1)) {
                new Object[1][0] = Long.valueOf(cdgp.m133201j());
                i2 = 10;
            } else if (dyo.mo9876b(16)) {
                if (dyo.f14414F > 0.25f) {
                    i2 = 10;
                }
            }
            if (!dyo.f14437z) {
                i2 = 10;
            }
            i2 = 90;
        }
        if (dyo.f14417I != i2 || dyo.f14418J != dyo.f14419K) {
            dyo.f14417I = i2;
            bxvd da = bxkq.f163780d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxkq bxkq = (bxkq) da.f164949b;
            int i3 = bxkq.f163783a | 1;
            bxkq.f163783a = i3;
            bxkq.f163784b = i2;
            bxkq.f163785c = dyo.f14419K.f163779d;
            bxkq.f163783a = i3 | 2;
            bxkq bxkq2 = (bxkq) da.mo74062i();
            tip tip = new tip(1, 59, 2);
            tip.mo26574a(tka.m37117a(j));
            tip.mo26572a(bxkq.f163781e, bxkq2);
            ContextData a2 = tip.mo26570a();
            Object[] objArr3 = new Object[2];
            objArr3[0] = Integer.valueOf(bxkq2.f163784b);
            bxkp a3 = bxkp.m122811a(bxkq2.f163785c);
            if (a3 == null) {
                a3 = bxkp.UNKNOWN_STATE;
            }
            objArr3[1] = a3;
            dyo.mo9856c(a2);
        }
    }
}
