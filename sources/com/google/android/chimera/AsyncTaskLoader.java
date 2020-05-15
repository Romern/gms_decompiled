package com.google.android.chimera;

import android.content.Context;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class AsyncTaskLoader extends Loader {
    public AsyncTaskLoader(Context context) {
        super(context);
        setProxy(new AsyncTaskLoaderProxy(this, context));
    }

    public void cancelLoadInBackground() {
        getProxyCallbacks().superCancelLoadInBackground();
    }

    public C1132kg getContainerLoader() {
        return (C1132kg) this.proxy;
    }

    /* access modifiers changed from: protected */
    public deb getProxyCallbacks() {
        return (deb) this.proxyCallbacks;
    }

    public boolean isLoadInBackgroundCanceled() {
        return getProxyCallbacks().superIsLoadInBackgroundCanceled();
    }

    public abstract Object loadInBackground();

    public void onCanceled(Object obj) {
        getProxyCallbacks().superOnCanceled(obj);
    }

    /* access modifiers changed from: protected */
    public Object onLoadInBackground() {
        return getProxyCallbacks().superOnLoadInBackground();
    }

    public void setUpdateThrottle(long j) {
        getProxyCallbacks().superSetUpdateThrottle(j);
    }

    public void waitForLoader() {
    }
}
