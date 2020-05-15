package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.location.reporting.service.ReportingAndroidChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: bgxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxj extends rzt {

    /* renamed from: a */
    final /* synthetic */ ReportingAndroidChimeraService f117916a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgxj(ReportingAndroidChimeraService reportingAndroidChimeraService, Context context) {
        super(context, 22, new int[0]);
        this.f117916a = reportingAndroidChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        String str;
        ReportingAndroidChimeraService reportingAndroidChimeraService = this.f117916a;
        String str2 = getServiceRequest.f30230d;
        Bundle bundle = getServiceRequest.f30233g;
        if (bundle != null) {
            str = bundle.getString("real_client_package_name");
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
        } else {
            str = null;
        }
        sbj.mo16678a(0, new aeqk(reportingAndroidChimeraService, str2, str), (Bundle) null);
    }
}
