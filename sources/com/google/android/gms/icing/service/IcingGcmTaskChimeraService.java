package com.google.android.gms.icing.service;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IcingGcmTaskChimeraService extends aeah {
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        absg.m48186a("%s: Running gcm task %s", "IcingGcmTaskChimeraService", aecc.f63128a);
        Intent intent = new Intent("com.google.android.gms.icing.GCM_TASK");
        intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        intent.putExtra("tag", aecc.f63128a);
        startService(intent);
        return 0;
    }
}
