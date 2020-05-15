package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInBrokerChimeraService extends zzx {
    public SignInBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        int i;
        String str = getServiceRequest.f30230d;
        sdo.m34959a(getServiceRequest.f30232f);
        HashSet hashSet = new HashSet(Arrays.asList(getServiceRequest.f30232f));
        int callingUid = Binder.getCallingUid();
        Bundle bundle = getServiceRequest.f30233g;
        ClassLoader classLoader = BinderWrapper.class.getClassLoader();
        sdo.m34959a(classLoader);
        bundle.setClassLoader(classLoader);
        String string = bundle.getString("com.google.android.gms.signin.internal.realClientPackageName");
        if (TextUtils.isEmpty(string)) {
            string = str;
            i = callingUid;
        } else if (rfz.m33557a(this).mo24608b(callingUid)) {
            try {
                i = svr.m36484b(this).mo26176b(string, 0).applicationInfo.uid;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(string);
                throw new SecurityException(valueOf.length() == 0 ? new String("Bad package name: ") : "Bad package name: ".concat(valueOf));
            }
        } else {
            throw new SecurityException("Caller is not a Google app!");
        }
        aqpg aqpg = new aqpg(this, string, hashSet, i, (Account) bundle.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount"), aqks.m71765a(bundle).mo47941a(), new aaag(this, this.f56354e, this.f56355f));
        if (getServiceRequest.mo17822a() != null) {
            aqpg.mo48021a(getServiceRequest.mo17822a(), hashSet);
        }
        aaac.mo16652a(aqpg);
    }
}
