package p000;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ClientState;

/* renamed from: lnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lnh implements lnc {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo15290a(Object obj) {
        Boolean bool = (Boolean) obj;
        return null;
    }

    /* renamed from: a */
    public final lis mo15291a(lir lir, AssistStructure assistStructure, bmxv bmxv, Bundle bundle, int i) {
        ClientState a = ClientState.m7166a(bundle);
        if (bmxv.mo66813a()) {
            a.f11673e = (MetricsContext) bmxv.mo66814b();
        }
        return new lng(lir, assistStructure, a, i);
    }
}
