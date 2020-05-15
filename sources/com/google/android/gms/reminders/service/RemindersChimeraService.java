package com.google.android.gms.reminders.service;

import android.accounts.Account;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemindersChimeraService extends zzx {
    public RemindersChimeraService() {
        super(18, "com.google.android.gms.reminders.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str;
        String str2 = getServiceRequest.f30230d;
        aaag a = aaag.m21013a();
        Account account = getServiceRequest.f30234h;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        aaac.mo16652a(new aouy(this, a, str2, str));
    }
}
