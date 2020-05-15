package p000;

import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;

/* renamed from: lbo */
final /* synthetic */ class lbo implements bqeh {

    /* renamed from: a */
    private final lbu f25740a;

    /* renamed from: b */
    private final lcf f25741b;

    public lbo(lbu lbu, lcf lcf) {
        this.f25740a = lbu;
        this.f25741b = lcf;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        lbu lbu = this.f25740a;
        lcf lcf = this.f25741b;
        awlm a = GetSaveInstrumentDetailsRequest.m93938a();
        a.mo52244a(lcf.f25777a.f23817a);
        a.mo52243a(((Long) ((bmxv) obj).mo66812a((Object) 0L)).longValue());
        return lqv.m19545a(lbu.f25757c.mo52199a(a.mo52242a()));
    }
}
