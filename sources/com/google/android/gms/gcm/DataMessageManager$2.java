package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataMessageManager$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aajt f32768a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMessageManager$2(aajt aajt, String str) {
        super(str);
        this.f32768a = aajt;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        aajt aajt;
        aand aand;
        aamg aamg;
        String action = intent.getAction();
        if ((action.equals("android.intent.action.USER_ADDED") || action.equals("android.intent.action.USER_REMOVED") || action.equals("android.intent.action.USER_STARTING") || action.equals("android.intent.action.USER_STOPPED") || action.equals("android.intent.action.USER_STOPPING") || action.equals("android.intent.action.USER_SWITCHED")) && (aand = (aajt = this.f32768a).f28313p) != null && (aamg = aajt.f28300c) != null && aand.mo17093a()) {
            int i = -1;
            if ("android.intent.action.USER_STOPPING".equals(intent.getAction())) {
                i = intent.getIntExtra("android.intent.extra.user_handle", -1);
            }
            C1245ok okVar = new C1245ok();
            if (aamg.mo17014a(okVar, i)) {
                blmo blmo = (blmo) blmp.f126864r.mo74144da();
                if (blmo.f164950c) {
                    blmo.mo74035c();
                    blmo.f164950c = false;
                }
                blmp blmp = (blmp) blmo.f164949b;
                "com.google.android.gsf.gtalkservice".getClass();
                blmp.f126866a |= 16;
                blmp.f126870e = "com.google.android.gsf.gtalkservice";
                for (int i2 = 0; i2 < okVar.f26809h; i2++) {
                    aajt.m21356a(blmo, (String) okVar.mo15620b(i2), (String) okVar.mo15621c(i2));
                }
                aand.mo17091a(blmo);
            }
        }
    }
}
