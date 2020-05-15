package com.google.android.gms.wearable.node.ble;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IosSystemServicesHandler$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aycf f110991a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IosSystemServicesHandler$1(aycf aycf, String str) {
        super(str);
        this.f110991a = aycf;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.clockwork.settings.ACTION_SET_HOME_READY".equals(intent.getAction())) {
            aycf aycf = this.f110991a;
            aycf.f97112e = false;
            aycf.f97108a.unregisterReceiver(aycf.f97111d);
            this.f110991a.f97110c.set(true);
            this.f110991a.f97117j.f97030a.mo53895b(17);
        }
    }
}
