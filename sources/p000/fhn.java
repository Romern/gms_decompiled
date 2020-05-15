package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequestBrokerChimeraService;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.request.service.C0557g;
import com.google.android.gms.ads.internal.request.service.C0567q;
import com.google.android.gms.ads.internal.request.service.C0570t;
import com.google.android.gms.ads.internal.request.service.C0571u;
import com.google.android.gms.ads.internal.request.service.C0572v;
import com.google.android.gms.ads.nonagon.load.service.C0780p;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: fhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fhn extends rzu {

    /* renamed from: a */
    final /* synthetic */ AdRequestBrokerChimeraService f16610a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fhn(AdRequestBrokerChimeraService adRequestBrokerChimeraService, Context context) {
        super(context, 8, new int[0]);
        this.f16610a = adRequestBrokerChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        this.f16610a.mo6370a();
        AdRequestBrokerChimeraService adRequestBrokerChimeraService = this.f16610a;
        if (!((Boolean) C0371o.f8243au.mo6604a()).booleanValue()) {
            sbj.mo16678a(0, C0557g.m5546a(adRequestBrokerChimeraService, C0567q.m5569a(adRequestBrokerChimeraService)), (Bundle) null);
            return;
        }
        fii a = fii.m11748a(adRequestBrokerChimeraService);
        Context context = a.f16639a.f16617a;
        C0557g a2 = C0557g.m5546a(context, C0567q.m5569a(context));
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable @Provides method");
        cazf.m127593a(new C0570t(), "Cannot return null from a non-@Nullable @Provides method");
        cazf.m127593a(a, "Cannot return null from a non-@Nullable @Provides method");
        Context a3 = fia.m11732a(a.f16639a);
        C0571u uVar = new C0571u(a3, new C0572v(a3).f8861b);
        cazf.m127593a(uVar, "Cannot return null from a non-@Nullable @Provides method");
        sbj.mo16678a(0, new fhr(a2, new C0780p(fia.m11732a(a.f16639a), (Executor) a.f16640b.mo6445a(), a, uVar, (HashMap) a.f16641c.mo6445a())), (Bundle) null);
    }
}
