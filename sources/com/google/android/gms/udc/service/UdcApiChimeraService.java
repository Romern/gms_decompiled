package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcApiChimeraService extends zzx {
    public UdcApiChimeraService() {
        super(35, "com.google.android.gms.udc.service.START", Collections.emptySet(), 1, 9);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        Account account = getServiceRequest.f30234h;
        int callingUid = Binder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            avfd avfd = new avfd(this, aaag.m21013a(), account, str, callingUid);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            aaac.mo16652a(avfd);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
