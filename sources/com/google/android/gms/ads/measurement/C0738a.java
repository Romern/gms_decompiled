package com.google.android.gms.ads.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.measurement.service.C0744b;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.measurement.module.Analytics;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.ads.measurement.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0738a extends rzu {

    /* renamed from: a */
    final /* synthetic */ GmpConversionTrackingBrokerChimeraService f9152a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C0738a(GmpConversionTrackingBrokerChimeraService gmpConversionTrackingBrokerChimeraService, Context context) {
        super(context, 95, new int[0]);
        this.f9152a = gmpConversionTrackingBrokerChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        C0744b bVar;
        rfz.m33557a(this.f43904d).mo24605a(getServiceRequest.f30230d);
        GmpConversionTrackingBrokerChimeraService gmpConversionTrackingBrokerChimeraService = this.f9152a;
        synchronized (C0744b.f9156a) {
            if (C0744b.f9157b == null) {
                if (gmpConversionTrackingBrokerChimeraService.getApplicationContext() != null) {
                    gmpConversionTrackingBrokerChimeraService.getApplicationContext();
                }
                C0744b.f9157b = new C0744b(Analytics.getInstance(gmpConversionTrackingBrokerChimeraService), agje.m54353a(gmpConversionTrackingBrokerChimeraService));
            }
            bVar = C0744b.f9157b;
        }
        try {
            sbj.mo16678a(0, bVar, (Bundle) null);
        } catch (RemoteException e) {
            C0633h.m5673d("Client died while brokering conversion tracking service.", e);
        }
    }
}
