package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.lockbox.service.LockboxBrokerChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: aezp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezp extends rzt {

    /* renamed from: a */
    final /* synthetic */ LockboxBrokerChimeraService f64048a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aezp(LockboxBrokerChimeraService lockboxBrokerChimeraService, Context context) {
        super(context, 26, new int[0]);
        this.f64048a = lockboxBrokerChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        sbj.mo16678a(0, new aezd(this.f64048a, getServiceRequest.f30230d), (Bundle) null);
    }
}
