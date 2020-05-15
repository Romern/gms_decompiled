package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FacsInternalSyncApiChimeraService extends zzx {

    /* renamed from: a */
    public static final bnsn f109381a = avex.m78396b();

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        Account account = getServiceRequest.f30234h;
        int callingUid = Binder.getCallingUid();
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = str;
        clientContext.f30216f = "com.google.android.gms";
        clientContext.f30212b = callingUid;
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        bnsi d = f109381a.mo68390d();
        d.mo68432a("com.google.android.gms.udc.service.FacsInternalSyncApiChimeraService", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Receiving API connection to internal FACS API...");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            avez avez = new avez(aaag.m21014a(this, this.f56354e, this.f56355f), clientContext, avgm.m78459a(this), avfo.m78445g(this), avfo.m78444f(this));
            Binder.restoreCallingIdentity(clearCallingIdentity);
            aaac.mo16652a(avez);
            bnsi d2 = f109381a.mo68390d();
            d2.mo68432a("com.google.android.gms.udc.service.FacsInternalSyncApiChimeraService", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("API connection successful!");
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public FacsInternalSyncApiChimeraService() {
        super(220, "com.google.android.gms.facs.internal.service.START", bnon.f131923a, 0, 10);
    }
}
