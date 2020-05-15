package com.google.android.gms.audiomodem;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaybackCapabilityHelper$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ gec f9886a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaybackCapabilityHelper$2(gec gec, String str) {
        super(str);
        this.f9886a = gec;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        gec gec;
        if (TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            gec = this.f9886a;
            gec.f18016j = true;
        } else if (TelephonyManager.EXTRA_STATE_IDLE.equals(intent.getStringExtra("state")) || TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
            gec = this.f9886a;
            gec.f18016j = false;
        } else {
            return;
        }
        gec.mo11723c();
    }
}
