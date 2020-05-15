package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CloudNodeAdapter$EventHandler$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ Semaphore f110976a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloudNodeAdapter$EventHandler$1(String str, Semaphore semaphore) {
        super(str);
        this.f110976a = semaphore;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (Log.isLoggable("CloudNode", 3)) {
            Log.d("CloudNode", "Checkin Complete received.");
        }
        this.f110976a.release();
    }
}
