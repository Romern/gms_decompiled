package com.google.android.gms.identity.accounts.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AccountDataApiService extends zzx {

    /* renamed from: a */
    private static final acyg f79108a = new acyf();

    /* renamed from: b */
    private final acyg f79109b;

    public AccountDataApiService() {
        this(f79108a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(this.f79109b.mo33238a(this));
    }

    public AccountDataApiService(acyg acyg) {
        super(9, "com.google.android.gms.accounts.ACCOUNT_SERVICE", Collections.emptySet(), 1, 10);
        this.f79109b = acyg;
    }
}
