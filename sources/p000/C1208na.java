package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: na */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1208na {

    /* renamed from: a */
    public final Object f26715a = new Object();

    /* renamed from: b */
    public HandlerThread f26716b;

    /* renamed from: c */
    public Handler f26717c;

    /* renamed from: d */
    public final int f26718d;

    /* renamed from: e */
    private int f26719e;

    /* renamed from: f */
    private final Handler.Callback f26720f = new C1202mv(this);

    /* renamed from: g */
    private final int f26721g;

    /* renamed from: h */
    private final String f26722h;

    public C1208na(String str) {
        this.f26722h = str;
        this.f26721g = 10;
        this.f26718d = 10000;
        this.f26719e = 0;
    }

    /* renamed from: a */
    public final void mo15488a(Runnable runnable) {
        synchronized (this.f26715a) {
            if (this.f26716b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f26722h, this.f26721g);
                this.f26716b = handlerThread;
                handlerThread.start();
                this.f26717c = new Handler(this.f26716b.getLooper(), this.f26720f);
                this.f26719e++;
            }
            this.f26717c.removeMessages(0);
            Handler handler = this.f26717c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }
}
