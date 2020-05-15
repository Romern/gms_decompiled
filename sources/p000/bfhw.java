package p000;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;

/* renamed from: bfhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfhw extends bfgs {

    /* renamed from: a */
    protected static volatile boolean f113975a = false;

    /* renamed from: b */
    protected static volatile AudioRecord f113976b;

    /* renamed from: c */
    protected static volatile Thread f113977c = null;

    /* renamed from: d */
    private static volatile Object f113978d = new Object();

    public bfhw(Context context, bfev bfev, bfew bfew, bhdb bhdb) {
        super(bfev, bfew, bhdb);
        bmxy.m108581a(context);
        f113975a = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo61527a() {
        synchronized (f113978d) {
            if (f113975a) {
                return;
            }
            if (f113976b == null) {
                int d = ((mo61646d() * 2000) / 1000) * mo61647e() * 4;
                int minBufferSize = AudioRecord.getMinBufferSize(mo61646d(), 16, mo61648f());
                if (minBufferSize != -1 && minBufferSize != -2) {
                    int max = Math.max(d, minBufferSize);
                    f113975a = true;
                    f113977c = new Thread(new bfhu(this, max), "Audio Thread");
                    f113977c.setPriority(4);
                    f113977c.start();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo61644a(int i, int i2, long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61529b() {
        synchronized (f113978d) {
            f113975a = false;
            try {
                synchronized (f113977c) {
                    f113977c.notifyAll();
                }
                f113977c.join();
            } catch (InterruptedException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract AudioFormat mo61645c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo61646d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo61647e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo61648f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo61649g();
}
