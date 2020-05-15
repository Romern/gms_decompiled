package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiRadio$1 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ aioz f80661a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiRadio$1(aioz aioz, String str) {
        super(str);
        this.f80661a = aioz;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            srn srn = ailf.f69111a;
            return;
        }
        aioz aioz = this.f80661a;
        aioz.f69400a.execute(new aioy(this, intent));
    }
}
