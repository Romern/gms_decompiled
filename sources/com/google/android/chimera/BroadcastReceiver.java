package com.google.android.chimera;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BroadcastReceiver implements dix {

    /* renamed from: a */
    android.content.BroadcastReceiver f7610a;

    public final void abortBroadcast() {
        this.f7610a.abortBroadcast();
    }

    public final void clearAbortBroadcast() {
        this.f7610a.clearAbortBroadcast();
    }

    public final boolean getAbortBroadcast() {
        return this.f7610a.getAbortBroadcast();
    }

    public Object getChimeraImpl() {
        return this;
    }

    public android.content.BroadcastReceiver getContainerReceiver() {
        return this.f7610a;
    }

    public final boolean getDebugUnregister() {
        return this.f7610a.getDebugUnregister();
    }

    public final int getResultCode() {
        return this.f7610a.getResultCode();
    }

    public final String getResultData() {
        return this.f7610a.getResultData();
    }

    public final Bundle getResultExtras(boolean z) {
        return this.f7610a.getResultExtras(z);
    }

    public final BroadcastReceiver.PendingResult goAsync() {
        int i = Build.VERSION.SDK_INT;
        return this.f7610a.goAsync();
    }

    public final boolean isInitialStickyBroadcast() {
        return this.f7610a.isInitialStickyBroadcast();
    }

    public final boolean isOrderedBroadcast() {
        return this.f7610a.isOrderedBroadcast();
    }

    public abstract void onReceive(Context context, Intent intent);

    public IBinder peekService(Context context, Intent intent) {
        return this.f7610a.peekService(context, intent);
    }

    public final void setDebugUnregister(boolean z) {
        this.f7610a.setDebugUnregister(z);
    }

    public final void setOrderedHint(boolean z) {
        this.f7610a.setOrderedHint(z);
    }

    public void setProxy(android.content.BroadcastReceiver broadcastReceiver) {
        this.f7610a = broadcastReceiver;
    }

    public final void setResult(int i, String str, Bundle bundle) {
        this.f7610a.setResult(i, str, bundle);
    }

    public final void setResultCode(int i) {
        this.f7610a.setResultCode(i);
    }

    public final void setResultData(String str) {
        this.f7610a.setResultData(str);
    }

    public final void setResultExtras(Bundle bundle) {
        this.f7610a.setResultExtras(bundle);
    }
}
