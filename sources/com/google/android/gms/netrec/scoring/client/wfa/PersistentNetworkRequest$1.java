package com.google.android.gms.netrec.scoring.client.wfa;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersistentNetworkRequest$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aklk f81199a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentNetworkRequest$1(aklk aklk, String str) {
        super(str);
        this.f81199a = aklk;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(intent.getAction())) {
            aklk aklk = this.f81199a;
            int i = aklk.f72200k;
            if (!aklk.mo39541a()) {
                synchronized (this.f81199a.f72204f) {
                    aklk aklk2 = this.f81199a;
                    aklk2.f72205g = null;
                    aklk2.mo39543d();
                }
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            aklk aklk3 = this.f81199a;
            if (uptimeMillis > aklk3.f72208j) {
                int i2 = eoa.f15378a;
                aklk3.mo39542c();
            }
        }
    }
}
