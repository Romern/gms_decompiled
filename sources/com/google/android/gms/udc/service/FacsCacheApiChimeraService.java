package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FacsCacheApiChimeraService extends zzx {

    /* renamed from: a */
    public static final bnsn f109379a = avex.m78396b();

    /* renamed from: b */
    ExecutorService f109380b = snp.m35704b(10);

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac aaac2 = aaac;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        bnsi d = f109379a.mo68390d();
        d.mo68432a("com.google.android.gms.udc.service.FacsCacheApiChimeraService", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Receiving API connection to FACS API from package '%s'...", getServiceRequest2.f30230d);
        if (chbh.m148007e()) {
            String str = getServiceRequest2.f30230d;
            Account account = getServiceRequest2.f30234h;
            int callingUid = Binder.getCallingUid();
            ClientContext clientContext = new ClientContext();
            clientContext.f30215e = str;
            clientContext.f30216f = "com.google.android.gms";
            clientContext.f30212b = callingUid;
            clientContext.f30214d = account;
            clientContext.f30213c = account;
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                aaag a = aaag.m21014a(this, this.f56354e, this.f56355f);
                aaag a2 = aaag.m21014a(this, this.f56354e, this.f109380b);
                avgm a3 = avgm.m78459a(this);
                avfu a4 = avfv.m78451a(this);
                avfh avfh = new avfh(new avcd(this, account));
                aeeh g = avfo.m78445g(this);
                Executor f = avfo.m78444f(this);
                aveu d2 = avfo.m78442d(getApplicationContext());
                avfk avfk = avfo.m78438a(getApplicationContext()).f93092b;
                aytg aytg = new aytg();
                wek wek = new wek(account);
                String str2 = "com.google.android.gms.udc.service.FacsCacheApiChimeraService";
                sdo.checkIfNull(wek, "Must provide non-null options!");
                avey avey = new avey(account, a, a2, clientContext, a3, a4, avfh, g, f, d2, avfk, aytg, new wfh(this, wek));
                Binder.restoreCallingIdentity(clearCallingIdentity);
                aaac2.mo16652a(avey);
                bnsi d3 = f109379a.mo68390d();
                d3.mo68432a(str2, "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68405a("API connection successful!");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        } else {
            aaac2.mo16650a(16, (Bundle) null);
            bnsi c = f109379a.mo68388c();
            c.mo68432a("com.google.android.gms.udc.service.FacsCacheApiChimeraService", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("API connection rejected!");
        }
    }

    public FacsCacheApiChimeraService() {
        super(202, "com.google.android.gms.facs.cache.service.START", bnon.f131923a, 1, 9);
    }
}
