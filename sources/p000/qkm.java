package p000;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: qkm */
final /* synthetic */ class qkm implements Runnable {

    /* renamed from: a */
    private final qkn f41607a;

    /* renamed from: b */
    private final ArrayBlockingQueue f41608b;

    public qkm(qkn qkn, ArrayBlockingQueue arrayBlockingQueue) {
        this.f41607a = qkn;
        this.f41608b = arrayBlockingQueue;
    }

    public final void run() {
        qkn qkn = this.f41607a;
        ArrayBlockingQueue arrayBlockingQueue = this.f41608b;
        qkp qkp = qkn.f41611c;
        Intent intent = qkn.f41610b;
        int i = qkp.f41615c;
        Object a = qkp.mo24064a(intent);
        if (a == null) {
            Log.w("GmsApiChimeraSvc", "Failed in attempt to reload bound-service.");
            a = qkn.f41609a;
        }
        try {
            arrayBlockingQueue.add(a);
        } catch (IllegalStateException e) {
            Log.w("GmsApiChimeraSvc", "Duplicate binder!");
        }
    }
}
