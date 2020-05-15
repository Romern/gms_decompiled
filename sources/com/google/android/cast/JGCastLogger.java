package com.google.android.cast;

import android.content.Context;
import android.util.Log;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JGCastLogger {
    private static final String TAG = "JGCastLogger";
    public boolean mDidLoadLibrary;
    private long mNativeContext;

    public JGCastLogger(Context context) {
        boolean a = mo5044a(context, "jgcastservice");
        this.mDidLoadLibrary = a;
        if (!a) {
            Log.e(TAG, "Unable to load JGCastService library");
            return;
        }
        native_init();
        native_setup(new WeakReference(this), context, context.getCacheDir().getAbsolutePath());
    }

    private final native void native_finalize();

    private static final native void native_init();

    private final native void native_release();

    private final native void native_setup(Object obj, Context context, String str);

    /* renamed from: a */
    public final void mo5043a() {
        if (this.mDidLoadLibrary) {
            native_release();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.mDidLoadLibrary) {
            native_finalize();
        }
        super.finalize();
    }

    public final native boolean native_collectData(FileDescriptor fileDescriptor);

    /* renamed from: a */
    public boolean mo5044a(Context context, String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            String obj = context.getClassLoader().toString();
            Log.e(TAG, "Unable to locate " + str + " in " + obj, e);
            return false;
        }
    }
}
