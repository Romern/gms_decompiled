package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SignInInternalBrokerChimeraService extends zzx {
    public SignInInternalBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.INTERNAL_START", sft.m35178d(), 1, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        throw new UnsupportedOperationException();
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.signin.service.INTERNAL_START".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("SignInInternalBrokerSrv", valueOf.length() == 0 ? new String("request for unknown service ") : "request for unknown service ".concat(valueOf));
            return null;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.PACKAGE_NAME");
        bmxy.m108581a(stringExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SIGNIN_OPTIONS");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        Set a = stc.m36282a((String[]) bmxy.m108581a(intent.getStringArrayExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SCOPES")));
        int intExtra = intent.getIntExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.CALLING_UID", 0);
        int i = rfx.f42891a;
        return new aqpg(this, stringExtra, a, intExtra, (Account) bundleExtra.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount"), aqks.m71765a(bundleExtra).mo47941a(), new aaag(this, this.f56354e, this.f56355f));
    }
}
