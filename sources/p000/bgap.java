package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.location.internal.GoogleLocationManagerChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: bgap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgap extends rzu {

    /* renamed from: a */
    final /* synthetic */ GoogleLocationManagerChimeraService f115911a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgap(GoogleLocationManagerChimeraService googleLocationManagerChimeraService, Context context) {
        super(context, 23, new int[0]);
        this.f115911a = googleLocationManagerChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        Bundle bundle = getServiceRequest.f30233g;
        if (!bundle.containsKey("client_name") || !"activity_recognition".equals(bundle.getString("client_name"))) {
            this.f115911a.mo70875a(sbj, str);
            return;
        }
        Binder.getCallingPid();
        Binder.getCallingUid();
        this.f115911a.f150783a.post(new bgao(this, sbj, str));
    }
}
