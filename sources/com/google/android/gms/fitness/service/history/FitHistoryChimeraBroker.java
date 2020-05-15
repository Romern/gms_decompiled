package com.google.android.gms.fitness.service.history;

import android.content.Intent;
import android.os.Message;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitHistoryChimeraBroker extends zme {
    public FitHistoryChimeraBroker() {
        super("com.google.android.gms.fitness.service.history.FitHistoryBroker");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo19167a() {
        return zai.f54889a.mo3214a();
    }

    public final boolean handleMessage(Message message) {
        if (mo31251c()) {
            return true;
        }
        stopSelf();
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zlz mo19168a(String str) {
        return new zne(this, str, this.f55437e, zsm.m46221a(this, this.f55436d, (int) cdzd.m135481j(), cdzd.m135480i(), (int) cdzd.m135482k(), (int) cdzd.m135478g(), (int) cdzd.m135479h(), this.f55438f.mo30889j(), this.f55438f.mo30874b(), this.f55438f.mo30869a()), this.f55438f, yup.m44878a(cdzd.f182003a.mo6606a().mo78590n()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19169a(Intent intent) {
        return "com.google.android.gms.fitness.HistoryApi".equals(intent.getAction());
    }
}
