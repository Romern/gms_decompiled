package p000;

import android.app.assist.AssistStructure;
import android.content.Context;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ClientState;

/* renamed from: lne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lne implements lis {

    /* renamed from: a */
    private final Context f26439a;

    /* renamed from: b */
    private final AssistStructure f26440b;

    /* renamed from: c */
    private final bmxv f26441c;

    public lne(Context context, AssistStructure assistStructure, bmxv bmxv) {
        this.f26439a = context.getApplicationContext();
        this.f26440b = assistStructure;
        this.f26441c = bmxv;
    }

    /* renamed from: a */
    public final Object mo15181a() {
        return "future_key";
    }

    /* renamed from: b */
    public final bqgg mo15182b() {
        kuw kuw;
        if (this.f26441c.mo66813a()) {
            kuw = krc.m18382a(this.f26439a).mo14826a(this.f26439a, (MetricsContext) this.f26441c.mo66814b());
        } else {
            kuw = krc.m18382a(this.f26439a).mo14825a(this.f26439a);
        }
        return bqdx.m112674a(kuw.mo14864b().mo15036a(snp.m35702a(9), new leh(0, this.f26440b, ClientState.m7165a(), -1)), lnd.f26438a, snp.m35702a(9));
    }
}
