package com.google.android.gms.mdi.mobstore;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MobStoreFileService extends zzx {

    /* renamed from: a */
    public Context f80025a;

    /* renamed from: b */
    private afqj f80026b;

    public MobStoreFileService() {
        super(160, "com.google.android.mobstore.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        int i;
        if (ceni.f183073a.mo6606a().mo79433j()) {
            String str = getServiceRequest.f30230d;
            bmzi a = bmzn.m108681a((bmzi) new afqo(this));
            if (!spn.m35869b()) {
                rfz a2 = rfz.m33557a(this.f80025a);
                this.f80025a.getPackageManager();
                i = a2.mo24610b(str) ? 1 : 2;
            } else {
                i = 0;
            }
            afqr afqr = new afqr(a, str, i);
            befh a3 = befi.m94962a(this.f80025a);
            a3.mo60660a("mobstore");
            a3.mo60663b("mobstore_accounts.pb");
            aaac.mo16652a(new afqp(this, aaag.m21013a(), this.f80026b, str, afqr, new befv(new befa(Arrays.asList(beff.m94940a(this.f80025a).mo60653a())), a3.mo60657a())));
            return;
        }
        if (Log.isLoggable("MDD", 4)) {
            Log.i("MDD", bbev.m87903a("%s: is disabled", "MobStoreFileService"));
        }
        aaac.mo16650a(16, (Bundle) null);
    }

    public final void onCreate() {
        this.f80025a = getApplicationContext();
        Context context = this.f80025a;
        this.f80026b = new afoq(context, new bbfi(context), afor.m53373a(this.f80025a));
    }
}
