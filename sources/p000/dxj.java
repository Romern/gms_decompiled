package p000;

import android.content.Context;
import java.util.Collection;

/* renamed from: dxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxj extends dxd {

    /* renamed from: f */
    private final Collection f14359f;

    public dxj(Context context, doh doh, Collection collection, dwu dwu, dqb dqb) {
        super(context, "ReportServerFenceResultsTask", doh, "reportfenceresults", 12555, 13, bxji.f163641b, cdhr.m133452b(), dwu, dqb, null);
        sdo.m34959a(collection);
        this.f14359f = collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxjd mo9827a(bxxc bxxc) {
        bxjd bxjd = ((bxji) bxxc).f163643a;
        return bxjd == null ? bxjd.f163616c : bxjd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo9830c() {
        bxvd da = bxjh.f163636d.mo74144da();
        bxjc a = dwv.m9720a(this.f14340c, this.f14341d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjh bxjh = (bxjh) da.f164949b;
        a.getClass();
        bxjh.f163639b = a;
        bxjh.f163638a |= 1;
        for (duu duu : this.f14359f) {
            int a2 = bxjz.m122790a(duu.f14129l);
            if (a2 == 0) {
                a2 = 1;
            }
            bxvd da2 = bxjw.f163692e.mo74144da();
            bxvd da3 = bxjx.f163698d.mo74144da();
            String str = duu.f14118a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxjx bxjx = (bxjx) da3.f164949b;
            str.getClass();
            int i = bxjx.f163700a | 1;
            bxjx.f163700a = i;
            bxjx.f163701b = str;
            long j = duu.f14120c;
            bxjx.f163700a = i | 2;
            bxjx.f163702c = j;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxjw bxjw = (bxjw) da2.f164949b;
            bxjx bxjx2 = (bxjx) da3.mo74062i();
            bxjx2.getClass();
            bxjw.f163695b = bxjx2;
            bxjw.f163694a |= 1;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxjw bxjw2 = (bxjw) da2.f164949b;
            bxjw2.f163696c = a2 - 1;
            int i2 = bxjw2.f163694a | 2;
            bxjw2.f163694a = i2;
            long j2 = duu.f14132o;
            bxjw2.f163694a = i2 | 4;
            bxjw2.f163697d = j2;
            bxjw bxjw3 = (bxjw) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxjh bxjh2 = (bxjh) da.f164949b;
            bxjw3.getClass();
            if (!bxjh2.f163640c.mo73666a()) {
                bxjh2.f163640c = GeneratedMessageLite.m124021a(bxjh2.f163640c);
            }
            bxjh2.f163640c.add(bxjw3);
            duu.f14134q = 2;
        }
        new Object[1][0] = da.mo74062i();
        return (bxjh) da.mo74062i();
    }
}
