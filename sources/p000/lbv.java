package p000;

import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;

/* renamed from: lbv */
final /* synthetic */ class lbv implements bqeh {

    /* renamed from: a */
    private final lce f25759a;

    /* renamed from: b */
    private final lcf f25760b;

    public lbv(lce lce, lcf lcf) {
        this.f25759a = lce;
        this.f25760b = lcf;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        lce lce = this.f25759a;
        lcf lcf = this.f25760b;
        awlm a = GetSaveInstrumentDetailsRequest.m93938a();
        a.mo52244a(lcf.f25777a.f23817a);
        a.mo52243a(((Long) ((bmxv) obj).mo66812a((Object) 0L)).longValue());
        return lqv.m19545a(lce.f25775d.mo52199a(a.mo52242a()));
    }
}
