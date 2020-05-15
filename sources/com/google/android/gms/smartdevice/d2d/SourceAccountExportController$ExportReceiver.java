package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourceAccountExportController$ExportReceiver extends aacn {

    /* renamed from: a */
    public final /* synthetic */ aral f107912a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SourceAccountExportController$ExportReceiver(aral aral) {
        super("smartdevice");
        this.f107912a = aral;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        aral.f87205a.mo25409a("Received broadcast %s", intent);
        if (!"com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(intent.getAction())) {
            aral.f87205a.mo25418e("Unexpected broadcast action %s", intent.getAction());
            return;
        }
        this.f107912a.f87208d.execute(new arak(this, intent.getStringArrayExtra("key_extra_ids")));
    }
}
