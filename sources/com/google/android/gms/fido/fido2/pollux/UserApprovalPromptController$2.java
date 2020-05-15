package com.google.android.gms.fido.fido2.pollux;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserApprovalPromptController$2 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ xuh f31851a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserApprovalPromptController$2(xuh xuh, Handler handler) {
        super(handler);
        this.f31851a = xuh;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i != -1) {
            xuh xuh = this.f31851a;
            sek sek = xuh.f53152i;
            xuh.f53160h.mo30116a(false);
        } else if (bundle.containsKey("ActivityCompletionExtra")) {
            xuh xuh2 = this.f31851a;
            sek sek2 = xuh.f53152i;
            if (xuh2.f53159g == 3) {
                xuh2.f53160h.mo30116a(false);
            }
        } else if (bundle.getBoolean("UserApprovalExtra", false)) {
            xuh xuh3 = this.f31851a;
            sek sek3 = xuh.f53152i;
            xuh3.f53159g = 4;
            xtb xtb = xuh3.f53160h;
            xtk.f53046k.mo25414c("  User approved, continuing...", new Object[0]);
            xtb.f53028b.mo30121a(xtb.f53027a);
        } else {
            xuh xuh4 = this.f31851a;
            sek sek4 = xuh.f53152i;
            xuh4.f53159g = 5;
            xuh4.f53160h.mo30116a(true);
        }
    }
}
