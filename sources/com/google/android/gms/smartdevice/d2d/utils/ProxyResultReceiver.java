package com.google.android.gms.smartdevice.d2d.utils;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProxyResultReceiver extends ResultReceiver {

    /* renamed from: a */
    private final WeakReference f108049a;

    public ProxyResultReceiver(Handler handler, arqe arqe) {
        super(handler);
        this.f108049a = new WeakReference(arqe);
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        arqe arqe = (arqe) this.f108049a.get();
        if (arqe != null) {
            arqe.mo48435a(i, bundle);
        }
    }
}
