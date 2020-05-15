package com.google.android.gms.auth.api.proxy;

import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthChimeraService extends sjh {

    /* renamed from: a */
    public static final Map f10295a = Collections.synchronizedMap(new HashMap());

    public AuthChimeraService() {
        super(16, "com.google.android.gms.auth.service.START", bnic.m109489a("android.permission.INTERNET"), 3, 10);
    }

    /* renamed from: a */
    public static void m6408a(ClientContext clientContext, ibk ibk) {
        f10295a.put(clientContext, new WeakReference(ibk));
    }

    /* renamed from: a */
    public final sjn mo7517a() {
        return sjn.m35483a(this, this.f44565c, this.f44566d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        String string = getServiceRequest.f30233g.getString("consumerPkg");
        ClientContext clientContext = new ClientContext(Binder.getCallingUid(), getServiceRequest.f30234h, getServiceRequest.mo17822a(), str, string == null ? str : string, null, null, getServiceRequest.f30233g);
        sjn a = mo7517a();
        m6408a(clientContext, new ibk(this, a, clientContext));
        a.mo25649a(new ibv(sjj, Binder.getCallingUid(), getServiceRequest.f30233g, clientContext));
    }
}
