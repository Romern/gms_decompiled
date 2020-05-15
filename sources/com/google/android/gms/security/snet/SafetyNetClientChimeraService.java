package com.google.android.gms.security.snet;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SafetyNetClientChimeraService extends apyj {

    /* renamed from: b */
    public static final Set f107558b = new HashSet();

    /* renamed from: a */
    public static void m92416a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, OperationLauncherIntentOperation.class, "com.google.android.gms.security.snet.XLB_UPDATE"));
    }

    public final void onDestroy() {
        if (aqbj.f85558b) {
            aqbj.m71298b();
        }
    }

    /* renamed from: a */
    public static void m92417a(HarmfulAppsInfo harmfulAppsInfo) {
        f107558b.clear();
        if (harmfulAppsInfo != null) {
            HarmfulAppsData[] harmfulAppsDataArr = harmfulAppsInfo.f107319b;
            for (HarmfulAppsData harmfulAppsData : harmfulAppsDataArr) {
                f107558b.add(C1240of.m19758a(harmfulAppsData.f107315a, new apgr(harmfulAppsData.f107316b)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new aqdn(this, aaag.m21013a(), getServiceRequest.f30230d));
    }
}
