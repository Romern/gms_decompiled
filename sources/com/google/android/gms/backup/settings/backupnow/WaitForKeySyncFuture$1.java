package com.google.android.gms.backup.settings.backupnow;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WaitForKeySyncFuture$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ mui f29062a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaitForKeySyncFuture$1(mui mui, String str) {
        super(str);
        this.f29062a = mui;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        boolean z = true;
        mui.f34770a.mo25414c("Key sync broadcast received %s", intent);
        if (intent.getExtras() != null) {
            int intExtra = intent.getIntExtra("com.google.android.gms.auth.folsom.EXTRA_SYNC_RESULT", 1);
            mui mui = this.f29062a;
            if (intExtra != 0) {
                z = false;
            }
            mui.mo69138b(Boolean.valueOf(z));
            return;
        }
        this.f29062a.mo69138b((Object) false);
    }
}
