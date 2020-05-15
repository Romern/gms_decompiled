package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetDirectTransferController$3 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ argm f107952a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TargetDirectTransferController$3(argm argm, Handler handler) {
        super(handler);
        this.f107952a = argm;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        argm argm = this.f107952a;
        sek sek = argm.f87667h;
        argm.mo48521h();
    }
}
