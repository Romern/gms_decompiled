package p000;

import android.os.Bundle;

/* renamed from: kbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kbm implements kbj {

    /* renamed from: a */
    public static final srn f23698a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final kpk f23699b;

    /* renamed from: c */
    private final rjx f23700c;

    public kbm(rjx rjx, kpk kpk) {
        this.f23700c = rjx;
        this.f23699b = kpk;
    }

    /* renamed from: a */
    static final /* synthetic */ bnic m17596a(kcv kcv, Throwable th) {
        bnsl bnsl = (bnsl) f23698a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("kbm", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68448m();
        return bnic.m109489a(kcv);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bnic mo14348a(kcv kcv, bngx bngx) {
        bnia j = bnic.m109500j();
        j.mo67629b(kcv);
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            bxwc bxwc = ((byts) i.next()).f167715a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    j.mo67629b(this.f23699b.mo14763a(((bytw) bxwc.get(i2)).f167728b));
                } catch (kpi e) {
                    bnsl bnsl = (bnsl) f23698a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kbm", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68448m();
                }
            }
        }
        return j.mo67751a();
    }

    /* renamed from: a */
    public final bqgg mo14347a(kcv kcv) {
        return bqdf.m112619a(bqdx.m112673a(lqv.m19545a(this.f23700c.mo24693a(kcv.f23841b, new Bundle())), new kbk(this, kcv), bqfb.INSTANCE), Throwable.class, new kbl(kcv), bqfb.INSTANCE);
    }
}
