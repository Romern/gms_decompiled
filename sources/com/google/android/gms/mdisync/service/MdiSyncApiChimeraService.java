package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdiSyncApiChimeraService extends zzx {

    /* renamed from: a */
    private static final bnsn f80034a = afvx.m53604b();

    /* renamed from: b */
    private final bmzi f80035b;

    /* renamed from: k */
    private final bmxj f80036k;

    public MdiSyncApiChimeraService() {
        this(afwp.f64879a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        bnsi d = f80034a.mo68390d();
        d.mo68432a("com.google.android.gms.mdisync.service.MdiSyncApiChimeraService", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Receiving API connection from package '%s'...", getServiceRequest.f30230d);
        if (!cfgy.m139569f()) {
            aaac.mo16650a(16, (Bundle) null);
            bnsi c = f80034a.mo68388c();
            c.mo68432a("com.google.android.gms.mdisync.service.MdiSyncApiChimeraService", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("API connection rejected!");
            return;
        }
        Account account = getServiceRequest.f30234h;
        String str = getServiceRequest.f30230d;
        afub afub = (afub) this.f80036k.apply(account);
        aaag aaag = (aaag) this.f80035b.mo6606a();
        cazf.m127594a(aaag);
        afub.f64741a = aaag;
        cazf.m127594a(str);
        afub.f64742b = str;
        cazf.m127595a(afub.f64741a, aaag.class);
        cazf.m127595a(afub.f64742b, String.class);
        aaac.mo16652a((afxe) new afuc(afub.f64743c, afub.f64741a, afub.f64742b).f64744a.mo6445a());
        bnsi d2 = f80034a.mo68390d();
        d2.mo68432a("com.google.android.gms.mdisync.service.MdiSyncApiChimeraService", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("API connection successful!");
    }

    public MdiSyncApiChimeraService(bmxj bmxj) {
        super((int) BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR, "com.google.android.gms.mdisync.service.START", bnon.f131923a, 1, 9);
        this.f80035b = bmzn.m108681a((bmzi) new afwo(this));
        this.f80036k = bmxj;
    }
}
