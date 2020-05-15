package p000;

import android.util.Log;

/* renamed from: aabw */
final /* synthetic */ class aabw implements Runnable {

    /* renamed from: a */
    private final aabx f27902a;

    /* renamed from: b */
    private final long f27903b;

    public aabw(aabx aabx, long j) {
        this.f27902a = aabx;
        this.f27903b = j;
    }

    public final void run() {
        String str;
        double d;
        aabx aabx = this.f27902a;
        long j = this.f27903b;
        bljg b = blkh.m107292b();
        if (b != null) {
            str = blkh.m107297c(b);
        } else {
            str = "<no trace>";
        }
        bljc a = blkh.m107284a(blkn.f126753a);
        if (j >= ((long) aabx.f27906c)) {
            double d2 = (double) j;
            double d3 = (double) aabx.f27905b;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = Math.min(d2 / d3, 1.0d);
        } else {
            double d4 = (double) aabx.f27904a;
            Double.isNaN(d4);
            d = 1.0d / d4;
        }
        Log.i("GmsTraceSample", String.format("%dms performing %s [%.1f%% sampled, %d omitted, %s]", Long.valueOf(j), str, Double.valueOf(d * 100.0d), Integer.valueOf(aabx.f27907d.getAndSet(0)), aaby.m21076a(a)));
    }
}
