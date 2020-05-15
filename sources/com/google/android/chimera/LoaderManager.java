package com.google.android.chimera;

import android.os.Bundle;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoaderManager {

    /* renamed from: a */
    private static WeakHashMap f7645a = new WeakHashMap();

    /* renamed from: b */
    private final C1087iq f7646b;

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface LoaderCallbacks {
        Loader onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(Loader loader, Object obj);

        void onLoaderReset(Loader loader);
    }

    private LoaderManager(C1087iq iqVar) {
        this.f7646b = iqVar;
    }

    static LoaderManager get(C1087iq iqVar) {
        LoaderManager loaderManager;
        WeakReference weakReference = (WeakReference) f7645a.get(iqVar);
        if (weakReference != null) {
            loaderManager = (LoaderManager) weakReference.get();
        } else {
            loaderManager = null;
        }
        if (loaderManager != null) {
            return loaderManager;
        }
        LoaderManager loaderManager2 = new LoaderManager(iqVar);
        f7645a.put(iqVar, new WeakReference(loaderManager2));
        return loaderManager2;
    }

    public void destroyLoader(int i) {
        this.f7646b.mo13249a(i);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7646b.mo13250a(str, fileDescriptor, printWriter, strArr);
    }

    public Loader getLoader(int i) {
        deo deo = (deo) this.f7646b.mo13252b(i);
        if (deo != null) {
            return deo.getModuleLoader();
        }
        return null;
    }

    public boolean hasRunningLoaders() {
        return this.f7646b.mo13251a();
    }

    public Loader initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        return ((deo) this.f7646b.mo13248a(i, bundle, new dep(loaderCallbacks))).getModuleLoader();
    }

    public Loader restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        return ((deo) this.f7646b.mo13253b(i, bundle, new dep(loaderCallbacks))).getModuleLoader();
    }
}
