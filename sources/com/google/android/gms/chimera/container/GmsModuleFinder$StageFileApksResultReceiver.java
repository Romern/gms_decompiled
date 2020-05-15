package com.google.android.gms.chimera.container;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsModuleFinder$StageFileApksResultReceiver extends ResultReceiver {

    /* renamed from: a */
    public ArrayBlockingQueue f29976a = new ArrayBlockingQueue(1);

    public GmsModuleFinder$StageFileApksResultReceiver(Handler handler) {
        super(handler);
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        try {
            this.f29976a.add(Integer.valueOf(i));
        } catch (IllegalStateException e) {
            Log.w("GmsModuleFndr", "Duplicate result received");
        }
    }
}
