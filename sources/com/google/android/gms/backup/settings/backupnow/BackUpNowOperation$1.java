package com.google.android.gms.backup.settings.backupnow;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackUpNowOperation$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ mug f29061a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackUpNowOperation$1(mug mug, String str) {
        super(str);
        this.f29061a = mug;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.intent.action.DREAMING_STOPPED".equals(intent.getAction())) {
            mug.f34754a.mo25409a("No longer in dreaming mode.", new Object[0]);
            this.f29061a.f34760g = false;
        }
    }
}
