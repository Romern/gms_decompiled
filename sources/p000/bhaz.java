package p000;

/* renamed from: bhaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhaz {

    /* renamed from: a */
    private long f118223a = -1;

    /* renamed from: b */
    private final bgmi f118224b;

    /* renamed from: c */
    private final bhba[] f118225c;

    public bhaz(bgmi bgmi, bhba... bhbaArr) {
        this.f118224b = bgmi;
        this.f118225c = bhbaArr;
    }

    /* renamed from: a */
    private static boolean m100552a() {
        return !ceze.f183524a.mo6606a().nlpClientStatsOmitAppend();
    }

    /* renamed from: a */
    public final void mo63511a(long j) {
        bhba[] bhbaArr = this.f118225c;
        for (int i = 0; i < 5; i++) {
            bhbaArr[i].mo61420a();
        }
        this.f118223a = j;
    }

    /* renamed from: a */
    public final void mo63512a(bgmk bgmk, bsax bsax) {
        long c = bgmk.mo62776c();
        long j = this.f118223a;
        if (j == -1) {
            mo63511a(c);
        } else if (c - j >= 7200000) {
            bxvd da = buna.f154289i.mo74144da();
            long b = bgmk.mo62775b();
            bsax bsax2 = new bsax(bgox.f117055av);
            long j2 = this.f118223a;
            long j3 = (b - c) + j2;
            int i = (int) ((c - j2) / 1000);
            bsax2.mo70117b(1, b / 1000);
            bsax2.mo70134g(2, i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buna buna = (buna) da.f164949b;
            buna.f154291a = 1 | buna.f154291a;
            buna.f154292b = i;
            bhba[] bhbaArr = this.f118225c;
            for (int i2 = 0; i2 < 5; i2++) {
                bhba bhba = bhbaArr[i2];
                if (m100552a()) {
                    bhba.mo61425a(bsax2, j3);
                }
                if (ceze.m138463h()) {
                    bhba.mo61426a(da, j3);
                }
                bhba.mo61420a();
            }
            if (m100552a()) {
                bsax.mo70107a(5, bsax2);
            }
            if (ceze.m138463h()) {
                this.f118224b.mo62626a((buna) da.mo74062i());
            }
            this.f118223a = c;
        }
    }
}
