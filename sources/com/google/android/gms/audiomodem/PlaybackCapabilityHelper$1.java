package com.google.android.gms.audiomodem;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaybackCapabilityHelper$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ gec f9885a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaybackCapabilityHelper$1(gec gec, String str) {
        super(str);
        this.f9885a = gec;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int intExtra;
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG") && ((intExtra = intent.getIntExtra("state", -1)) == 0 || intExtra == 1)) {
            this.f9885a.mo11723c();
        }
        if (intent.getAction().equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED") || intent.getAction().equals("android.media.SCO_AUDIO_STATE_CHANGED")) {
            int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            if (intExtra2 == 0 || intExtra2 == 1 || intExtra2 == 2) {
                this.f9885a.mo11723c();
            }
        }
    }
}
