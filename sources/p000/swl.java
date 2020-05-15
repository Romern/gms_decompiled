package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.config.ConfigChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: swl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swl extends rzu {

    /* renamed from: a */
    final /* synthetic */ ConfigChimeraService f45289a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public swl(ConfigChimeraService configChimeraService, Context context) {
        super(context, 64, new int[0]);
        this.f45289a = configChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        ConfigChimeraService configChimeraService = this.f45289a;
        int i = ConfigChimeraService.f30430l;
        swz swz = configChimeraService.f30441k;
        swz.asBinder();
        sbj.mo16678a(0, swz, (Bundle) null);
    }
}
