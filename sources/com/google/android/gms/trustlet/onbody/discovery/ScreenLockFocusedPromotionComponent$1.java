package com.google.android.gms.trustlet.onbody.discovery;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScreenLockFocusedPromotionComponent$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ View f109245a;

    /* renamed from: b */
    final /* synthetic */ auvn f109246b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenLockFocusedPromotionComponent$1(auvn auvn, String str, View view) {
        super(str);
        this.f109246b = auvn;
        this.f109245a = view;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("onbody_learn_more".equals(intent.getStringExtra("id"))) {
            auvn auvn = this.f109246b;
            View view = this.f109245a;
            int i = auvn.f92608a;
            auvn.mo50975a(view);
        }
    }
}
