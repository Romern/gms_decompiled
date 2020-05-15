package com.google.android.gms.backup.common.play;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.concurrent.CancellationException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaySetupServiceV2Proxy$2 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ bqgy f29013a;

    /* renamed from: b */
    final /* synthetic */ lzt f29014b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaySetupServiceV2Proxy$2(lzt lzt, Handler handler, bqgy bqgy) {
        super(handler);
        this.f29014b = lzt;
        this.f29013a = bqgy;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        if (i == 0) {
            lzt lzt = this.f29014b;
            Intent intent = lzt.f33291a;
            lzt.f33292b.mo25414c("App updates paused", new Object[0]);
            this.f29013a.mo69138b((Object) null);
        } else if (i == 2) {
            lzt lzt2 = this.f29014b;
            Intent intent2 = lzt.f33291a;
            lzt2.f33292b.mo25414c("App updates pause cancelled", new Object[0]);
            this.f29013a.mo69136a((Throwable) new CancellationException());
        } else {
            lzt lzt3 = this.f29014b;
            Intent intent3 = lzt.f33291a;
            lzt3.f33292b.mo25414c("Pause app updates result: %d", Integer.valueOf(i));
        }
    }
}
