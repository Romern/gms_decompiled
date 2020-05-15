package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfea extends Thread {

    /* renamed from: a */
    public final CountDownLatch f113543a = new CountDownLatch(1);

    /* renamed from: b */
    public volatile Handler f113544b;

    /* renamed from: c */
    public volatile boolean f113545c = false;

    /* renamed from: d */
    final /* synthetic */ bfeb f113546d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfea(bfeb bfeb) {
        super("SensorBatchThread");
        this.f113546d = bfeb;
        setPriority(4);
    }

    public final void run() {
        Looper.prepare();
        this.f113544b = new adzt();
        this.f113543a.countDown();
        Looper.loop();
        bhdb bhdb = this.f113546d.f113548a;
        String.valueOf(getName()).concat(" quitted.");
    }
}
