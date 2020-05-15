package com.google.android.libraries.matchstick.p091ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.google.android.libraries.matchstick.ui.ReplyViewSwipeHelper$7 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReplyViewSwipeHelper$7 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ azme f111249a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReplyViewSwipeHelper$7(azme azme, Handler handler) {
        super(handler);
        this.f111249a = azme;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        azme azme = this.f111249a;
        azme.mo55044a(azme.f99618d, azme.f99617c);
    }
}
