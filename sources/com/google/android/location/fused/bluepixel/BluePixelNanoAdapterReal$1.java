package com.google.android.location.fused.bluepixel;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluePixelNanoAdapterReal$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bftm f150763a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluePixelNanoAdapterReal$1(bftm bftm, String str) {
        super(str);
        this.f150763a = bftm;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!"com.google.android.gms.phenotype.COMMITTED".equals(action) || !"com.google.android.location".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(action)) {
                    bftm bftm = this.f150763a;
                    int i = bftm.f115220d;
                    if (bftm.f115222a.isPowerSaveMode()) {
                        this.f150763a.mo62250e();
                    } else {
                        this.f150763a.mo62249d();
                    }
                }
            } else if (!cest.m138205k()) {
                this.f150763a.mo62250e();
            } else if (!cest.m138206l()) {
                bftm bftm2 = this.f150763a;
                int i2 = bftm.f115220d;
                bftm2.mo62253g();
            }
        }
    }
}
