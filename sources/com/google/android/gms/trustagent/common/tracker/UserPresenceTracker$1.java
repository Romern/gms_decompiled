package com.google.android.gms.trustagent.common.tracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserPresenceTracker$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ auoq f109156a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserPresenceTracker$1(auoq auoq, String str) {
        super(str);
        this.f109156a = auoq;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Bundle extras;
        if ("com.google.android.gms.trustagent.TRUST_STATE_CHANGED".equals(intent.getAction()) && (extras = intent.getExtras()) != null && extras.keySet().contains("is_trusted")) {
            boolean booleanExtra = intent.getBooleanExtra("is_trusted", false);
            StringBuilder sb = new StringBuilder(28);
            sb.append("Trust state changed to ");
            sb.append(booleanExtra);
            Log.i("Coffee-UserPresenceTracker", sb.toString());
            if (booleanExtra) {
                this.f109156a.mo50744e();
            }
        }
    }
}
