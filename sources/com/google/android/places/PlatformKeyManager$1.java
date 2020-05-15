package com.google.android.places;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlatformKeyManager$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bhqp f151356a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlatformKeyManager$1(bhqp bhqp, String str) {
        super(str);
        this.f151356a = bhqp;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.places.PLATFORM_KEY_CHANGED_ACTION".equals(intent.getAction())) {
            bhqp bhqp = this.f151356a;
            bhqp.f119340a = bhqp.mo64169b();
            if (bhqp.f119340a == null && Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "Failed to read platform key from disk after key changed broadcast.");
            }
        }
    }
}
