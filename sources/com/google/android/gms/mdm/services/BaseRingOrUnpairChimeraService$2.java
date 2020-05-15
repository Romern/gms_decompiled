package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseRingOrUnpairChimeraService$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ afzm f80053a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRingOrUnpairChimeraService$2(afzm afzm, String str) {
        super(str);
        this.f80053a = afzm;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            afyu.m53687a(new cake[]{cake.SUCCESS}, this.f80053a.f65022g, afzw.m53778a(context), afzw.m53776a());
            this.f80053a.stopSelf();
        }
    }
}
