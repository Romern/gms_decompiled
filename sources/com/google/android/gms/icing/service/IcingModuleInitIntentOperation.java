package com.google.android.gms.icing.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IcingModuleInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        absg.m48203d("IcingModuleInitIntentOperation.onInitRuntimeState: got intent: %s with flag %d", intent, Integer.valueOf(i));
        Context baseContext = getBaseContext();
        int i2 = i & 2;
        if ((i & 12) > 0) {
            absg.m48201d("IcingModuleInitIntentOperation.onInitRuntimeState: module or container updated.");
            acni.m49501a(baseContext);
        } else if (i2 > 0) {
            absg.m48201d("IcingModuleInitIntentOperation.onInitRuntimeState: boot completed.");
        } else {
            absg.m48201d("IcingModuleInitIntentOperation.onInitRuntimeState: Nothing happened returning.");
            return;
        }
        acni.m49503b(baseContext);
        SystemEventIntentOperation.m66745a(baseContext, intent);
        IcingInternalCorporaUpdateChimeraService.m66709b(baseContext);
        if (((Boolean) abzt.f58912b.mo58455c()).booleanValue()) {
            aeat a = aeat.m51532a(rpr.m34216b());
            aebl aebl = new aebl();
            aebl.f63099k = "InternalCorporaMaintenance";
            aebl.f63102n = true;
            aebl.mo34026a(((Boolean) abzt.f58984d.mo58455c()).booleanValue());
            aebl.mo34023a(2);
            aebl.mo34024a(1, 1);
            aebl.f63097i = "com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateService";
            aebl.mo34027b(1);
            long longValue = ((Long) abzt.f58965c.mo58455c()).longValue();
            long longValue2 = ((Long) abzt.f58985e.mo58455c()).longValue();
            if (!cdny.m134346k()) {
                aebl.f63070a = longValue;
                aebl.f63071b = longValue2;
            } else {
                aebl.mo34009a(aebh.m51568a(longValue));
            }
            a.mo33984a(aebl.mo33974b());
            acnv.m49541a("Internal Corpora Maintenance is scheduled");
        }
        if (acbm.m48831a()) {
            acbp.m48832a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        absg.m48203d("IcingModuleInitIntentOperation.onModuleUpdated got intent: %s (containerUpdated=%b)", intent, Boolean.valueOf(z));
    }
}
