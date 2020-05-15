package com.google.android.gms.auth.api.phone.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmsRetrieverApiChimeraService extends zzx {

    /* renamed from: a */
    private static final sek f10281a = new sek("SmsRetrieverApiChimeraService");

    /* renamed from: b */
    private static final bnic f10282b = bnic.m109489a("android.permission-group.SMS");

    public SmsRetrieverApiChimeraService() {
        this(sgj.SMS_RETRIEVER, "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START");
        f10281a.mo25412b("constructor", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        f10281a.mo25412b("onGetService", new Object[0]);
        aaac.mo16652a(new iak(this, getServiceRequest.f30230d));
    }

    private SmsRetrieverApiChimeraService(sgj sgj, String str) {
        this(sgj, str, f10282b, 3);
    }

    private SmsRetrieverApiChimeraService(sgj sgj, String str, Set set, int i) {
        super(sgj.mo3214a(), str, set, i, 10);
    }
}
