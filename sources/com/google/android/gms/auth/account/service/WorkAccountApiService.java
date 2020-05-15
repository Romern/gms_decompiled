package com.google.android.gms.auth.account.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WorkAccountApiService extends zzx {

    /* renamed from: a */
    private static final sek f10029a = ght.m13171a("WorkAccountApiService");

    /* renamed from: b */
    private gse f10030b;

    /* renamed from: k */
    private ily f10031k;

    public WorkAccountApiService() {
        super(120, "com.google.android.gms.auth.account.workaccount.START", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        f10029a.mo25412b("getting api service", new Object[0]);
        String str = getServiceRequest.f30230d;
        if (spn.m35869b()) {
            aaac.mo16652a(this.f10030b);
        } else if (str != null && this.f10031k.mo13132a(str)) {
            aaac.mo16652a(this.f10030b);
        } else {
            f10029a.mo25418e("Caller can't manage work accounts %s", str);
            aaac.mo16650a(13, Bundle.EMPTY);
        }
    }

    public final void onCreate() {
        this.f10030b = new gse(this, this.f56354e);
        this.f10031k = (ily) ily.f21320d.mo13145b();
    }
}
