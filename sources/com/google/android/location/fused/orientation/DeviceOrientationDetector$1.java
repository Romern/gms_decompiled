package com.google.android.location.fused.orientation;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceOrientationDetector$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bfty f150766a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceOrientationDetector$1(bfty bfty, String str) {
        super(str);
        this.f150766a = bfty;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            bfty bfty = this.f150766a;
            int i = bfty.f115273l;
            bfty.f115288i = false;
            bfty.mo62267c();
            synchronized (this.f150766a.f115289j) {
                bfty bfty2 = this.f150766a;
                if (bfty2.f115281b) {
                    bfty2.mo62266b();
                }
            }
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            bfty bfty3 = this.f150766a;
            int i2 = bfty.f115273l;
            bfty3.f115288i = true;
            synchronized (bfty3.f115289j) {
                bfty bfty4 = this.f150766a;
                if (bfty4.f115281b) {
                    bfty4.mo62264a();
                }
            }
        }
    }
}
