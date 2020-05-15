package com.google.android.gms.trustagent.trustlet.device.p073ui;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.trustagent.trustlet.device.ui.TrustedDeviceSelectionFragment$1 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustedDeviceSelectionFragment$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ String f109209a;

    /* renamed from: b */
    final /* synthetic */ auuh f109210b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrustedDeviceSelectionFragment$1(auuh auuh, String str, String str2) {
        super(str);
        this.f109210b = auuh;
        this.f109209a = str2;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        auuh auuh;
        boolean z;
        String str;
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 10) {
                auuh = this.f109210b;
                z = false;
                str = this.f109209a;
            } else if (intExtra == 12) {
                auuh = this.f109210b;
                z = true;
                str = "";
            } else {
                return;
            }
            auuh.mo50932a(z, str);
        }
    }
}
