package com.google.android.gms.search.service;

import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SearchAuthChimeraService extends zzx {
    public SearchAuthChimeraService() {
        super(73, "com.google.android.gms.search.service.SEARCH_AUTH_START", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaag.m21013a();
        Binder.getCallingUid();
        aaac.mo16652a(new aptg());
    }
}
