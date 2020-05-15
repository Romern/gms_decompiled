package com.google.android.chimera;

import android.content.Context;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Loader {

    /* renamed from: Dk */
    private WeakHashMap f7641Dk;

    /* renamed from: b */
    private WeakHashMap f7642b;
    protected C1140ko proxy;
    protected deo proxyCallbacks;

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface OnLoadCanceledListener {
        void onLoadCanceled(Loader loader);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class OnLoadCanceledListenerWrapper implements C1138km {

        /* renamed from: a */
        OnLoadCanceledListener f7643a;

        public OnLoadCanceledListenerWrapper(OnLoadCanceledListener onLoadCanceledListener) {
            this.f7643a = onLoadCanceledListener;
        }

        public void onLoadCanceled(C1140ko koVar) {
            this.f7643a.onLoadCanceled(((deo) koVar).getModuleLoader());
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface OnLoadCompleteListener {
        void onLoadComplete(Loader loader, Object obj);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class OnLoadCompleteListenerWrapper implements C1139kn {

        /* renamed from: a */
        OnLoadCompleteListener f7644a;

        public OnLoadCompleteListenerWrapper(OnLoadCompleteListener onLoadCompleteListener) {
            this.f7644a = onLoadCompleteListener;
        }

        public void onLoadComplete(C1140ko koVar, Object obj) {
            this.f7644a.onLoadComplete(((deo) koVar).getModuleLoader(), obj);
        }
    }

    public Loader(Context context) {
        setProxy(new LoaderProxy(this, context));
    }

    public void abandon() {
        this.proxyCallbacks.superAbandon();
    }

    public boolean cancelLoad() {
        return this.proxyCallbacks.superCancelLoad();
    }

    public void commitContentChanged() {
        this.proxyCallbacks.superCommitContentChanged();
    }

    public String dataToString(Object obj) {
        return this.proxyCallbacks.superDataToString(obj);
    }

    public void deliverCancellation() {
        this.proxyCallbacks.superDeliverCancellation();
    }

    public void deliverResult(Object obj) {
        this.proxyCallbacks.superDeliverResult(obj);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.proxyCallbacks.superDump(str, fileDescriptor, printWriter, strArr);
    }

    public void forceLoad() {
        this.proxyCallbacks.superForceLoad();
    }

    public C1140ko getContainerLoader() {
        return this.proxy;
    }

    public Context getContext() {
        return this.proxyCallbacks.superGetContext();
    }

    public int getId() {
        return this.proxyCallbacks.superGetId();
    }

    public boolean isAbandoned() {
        return this.proxyCallbacks.superIsAbandoned();
    }

    public boolean isReset() {
        return this.proxyCallbacks.superIsReset();
    }

    public boolean isStarted() {
        return this.proxyCallbacks.superIsStarted();
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
        this.proxyCallbacks.superOnAbandon();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return this.proxyCallbacks.superOnCancelLoad();
    }

    public void onContentChanged() {
        this.proxyCallbacks.superOnContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        this.proxyCallbacks.superOnForceLoad();
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        this.proxyCallbacks.superOnReset();
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        this.proxyCallbacks.superOnStartLoading();
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        this.proxyCallbacks.superOnStopLoading();
    }

    public synchronized void registerListener(int i, OnLoadCompleteListener onLoadCompleteListener) {
        OnLoadCompleteListenerWrapper onLoadCompleteListenerWrapper;
        if (this.f7641Dk == null) {
            this.f7641Dk = new WeakHashMap();
        }
        WeakReference weakReference = (WeakReference) this.f7641Dk.get(onLoadCompleteListener);
        if (weakReference != null) {
            onLoadCompleteListenerWrapper = (OnLoadCompleteListenerWrapper) weakReference.get();
            if (onLoadCompleteListenerWrapper != null) {
                this.proxyCallbacks.superRegisterListener(i, onLoadCompleteListenerWrapper);
            }
        }
        onLoadCompleteListenerWrapper = new OnLoadCompleteListenerWrapper(onLoadCompleteListener);
        this.f7641Dk.put(onLoadCompleteListener, new WeakReference(onLoadCompleteListenerWrapper));
        this.proxyCallbacks.superRegisterListener(i, onLoadCompleteListenerWrapper);
    }

    public synchronized void registerOnLoadCanceledListener(OnLoadCanceledListener onLoadCanceledListener) {
        OnLoadCanceledListenerWrapper onLoadCanceledListenerWrapper;
        if (this.f7642b == null) {
            this.f7642b = new WeakHashMap();
        }
        WeakReference weakReference = (WeakReference) this.f7642b.get(onLoadCanceledListener);
        if (weakReference != null) {
            onLoadCanceledListenerWrapper = (OnLoadCanceledListenerWrapper) weakReference.get();
            if (onLoadCanceledListenerWrapper != null) {
                this.proxyCallbacks.superRegisterOnLoadCanceledListener(onLoadCanceledListenerWrapper);
            }
        }
        onLoadCanceledListenerWrapper = new OnLoadCanceledListenerWrapper(onLoadCanceledListener);
        this.f7642b.put(onLoadCanceledListener, new WeakReference(onLoadCanceledListenerWrapper));
        this.proxyCallbacks.superRegisterOnLoadCanceledListener(onLoadCanceledListenerWrapper);
    }

    public void reset() {
        this.proxyCallbacks.superReset();
    }

    public void rollbackContentChanged() {
        this.proxyCallbacks.superRollbackContentChanged();
    }

    /* access modifiers changed from: protected */
    public void setProxy(C1140ko koVar) {
        this.proxy = koVar;
        this.proxyCallbacks = (deo) koVar;
    }

    public final void startLoading() {
        this.proxy.startLoading();
    }

    public void stopLoading() {
        this.proxyCallbacks.superStopLoading();
    }

    public boolean takeContentChanged() {
        return this.proxyCallbacks.superTakeContentChanged();
    }

    public String toString() {
        return this.proxyCallbacks.superToString();
    }

    public synchronized void unregisterListener(OnLoadCompleteListener onLoadCompleteListener) {
        OnLoadCompleteListenerWrapper onLoadCompleteListenerWrapper;
        WeakReference weakReference = (WeakReference) this.f7641Dk.remove(onLoadCompleteListener);
        if (weakReference != null) {
            onLoadCompleteListenerWrapper = (OnLoadCompleteListenerWrapper) weakReference.get();
        } else {
            onLoadCompleteListenerWrapper = null;
        }
        if (onLoadCompleteListenerWrapper != null) {
            this.proxyCallbacks.superUnregisterListener(onLoadCompleteListenerWrapper);
        }
    }

    public synchronized void unregisterOnLoadCanceledListener(OnLoadCanceledListener onLoadCanceledListener) {
        OnLoadCanceledListenerWrapper onLoadCanceledListenerWrapper;
        WeakReference weakReference = (WeakReference) this.f7642b.remove(onLoadCanceledListener);
        if (weakReference != null) {
            onLoadCanceledListenerWrapper = (OnLoadCanceledListenerWrapper) weakReference.get();
        } else {
            onLoadCanceledListenerWrapper = null;
        }
        if (onLoadCanceledListenerWrapper != null) {
            this.proxyCallbacks.superUnregisterOnLoadCanceledListener(onLoadCanceledListenerWrapper);
        }
    }
}
