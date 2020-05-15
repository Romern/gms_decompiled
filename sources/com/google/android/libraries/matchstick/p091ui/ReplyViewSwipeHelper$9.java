package com.google.android.libraries.matchstick.p091ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.google.android.libraries.matchstick.ui.ReplyViewSwipeHelper$9 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReplyViewSwipeHelper$9 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ azme f111251a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReplyViewSwipeHelper$9(azme azme, Handler handler) {
        super(handler);
        this.f111251a = azme;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f111251a.f99621g.animate().translationX(0.0f).alpha(1.0f).setDuration(this.f111251a.f99615a).setListener(null);
    }
}
