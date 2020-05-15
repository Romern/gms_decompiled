package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: dxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxf extends dxd {

    /* renamed from: f */
    private final ContextData[] f14354f;

    /* renamed from: g */
    private final bxco f14355g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public dxf(Context context, doh doh, bxco bxco, ContextData[] contextDataArr, long j, dwu dwu, dqb dqb) {
        super(context, "ProduceContextTask", doh, r4, 12551, r6, bxiv.f163573e, j, dwu, dqb, null);
        String str;
        int i;
        if (doh != null && !doh.mo9338b()) {
            str = "producecontextinternal";
        } else {
            str = "produceanonymouscontext";
        }
        if (doh != null) {
            i = doh.mo9338b() ? 10 : 9;
        } else {
            i = 10;
        }
        this.f14354f = contextDataArr;
        this.f14355g = bxco;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxjd mo9827a(bxxc bxxc) {
        bxjd bxjd = ((bxiv) bxxc).f163576b;
        return bxjd == null ? bxjd.f163616c : bxjd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo9830c() {
        bxvd da = bxiu.f163567e.mo74144da();
        bxjc a = dwv.m9720a(this.f14340c, this.f14341d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxiu bxiu = (bxiu) da.f164949b;
        a.getClass();
        bxiu.f163570b = a;
        int i = bxiu.f163569a | 1;
        bxiu.f163569a = i;
        bxiu.f163571c = this.f14355g.f162973bD;
        bxiu.f163569a = i | 2;
        ContextData[] contextDataArr = this.f14354f;
        if (contextDataArr == null || (r2 = contextDataArr.length) == 0) {
            return (bxiu) da.mo74062i();
        }
        for (ContextData contextData : contextDataArr) {
            bxtx aL = contextData.mo18013c().mo73639aL();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxiu bxiu2 = (bxiu) da.f164949b;
            aL.getClass();
            if (!bxiu2.f163572d.mo73666a()) {
                bxiu2.f163572d = bxvk.m124021a(bxiu2.f163572d);
            }
            bxiu2.f163572d.add(aL);
        }
        return (bxiu) da.mo74062i();
    }
}
