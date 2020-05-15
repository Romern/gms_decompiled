package com.google.android.gms.audiomodem;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioPlayer$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ gdd f9852a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioPlayer$1(gdd gdd, String str) {
        super(str);
        this.f9852a = gdd;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
            int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
            int intExtra3 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", -1);
            if (intExtra != -1 && intExtra2 != -1 && intExtra3 != -1 && intExtra2 != intExtra3 && intExtra == 3) {
                gdd gdd = this.f9852a;
                gdd.f17930j = intExtra2;
                gdd.mo11675c();
            }
        }
    }
}
