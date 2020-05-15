package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: snr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class snr extends Handler {

    /* renamed from: c */
    static final Looper f44808c;

    /* renamed from: d */
    public final soc f44809d;

    /* renamed from: e */
    public final Handler.Callback f44810e;

    static {
        HandlerThread handlerThread = new HandlerThread("GlobalDispatchingHandlerThread", 9);
        handlerThread.start();
        f44808c = handlerThread.getLooper();
    }

    public snr(sns sns) {
        this(sns, null);
    }

    @Deprecated
    /* renamed from: c */
    public void mo25780c() {
        this.f44809d.shutdown();
    }

    public final void dispatchMessage(Message message) {
        Runnable callback = message.getCallback();
        if (callback != null) {
            this.f44809d.mo25848b(callback);
            return;
        }
        this.f44809d.mo25848b(new snq(this, Message.obtain(message), null));
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        if (this.f44809d.isShutdown()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append(valueOf);
            sb.append(" sendMessageAtTime() called with no mQueue");
            RuntimeException runtimeException = new RuntimeException(sb.toString());
            Log.w("Looper", runtimeException.getMessage(), runtimeException);
            return false;
        }
        Message obtain = Message.obtain(this, new snq(this, message, soh.m35750a(j)));
        obtain.what = message.what;
        obtain.obj = message.obj;
        return super.sendMessageAtTime(obtain, j);
    }

    public snr(sns sns, Handler.Callback callback) {
        super(f44808c);
        this.f44809d = sns.f44811a;
        this.f44810e = callback;
    }
}
