package com.google.android.gms.trustagent.common.trustlet;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AbstractOneTimeAuthTrustletService$1 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ auot f109157a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractOneTimeAuthTrustletService$1(auot auot, String str) {
        super(str);
        this.f109157a = auot;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.USER_PRESENT".equals(action)) {
            auot.f92213a.mo50711a("user present", new Object[0]);
            this.f109157a.mo50745a(0);
        }
        if ("android.intent.action.SCREEN_OFF".equals(action) || "android.intent.action.USER_PRESENT".equals(action)) {
            auot.f92213a.mo50711a("screen off", new Object[0]);
            this.f109157a.mo50756j();
            auot auot = this.f109157a;
            if (auot.f92215c) {
                auot.f92215c = false;
                auot.mo50750c(false);
                this.f109157a.mo50776t("User present. Revoking one time auth.");
                this.f109157a.mo50778u("release_one_time_trust");
            }
        } else if ("android.intent.action.SCREEN_ON".equals(action) && this.f109157a.mo50767l()) {
            auot auot2 = this.f109157a;
            aunx aunx = auot.f92213a;
            if (!auot2.mo50755i()) {
                auot.f92213a.mo50711a("screen on", new Object[0]);
                bqga.m112781a(this.f109157a.f92216d.mo50741a(), new auos(this), new aupl());
            }
        }
    }
}
