package com.google.android.gms.backup.settings.component;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackUpNowApiChimeraService extends zzx {

    /* renamed from: a */
    private final muh f29063a = new muh();

    public BackUpNowApiChimeraService() {
        super(175, "com.google.android.gms.backup.ACTION_BACKUP_NOW", Collections.emptySet(), ccll.m130464b() ? 1 : 0, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (!ccll.m130464b() || ccll.f179359a.mo6606a().mo76295a().f165797a.contains(getServiceRequest.f30230d)) {
            aaac.mo16652a(new mua(this, aaag.m21013a(), this.f29063a));
        } else {
            aaac.mo16650a(16, new Bundle());
        }
    }
}
