package com.google.android.gms.fido.fido2.pollux;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserApprovalPromptController$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ xuh f31850a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserApprovalPromptController$1(xuh xuh, String str) {
        super(str);
        this.f31850a = xuh;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        xuh.f53152i.mo25414c("screenUnlockReceiver triggered...", new Object[0]);
        xuh xuh = this.f31850a;
        xuh.f53157e.mo30194a(xuh.f53153a, xaj.TYPE_USER_UNLOCKS_SCREEN);
        xuh xuh2 = this.f31850a;
        if (xuh2.f53159g == 2) {
            xuh2.mo30155b();
        }
    }
}
