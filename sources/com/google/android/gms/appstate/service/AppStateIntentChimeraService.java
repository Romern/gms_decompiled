package com.google.android.gms.appstate.service;

import android.content.Context;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppStateIntentChimeraService extends qkc {

    /* renamed from: a */
    public static final qke f9813a = new qke();

    public AppStateIntentChimeraService() {
        super("AppStateIntentService", f9813a);
    }

    /* renamed from: a */
    public static void m6237a(Context context, qke qke, gai gai) {
        int i = spn.f44932a;
        qke.offer(new gaj(gai));
        context.startService(spn.m35889g("com.google.android.gms.appstate.service.INTENT"));
    }
}
