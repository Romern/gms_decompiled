package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClientListeners$UserReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ squ f30402a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClientListeners$UserReceiver(squ squ) {
        super("common-base");
        this.f30402a = squ;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.intent.action.USER_SWITCHED".equals(intent.getAction())) {
            this.f30402a.mo25987a(false);
        }
    }
}
