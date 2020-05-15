package com.google.android.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JGCastService {
    public static final boolean DEBUG = false;
    public static final int FLAG_PRIVATE_DISPLAY = 1073741824;
    public static final int FLAG_SHOW_RECEIVER_STATS = 2;
    public static final int FLAG_SHOW_SENDER_STATS = 1;
    public static final int FLAG_USE_TDLS = Integer.MIN_VALUE;
    private static final String TAG = "JGCastService";
    public boolean mDidLoadLibrary;
    private Handler mEventHandler;
    public dea mListener;
    private long mNativeContext;

    public JGCastService(Context context, dea dea, Intent intent) {
        this.mListener = dea;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        if (myLooper != null) {
            this.mEventHandler = new ddz(this, myLooper);
        }
        boolean a = mo5048a(context, "jgcastservice");
        this.mDidLoadLibrary = a;
        if (!a) {
            Log.e(TAG, "Unable to load JGCastService library");
            return;
        }
        native_init();
        native_setup(new WeakReference(this), context, intent);
    }

    private final native void native_createSourceOrSink(boolean z, String str, String str2, String str3, Surface surface, int i);

    private final native void native_finalize();

    private static final native void native_init();

    private final native void native_release();

    private final native void native_setup(Object obj, Context context, Intent intent);

    private static void postEventFromNative(Object obj, int i, int i2, int i3, Surface surface) {
        JGCastService jGCastService = (JGCastService) ((WeakReference) obj).get();
        if (jGCastService != null) {
            jGCastService.mEventHandler.sendMessage(jGCastService.mEventHandler.obtainMessage(i, i2, i3, surface));
        }
    }

    /* renamed from: a */
    public final void mo5047a(String str, String str2, String str3, int i) {
        if (this.mDidLoadLibrary) {
            if (DEBUG) {
                "createSourceOrSink createSource=true, localInterface=" + str + ", remoteHost=" + str2 + ", jsonConfig=" + str3 + ", flags=" + i;
            }
            native_createSourceOrSink(true, str, str2, str3, null, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.mDidLoadLibrary) {
            native_finalize();
        }
        super.finalize();
    }

    public final native void native_disconnect();

    public final native void native_setLogger(JGCastLogger jGCastLogger);

    public final native void native_setParameters(boolean z, String str);

    /* renamed from: a */
    public boolean mo5048a(Context context, String str) {
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
