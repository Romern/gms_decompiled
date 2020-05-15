package com.google.android.gms.appinvite.service;

import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppInviteChimeraService extends sjh {

    /* renamed from: a */
    private fva f9761a;

    /* renamed from: i */
    private fuu f9762i;

    public AppInviteChimeraService() {
        super(new int[]{77, 106}, new String[]{"com.google.android.gms.appinvite.service.START", "com.google.android.gms.appinvite.service.START_INTERNAL"}, new HashSet(), 3, 9);
    }

    /* renamed from: a */
    static void m6193a() {
        if (Process.myUid() != Binder.getCallingUid()) {
            throw new SecurityException("Calling uid not permitted.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        if (this.f9761a == null) {
            this.f9761a = fva.m12456a(this);
        }
        if (this.f9762i == null) {
            this.f9762i = new fuu(getApplicationContext());
        }
        int i = getServiceRequest.f30228b;
        if (i == 77) {
            String str = getServiceRequest.f30230d;
            String string = getServiceRequest.f30233g.getString("authPackage");
            if (getPackageName().equals(string)) {
                m6193a();
            } else if (!str.equals(string)) {
                throw new SecurityException("invalid authPackage");
            }
            ClientContext clientContext = new ClientContext();
            clientContext.f30212b = Binder.getCallingUid();
            clientContext.f30215e = str;
            clientContext.f30216f = getPackageName();
            sjj.mo25645a(new fvn(sjn.m35483a(this, this.f44565c, this.f44566d), clientContext, this.f9761a, this.f9762i));
        } else if (i != 106) {
            sjj.mo25644a(16, null);
        } else {
            m6193a();
            ClientContext clientContext2 = new ClientContext();
            clientContext2.f30216f = getPackageName();
            clientContext2.f30212b = Binder.getCallingUid();
            clientContext2.f30214d = getServiceRequest.f30234h;
            clientContext2.f30213c = getServiceRequest.mo17822a();
            String string2 = getServiceRequest.f30233g.getString("realClientPackage");
            if (TextUtils.isEmpty(string2)) {
                string2 = getServiceRequest.f30230d;
            }
            clientContext2.f30215e = string2;
            Scope[] scopeArr = getServiceRequest.f30232f;
            if (scopeArr != null) {
                clientContext2.mo17799a(stc.m36284a(scopeArr));
            }
            sjj.mo25645a(new fvm(sjn.m35483a(this, this.f44565c, this.f44566d), clientContext2, this.f9761a));
        }
    }
}
