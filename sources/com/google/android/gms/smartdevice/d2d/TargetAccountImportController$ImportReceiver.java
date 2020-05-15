package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetAccountImportController$ImportReceiver extends aacn {

    /* renamed from: a */
    public final /* synthetic */ ardy f107935a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TargetAccountImportController$ImportReceiver(ardy ardy) {
        super("smartdevice");
        this.f107935a = ardy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        ardy.f87480a.mo25409a("Received broadcast %s", intent);
        String action = intent.getAction();
        if ("com.google.android.gms.smartdevice.setup.RESTORE_DATA".equals(action)) {
            this.f107935a.f87481b.post(new ardw(this, intent));
        } else if ("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(action)) {
            this.f107935a.f87481b.post(new ardx(this, intent.getStringArrayExtra("key_extra_ids")));
        } else {
            ardy.f87480a.mo25418e("Unexpected broadcast action %s", action);
        }
    }
}
