package p000;

import android.content.Context;
import android.service.autofill.SaveInfo;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ClientState;

/* renamed from: lfk */
final /* synthetic */ class lfk implements bqeh {

    /* renamed from: a */
    private final lfm f25979a;

    /* renamed from: b */
    private final kjp f25980b;

    /* renamed from: c */
    private final kca f25981c;

    /* renamed from: d */
    private final ClientState f25982d;

    public lfk(lfm lfm, kjp kjp, kca kca, ClientState clientState) {
        this.f25979a = lfm;
        this.f25980b = kjp;
        this.f25981c = kca;
        this.f25982d = clientState;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        lfm lfm = this.f25979a;
        kjp kjp = this.f25980b;
        kca kca = this.f25981c;
        ClientState clientState = this.f25982d;
        bmxv bmxv = (bmxv) obj;
        if (!bmxv.mo66813a()) {
            return bqga.m112775a(lei.f25877b);
        }
        if (!((lcg) bmxv.mo66814b()).f25783a.mo66813a()) {
            return bqga.m112775a(((lcg) bmxv.mo66814b()).f25788f ? lei.f25878c : lei.f25877b);
        }
        lcg lcg = (lcg) bmxv.mo66814b();
        if (lfm.f25988f.mo66813a()) {
            ((MetricsContext) lfm.f25988f.mo66814b()).mo7955a(new MetricsContext.FillContext(kwv.m18704a(kjp), bngx.m109376e(), lcg.f25784b, true));
        }
        if (lfm.f25985c.mo15089i()) {
            kwe.m18646a((Context) null).mo14890b(lcg.f25784b.mo3214a());
        }
        kca.mo14362a((SaveInfo) lcg.f25783a.mo66814b());
        kca.mo14360a(clientState.mo7976b());
        bmxv c = bmxv.m108567c(kca.mo14359a());
        return bqga.m112775a(new lei(c, true, c.mo66813a(), bmvz.f131120a));
    }
}
