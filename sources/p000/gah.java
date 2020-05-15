package p000;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.appstate.service.AppStateAndroidChimeraService;
import com.google.android.gms.appstate.service.AppStateIntentChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: gah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gah extends rzu {

    /* renamed from: a */
    final /* synthetic */ AppStateAndroidChimeraService f17787a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gah(AppStateAndroidChimeraService appStateAndroidChimeraService, Context context) {
        super(context, 7, new int[0]);
        this.f17787a = appStateAndroidChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        AppStateIntentChimeraService.m6237a(this.f17787a, AppStateIntentChimeraService.f9813a, new gas(sbj, Binder.getCallingUid(), getServiceRequest.f30230d, getServiceRequest.f30234h, getServiceRequest.mo17822a(), stc.m36284a(getServiceRequest.f30232f), rzu.m34713a(getServiceRequest)));
    }
}
