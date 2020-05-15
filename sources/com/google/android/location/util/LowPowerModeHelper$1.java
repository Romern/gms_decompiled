package com.google.android.location.util;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LowPowerModeHelper$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bhca f150967a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LowPowerModeHelper$1(bhca bhca, String str) {
        super(str);
        this.f150967a = bhca;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(action)) {
            bhca bhca = this.f150967a;
            boolean c = bhca.mo63547c();
            if (bhca.f118279a != c) {
                bhca.f118279a = c;
                bhca.mo63546b(false);
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.f150967a.mo63544a(false);
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            this.f150967a.mo63544a(true);
        }
    }
}
