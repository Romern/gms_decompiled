package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;

/* renamed from: apmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apmh extends aplq {

    /* renamed from: a */
    private final abrv f84724a;

    public apmh(abrv abrv, ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, abyy abyy) {
        super(bqbd.CLEAR_DEBUG_UI_CACHE, 1, 4, abrv.f58066b, clearDebugUiCacheCall$Request, abyy);
        this.f84724a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        try {
            abxp.m48475a(this.f84724a.f58066b).mo32413a(((ClearDebugUiCacheCall$Request) this.f84708n).f107357a);
            return new ClearDebugUiCacheCall$Response(Status.f30107a);
        } catch (Exception e) {
            this.f84724a.mo32331n().mo32456a("ClearDebugUiCacheTask", e, cema.m137239f());
            return new ClearDebugUiCacheCall$Response(Status.f30109c);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        return new ClearDebugUiCacheCall$Response(status);
    }
}
